import java.util.Date;

public class Message {
    private final String sender;
    private final String text;
    private final String target;
    private final Date timestamp;

    public Message(String sender, String text, String target) {
        this.sender = sender;
        this.text = text;
        this.target = target;
        this.timestamp = new Date();
    }

    public String getSender() { return sender; }
    public String getText() { return text; }
    public String getTarget() { return target; }
    public Date getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        if (target == null) {
            return "[" + sender + "]: " + text;
        } else {
            return "[Private from " + sender + "]: " + text;
        }
    }
}
