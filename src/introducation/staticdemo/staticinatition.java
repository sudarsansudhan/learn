package introducation.staticdemo;


public class staticinatition {

    //inner class should static because it's depenment on outer class
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a=new Test("siva");
        Test b=new Test("old age man");


        System.out.println(a.name);
        System.out.println(b.name);

    }
}
