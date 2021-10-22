package Task;

public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
        System.out.println("added: " + description) ;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    public String fullDescription(){
        return "[T]" + this.toString() + this.description;
    }

    @Override
    public String toString() {
        String status = null;
        if (isDone){
            status = "[x] ";
        } else {
            status = "[ ] ";
        }
        return "[T]" + this.toString() + this.description;
        //return status + super.toString() ;
        //return "[T]" + super.toString() + " (by: " + by + ")";
    }


}

//System.out.println("added: " + description);