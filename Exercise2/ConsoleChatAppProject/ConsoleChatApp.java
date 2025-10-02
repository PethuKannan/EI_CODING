public class ConsoleChatApp {
    public static void main(String[] args) {
        ChatRoomManager manager = ChatRoomManager.getInstance();

        ChatRoom room = manager.getOrCreateRoom("Room123");

        User alice = new User("Alice", new WebSocketAdapter());
        User bob = new User("Bob", new HttpAdapter());
        User charlie = new User("Charlie", new WebSocketAdapter());

        room.attach(alice);
        room.attach(bob);
        room.attach(charlie);

        alice.sendMessage(room, "Hello everyone!");
        bob.sendMessage(room, "Hi Alice!");
        charlie.sendPrivate(room, "Alice", "How are you?");

        room.printActiveUsers();

        alice.readMessages();
        bob.readMessages();
        charlie.readMessages();
    }
}
