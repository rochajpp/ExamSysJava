package src.views;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;

import src.Database;
import src.models.*;

public class TestApplication extends JFrame{

    private JLabel numberQuestion, question;
    private JCheckBox option1, option2, option3, option4, option5;
    private ButtonGroup group = new ButtonGroup();
    private JButton send;

    private Student student;

    private int number;
    private Exam exam;
    private HashMap<Integer, String> userResponse;

    private Database db = new Database();

    public TestApplication(int number, Exam exam, HashMap<Integer, String> userResponse, Student student){
        this.number = number;
        this.exam = exam;
        this.userResponse = userResponse;
        this.student = student;

        if(number == 10){
            float result = 0;
            for(int i = 0; i < this.exam.getQuestions().size(); i++){
                if(this.exam.getQuestions().get(i).getResult().equals(userResponse.get(i).toUpperCase())){
                    result++;
                }
            }
            StudentExam studantExam = new StudentExam(this.student.getId(), this.exam.getId(), result);
            db.saveStudentExam(studantExam);

            Student updateStudent = db.getStudent(this.student.getUser());

            JOptionPane.showMessageDialog(null, "Prova finalizada com sucesso!\nSua nota: " + result);
            new StudentArea(updateStudent);
            dispose();
            return;
        }

        initComponents(number, exam, userResponse);

        setSize(800, 500);
        setLocationRelativeTo(null); // Centralize a janela na tela
    }

    public void initComponents(int number, Exam exam, HashMap<Integer, String> userReponse){

        numberQuestion = new JLabel("Questão " + (number + 1));
        numberQuestion.setFont(new Font("Segoe UI", Font.BOLD, 20)); 

        question = new JLabel(exam.getQuestions().get(number).getStatement());
        question.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        send = new JButton("Enviar");

        send.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                sendQuestion();
            }
        });


        option1 = new JCheckBox(exam.getQuestions().get(number).getOption1());
        option2 = new JCheckBox(exam.getQuestions().get(number).getOption2());
        option3 = new JCheckBox(exam.getQuestions().get(number).getOption3());
        option4 = new JCheckBox(exam.getQuestions().get(number).getOption4());
        option5 = new JCheckBox(exam.getQuestions().get(number).getOption5());

        

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
            this.userResponse.put(number, "a");
            this.number++;
            new TestApplication(this.number, this.exam, this.userResponse, this.student);
            dispose(); 
        }
        if(option2.isSelected()){
            String answer = "b";
            this.userResponse.put(number, "b");
            this.number++;
            new TestApplication(this.number, this.exam, this.userResponse, this.student);
            dispose(); 
        }
        if(option3.isSelected()){
            String answer = "c";
            this.userResponse.put(number, "c");
            this.number++;
            new TestApplication(this.number, this.exam, this.userResponse, this.student);
            dispose(); 
        }
        if(option4.isSelected()){
            String answer = "d";
            this.userResponse.put(number, "d");
            this.number++;
            new TestApplication(this.number, this.exam, this.userResponse, this.student);
            dispose(); 
        }
        if(option5.isSelected()){
            String answer = "e";
            this.userResponse.put(number, "e");
            this.number++;
            new TestApplication(this.number, this.exam, this.userResponse, this.student);
            dispose(); 
        }
    }    
}
