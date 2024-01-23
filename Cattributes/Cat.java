package Cattributes;

// Instance variables capture the essence of an object's state within a Java class. In the Cat class, the properties name and age are specific to each Cat object. Each Cat object has a unique identity. 

// Encapsulation is employed by making the name and age variables private, which means they can't be accessed directly from outside the class. Instead, public getters and setters are provided to interact with these properties safely. This not only protects the data from being changed in unintended ways but also enables a controlled interface for other classes to interact w/ the Cat objects. 

public class Cat {
    // Private instance variables, encapsulating the state of the Cat object
    private String name;
    private int age;

    // Constructor that initializes a Cat object with a given name and age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for the name, allowing read access to the private variable
    public String getName() {
        return this.name;
    }

    // Public setter for the name, allowing write access to the private variable
    public void setName( String name) {
        this.name = name;
    }

    // Public getter for the age, allowing read access to the private variable
    public int getAge() {
        return this.age;
    }

    // Public setter for the age, allowing write access to the private variable
    public void setAge(int age) {
        this.age = age;
    }

    // Public method to display the Cat's attributes (Cattributes)
    public void displayInfo() {
        System.out.println(this.name + " is " + this.age + " year(s) old.");
    }
}
