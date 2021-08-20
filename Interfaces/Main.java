package Interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers={new SmsLogger(),new EmailLogger(),new FileLogger()};
        CustomerManager customerManager=new CustomerManager(loggers);
        Customer Taleh=new Customer(1,"Taleh","Rzayev");
        customerManager.add(Taleh);
    }
}
