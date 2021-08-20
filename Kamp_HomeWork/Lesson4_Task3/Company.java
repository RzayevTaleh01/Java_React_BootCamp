package Lesson4_Task3;

import java.util.Date;

public class Company {
    private int id;
    private String name;
    private Date startdate;
    private Date deadline;
    private int price;
    private int discount;

    public Company() {
    }

    public Company(int id, String name, Date startdate, Date deadline, int price, int discount) {
        this.id = id;
        this.name = name;
        this.startdate = startdate;
        this.deadline = deadline;
        this.price = price;
        this.discount = discount;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getPriceAfterDiscount(){
        return this.price-this.price*this.discount/100;
    }
}
