package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.*;

public class SpinnerActionEvent
{
 private SpinnerActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //--------------------
 JTextArea textArea=new JTextArea(30,30);
 String[] monthStrings = {"Jan","Feb","Mar","Apr","May"};
 SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
 JSpinner spinner = new JSpinner(monthModel);
 spinner.addChangeListener(new ChangeListener() {
 @Override
 public void stateChanged(ChangeEvent e) {
 textArea.setText(spinner.getValue().toString());
}
 });



 panel.add(spinner);
 panel.add(textArea);
 //--------------------
 frame.add(panel);
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
 new SpinnerActionEvent();
}
}

