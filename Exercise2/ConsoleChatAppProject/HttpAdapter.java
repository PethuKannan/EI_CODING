public class HttpAdapter implements ClientAdapter {
    @Override
    public void send(User user, Message payload) {
        System.out.println("[HTTPAdapter] -> " + user.getName());
    }

    @Override
    public Message receive(User user) {
        return user.getInbox().poll();
    }
}
