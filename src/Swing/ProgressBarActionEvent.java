package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ProgressBarActionEvent
{
 private ProgressBarActionEvent() throws Exception
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //----------------------------
 JTextArea textArea=new JTextArea(20,20);
 JProgressBar progressBar=new JProgressBar();
 panel.add(progressBar);
 panel.add(textArea);
 frame.add(panel);
 frame.pack();
 frame.setVisible(true);

 for(int i=0;i<101;i++) {
     Thread.sleep(100);
     progressBar.setValue(i);
     textArea.setText(String.valueOf(i));

 }
//----------------------------
//        frame.pack();
//        frame.setVisible(true);
}
public static void main(String[] args) throws Exception
 {
 new ProgressBarActionEvent();
 }
}
