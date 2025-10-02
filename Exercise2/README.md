
# Console Chat Application (Java)

## 📌 Overview
This is a **console-based real-time chat application simulation** built in Java as part of Exercise 2.

### Features Implemented
- Create / Join Chat Rooms using a unique ID
- Send & Receive messages (simulated real-time)
- Private messaging between users
- View active users in a chat room
- Message history stored in `ChatRoom`

### Design Patterns Used
- **Observer Pattern** → `User` observes `ChatRoom` for new messages  
- **Singleton Pattern** → `ChatRoomManager` manages all chat rooms  
- **Adapter Pattern** → Different communication adapters (`WebSocketAdapter`, `HttpAdapter`)  
- **OOP & SOLID** principles applied  

---

## ⚙️ Project Structure

ConsoleChatAppProject/
├── ConsoleChatApp.java # Main entry point
├── Message.java # Message model
├── Observer.java # Observer interface
├── Subject.java # Subject interface
├── User.java # User class (Observer)
├── ChatRoom.java # ChatRoom (Subject implementation)
├── ChatRoomManager.java # Singleton manager for rooms
├── ClientAdapter.java # Adapter interface
├── WebSocketAdapter.java # WebSocket-style adapter
└── HttpAdapter.java # HTTP-style adapter


---

## 🚀 How to Compile & Run

### Step 1: Navigate to the project folder
```sh
cd ConsoleChatAppProject

Step 2: Compile all .java files

javac *.java

Step 3: Run the application

java ConsoleChatApp
