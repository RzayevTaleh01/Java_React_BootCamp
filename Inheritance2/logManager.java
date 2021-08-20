package Inheritance2;

public class logManager {
    public void log(int logType){
        if(logType==1){
            System.out.println("Veritabani");
        }else if(logType==2){
            System.out.println("Dosya");
        }else{
            System.out.println("Email");
        }
    }
}
