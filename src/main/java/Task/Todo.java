package Task;

public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        String status = null;
        if (isDone){
            status = "[x] ";
        } else {
            status = "[ ] ";
        }
        return status + super.toString() ;
        //return "[D]" + super.toString() + " (by: " + by + ")";
    }
}

//System.out.println("added: " + description);