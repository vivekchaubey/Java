package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

public class FrameLayout_002
{
    private FrameLayout_002()
    {
        JFrame frame=new JFrame("Different panels in one frame");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints frameConstraints=new GridBagConstraints();

        //PANEL 1--CARD LAYOUT
        frameConstraints.gridx=0;
        frameConstraints.gridy=0;
        JPanel panel1=new JPanel(new BorderLayout());
        panel1.setPreferredSize(new Dimension(300,300));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Card Layout 1"));

        JPanel card1 = new JPanel();
        card1.setBackground(Color.red);
        card1.setPreferredSize(new Dimension(50,50));
        card1.setVisible(false);

        JPanel card2 = new JPanel();
        card2.setBackground(Color.blue);
        card2.setPreferredSize(new Dimension(100,100));
        card2.setVisible(false);

        JPanel buttonPanel = new JPanel();

        JButton b1 = new JButton("Red");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                card1.setVisible(true);
                card2.setVisible(false);
            }
        });
        buttonPanel.add(b1);

        JButton b2 = new JButton("Blue");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                card2.setVisible(true);
                card1.setVisible(false);
            }
        });
        buttonPanel.add(b2);

        panel1.add(card1,BorderLayout.PAGE_START);
        panel1.add(card2,BorderLayout.CENTER);
        panel1.add(buttonPanel,BorderLayout.PAGE_END);


        GridBagConstraints p1Constraints=new GridBagConstraints();



        frame.add(panel1,frameConstraints);


        //PANEL 2--BORDER LAYOUT
        frameConstraints.gridx=2;
        frameConstraints.gridy=0;
        JPanel panel2=new JPanel(new BorderLayout());
        panel2.setPreferredSize(new Dimension(300,300));
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Card Layout 2"));


        String BUTTONPANEL = "Card with JButtons";
        String TEXTPANEL = "Card with JTextField";

        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        panel2.add(cb,BorderLayout.PAGE_START);


        JPanel card1_panel2 = new JPanel();
        card1_panel2.add(new JButton("Button 1"));
        card1_panel2.add(new JButton("Button 2"));
        card1_panel2.add(new JButton("Button 3"));

        JPanel card2_panel2 = new JPanel();
        card2_panel2.add(new JTextField("TextField", 20));

        JPanel cards_panel2 = new JPanel(new CardLayout());
        cards_panel2.add(card1_panel2, BUTTONPANEL);
        cards_panel2.add(card2_panel2, TEXTPANEL);

        panel2.add(cards_panel2,BorderLayout.CENTER);

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                CardLayout cl = (CardLayout)(cards_panel2.getLayout());
                cl.show(cards_panel2, (String)e.getItem());
            }
        });

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab(BUTTONPANEL, card1_panel2);
        tabbedPane.addTab(TEXTPANEL, card2_panel2);
        panel2.add(tabbedPane,BorderLayout.SOUTH);

        frame.add(panel2,frameConstraints);


        //PANEL 3
        frameConstraints.gridx=0;
        frameConstraints.gridy=2;
        JPanel panel3=new JPanel();
        GroupLayout layout=new GroupLayout(panel3);
        panel3.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        panel3.setPreferredSize(new Dimension(300,300));
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Group Layout"));

        JLabel label = new JLabel("Label:");;
        JTextField textField = new JTextField();
        JCheckBox checkBox1 = new JCheckBox("CheckBox1");
        JCheckBox checkBox2 = new JCheckBox("CheckBox2");
        JCheckBox checkBox3 = new JCheckBox("CheckBox3");
        JCheckBox checkBox4 = new JCheckBox("CheckBox4");
        JButton findButton = new JButton("Find");
        JButton cancelButton = new JButton("Cancel");

        checkBox1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(textField)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(checkBox1)
                                        .addComponent(checkBox3))
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(checkBox2)
                                        .addComponent(checkBox4))))
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(findButton)
                        .addComponent(cancelButton))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label)
                        .addComponent(textField)
                        .addComponent(findButton))
                .addGroup(layout.createParallelGroup(LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(checkBox1)
                                        .addComponent(checkBox2))
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(checkBox3)
                                        .addComponent(checkBox4)))
                        .addComponent(cancelButton))
        );


        frame.add(panel3,frameConstraints);

        //PANEL 4
        frameConstraints.gridx=2;
        frameConstraints.gridy=2;
        JPanel panel4=new JPanel();
        SpringLayout springLayout=new SpringLayout();
        panel4.setLayout(springLayout);
        panel4.setPreferredSize(new Dimension(300,300));
        panel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Spring Layout"));

        JLabel label_panel4 = new JLabel("Left Label Text");
        JTextField tf_panel4 = new JTextField("Text Field",15);

        springLayout.putConstraint(SpringLayout.WEST, tf_panel4, 95,SpringLayout.WEST, panel4);
        springLayout.putConstraint(SpringLayout.NORTH, tf_panel4, 0, SpringLayout.NORTH, panel4);
        //panel4.add(label_panel4);
        //panel4.add(tf_panel4);



        frame.add(panel4,frameConstraints);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new FrameLayout_002();
    }
}