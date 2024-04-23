package app.models;

import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private String user;
    private String password;
    private HashMap<Integer, Float> exams; // <Id da prova, Resultado da prova>
}
