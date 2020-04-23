package Swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneActionEvent
{
 private TabbedPaneActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
 //--------------------
 JTabbedPane tabbedPane=new JTabbedPane();
 JButton button=new JButton("Tab 2");
 tabbedPane.addTab("tab 1", new JTextField("tab1 output"));
 tabbedPane.addTab("tab 2", button);
 button.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
System.out.println("tab2");
 }
 });
 panel.add(tabbedPane);
 //--------------------
 frame.add(panel);
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
 new TabbedPaneActionEvent();
 }
}


