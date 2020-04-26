package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonActionEvent
{
 private RadioButtonActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //----------------------------
 JTextArea textArea=new JTextArea(20,20);
 JRadioButton radioButton1=new JRadioButton("Radio Button 1");
 JRadioButton radioButton2=new JRadioButton("Radio Button 1");

 radioButton1.addItemListener(new ItemListener() {
     @Override
     public void itemStateChanged(ItemEvent e) {
         if(radioButton1.isSelected()){textArea.setText("1 selected");}
         else {textArea.setText("1 unselected");}
     }
 });


     radioButton2.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
             if(radioButton1.isSelected()){textArea.setText("2 selected");}
             else {textArea.setText("2 unselected");}
         }
     });





 ButtonGroup buttonGroup=new ButtonGroup();
 buttonGroup.add(radioButton1);
 buttonGroup.add(radioButton2);

 panel.add(radioButton1);
 panel.add(radioButton2);

 panel.add(textArea);
 frame.add(panel);
 //----------------------------
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
 new RadioButtonActionEvent();
 }
}

