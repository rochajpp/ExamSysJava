package src.views;

import src.Database;
import src.models.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreateQuestions extends JFrame{
    private Database db;
    private int idExam;
    private int count;

    private JLabel title, statementLabel, option1Label, option2Label, option3Label,option4Label,option5Label, resultLabel;
    private JComboBox<String> resultInput;
    private JTextArea option1Input, option2Input, option3Input,option4Input,option5Input, statementInput;

    private JButton confirm;

    public CreateQuestions(int idExam, int count){
        this.db = new Database();
        this.idExam = idExam;
        this.count = count;

        if(count > 10){
            JOptionPane.showMessageDialog(null, "Questões cadastradas com sucesso!");
            Exam exam = db.getExam(this.idExam);
            new ProfessorArea(exam.getProfessor());
            return;
        }
      
        initComponents();

        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;

        title = new JLabel("Questão " + this.count);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        statementLabel = new JLabel("Enunciado:");
        statementLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(statementLabel, gbc);

        statementInput = new JTextArea(1, 20); // Defina o número de linhas e colunas desejadas
        statementInput.setLineWrap(true); // Permitir que o JTextArea faça quebras de linha automática
        gbc.gridy++;
        panel.add(statementInput, gbc);
        
        option1Label = new JLabel("Opção a");
        option1Label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(option1Label, gbc);

        option1Input = new JTextArea(1,  20);
        option1Input.setLineWrap(true);
        gbc.gridy++;
        panel.add(option1Input, gbc);

        option2Label = new JLabel("Opção b");
        option2Label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(option2Label, gbc);

        option2Input = new JTextArea(1,  20);
        option2Input.setLineWrap(true);
        gbc.gridy++;
        panel.add(option2Input, gbc);

        option3Label = new JLabel("Opção c");
        option3Label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(option3Label, gbc);

        option3Input = new JTextArea(1,  20);
        option3Input.setLineWrap(true);
        gbc.gridy++;
        panel.add(option3Input, gbc);

        option4Label = new JLabel("Opção d");
        option4Label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(option4Label, gbc);

        option4Input = new JTextArea(1,  20);
        option4Input.setLineWrap(true);
        gbc.gridy++;
        panel.add(option4Input, gbc);

        option5Label = new JLabel("Opção e");
        option5Label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(option5Label, gbc);

        option5Input = new JTextArea(1,  20);
        option5Input.setLineWrap(true);
        gbc.gridy++;
        panel.add(option5Input, gbc);

        resultLabel = new JLabel("Resultado");
        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        gbc.gridy++;
        panel.add(resultLabel, gbc);

        String[] results = {"", "A", "B", "C", "D", "E"};
        resultInput = new JComboBox<String>(results);
        gbc.gridy++;
        panel.add(resultInput, gbc);

        confirm = new JButton("Confirmar");
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                confirm(evt);
            }
        });
        gbc.gridy++;
        panel.add(confirm, gbc);

        JScrollPane scrollPane = new JScrollPane(panel);
            
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        add(scrollPane);
        setVisible(true);
    }

    public void confirm(ActionEvent evt){
        String statement = statementInput.getText();
        String option1 = option1Input.getText();
        String option2 = option2Input.getText();
        String option3 = option3Input.getText();
        String option4 = option4Input.getText();
        String option5 = option5Input.getText();
        String result = resultInput.getSelectedItem().toString();

        if(statement.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty() || option5.isEmpty() || result.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        Question question = new Question(this.idExam, statement, option1, option2, option3, option4, option5, result);
        db.saveQuestion(question);
        
        this.count++;
        new CreateQuestions(this.idExam, this.count);
        dispose();
        return;
    }
}
