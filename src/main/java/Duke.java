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
    public static int index=1; //for printing string array later
    public static String inputType; //

    private static void printList(){
        System.out.println("Here are the tasks in your list:");
        for(Task item : taskList) {
            System.out.println((index++)+". "+item); //print string array
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");

        line = in.nextLine();

        while(!line.equals("bye")){
            if (line.equals("list")){
                printList();
                line = in.nextLine();
            }
            Todo todo = new Todo(line);
            taskList.add(todo);
            line = in.nextLine();

        }

//        while(!line.equals("bye")){
//            if (line.equals("list")){
//                printList();
//                line = in.nextLine();
//            }
//            addTask(line);
//            line = in.nextLine();
//
//        }


        //test out date time class
        //write the logic for main object
        //everytime when add new item, show this "Now you have 5 tasks in the list."
        //for the string, splitstring method to split, 'by', 'at'
        //implement switch case

        //Deadline d = new Deadline("Read textbook", "Nov 16");





        //scanner have to split the characters with the 'by' keyword to differentiate todo vs deadline
        //implement case?

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
