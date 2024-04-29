package src;
import java.sql.*;
import src.models.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private static String password = "database";
    private static String url = "jdbc:mysql://localhost:3306/pooDb";
    private static String user = "root";

    public Student loginStudent(String user){
        try{
            Connection connection = DriverManager.getConnection(url, this.user, password);
            
            String query = "SELECT * FROM student WHERE user = '"  + user + "'";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet result = preparedStatement.executeQuery();
            if(result.next()){
                Student student = new Student();             
                student = new Student(
                    result.getInt("id"), 
                    result.getString("name"), 
                    result.getString("user"), 
                    result.getString("password")
                );
            

                String queryExams = "SELECT * FROM student_exam WHERE id_student = " + student.getId();
                PreparedStatement preparedStatement2 = connection.prepareStatement(queryExams);

                ResultSet resultExams = preparedStatement2.executeQuery();

                HashMap<Integer, Float> exams = new HashMap();

                while(resultExams.next()){
                    exams.put(resultExams.getInt("id_exam"), resultExams.getFloat("result"));
                }

                student.setExams(exams);

                return student;
            } else{
                Student student = new Student();
                return student;
            }
        } catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public Exam getExam(int id){
        Exam exam = new Exam();

        try{

            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM exam WHERE id = " + id;

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet result = preparedStatement.executeQuery();
            

            while(result.next()){
                List<Question> questions = new ArrayList<>();
                Professor professor = new Professor();


                String queryQuestion = "SELECT * FROM question WHERE id_exam=" + result.getInt("id");

                PreparedStatement preparedStatementQuestion = connection.prepareStatement(queryQuestion);
                ResultSet resultQuestion = preparedStatementQuestion.executeQuery();

                while(resultQuestion.next()){
                    Question newQuestion = new Question(
                        resultQuestion.getInt("id"),
                        resultQuestion.getInt("id_exam"),
                        resultQuestion.getString("statement"),
                        resultQuestion.getString("option1"),
                        resultQuestion.getString("option2"),
                        resultQuestion.getString("option3"),
                        resultQuestion.getString("option4"),
                        resultQuestion.getString("option5")

                    );
                    questions.add(newQuestion);
                }


                String queryProfessor = "SELECT * FROM professor WHERE id=" + result.getInt("id_professor");

                PreparedStatement preparedStatementProfessor = connection.prepareStatement(queryProfessor);
                ResultSet resultProfessor = preparedStatementProfessor.executeQuery();

                while(resultProfessor.next()){
                    professor = new Professor(
                        resultProfessor.getInt("id"), 
                        resultProfessor.getString("name"), 
                        resultProfessor.getString("user"), 
                        resultProfessor.getString("password")
                    );
                      
                }
                
               
                exam = new Exam(result.getInt("id"), result.getString("name"), professor, questions);
                connection.close();
                return exam;  
            }
            connection.close();
            return exam = new Exam();

           

        }catch(Exception e){
            System.err.println(e);
            return exam = new Exam();
        }
    }
}
