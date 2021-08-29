import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);

//        Level 1. Greet, Echo, Exit
        String line; //to take in the string
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");
        List<String> list = new ArrayList<String>(); //add string array to store values
        int index=1; //for printing string array later
        line = in.nextLine();

        while(!line.equals("bye")){

            if (line.equals("list")){
                for(String item : list) {
                    System.out.println((index++)+". "+item); //print string array
                }
            }
            list.add(line);
            System.out.println("added: " + line);
            line = in.nextLine();
        }

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
