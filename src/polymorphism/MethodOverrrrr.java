package polymorphism;

public class MethodOverrrrr {

        String name;
        int age;

        public MethodOverrrrr(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display(){
            System.out.println("name :"+name);
            System.out.println("age  :"+age);
        }
      static   class A extends MethodOverrrrr{
            String Companyname;
            public A(String name, int age,String n) {
                super(name, age);
                this.Companyname=n;
            }
            void display(){
                System.out.println("name :"+name);
                System.out.println("age  :"+age);
                System.out.println("CompanyName :"+Companyname);
            }
        }


    public static void main(String[] args) {
//            MethodOverrrrr obj=new MethodOverrrrr("sudarsan",45);
//            obj.display();
        A a=new A("sudrasan",32,"Embitel");
        a.display();

    }
}


