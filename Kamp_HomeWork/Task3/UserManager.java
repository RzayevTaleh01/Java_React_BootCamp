package HomeWork.Task3;

public class UserManager {

    public void login(Instructor instructor){
        System.out.println("Instructor login");
    }
    public void login(Student student){
        System.out.println("Student login");
    }
    public void logout() {
        System.out.println("logout");
    }
}
