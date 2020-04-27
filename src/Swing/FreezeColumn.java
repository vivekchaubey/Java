package Swing;


import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class FreezeColumn extends JFrame {
    private DefaultTableModel tableModel;
    private JScrollPane jScrollPane;
    private JTable jTable;
    private JTable freezeTable;
    private int fixedColumns = 1;//number of colums to be freezed

    public FreezeColumn() {
        jScrollPane = new JScrollPane();
        jTable = new JTable();
        jScrollPane.setViewportView(jTable);
        getContentPane().add(jScrollPane);

        setPreferredSize(new Dimension(300,200));
        setDefaultCloseOperation(3);

        Object[][] data = {{"Item1", "Papaya", "Letus", "Cashew", "Pine"},
                {"Item2", "Orange", "Carrot", "Pine nut", "Oak"},
                {"Item3", "Apple", "Pepper", "Pistacho", "Cypress"}};
        Object[] headers = {"Item", "Fruit", "Vegetable", "Nuts", "Tree"};
        tableModel = new DefaultTableModel(data, headers);
        jTable.setModel(tableModel);


        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        /*jTable.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent e) {
                //  Keep freezeTable in sync with the jTable
                if ("selectionModel".equals(e.getPropertyName())) {
                    freezeTable.setSelectionModel(jTable.getSelectionModel());
                }

                if ("dataModel".equals(e.getPropertyName())) {
                    freezeTable.setModel(jTable.getModel());
                }
            }
        });*/

        freezeTable = new JTable();
        freezeTable.setAutoCreateColumnsFromModel(false);
        freezeTable.setModel(tableModel);
        freezeTable.setSelectionModel(jTable.getSelectionModel());
        freezeTable.setFocusable(false);



        for (int i = 0; i < fixedColumns; i++) {
            TableColumnModel colModel = jTable.getColumnModel();
            TableColumn column = colModel.getColumn(0);
            colModel.removeColumn(column);
            freezeTable.getColumnModel().addColumn(column);
        }

        //Synchronize sorting of freezeTable with jTable
        /*jTable.setAutoCreateRowSorter(true);
        freezeTable.setRowSorter(jTable.getRowSorter());
        jTable.setUpdateSelectionOnSort(true);
        freezeTable.setUpdateSelectionOnSort(false);
*/
        //  Add the fixed table to the scroll pane
        freezeTable.setPreferredScrollableViewportSize(freezeTable.getPreferredSize());
        jScrollPane.setRowHeaderView(freezeTable);
        jScrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER, freezeTable.getTableHeader());

        // Synchronize scrolling of the row header with the jTable
        jScrollPane.getRowHeader().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                //  Sync the scroll pane scrollbar with the row header
                JViewport viewport = (JViewport) e.getSource();
                jScrollPane.getVerticalScrollBar().setValue(viewport.getViewPosition().y);
            }
        });
        pack();
    }


    public static void main(String[] args) {
        new FreezeColumn().setVisible(true);
    }
}
