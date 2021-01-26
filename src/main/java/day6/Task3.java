package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ирина Сергеевна", "Биология");
        Student student = new Student("Петр Владимирович");
        teacher.setName("Ирина Сергеевна");
        teacher.setSubject("Биология");
        teacher.evaluate(student);
    }
}
