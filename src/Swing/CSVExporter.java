package Swing;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
public class CSVExporter  {

    public void exportTable(JTable table, File file) throws IOException {
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);

        for(int i=0; i < model.getColumnCount(); i++) {
            if(i!=model.getColumnCount()-1)
            {out.write(model.getColumnName(i) + ",");}
            else
            {
                out.write(model.getColumnName(i));
            }
        }

        out.close();
        System.out.println("write out to: " + file);
    }


    public static void main(String[] args) {
        String[][] data = {
                { "Housewares",  "$1275.00" },
                { "Pets",         "$125.00" },
                { "Electronics", "$2533.00" },
                { "Mensware",     "$4555597.00" }
        };
        String[] headers = { "Department", "Daily Revenue" };

        JFrame frame = new JFrame("JTable to CSV");
        DefaultTableModel model = new DefaultTableModel(data,headers);
        final JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        JButton export = new JButton("Export");
        export.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    CSVExporter exp = new CSVExporter();
                    exp.exportTable(table, new File("results.csv"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        frame.getContentPane().add("Center",scroll);
        frame.getContentPane().add("South",export);
        frame.pack();
        frame.setVisible(true);
    }
}