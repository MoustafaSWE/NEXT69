package session_02.encapsulation;

public class StudentDisplay {
    public static void main(String[] args) {
        // Create a new object of class 'Person'
        Student person = new Student();

        // Use setter methods to set values
        person.setName("John");
        person.setAge(25);

        // Use getter methods to access values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
