package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SliderActionEvent
{
 private SliderActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //----------------------------
 JTextArea textArea=new JTextArea(20,20);
 JSlider slider=new JSlider(0,100,10);
 slider.addChangeListener(new ChangeListener() {
 @Override
 public void stateChanged(ChangeEvent e) {
     int value=((JSlider)e.getSource()).getValue();
     textArea.setText(String.valueOf(value));
}
 });


 panel.add(slider);
 panel.add(textArea);
 frame.add(panel);
 //----------------------------
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
 new SliderActionEvent();
 }
}
