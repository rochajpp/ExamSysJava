package src.models;

public class StudentExam {
    private int idStudent;
    private int idExam;
    private float result;

    public StudentExam(int idStudent, int idExam, float result){
        this.idStudent = idStudent;
        this.idExam = idExam;
        this.result = result;
    }

    public int getIdStudent(){
        return this.idStudent;
    }

    public void setIdStudent(int idStudent){
        this.idStudent = idStudent;
    }


    public int getIdExam(){
        return this.idExam;
    }

    public void setIdExam(int idExam){
        this.idExam = idExam;
    }


    public float getResult(){
        return this.result;
    }

    public void setResult(float result){
        this.result = result;
    }
}
