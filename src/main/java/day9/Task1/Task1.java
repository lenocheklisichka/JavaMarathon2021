package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Евгений");
        human.printInfo();
        Student student = new Student("Евгений","Английский А3");
        student.printInfo();
        student.getGroupName();
        student.getName();
        Teacher teacher = new Teacher("Евгений", "Английский");
        teacher.getName();
        teacher.getSubjectName();
        teacher.printInfo();
    }
}
