package app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;

import javax.swing.*;

import models.Exam;

public class QuestionScreen extends JFrame{ 

    private JLabel numberQuestion, question;
    private JCheckBox option1, option2, option3, option4, option5;
    private ButtonGroup group = new ButtonGroup();
    private JButton send;

    public QuestionScreen(int number, List<Exam> exam, HashMap<Integer, String> userReponse){
        initComponents(number, exam, userReponse);

        Dimension screenSize = getToolkit().getScreenSize();

        int width = getWidth();
        int height = getHeight();

        setLocation((screenSize.width- width) / 2, (screenSize.height - height) / 2);
        setSize(800, 500);
        setLocationRelativeTo(null); // Centralize a janela na tela
    }

    public void initComponents(int number, List<Exam> exam, HashMap<Integer, String> userReponse){

        numberQuestion = new JLabel("Questão " + number);
        numberQuestion.setFont(new Font("Segoe UI", Font.BOLD, 20)); 

        question = new JLabel(exam.get(number).getQuestion());
        question.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        send = new JButton("Enviar");

        send.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                sendQuestion();
            }
        });


        option1 = new JCheckBox(exam.get(number).getOption1());
        option2 = new JCheckBox(exam.get(number).getOption2());
        option3 = new JCheckBox(exam.get(number).getOption3());
        option4 = new JCheckBox(exam.get(number).getOption4());
        option5 = new JCheckBox(exam.get(number).getOption5());

        

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(numberQuestion, gbc);

        gbc.gridy = 2;
        panel.add(question, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridy = 3;
        panel.add(option1, gbc);

        gbc.gridy = 4;
        panel.add(option2, gbc);

        gbc.gridy = 5;
        panel.add(option3, gbc);

        gbc.gridy = 6;
        panel.add(option4, gbc);

        gbc.gridy = 7;
        panel.add(option5, gbc);

        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        group.add(option5);

        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy = 9;
        panel.add(send, gbc);

        add(panel);
        setVisible(true);
    }

    public void sendQuestion(){
        StringBuilder selected = new StringBuilder();

        if(option1.isSelected()){
            String answer = "a";
        }
        if(option2.isSelected()){
            String answer = "b";
        }
        if(option3.isSelected()){
            String answer = "c";
        }
        if(option4.isSelected()){
            String answer = "d";
        }
        if(option5.isSelected()){
            String answer = "e";
        }


    }
}


