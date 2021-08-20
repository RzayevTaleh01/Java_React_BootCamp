package Kamp_HomeWork.KodlamaIo_Simulator;
public class Main {
    public static void main(String[] args) {
        System.out.println("_______________________ Teacher Panel ________________________________");
        Teacher teacher1=new Teacher(1,"Taleh Rzayev");
        Teacher teacher2=new Teacher(2,"Engin Demirog");
        TeacherMeneger teacherMeneger=new TeacherMeneger();
        teacherMeneger.addTeacher(teacher1);
        teacherMeneger.removeTaacher(teacher2);
        Teacher[] teachers={teacher1,teacher2};
        for (Teacher teacher:teachers) {
            System.out.println("ID: "+teacher.id);
            System.out.println("Name: "+teacher.name);
        }
        System.out.println("_______________________ Category Panel ________________________________");
        Category category1=new Category(1,"Yazilim");
        Category category2=new Category(2,"Tekoloji");
        CategoryMeneger categoryMeneger=new CategoryMeneger();
        categoryMeneger.addCategory(category1);
        categoryMeneger.DeleteCategory(category2);
        Category[] categories={category1,category2};
        for (Category category:categories) {
            System.out.println("ID: "+category.id);
            System.out.println("Name: "+category.name);
        }
        System.out.println("_______________________ Course Panel ________________________________");
        Course course1 = new Course(
                1,
                "https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0",
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "Engin Demirog");

        Course course2 = new Course(
                2,
                "https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI",
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Engin Demirog"
        );
        Course course3 = new Course(
                3,
                "https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI",
                "Programlamaya Giriş için Temel Kurs",
                "Engin Demirog"
        );
        CourseMeneger courseMeneger=new CourseMeneger();
        courseMeneger.addCourse(course1);
        courseMeneger.removeCourse(course2);
        Course[] courses = {course1, course2, course3};
        for (Course course:courses) {
            System.out.println(course.id);
            System.out.println(course.ImgUrl);
            System.out.println(course.name);
            System.out.println(course.Teacher);
        }

    }
}
