package Stringintro;

public class StringbuferandStringbuilder {
    //StringBuffer and StringBuilder
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("sudarsan");
        System.out.println(buffer);
        //to add value
        buffer.append(" sudhan");
        System.out.println(buffer);
        //to add value
        buffer.insert(15,"111");
        System.out.println("after the insert :"+buffer);
        //to replace the value from and to
        buffer.replace(8,10,"@@@");
        System.out.println("replce value from 8 to 11"+buffer);
        //to delete from to
        buffer.delete(8,10);
        System.out.println("to dtele "+buffer);

        // to resver
        buffer.reverse();
        System.out.println("reverse the String "+buffer);
        //to print index
        buffer.charAt(2);
        System.out.println("buffer charAT :"+buffer);
        //to substring
        System.out.println("substing :"+buffer.substring(0));
        System.out.println("substing :"+buffer.substring(0,4));

        //to set the char
        buffer.setCharAt(0,'@');
        System.out.println("adding index :"+buffer);

        //to check the capacity
        StringBuffer sb=new StringBuffer();
        System.out.println("capacity :"+sb.capacity());

        //to check the capacity
        sb.append("hello welcome to my place in embitel");//capacity*2
        System.out.println("after adding the capacity :"+sb.capacity());//now (16*2)+2=34 i.e,(oldcapacity *2)+2;

    }
}
