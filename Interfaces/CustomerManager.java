package Interfaces;

public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }
    public void add(Customer customer){
        System.out.println("Musteri Eklendi "+customer.getFirstname());
        Utils.runLoggers(loggers,customer.getFirstname());

    }
    public void delete(Customer customer){
        System.out.println("Musteri Silindi"+customer.getFirstname());
        Utils.runLoggers(loggers,customer.getFirstname());
    }
}
