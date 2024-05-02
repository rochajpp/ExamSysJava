package src.views;
import src.models.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class ViewNotes extends JFrame{
    private Student student;
    
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
        panel.add(title, gbc);

        add(panel);
        setVisible(true);
    }
}
