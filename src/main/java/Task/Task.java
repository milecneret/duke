package Task;

public class Task {
    protected String description;

    public Task(String description) {
        this.description = description;
        System.out.println("Got it. I've added this task:\r\n" + description) ;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
//    public String toString() {
//        return "description: " + description;
//    }
}