package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class MenuActionEvent
{
 private MenuActionEvent()
 {
 JFrame frame=new JFrame();
 JPanel panel=new JPanel();
//--------------------
 JTextArea textArea=new JTextArea(20,20);
 JMenuBar menuBar=new JMenuBar();
JMenu menu=new JMenu("Menu");
 JMenu submenu=new JMenu("Sub Menu");
 JMenuItem i1=new JMenuItem("Item 1");
 JMenuItem i2=new JMenuItem("Item 2");
JMenuItem i3=new JMenuItem("Item 3");
 JMenuItem i4=new JMenuItem("Item 4");
 JMenuItem i5=new JMenuItem("Item 5");
 menu.add(i1);
 menu.add(i2);
 menu.add(i3);
 submenu.add(i4);
 submenu.add(i5);
 menu.add(submenu);
 menuBar.add(menu);
 i1.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 textArea.setText("aa");
 }
 });
panel.add(textArea);
 panel.add(menuBar);
 //--------------------
 frame.add(panel);
 frame.pack();
 frame.setVisible(true);
}
 public static void main(String[] args)
 {
 new MenuActionEvent();
}
}

