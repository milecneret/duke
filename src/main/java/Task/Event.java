package Task;

public class Event extends Todo {
    String symbol = "[E]";
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    public Event(String description) {
        super(description);
    }

    //to modify to datetime class later
    public void setBy(String at) {
        this.at = at;
    }

    public String getBy() {
        return at;
    }

    @Override
    public String getDescription(){
        return "[E]" + status + this.description + " (at: " + at +")" ;
    }

}