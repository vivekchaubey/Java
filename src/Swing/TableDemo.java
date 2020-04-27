package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class TableDemo
{
    public TableDemo()
    {
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout());
        int rowCount=10;



        JPanel buttonPanel=new JPanel(new GridLayout(0,3));
        JButton prev=new JButton("previous");
        JButton next=new JButton("next");
        JButton goIndex=new JButton("Row Index 100");
        buttonPanel.add(prev);
        buttonPanel.add(next);
        buttonPanel.add(goIndex);

        Vector<String> columns=new Vector();
        columns.add("header1");
        columns.add("header2");
        columns.add("header3");
        columns.add("header4");


        Vector<Vector<String>> rows=new Vector<>();

        for(int i=0;i<1000;i++)
        {
            Vector eachRow=new Vector();
            eachRow.add(i);
            eachRow.add(2*i);
            eachRow.add(3*i);
            eachRow.add(4*i);
            rows.add(eachRow);
        }

        JTable table=new JTable(new DefaultTableModel(rows,columns));
        JScrollPane pane=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height = table.getRowHeight()*(rowCount);
                JScrollBar bar = pane.getVerticalScrollBar();
                bar.setValue( bar.getValue()+height );
            }
        });


        prev.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int height = table.getRowHeight()*(rowCount);
                JScrollBar bar = pane.getVerticalScrollBar();
                bar.setValue( bar.getValue()-height );
            }
        } );

        goIndex.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                table.getSelectionModel().setSelectionInterval(100, 100);
                table.scrollRectToVisible(new Rectangle(table.getCellRect(100, 0, true)));
            }
        });


        frame.add(pane,BorderLayout.CENTER);
        frame.add(buttonPanel,BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
        new TableDemo();
    }
}