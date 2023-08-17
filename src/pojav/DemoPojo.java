package pojav;

public class DemoPojo {

    String name;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        DemoPojo demoPojo=new DemoPojo();
        demoPojo.setName("sudarsabn");
        demoPojo.setAge(23);
        demoPojo.setSalary(45678);

        System.out.println("name "+demoPojo.getName());
        System.out.println("age "+demoPojo.getAge());
        System.out.println("salery "+demoPojo.getSalary());
    }
}
