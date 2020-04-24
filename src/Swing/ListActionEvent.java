package Swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListActionEvent
{
 private ListActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //--------------------
 JTextArea textArea=new JTextArea(30,30);
 String[] ar = {"one", "two", "three"};
 JList list=new JList(ar);

 list.addListSelectionListener(new ListSelectionListener() {
     @Override
     public void valueChanged(ListSelectionEvent e) {
         textArea.setText(list.getSelectedValue().toString());
     }
 });



panel.add(list);
         panel.add(textArea);
         //--------------------
         frame.add(panel);
         frame.pack();
         frame.setVisible(true);
        }
         public static void main(String[] args)
         {
         new ListActionEvent();
         }
        }