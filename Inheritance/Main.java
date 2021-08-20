package Inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer taleh = new IndividualCustomer();
        taleh.customerNumber="234";
        CorporateCustomer AzCoder= new CorporateCustomer();
        AzCoder.customerNumber="AzCoder";
        CustomerManager customerManager=new CustomerManager();
        Customer[] customers={taleh,AzCoder};
        customerManager.addMultiple(customers);
    }
}
