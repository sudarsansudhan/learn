package paritces;

public  class Employee {
    String name;
    String job_title;
    double salary;

    public Employee(String name, String job_title, double salary) {
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
    public void raiseSalary(double percentage) {
        salary=  salary + salary * percentage / 100;
    }
    public void printEmplyeDetails(){
        System.out.println("name "+name);
        System.out.println("job litle "+job_title);
        System.out.println("salary "+salary);
    }




    public static void main(String[] args) {
        Employee employee=new Employee("eee","ew",76);

        employee.printEmplyeDetails();

        employee.setSalary(345);



        System.out.println(employee.getSalary());
        employee.raiseSalary(45);
        employee.printEmplyeDetails();





    }


}
