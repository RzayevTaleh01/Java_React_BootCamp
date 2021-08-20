package Lesson4_Task3;

import java.util.Date;

public class Player {
    private int id;
    private String name;
    private String lastname;
    private Date birth;
    private String country;

    public Player() {

    }

    public Player(int id, String name, String lastname, Date birth, String country) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birth = birth;
        this.country = country;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
