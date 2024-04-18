package app;

import java.sql.*;
import models.*;
import java.util.List;
import java.util.ArrayList;

public class Database {
    private static String password = "database";
    private static String url = "jdbc:mysql://localhost:3306/enadeSys";
    private static String user = "root";

    public List<Exam> getExam(){
        List<Exam> exams = new ArrayList<Exam>();
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM exam";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                Exam newExam = new Exam(
                    result.getInt("id"), 
                    result.getString("question"), 
                    result.getString("option1"),
                    result.getString("option2"),
                    result.getString("option3"),
                    result.getString("option4"),
                    result.getString("option5"),
                    result.getString("answer")
                );

                exams.add(newExam);
            }

            return exams;

        }catch(Exception e){
            System.err.println(e);
            return exams;
        }
    }
}
