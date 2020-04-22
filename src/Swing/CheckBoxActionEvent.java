package Swing;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxActionEvent
{
private CheckBoxActionEvent()
{
JFrame frame=new JFrame();
JPanel panel=new JPanel();
 //----------------------------
JTextArea textArea=new JTextArea(20,20);
JCheckBox checkBox1=new JCheckBox("CheckBox 1",true);
checkBox1.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
    if (checkBox1.isSelected()) {
        textArea.setText("box1");
    } else {
        textArea.setText("no box1");
    }

}});


JCheckBox checkBox2=new JCheckBox("CheckBox 2",true);
checkBox2.addItemListener(new ItemListener() {
 @Override
public void itemStateChanged(ItemEvent e) {
 if(checkBox2.isSelected()){textArea.setText("box2");}
else{textArea.setText("no box2");}
}});

panel.add(checkBox1);
panel.add(checkBox2);
panel.add(textArea);
frame.add(panel);
 //----------------------------
frame.pack();
frame.setVisible(true);
}
public static void main(String[] args)
{
new CheckBoxActionEvent();
 }
}