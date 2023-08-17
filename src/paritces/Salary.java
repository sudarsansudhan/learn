package paritces;

public class Salary {
    String name;
    String  job_title;
    double salary;

    public Salary(String name, String job_title, double salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculate(){
        return salary * 12;
    }
    public void updateSalary(double percentageIncrease){
        double increase= salary* percentageIncrease/100;
        salary=+increase;
    }

    public static void main(String[] args) {
        Salary salary1=new Salary("sudarsan","software",34);

        System.out.println(salary1.getName());
        System.out.println(salary1.getJob_title());
        System.out.println(salary1.getSalary());


        double anualsalry=salary1.calculate();
        System.out.println("Aunal salary "+anualsalry);

        salary1.updateSalary(10);

        System.out.println("update salry "+salary1.getSalary());



    }
}
