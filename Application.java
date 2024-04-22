import javax.swing.*;
import models.Exam;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import app.*;

public class Application{    
    
    public static void main(String[] args){  

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Database context = new Database();

                List<Exam> exam = context.getExam();

                Collections.shuffle(exam);

                HashMap<Integer, String> userResponse = new HashMap<>();    

                new QuestionScreen(0, exam, userResponse);

                System.out.println("Quiz concluido com sucesso!");
            }
        });
        
        
    }
}