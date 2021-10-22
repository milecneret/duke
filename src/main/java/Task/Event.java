package Task;

public class Event extends Todo {

    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    //to modify to datetime class later
    public void setBy(String at) {
        this.at = at;
    }

    public String getBy() {
        return at;
    }

    @Override
    public String fullDescription(){
        return "[E]" + this.toString() + this.description;
    }
}