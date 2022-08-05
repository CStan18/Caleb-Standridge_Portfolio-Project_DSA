public class Person implements Comparable<Person> {
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
        return "\n" + this.firstName + " " + this.lastName + " " + this.age;
    }
    @Override
    public int compareTo(Person p) {
        if (age < p.age)
        {
            return -1;
        }
        else if (age > p.age)
        {
            return 1;
        }
        return 0;
    }
}
