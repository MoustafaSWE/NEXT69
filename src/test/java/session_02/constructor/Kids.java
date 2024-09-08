package session_02.constructor;

public class Kids {

    String name;
    int age;
    int id;

    public Kids(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void displayKidName (){
        System.out.println("Kid Name is: " + name
                +"\nage: " + age
        + "\nid: " + id);
    }

}
