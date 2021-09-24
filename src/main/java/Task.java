public class Task {
    protected String description;
    protected boolean isDone;
    private int id;

    public Task(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    //...

    public void markDone() {
        isDone = true;
        System.out.println("Nice! I've marked this task as done: \n[X] " + this.description);
    }

    @Override
    public String toString() {
        String doneIndicator = this.isDone
                ? "[X]"
                : "[ ]";
        return (
                (this.id + 1) + ". " + doneIndicator + " " + this.description
        );
    }
}