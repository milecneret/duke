package Task;

public class Task {
    protected String description;
    protected String status = "[ ] ";

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void markDone() {
        status = "[X] ";
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