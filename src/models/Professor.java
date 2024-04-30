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

    
}
