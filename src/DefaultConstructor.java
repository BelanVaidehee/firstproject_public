class Person {
    String name;

    Person() {
        name = "Vaidehee Belan";
    }

    void DisplayName() {
        System.out.println("My name is: " + name);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Person personobj = new Person();

        personobj.DisplayName();
    }
}
