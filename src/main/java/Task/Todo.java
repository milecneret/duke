package Task;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
        //System.out.println("Got it. I've added this task:\n" + "[T]" + status + this.description) ;
    }

    @Override
    public String getDescription(){
        return "[T]" + status + this.description;
    }

}

//System.out.println("added: " + description);