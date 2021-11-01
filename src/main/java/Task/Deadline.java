package Task;

public class Deadline extends Todo {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    //to modify to datetime class later
    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String getDescription(){
        return "[D]" + status + this.description  + " (by: " + by +")" ;
    }
}