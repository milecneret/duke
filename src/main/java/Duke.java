import java.util.Scanner;
import java.util.*;

public class Duke {
    public static String line; //to take in the string

    Task[] tasks = new Task[100];
    int count = 0;

    private void addTask(String t) {
        Task newTask = new Task(t, count);
        tasks[count] = newTask;
        count++;

        System.out.println("added: " + t);
    }

    private String printTaskList() {
        String tasksList = "Here are the tasks in your list: \n";
        for (int i = 0; i < count; i++) {
            tasksList += this.tasks[i].toString() + "\n";
        }

        return (tasksList);
    }

    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);

        Duke DukeMorpheus = new Duke();
        System.out.println("Hello! I'm Duke Morpheus\n");
        System.out.println("What can I do for you?");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        while (!input.equals("bye")) {
            if (input.equals("list")) {
                System.out.println(DukeMorpheus.printTaskList());
            }
            else if (input.split(" ")[0].equals("done")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                DukeMorpheus.tasks[index - 1].markDone();
            }
            else {
                DukeMorpheus.addTask(input);
            }

            input = in.nextLine();
        }
        System.out.println("Bye. Hope to see you again soon!\n");
    }
}
