import javax.swing.JOptionPane;
import app.Database;
import models.Exam;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Application{    

    public static char question(Exam exam){

        

        return 'a';
    }
    
    public static void main(String[] args){  
        Database context = new Database();

        List<Exam> exam = context.getExam();

        Collections.shuffle(exam);

        HashMap<Integer, String> template = new HashMap<>();

        for(int i = 0; i < exam.size(); i++){
            template.put(i + 1, exam.get(i).getAnswer());
        }

        for(int i = 0; i < exam.size(); i++){

        }
    }
}