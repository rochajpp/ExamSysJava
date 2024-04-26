package src.models;

public class Professor {
    private int id;
    private String name;
    private String user;
    private String password;

    public Professor(){

    }

    public Professor(int id, String name, String user, String password){
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Professor [id=" + id + ", name=" + name + ", user=" + user + ", password=" + password + "]";
    }

    
}
