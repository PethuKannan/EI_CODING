import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Subject {
    private final String roomId;
    private final List<Observer> observers = new ArrayList<>();
    private final List<Message> history = new ArrayList<>();

    public ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
        System.out.println(((User)o).getName() + " joined " + roomId);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
        System.out.println(((User)o).getName() + " left " + roomId);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void broadcast(Message message) {
        history.add(message);
        notifyObservers(message);
    }

    public void printActiveUsers() {
        System.out.print("Active users in " + roomId + ": ");
        for (Observer o : observers) {
            System.out.print(((User)o).getName() + " ");
        }
        System.out.println();
    }
}
