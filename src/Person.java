

public class Person {
// section 1
// returns the person's name
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
}
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello my name is %s\n", this.name);
    }

    public static void main(String[] args) {
        Person duck = new Person("Cody the duck");
        duck.sayHello();

// Section 2
    Person person1 = new Person("John");
    Person person2 = person1;
    person1.sayHello();
    person2.sayHello();
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        person1.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

}

    //     Create a property that belong to everybody
//    public static String species = "HUMAN";
//
//    private String firstName;
//    private String lastName;
//    private String fullName;
//
//    public Person(String fn, String ln){
//        this.firstName = fn;
//        this.lastName = ln;
//    }
//
//    public Person(String fullName){
//        this.fullName = fullName;
//    }
//
//    public String getName(){
//        return this.fullName;
//    }
//
//    public void setName(String fName){
//        this.fullName = fName;
//    }
//
//    public void sayHello() {
//        String out =  String.format("Hello I'm a " +species+" and my name is %s!", this.getName());
//
//        System.out.println(out);
//    }
//
//
//    public static void main(String[] args) {
//        Person fer = new Person("Fer", "Mendoza");
//        fer.sayHello();
//
// Section 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//        person1.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//    }
}




