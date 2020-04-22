package Swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxActionEvent
{
 private ComboBoxActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //--------------------
 JTextArea textArea=new JTextArea(30,30);
 String[] ar={"aa","bb","cc"};
 JComboBox comboBox=new JComboBox(ar);

 comboBox.addItemListener(new ItemListener() {
     @Override
     public void itemStateChanged(ItemEvent e) {
         textArea.setText(comboBox.getSelectedItem().toString());
     }
 });



 panel.add(comboBox);
 panel.add(textArea);
 //--------------------
 frame.add(panel);
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
 new ComboBoxActionEvent();
 }
}

