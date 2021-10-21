import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import Task.*;

public class Duke {
    public static List<Task> taskList = new ArrayList<Task>(); //array to store Task objects
    public static String line; //to take in the string
    public static int index=1; //for printing string array later

    private static void printList(){
        for(Task item : taskList) {
            System.out.println((index++)+". "+item); //print string array
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");

        line = in.nextLine();

        Todo t = new Todo(line);
        //Deadline d = new Deadline("Read textbook", "Nov 16");

//        while(!line.equals("bye")){
//            if (line.equals("list")){
//                printList();
//                line = in.nextLine();
//            }
//            addTask(line);
//            line = in.nextLine();
//
//        }



        //scanner have to split the characters with the 'by' keyword to differentiate todo vs deadline
        //implement case?

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
