package src.views;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Initial extends JFrame{
    private JLabel title, label;
    private JButton professor, student;

    public Initial(){
        initComponents();

        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0 ,0 ,0);
        gbc.gridx = 0;
        gbc.gridy = 0;


        title = new JLabel("Bem-vindo ao sistema de provas");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        label = new JLabel("Como você deseja entrar:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 18)); 
        gbc.gridy++;
        panel.add(label, gbc);

        student = new JButton("Aluno");
        student.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                enterStudent(evt);
            }
        });
        gbc.gridy+=2;
        panel.add(student, gbc);


        professor = new JButton("Professor");
        professor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                enterProfessor(evt);
            }
        });
        gbc.gridy++;
        panel.add(professor, gbc);
    

        add(panel);
        setVisible(true);
    }

    public void enterStudent(ActionEvent evt){

    }

    public void enterProfessor(ActionEvent evt){

    }
}
