import java.util.Arrays;
import java.util.Scanner;

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
        line = in.nextLine();

        while(!line.equals("bye")){
            System.out.println(line);
            line = in.nextLine();
        }

        System.out.println("Bye. Hope to see you again soon!\n");

    }
}
