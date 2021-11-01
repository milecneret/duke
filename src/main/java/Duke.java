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

    private static void printList() {
        int index = 1; //for printing string array later
        System.out.println("Here are the tasks in your list:");
        for (Task item : taskList) {
            System.out.println((index++) + ". " + item.getDescription()); //print string array
        }
    }

    private static void find(String keyword) {
        System.out.println("Here are the matching tasks in your list:");
        for (Task item : taskList) {
            if(item.getDescription().contains(keyword)){
                System.out.println(item.getDescription());
            }
        }
    }

    private static void AddingNewItemToList() {
        System.out.println("Got it. I've added this task:\n" + taskList.get(taskList.size() - 1).getDescription()) ;
    }

    private static void printCurrentListCount() {
        System.out.println("Now you have " + taskList.size() + " tasks in the list.");
    }

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");

        String[] instruction;

        do {
            line = in.nextLine();
            instruction = line.split(" ", 2);
            switch (instruction[0]) {
                case "todo":
                    taskList.add(new Todo(instruction[1]));
                    AddingNewItemToList();
                    printCurrentListCount();
                    break;
                case "deadline":
                    instruction = line.split(" /by ", 2); //further split using keyword "/by"
                    taskList.add(new Deadline(instruction[0].replace("deadline ",""), instruction[1]));
                    AddingNewItemToList();
                    printCurrentListCount();
                    break;
                case "event":
                    instruction = line.split(" /at ", 2); //further split using keyword "/by"
                    taskList.add(new Event(instruction[0].replace("event ",""), instruction[1]));
                    AddingNewItemToList();
                    printCurrentListCount();
                    break;
                case "list":
                    printList();
                    break;
                case "done":
                    taskList.get(Integer.parseInt(instruction[1]) - 1).markDone();
                    System.out.println("Nice! I've marked this task as done:") ;
                    System.out.println(taskList.get(Integer.parseInt(instruction[1]) - 1).getDescription());
                    break;
                case "delete":
                    System.out.println("Noted. I've removed this task:");
                    System.out.println(taskList.get(Integer.parseInt(instruction[1]) - 1).getDescription());
                    taskList.remove(Integer.parseInt(instruction[1]) - 1);
                    break;
                case "find":
                    find(instruction[1]);
                    break;
                case "bye":
                    break;
                default: //by default everything is todo if no specific instructions
                    taskList.add(new Todo(line));
                    AddingNewItemToList();
                    printCurrentListCount();
                    break;
            }
        }
        while (!instruction[0].equals("bye"));

        //test out date time class
        //for the string, splitstring method to split, 'by', 'at'

        //Deadline d = new Deadline("Read textbook", "Nov 16");

        //scanner have to split the characters with the 'by' keyword to differentiate todo vs deadline

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
