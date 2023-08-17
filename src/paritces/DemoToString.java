package paritces;

public class DemoToString {
    public static void main(String[] args) {
        Student student=new Student(1,"sudarsan");
        System.out.println(student);
    }


}
class Student{
    int roll_no;
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}
