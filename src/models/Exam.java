package src.models;

import java.util.List;

public class Exam {
    private int id;
    private String name;
    private Professor professor;
    private List<Question> questions;

    public Exam(){

    }

    public Exam(int id, String name, Professor professor, List<Question> questions){
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Exam [id=" + id + ", name=" + name + ", professor=" + professor + ", questions=" + questions + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    
}

