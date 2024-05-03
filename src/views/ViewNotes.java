package src.views;
import src.models.*;
import src.Database;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Map;

import javax.swing.*;

public class ViewNotes extends JFrame{
    private Student student;
    private Database db = new Database();
    
    private JLabel title;

    public ViewNotes(Student student){
        this.student = student;
        
        initComponents();

        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridy = 0;
        gbc.gridx = 0;

        title = new JLabel("Provas realizadas:");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        for (Map.Entry<Integer, Float> entry : student.getExams().entrySet()) {
            Exam exam = db.getExam(entry.getKey());
            JLabel examLabel = new JLabel(exam.getId() + " - " + exam.getName() + " Professor: " + exam.getProfessor().getName() + " Nota: " + entry.getValue());
        }

        add(panel);
        setVisible(true);
    }
}
