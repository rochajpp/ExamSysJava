package src;
import java.sql.*;
import src.models.*;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private String password = "database";
    private String url = "jdbc:mysql://localhost:3306/pooDb";
    private String user = "root";

    public List<Exam> getAllExams(){
        List<Exam> exams = new ArrayList<Exam>();
        Professor professor = new Professor();
        List<Question> questions = new ArrayList<Question>();
        try{
            Connection connection = DriverManager.getConnection(url, this.user, password);

            String query = "SELECT * FROM exam";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                String queryProfessor = "SELECT * FROM professor WHERE id=" + result.getInt("id_professor");
                PreparedStatement preparedStatementProfessor = connection.prepareStatement(queryProfessor);
                ResultSet resultProfessor = preparedStatementProfessor.executeQuery();

                if(resultProfessor.next()){
                    professor = new Professor(
                        resultProfessor.getInt("id"),
                        resultProfessor.getString("name"),
                        resultProfessor.getString("user"),
                        resultProfessor.getString("password")
                    );
                }

                String queryQuestions = "SELECT * FROM question WHERE id_exam=" + result.getInt("id");
                PreparedStatement preparedStatementQuestions = connection.prepareStatement(queryQuestions);
                ResultSet resultQuestions = preparedStatementQuestions.executeQuery();
                
                while(resultQuestions.next()){
                    Question question = new Question(
                        resultQuestions.getInt("id"),
                        resultQuestions.getInt("id_exam"),
                        resultQuestions.getString("statement"),
                        resultQuestions.getString("option1"),
                        resultQuestions.getString("option2"),
                        resultQuestions.getString("option3"),
                        resultQuestions.getString("option4"),
                        resultQuestions.getString("option5"),
                        resultQuestions.getString("result")
                    );

                    questions.add(question);
                }

                Exam exam = new Exam(result.getInt("id"), result.getString("name"), professor, questions);
                exams.add(exam);
            }

            connection.close();
            return exams;

        } catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public Student getStudent(String user){
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

                HashMap<Integer, Float> exams = new HashMap<Integer, Float>();

                while(resultExams.next()){
                    exams.put(resultExams.getInt("id_exam"), resultExams.getFloat("result"));
                }

                student.setExams(exams);
                connection.close();
                return student;
            } else{
                Student student = new Student();
                connection.close();
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
                        resultQuestion.getString("option5"),
                        resultQuestion.getString("result")

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

    public void saveStudentExam(StudentExam studentExam){
        try{
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

            String query = "INSERT INTO student_exam (id_student, id_exam, result) VALUES (" + studentExam.getIdStudent() + ", " + studentExam.getIdExam() + ", " + studentExam.getResult() + ")";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.executeUpdate();

            connection.close();
            return;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar a prova, contate o administrador!");
            System.err.println(e);
            return;
        }


    }

    public Professor getProfessor(String user){
        try{
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

            String getProfessorQuery = "SELECT * FROM professor WHERE user='" + user + "'";
            
            PreparedStatement preparedStatement = connection.prepareStatement(getProfessorQuery);

            ResultSet result = preparedStatement.executeQuery();

            Professor professor = new Professor();
            if(result.next()){
                professor = new Professor(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getString("user"),
                    result.getString("password")
                );
            }
            
            connection.close();
            return professor;

        } catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public List<Exam> getExamsByProfessor(Professor professor){
        try{
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

            String getExams = "SELECT * FROM exam WHERE id_professor=" + professor.getId();

            PreparedStatement preparedStatement = connection.prepareStatement(getExams);

            ResultSet result = preparedStatement.executeQuery();

            List<Exam> exams = new ArrayList<Exam>();
            while(result.next()){
                String getQuestions = "SELECT * FROM question WHERE id_exam=" + result.getInt("id");
                preparedStatement = connection.prepareStatement(getQuestions);

                ResultSet resultQuestions = preparedStatement.executeQuery();

                List<Question> questions = new ArrayList<Question>();
                while(resultQuestions.next()){
                    
                    Question question = new Question(
                        resultQuestions.getInt("id"),
                        resultQuestions.getInt("id_exam"),
                        resultQuestions.getString("statement"),
                        resultQuestions.getString("option1"),
                        resultQuestions.getString("option2"),
                        resultQuestions.getString("option3"),
                        resultQuestions.getString("option4"),
                        resultQuestions.getString("option5"),
                        resultQuestions.getString("result")
                    );

                    questions.add(question);
                }
                Exam exam = new Exam(
                    result.getInt("id"),
                    result.getString("name"),
                    professor,
                    questions
                );

                exams.add(exam);
            }

            connection.close();
            return exams;
        } catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public int saveExam(String name, Professor professor){
        try{
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

            String insertExam = "INSERT INTO exam (name, id_professor) VALUES ('" + name + "', " + professor.getId() + ")";

            PreparedStatement preparedStatement = connection.prepareStatement(insertExam, Statement.RETURN_GENERATED_KEYS);

            int result = preparedStatement.executeUpdate();

            if(result == 1){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                System.out.println();
                if(resultSet.next()){
                    int id = resultSet.getInt(1);
                    return id;
                }  
            }
            connection.close();
            return 0;
        } catch(Exception e){
            System.err.println(e);
            return 0;
        }
    }

    public void saveQuestion(Question question){
        try{
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

            String saveQuestion = "INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES (" + question.getIdExam() + ", '" + question.getStatement() + "', '" + question.getOption1() + "', '" + question.getOption2() + "', '" + question.getOption3() + "', '" + question.getOption4() + "', '" + question.getOption5() + "', '" + question.getResult() + "')";

            PreparedStatement preparedStatement = connection.prepareStatement(saveQuestion);

            preparedStatement.executeUpdate();
            connection.close();

            return;
                
        } catch(Exception e){
            System.err.println(e);
            return;
        }
    }
}
