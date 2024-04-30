package src.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StudentArea extends JFrame{
    private JLabel title;

    private JList<String> lista;
    private DefaultListModel<String> modeloLista;

    public StudentArea(){
        setTitle("Área do Aluno");
        setSize(420, 350);
        setLocationRelativeTo(null);
    }
}

