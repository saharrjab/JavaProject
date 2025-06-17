package base;

public abstract class Person {
    public static String name;
    private int age;
    private static int totalPersons = 0;
    private final int Max_AGE = 120;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
public void parle(){
    System.out.println("je parle Person");
}
    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println(" Name : " + name + " l'age :  " + age);
    }

    public static int minVar(int a, int b) {
        if (a < b) {
            return a;
        } else
            return b;
    }

}
