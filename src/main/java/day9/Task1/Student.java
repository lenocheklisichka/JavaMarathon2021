package day9.Task1;

public class Student extends Human {
    private final String groupName;

    public String getGroupName() {
       return groupName;
    }
    public Student(String name,String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void printInfo() {
        super.getName();
        System.out.println("Этот студент с именем "+ getName() + ", группа: " + getGroupName());
    }
}
