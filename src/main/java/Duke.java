import java.util.Arrays;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;
import Task.*;

public class Duke {
    public static List<Task> taskList = new ArrayList<Task>(); //array to store Task objects
    public static String line; //to take in the string
    public static String inputType; //

    private static void printList(){
        int index=1; //for printing string array later
        System.out.println("Here are the tasks in your list:");
        for(Task item : taskList) {
            System.out.println((index++)+". "+item.getDescription()); //print string array
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");

        String [] instruction;

        do{
            line = in.nextLine();
            instruction = line.split(" ",2);
            switch (instruction[0]) {
                case "todo":
                    taskList.add(new Todo(instruction[1]));
                    System.out.println("Now you have " + taskList.size() + " tasks in the list.");
                    break;
                case "deadline":
                    taskList.add(new Deadline(instruction[1]));
                    System.out.println("Now you have " + taskList.size() + " tasks in the list.");
                    break;
                case "event":
                    taskList.add(new Event(instruction[1]));
                    System.out.println("Now you have " + taskList.size() + " tasks in the list.");
                    break;
                case "list":
                    printList();
                    break;
                case "done":
                    taskList.get(Integer.parseInt(instruction[1])-1).markDone();
                    break;
                case "bye":
                    break;
                default: //by default everything is todo if no specific instructions
                    taskList.add(new Todo(line));
                    System.out.println("Now you have " + taskList.size() + " tasks in the list.");
                    break;
            }
        }
        while(!instruction[0].equals("bye"));

        //test out date time class
        //for the string, splitstring method to split, 'by', 'at'

        //Deadline d = new Deadline("Read textbook", "Nov 16");

        //scanner have to split the characters with the 'by' keyword to differentiate todo vs deadline

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
