import src.models.*;
import src.Database;

public class Application {
    public static void main(String[] args){
        Exam exam;
        Database database = new Database();

        exam = database.getExam(1);

        System.out.println(exam.getProfessor().toString());
    }
}
