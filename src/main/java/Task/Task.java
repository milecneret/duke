package Task;

public class Task {
    protected String description;
    protected String status = "[ ] ";

    public Task(String description) {
        this.description = description;
        System.out.println("Got it. I've added this task:\r\n" + description) ;
    }

    public String getDescription() {
        return description;
    }

    public void markDone() {
        status = "[X] ";
        System.out.println("Nice! I've marked this task as done: \r\n" + status + description) ;
    }

    public boolean isDone() {
        if(status.equals("[ ] ")) return false;
        else return true;
    }

    @Override
    public String toString() {
        return description;
    }
}