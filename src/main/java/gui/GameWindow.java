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
    private static JTextArea gameLog;
    private static JTextArea partyInfo;
    private static JButton optionOneButton;
    private static JButton optionTwoButton;
    private static JButton optionThreeButton;
    private static JLabel welcomeLabel;
    private static JLabel partyHud;
    private static JLabel bossHealth;
    private static JScrollPane gameLogScroll;

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


        gameLog = new JTextArea();
        gameLog.setBounds(10, 30, 500, 281);
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        gameLog.setWrapStyleWord(true);
        gameLogScroll = new JScrollPane(gameLog);
        gameLogScroll.setBounds(10, 30, 500, 281);


        partyInfo = new JTextArea();
        partyInfo.setBounds(540, 111, 250, 200);
        partyInfo.setEditable(false);
        partyInfo.setLineWrap(true);
        partyInfo.setWrapStyleWord(true);

        welcomeLabel = new JLabel("Welcome Warrior of Light, Eorzea needs you!");
        welcomeLabel.setBounds(5, 5, 350, 25);

        partyHud = new JLabel("Current Party In Trial!");
        partyHud.setBounds(540, 90, 200, 25);

        bossHealth = new JLabel("Trial's Health");
        bossHealth.setBounds(620, 20, 200, 25);


        optionOneButton = new JButton("GetSkillMet");
        optionOneButton.setBounds(10, 340, 110, 25);
        optionOneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = gameLog.getText();
            }
        });

        optionTwoButton = new JButton("GetSkillMet");
        optionTwoButton.setBounds(120, 340, 110, 25);
        optionTwoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
            }
        });
        optionThreeButton = new JButton("GetSkillMet");
        optionThreeButton.setBounds(230, 340, 110, 25);
        optionThreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
            }
        });

        panel.add(gameLogScroll);
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
        gameLogScroll.setVisible(true);
        gameFrame.setVisible(true);
        setGameLog(openingStory());
    }

    public static void setGameLog(String appendToGameLog) {
        GameWindow.gameLog.setText(GameWindow.gameLog.getText() + appendToGameLog + " \n");
    }

    public String openingStory() {
        return  "Warrior of Light, how has our world been put into darkness. " +
                "For the last Umbral period we Eorzeans have lived in constant " +
                "of the 4 great trials of the land... Warrior of Light, you must " +
                "save us from this horror. Take your party and embark on your quest " +
                "to liberate the land!";
    }
}
