package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseActionEvent
{
 private MouseActionEvent()
 {
 JFrame frame=new JFrame();
 JButton button=new JButton("Button Demo");
 button.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 System.out.println("Button Click Success");
 System.exit(0);
 }
 });
 frame.add(button);
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args)
 {
new MouseActionEvent();
 }
}

