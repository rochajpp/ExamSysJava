package src;
import java.sql.*;
import src.models.*;
import java.util.List;
import java.util.ArrayList;

public class Database {
    private static String password = "database";
    private static String url = "jdbc:mysql://localhost:3306/pooDb";
    private static String user = "root";

    public List<Exam> getExam(){
        List<Exam> exam = new ArrayList<Exam>();
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM exam";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                Exam newExam = new Exam();

                exam.add(newExam);
            }

            return exam;

        }catch(Exception e){
            System.err.println(e);
            return exam;
        }
    }
}
