public class Person {
   String name;
   String breed;

    public Person(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Person person1=new Person("siva","aaa");
        Person person2=new Person("sudarsasa","bbb");

        System.out.println(person1.getName()+"is a "+person1.getBreed()+".");
        System.out.println(person2.getName()+"is a "+person2.getBreed()+".");

        person1.setName("siva1");
        person2.setName("sudarsan1");

        System.out.println(person1.getName()+" is a "+person1.getBreed()+".");
        System.out.println(person2.getName()+" is a "+person2.getBreed()+".");

    }
}
