package Lesson4_Task3;

public class Game {
    private int id;
    private String name;
    private int price;
    private int year;

    public Game(){

    }

    public Game(int id, String name, int price, int year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
