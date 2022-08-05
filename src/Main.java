import java.util.*;

public class Main
{

    private static Scanner scnr = new Scanner(System.in);

    // Crete queue to hold person objects
    private static PriorityQueue<Person> personQueue = new PriorityQueue();
    private static PriorityQueue<Integer> ageQueue = new PriorityQueue();
    private static PriorityQueue<String> lastNameQueue = new PriorityQueue(Collections.reverseOrder());

    private static void printQueueContents()
    {
        System.out.println(personQueue.toString());
    }

    // Get info for the person objects
    private static void getPersonInfo(Queue<Person> personQueue)
    {
        // To help create person objects
        String tempFirstName;
        String tempLastName;
        int tempAge;
        int count = 0;

        while (count < 5)
        {
            System.out.println("People entered: " + count + " of 5");
            System.out.println("First name: ");
            tempFirstName = scnr.next();
            System.out.println("Last name: ");
            tempLastName = scnr.next();
            System.out.println("Age: ");
            tempAge = scnr.nextInt();

            // Add new person to queue
            personQueue.add(new Person(tempFirstName, tempLastName, tempAge));

            count++;
        }
    }

    public static void main(String[] args)
    {
        // Get info for 5 people
        getPersonInfo(personQueue);

        // Print queue contents
        System.out.println("Unsorted: ");
        printQueueContents();

        // Sort contents in descending order by last name
        System.out.println("\nSorted in descending order by last name: ");
        personQueue.forEach(Person -> lastNameQueue.add(Person.lastName));
        while (!lastNameQueue.isEmpty())
        {
            System.out.println(lastNameQueue.poll());
        }

        // Sort contents by age
        System.out.println("\nSorted by age: ");
        personQueue.forEach(Person -> ageQueue.add(Person.age));
        while (!ageQueue.isEmpty())
        {
            System.out.println(ageQueue.poll());
        }

    }
}