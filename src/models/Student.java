package src.models;

import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private String user;
    private String password;
    private HashMap<Integer, Float> exams; // <Id da prova, Resultado da prova>

    public Student(){

    }

    public Student(int id, String name, String user, String password) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
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
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public HashMap<Integer, Float> getExams() {
        return exams;
    }
    public void setExams(HashMap<Integer, Float> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", user=" + user + ", password=" + password + ", exams=" + exams
                + "]";
    }

    
}
