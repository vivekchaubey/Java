package Swing;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;

public class Table001
{
    public Table001()
    {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        Object colData[]={"Col-1","Col-2","Col-3","Col-4","Col-5","Col-6","Col-7","Col-8","Col-9","Col-10","Col-11","Col-12","Col-13"};
        Object rowData[][]={
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
                {"R1-C1","R1-C2","R1-C3","R1-C4","R1-C5","R1-C6","R1-C7","R1-C8","R1-C9","R1-C10","R1-C11","R1-C12","R1-13"},
        };

        JTable table001=new JTable(rowData,colData);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        //center alignment
        for(int i=0;i<colData.length;i++)
        {
            table001.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }

        //table001.getModel() is good to extract information
        //System.out.println(table001.getModel().getValueAt(1,1));

        table001.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//to show horizontal bar
        table001.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        table001.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                System.out.println("changed");
            }
        });

        //table001.setRowSelectionAllowed(true);
        table001.setColumnSelectionAllowed(true);
        //table001.setCellSelectionEnabled(true);

        JScrollPane tableScroll=new JScrollPane(table001);
        tableScroll.getVerticalScrollBarPolicy();

        panel.add(tableScroll);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
    }
    public static void main(String[] args)
    {
        new Table001();
    }
}
