package src.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import src.models.*;
import src.Database;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class StudentArea extends JFrame{

    private JLabel title;
    private JList<String> list;
    private JButton viewNote;
    private DefaultListModel<String> modelList;
    private Student student;
    private List<Exam> exams; 
    private Database database = new Database();

    public StudentArea(Student student){
        this.student = student;
      
        this.exams = database.getAllExams();

        initComponents();

        setTitle("Área do Aluno");
        setSize(420, 350);
        setLocationRelativeTo(null);
    }

    public void initComponents(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);

        gbc.gridx = 0;
        gbc.gridy = 0;

        title = new JLabel("Provas Disponíveis");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        panel.add(title, gbc);

        modelList = new DefaultListModel<>();

        for(int i = 0; i < exams.size(); i++){
            Integer idExam = exams.get(i).getId();
            if(!this.student.getExams().containsKey(idExam)){
                modelList.addElement(exams.get(i).getId() + " - " + exams.get(i).getName() + " - Professor(a): " + exams.get(i).getProfessor().getName());
            }
        }

        if(modelList.isEmpty()){
            JLabel empty = new JLabel("Nenhuma prova disponível!");
            gbc.gridy++;
            panel.add(empty, gbc);
        }

        list = new JList<>(modelList);

        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 1) { // Detectar 1 clique
                    int index = list.locationToIndex(evt.getPoint()); //Index do item selcionado

                    String examContent = modelList.getElementAt(index);
                    String[] infoExam = examContent.split("-");
                    int idExam = Integer.parseInt(infoExam[0].replaceAll("\\s", ""));
                    
                    Exam examSelected = database.getExam(idExam);
                    HashMap<Integer, String> userResponse = new HashMap();
                    Collections.shuffle(examSelected.getQuestions());
                    new TestApplication(0, examSelected, userResponse, student);
                    dispose();
                }
            }
        }); 

        gbc.gridy++;
        panel.add(list, gbc);

        viewNote = new JButton("Ver notas");
        viewNote.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                viewNotes(evt);
            }
        });

        gbc.gridy++;
        panel.add(viewNote, gbc);

        add(panel);
        setVisible(true);

    }

    public void viewNotes(ActionEvent evt){
        new ViewNotes(this.student);
        dispose();
    }
}

