package Stringintro;

public class StringDemo {
    public static void main(String[] args) {
        //String value in java
        String a="sudarsan";
        String b="sudarsan";//String litrail
        //to check the value
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println("A Hashcode:"+a.hashCode());
        System.out.println("B Hashcode:"+b.hashCode());

        //to check String to Equal
        System.out.println("Eqaul :"+a.equals(b));
        //to check without Uppercase
        System.out.println("uppercase or lowercase :"+a.equalsIgnoreCase(b));

        //to find length
        System.out.println("length :"+a.length());
        //to find index of the length
        System.out.println("index of length :"+a.charAt(0));//we need to give index value
        //to change uppercase
        System.out.println("Uppercase :"+a.toUpperCase());//String immutable it's changeing copy of value
        //to change lowercase
        System.out.println("lowercase :"+a.toLowerCase());
        //to replce the value
        System.out.println("Replace :"+a.replace("sudarsan","sudarsan1"));
        //to check the value is there or not
        System.out.println("Contains :"+a.contains("s"));
        //to check string is empty or not
        System.out.println("empty or not :"+a.isEmpty());
        //we can check the endletter or startletter
        System.out.println("Endletter :"+a.endsWith("n"));
        System.out.println("Stratletter :"+a.startsWith("s"));

        //substring
        System.out.println("substring :"+a.substring(2));
        System.out.println("substring start to end "+b.substring(0,3));//startindex to endindex

        //to change chararray
        char chararry[]=a.toCharArray();
        for (char c:chararry){
            System.out.print(c);
        }
        //to remove unwamted spaces
        String d=" sudh ";
        System.out.println("to remove spces :"+d.length());
        System.out.println("d to tirm to avoid space"+d.trim());


    }
}
