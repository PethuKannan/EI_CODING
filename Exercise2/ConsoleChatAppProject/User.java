import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class User implements Observer {
    private final String name;
    private final BlockingQueue<Message> inbox = new LinkedBlockingQueue<>();
    private ClientAdapter adapter;

    public User(String name, ClientAdapter adapter) {
        this.name = name;
        this.adapter = adapter;
    }

    public String getName() { return name; }

    @Override
    public void update(Message message) {
        if (message.getTarget() == null || message.getTarget().equals(this.name)) {
            inbox.add(message);
        }
    }

    public void sendMessage(ChatRoom room, String text) {
        room.broadcast(new Message(name, text, null));
    }

    public void sendPrivate(ChatRoom room, String target, String text) {
        room.broadcast(new Message(name, text, target));
    }

    public void readMessages() {
        Message msg;
        while ((msg = adapter.receive(this)) != null) {
            System.out.println(name + " RECEIVED: " + msg);
        }
    }

    public BlockingQueue<Message> getInbox() { return inbox; }
}
