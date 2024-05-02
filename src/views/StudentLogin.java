package src.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import src.Database;
import src.models.*;

public class StudentLogin extends JFrame{
    private JLabel title, user, pass;
    private JTextField userInput;
    private JPasswordField passInput;
    private JButton send, back;

    public StudentLogin(){
        initComponents();
        setTitle("Login Aluno");
        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);

        gbc.gridy = 0;
        gbc.gridx = 0;

        title = new JLabel("Login Aluno");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        user = new JLabel("Usuário:");
        user.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridy++;
        panel.add(user, gbc);

        userInput = new JTextField(20);
        gbc.gridy++;
        panel.add(userInput, gbc);

        pass = new JLabel("Senha:");
        pass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        gbc.gridy++;
        panel.add(pass, gbc);

        passInput = new JPasswordField(20);
        gbc.gridy++;
        panel.add(passInput, gbc);

        send = new JButton("Entrar");
        send.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                enter(evt);
            }
        });
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;
        panel.add(send, gbc);

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

    public void enter(ActionEvent evt){
        Database database = new Database();

        String user = userInput.getText();
        String pass = new String(passInput.getPassword());

        if(user.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;
        }
      
        Student student = database.getStudent(user);
        
        if(student == null){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, contate o administrador do sistema!");
            return;
        }
        
        if(student.getId() == 0 || !student.getPassword().equals(pass)){
            JOptionPane.showMessageDialog(null, "Credencias incorretas!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
        new StudentArea(student);
        dispose();
    }

    public void back(ActionEvent evt){
        new Initial();
        dispose();
    }
}
