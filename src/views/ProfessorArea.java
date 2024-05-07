package src.views;

import src.models.*;
import src.Database;

import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProfessorArea extends JFrame{    

    private JLabel title;
    private JButton createExam, back;

    private Professor professor;
    private Database db;

    public ProfessorArea(Professor professor){
        this.professor = professor;
        db = new Database();

        initComponents();

        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        List<Exam> exams = db.getExamsByProfessor(this.professor);

        if(exams == null){
            JOptionPane.showMessageDialog(null, "Erro ao carregar provas, contate o administrador do sistema");
            new ProfessorLogin();
            dispose();
            return;
        }

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 0, 10, 0);

        gbc.gridx = 0;
        gbc.gridy = 0;
        
        title = new JLabel("Provas registradas");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));

        panel.add(title, gbc);
        System.out.println(exams.size());
        for(int i = 0; i < exams.size(); i++){
            
            Exam exam = exams.get(i);
            JLabel examLabel = new JLabel(exam.getId() + " - " + exam.getName());

            gbc.gridy++;
            panel.add(examLabel, gbc);
        }

        createExam = new JButton("Cadastrar nova prova");
        createExam.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                createExam(evt);
            }
        });

        gbc.gridy++;
        panel.add(createExam, gbc);

        back = new JButton("Voltar");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                back(evt);
            }
        });

        JScrollPane scrollPane = new JScrollPane(panel);
            
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane);
        setVisible(true);
    }

    public void createExam(ActionEvent evt){
        new CreateExam(this.professor);
        dispose();
    }

    public void back(ActionEvent evt){
        new ProfessorLogin();
        dispose();
    }
}
