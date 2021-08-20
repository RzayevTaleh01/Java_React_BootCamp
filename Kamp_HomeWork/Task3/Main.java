package HomeWork.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________________ Instructor _____________________________________");
        Instructor instructor1 = new Instructor(1,"Engin","Demirog","info@az","engin123");
        Instructor[] instructors={instructor1};
        for (Instructor instructor:instructors){
            System.out.println(instructor.getName());
            System.out.println(instructor.getSurname());
            System.out.println(instructor.getEmail());
        }
        System.out.println("----------------------");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addHomework(instructor1);
        instructorManager.addCourse(instructor1);
        UserManager userManager = new UserManager();
        userManager.login(instructor1);
        userManager.logout();

        System.out.println("________________________ Student ____________________________________---");
        Student student1 = new Student(2,"Taleh","Rzayev","info@as","taleh123");
        Student[] students={student1};
        for (Student student:students){
            System.out.println(student1.getName());
            System.out.println(student1.getSurname());
            System.out.println(student1.getEmail());
        }
        System.out.println("----------------------");
		userManager.login(student1);
        StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student1);
        userManager.login(student1);
        userManager.logout();
}
}