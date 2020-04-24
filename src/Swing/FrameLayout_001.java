package Swing;

import java.awt.*;
import javax.swing.*;

public class FrameLayout_001 extends JFrame
{
    private FrameLayout_001()
    {
        JFrame frame=new JFrame("Different panels in one frame");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints frameConstraints=new GridBagConstraints();

        //PANEL 1--GRIDBAG LAYOUT
        frameConstraints.gridx=0;
        frameConstraints.gridy=0;
        JPanel panel1=new JPanel(new GridBagLayout());
        panel1.setPreferredSize(new Dimension(300,300));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "GridBag layout"));

        JLabel label1_panel1=new JLabel("TextField: ");
        JLabel label2_panel1=new JLabel("Password Field: ");
        JTextField tf1_panel1=new JTextField(10);
        JPasswordField tf2_panel1=new JPasswordField(10);

        GridBagConstraints p1Constraints=new GridBagConstraints();
        p1Constraints.gridx=0;
        p1Constraints.gridy=0;
        panel1.add(label1_panel1,p1Constraints);

        p1Constraints.gridx=2;
        p1Constraints.gridy=0;
        panel1.add(tf1_panel1,p1Constraints);

        p1Constraints.gridx=0;
        p1Constraints.gridy=2;
        panel1.add(label2_panel1,p1Constraints);

        p1Constraints.gridx=2;
        p1Constraints.gridy=2;
        panel1.add(tf2_panel1,p1Constraints);

        frame.add(panel1,frameConstraints);


        //PANEL 2--BORDER LAYOUT
        frameConstraints.gridx=2;
        frameConstraints.gridy=0;
        JPanel panel2=new JPanel(new BorderLayout());
        panel2.setPreferredSize(new Dimension(300,300));
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Border Layout"));


        JLabel label1_panel2=new JLabel("Text Area: ");
        JTextArea ta_panel2=new JTextArea(10,20);
        ta_panel2.setLineWrap(true);

        panel2.add(label1_panel2,BorderLayout.PAGE_START);
        panel2.add(ta_panel2,BorderLayout.CENTER);
        panel2.add(new JScrollPane(ta_panel2));

        frame.add(panel2,frameConstraints);


        //PANEL 3
        frameConstraints.gridx=0;
        frameConstraints.gridy=2;
        JPanel panel3=new JPanel();
        BoxLayout boxLayout=new BoxLayout(panel3, BoxLayout.X_AXIS);
        panel3.setPreferredSize(new Dimension(300,300));
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Box Layout"));

        JButton b1=new JButton("Element 1");
        JButton b2=new JButton("Element 2");
        JButton b3=new JButton("Element 3");
        JButton b4=new JButton("Element 4");
        JButton b5=new JButton("Element 5");
        JButton b6=new JButton("Element 6");
        JButton b7=new JButton("Element 7");
        JButton b8=new JButton("Element 8");
        JButton b9=new JButton("Element 9");

        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        panel3.add(b4);
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(b7);
        panel3.add(b8);
        panel3.add(b9);

        Box left=Box.createVerticalBox();
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rbutton;
        radioGroup.add(rbutton = new JRadioButton("Red"));
        left.add(rbutton);
        radioGroup.add(rbutton = new JRadioButton("Green"));
        left.add(rbutton);
        radioGroup.add(rbutton = new JRadioButton("Blue"));
        left.add(rbutton);
        radioGroup.add(rbutton = new JRadioButton("Yellow"));
        left.add(rbutton);
        panel3.add(left);

        Box right = Box.createHorizontalBox();
        right.add(new JCheckBox("A"));
        right.add(new JCheckBox("B"));
        right.add(new JCheckBox("C"));
        panel3.add(right);



        frame.add(panel3,frameConstraints);

        //PANEL 4
        frameConstraints.gridx=2;
        frameConstraints.gridy=2;
        JPanel panel4=new JPanel(new FlowLayout());
        panel4.setPreferredSize(new Dimension(300,300));
        panel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Flow Layout"));
        JTextArea text_panel4=new JTextArea("In this layout, all the components are placed side by side.");
        panel4.add(text_panel4);
        panel4.add(new JScrollPane(text_panel4));
        frame.add(panel4,frameConstraints);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new FrameLayout_001();
    }
}
