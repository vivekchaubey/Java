package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class TableDemoWork
{

    int rowCount;
    JScrollPane pane;
    JTable table;

    public TableDemoWork()
    {
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout());
        pane=new JScrollPane();

        JRadioButton option1=new JRadioButton("10");
        JRadioButton option2=new JRadioButton("20");
        JRadioButton option3=new JRadioButton("30");

        ButtonGroup g=new ButtonGroup();
        g.add(option1);g.add(option2);g.add(option3);

        Box box=Box.createHorizontalBox();
        box.add(option1);
        box.add(option2);
        box.add(option3);


        JPanel buttonPanel=new JPanel(new GridLayout(0,2));
        JButton prev=new JButton("previous");
        JButton next=new JButton("next");
        buttonPanel.add(prev);
        buttonPanel.add(next);

        Vector<Vector> columns=new Vector();

        Vector<String> column1=new Vector<>();
        column1.add("header1");
        column1.add("header2");
        column1.add("header3");
        column1.add("header4");

        Vector<String> column2=new Vector<>();
        column2.add("header5");
        column2.add("header6");
        column2.add("header7");
        column2.add("header8");

        columns.add(column1);
        columns.add(column2);


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

        table=new JTable(new DefaultTableModel(rows,columns));

        option1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                rowCount=10;
                frame.remove(pane);
                Dimension d = table.getPreferredSize();
                frame.setSize(d.width,table.getRowHeight()*rowCount);
                pane.setPreferredSize(new Dimension(d.width,table.getRowHeight()*rowCount));
                pane=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frame.add(pane);
                pane.validate();
                frame.validate();
            }
        });

        option2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                rowCount=25;
                frame.remove(pane);
                Dimension d = table.getPreferredSize();
                frame.setSize(d.width,table.getRowHeight()*rowCount);
                pane.setPreferredSize(new Dimension(d.width,table.getRowHeight()*rowCount));
                pane=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frame.add(pane);
                pane.validate();
                frame.validate();
            }
        });

        option3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                rowCount=50;
                frame.remove(pane);
                Dimension d = table.getPreferredSize();
                frame.setSize(d.width,table.getRowHeight()*rowCount);
                pane.setPreferredSize(new Dimension(d.width,table.getRowHeight()*rowCount));
                pane=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frame.add(pane);
                pane.validate();
                frame.validate();
            }
        });

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




        frame.add(pane,BorderLayout.CENTER);
        frame.add(box,BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);

    }
    public static void main(String[] args)
    {
        new TableDemoWork();
    }
}