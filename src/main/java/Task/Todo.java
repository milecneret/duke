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
    public String getDescription(){
        String status = null;
        if (isDone){
            status = "[x] ";
        } else {
            status = "[ ] ";
        }
        return "[T]" + status + this.description;
    }

}

//System.out.println("added: " + description);