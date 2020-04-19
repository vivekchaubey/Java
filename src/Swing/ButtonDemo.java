package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame
{
 private JButton b1,b2;
 private JLabel label;

 private ButtonDemo()
 {
 Container cp=getContentPane();
 cp.setLayout(new FlowLayout());
 cp.add(b1=new JButton("b1"));
 cp.add(b2=new JButton("b2"));

 b1.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 System.out.println("clicked 1");
 dispose();
 System.exit(0);
 }
 });

 b2.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 System.out.println("clicked 2");
 dispose();
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
 new ButtonDemo().setVisible(true);
 }
}

