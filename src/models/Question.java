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

    public Question(int idExam, String statement, String option1, String option2, String option3, String option4, String option5, String result){
        this.idExam = idExam;
        this.statement = statement;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.result = result;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdExam() {
        return idExam;
    }

    public void setIdExam(int idExam) {
        this.idExam = idExam;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", idExam=" + idExam + ", statement=" + statement + ", option1=" + option1
                + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", option5=" + option5
                + ", result=" + result + "]";
    }

    
    
}

