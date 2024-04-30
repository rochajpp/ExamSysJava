package src.models;

public class Question {
    private int id;
    private int idExam; // Identificar de qual prova a questão pertence
    private String statement;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String result;

    public Question(){

    }

    public Question(int id, int idExam, String statement, String option1, String option2, String option3, String option4, String option5, String result){
        this.id = id;
        this.idExam = idExam;
        this.statement = statement;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.result = result;
    }
}

