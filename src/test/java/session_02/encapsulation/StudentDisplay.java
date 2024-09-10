package session_02.encapsulation;

public class StudentDisplay {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Mostafa");
        student1.setAge(20);
        student1.setId(234);

        student2.setName("Ali");
        student2.setAge(40);
        student2.setId(122);

        System.out.println("Student 1 name: "
                + student1.getName() + "\nage: "
                + student1.getAge() + "\nid: "
                + student1.getId());

        System.out.println("Student 2 name: "
                + student2.getName() + "\n age: "
                + student2.getAge() + "\n id: "
                + student2.getId());


    }
}
