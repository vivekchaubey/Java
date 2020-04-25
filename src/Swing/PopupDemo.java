package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupDemo extends JFrame
{
 private JButton b1,b2;
 private PopupDemo(String s)
 {
 super(s);

 Container cp=getContentPane();
 cp.setLayout(new FlowLayout());

 cp.add(b1=new JButton("give a message"));
 b1.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(null,"hello");
}
 });
 cp.add(b2=new JButton("bye"));
 b2.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 System.exit(0);
 }
 });
 addWindowListener(new WindowAdapter() {
 @Override
 public void windowClosing(WindowEvent e) {
 setVisible(false);
 dispose();
 System.exit(0);
 }
 });

 pack();
 }

 public static void main(String[] args)
{
 PopupDemo pop=new PopupDemo("Popup check");
 pop.setVisible(true);
 }
}
