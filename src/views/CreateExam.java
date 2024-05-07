package src.views;

import src.models.*;
import src.Database;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.ArrayList;

public class CreateExam extends JFrame{

    private Professor professor;
    private Database db;

    private JLabel title, name;
    private JTextField nameInput;
    private JButton confirm, back;

    public CreateExam(Professor professor){
        this.professor = professor;
        this.db = new Database();

        initComponents();
        
        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;

        title = new JLabel("Nova prova");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        name = new JLabel("Nome da prova");
        name.setFont(new Font("Segoe UI", Font.BOLD, 12));
        gbc.gridy++;
        panel.add(name, gbc);

        nameInput = new JTextField(20);
        gbc.gridy++;
        panel.add(nameInput, gbc);

        confirm = new JButton("Confirmar");
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                confirm(evt);
            }
        });
        gbc.gridy++;
        panel.add(confirm, gbc);

        back = new JButton("Voltar");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                back(evt);
            }
        });
        gbc.gridy++;
        panel.add(back, gbc);
        

        add(panel);
        setVisible(true);
    }

    public void confirm(ActionEvent evt){
        String name = new String(nameInput.getText());
        int result = JOptionPane.showConfirmDialog(null, "Criar prova com o nome " + name + "?");
        if(result == 0){
            int id = db.saveExam(name, this.professor);
            int count = 1;
            List<Question> questions = new ArrayList<Question>();
    
            new CreateQuestions(id, questions, count);
            dispose();
            
        }
    }

    public void back(ActionEvent evt){
        new ProfessorArea(this.professor);
        dispose();
    }
}
