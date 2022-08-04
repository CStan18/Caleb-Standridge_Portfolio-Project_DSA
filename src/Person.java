import java.util.Scanner;

public class Person
{
    String firstName;
    String lastName;
    int age;

    public Person(String newFirstName, String newLastName, int newAge)
    {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.age = newAge;
    }

    public String toString()
    {
        return "\n" + this.firstName + "  " + this.lastName + " " + this.age;
    }

}
