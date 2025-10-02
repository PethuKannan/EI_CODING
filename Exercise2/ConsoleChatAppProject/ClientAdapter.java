public interface ClientAdapter {
    void send(User user, Message payload);
    Message receive(User user);
}
