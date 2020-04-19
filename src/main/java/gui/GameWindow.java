package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameWindow {
    private static Container con;
    private static JFrame gameFrame;
    private static JPanel panel;
    private static JProgressBar bossHealthBar;
    private static JTextField gameLog;
    private static JTextField partyInfo;
    private static JButton optionOneButton;
    private static JButton optionTwoButton;
    private static JButton optionThreeButton;
    private static JLabel welcomeLabel;
    private static JLabel partyHud;
    private static JLabel bossHealth;

        public GameWindow() {

            gameFrame = new JFrame();
            gameFrame.setSize(800, 450);
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setLocationRelativeTo(null);
            gameFrame.setVisible(true);

            panel = new JPanel();
            panel.setLayout(null);

            bossHealthBar = new JProgressBar();
            bossHealthBar.setMinimum(0);
            bossHealthBar.setMaximum(1000); // method for this
            bossHealthBar.setBounds(570, 20, 200, 50);
            bossHealthBar.setValue(500);  // Set a method for this
            bossHealthBar.setForeground(Color.BLACK);
            
            gameLog = new JTextField();
            gameLog.setBounds(10, 30, 500, 281);
            gameLog.setEditable(false);

            partyInfo = new JTextField();
            partyInfo.setBounds(540, 111, 250, 200);
            partyInfo.setEditable(false);

            welcomeLabel = new JLabel("Welcome Warrior of Light, Eorzea needs you!");
            welcomeLabel.setBounds(5, 5, 350, 25);

            partyHud = new JLabel("Current Party In Trial!");
            partyHud.setBounds(540, 95, 200, 25);

            bossHealth = new JLabel("Trial's Health");
            bossHealth.setBounds(620, 20, 200, 25);


            optionOneButton = new JButton("GetSkillMet");
            optionOneButton.setBounds(10,340,110,25);
            optionOneButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String message = gameLog.getText();
                }
            });

            optionTwoButton = new JButton("GetSkillMet");
            optionTwoButton.setBounds(120,340,110,25);
            optionTwoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("test");
                }
            });
            optionThreeButton = new JButton("GetSkillMet");
            optionThreeButton.setBounds(230,340,110,25);
            optionThreeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("test");
                }
            });

            panel.add(gameLog);
            panel.add(bossHealthBar);
            panel.add(partyInfo);
            panel.add(welcomeLabel);
            panel.add(partyHud);
            panel.add(bossHealth);
            panel.add(optionTwoButton);
            panel.add(optionOneButton);
            panel.add(optionThreeButton);

            gameFrame.add(panel);
            panel.setVisible(true);
            gameFrame.setVisible(true);

        }
    }

