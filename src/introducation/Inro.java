package introducation;

public class Inro {
    public static void main(String[] args) {
        //store 5 rollno
        int[] num=new int[5];

        //store 5 names
        String[]name =new String[5];
        //date of 5 student{roll_no,names,marks}
        int[] roll_no=new int[5];
        String[] names=new String[5];
        float[] marsk=new float[5];

        //if Teacher is asking to store signle line,then we can create class
        Student[] students=new Student[5];

        //just declaring
        /*Student sudhan;
        sudhan=new Student();*/
        Student sudhan=new Student();

        sudhan.roll_no=12;
        sudhan.names="sudhan";
        sudhan.marsk=34.6f;

        sudhan.newname("shoe name");
        sudhan.gretting();

        Student random=new Student(sudhan);
        System.out.println(random.names);


        //memory allocation
        Student one=new Student();
        Student two=one;

        one.names="something somethink !";
        System.out.println(two.names);
       /* System.out.println(sudhan.roll_no);
        System.out.println(sudhan.names);
        System.out.println(sudhan.marsk);*/

    }
    //create a class
    //for every signle student
    static class Student{
        int roll_no;
        String names;
        float marsk;

        //we need a way to add the value of the above
        //properties object by object
        //we need one word to acess every object
        void gretting(){
            System.out.println("Hello ! my name is "+names);
        }
        void newname(String newName){
            names=newName;
        }

        public Student(int roll_no, String names, float marsk) {
            this.roll_no = roll_no;
            this.names = names;
            this.marsk = marsk;
        }

        public Student() {
            this.roll_no = roll_no;//random name with this
            this.names = names;
            this.marsk = marsk;
        }



        //create another construtor from calling another object
        Student(Student other){
            this.names=other.names;
            this.roll_no=other.roll_no;
            this.marsk=other.marsk;
        }
    }
}
