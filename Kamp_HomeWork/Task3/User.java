package HomeWork.Task3;

public class User {
    private int id;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;
    public User(){

    }
    public User(int id, String name, String surname, String email, String password) {
        this.id = id;
        Name = name;
        Surname = surname;
        Email = email;
        Password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }



}
