package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
import java.util.List;
import models.*;

public class ResultScreen extends JFrame{

    private JLabel initial, questionTitle, templateAnswer, userAnswer, result;
    private JButton finish;

    private HashMap<Integer, String> userResponse;
    private HashMap<Integer, String> template = new HashMap<>();
    private int corrects = 0;
    
    public ResultScreen(HashMap<Integer, String> userResponse, List<Exam> exam){
        for(int i = 0; i < exam.size(); i++){
            template.put(i, exam.get(i).getAnswer());
        }

        this.userResponse = userResponse;

        for(int i = 0; i < exam.size(); i++){
            if(userResponse.get(i).equals( template.get(i))){
                corrects++;
            }
        }

        initComponents();
        
        Dimension screenSize = getToolkit().getScreenSize();

        int width = getWidth();
        int height = getHeight();

        setLocation((screenSize.width- width) / 2, (screenSize.height - height) / 2);
        setSize(800, 500);
        setLocationRelativeTo(null); // Centralize a janela na tela
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        initial = new JLabel("Resultado");
        initial.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 1;
        gbc.gridy++;
        panel.add(initial, gbc);

        for (int i = 0; i < template.size(); i++) {
            gbc.gridx = 1;
            gbc.gridy++;

            questionTitle = new JLabel("Question " + (i + 1));
            questionTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
            panel.add(questionTitle, gbc);

            gbc.gridx = 0;
            gbc.gridy+=2;
            templateAnswer = new JLabel("Gabarito: " + template.get(i));
            templateAnswer.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            panel.add(templateAnswer, gbc);

            gbc.gridx = 2;
          
            userAnswer = new JLabel("Sua resposta: " + userResponse.get(i));
            userAnswer.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            panel.add(userAnswer, gbc);
        }

        result = new JLabel("Nota: " + corrects + "/10");
        result.setFont(new Font("Segoe UI", Font.BOLD, 20));

        gbc.gridx = 1;
        gbc.gridy++;
        panel.add(result, gbc);

        finish = new JButton("Finalizar");
        finish.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                finish();
            }
        });

        gbc.gridx = 1;
        gbc.gridy++;
        panel.add(finish, gbc);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        add(scrollPane);
        setVisible(true);

    }

    public void finish(){
        System.exit(0);
    }
}
