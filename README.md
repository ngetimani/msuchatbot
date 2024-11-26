Here's your **README.md** file formatted for GitHub, with emojis and animated-style partitioning lines:

```markdown
# 🚀 MSU Chatbot

A **JavaFX-based chatbot application** designed to provide an intuitive GUI for login, signup, and chat functionalities. 🌟

---

## ✨ Features
- 🔐 **Login Screen**: Secure user authentication.
- 📝 **Signup Screen**: Create new accounts effortlessly.
- 💬 **Chat Interface**: Engage with the chatbot through a responsive UI.
- 🎨 **Modern Styling**: A polished design using CSS.

---

## 🛠 Prerequisites
Before running the project, ensure you have the following:
- **Java Development Kit (JDK)**: Version 17 or later.
- **IntelliJ IDEA**: Community or Ultimate Edition.
- **MySQL Database**: For user management and authentication.

---

## 🚧 Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/ngetimani/msuchatbot.git
cd msuchatbot
```

### 2️⃣ Configure the Database
1. Set up a **MySQL database** named `msuchatbot`.
2. Create a `users` table:
   ```sql
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(50) UNIQUE NOT NULL,
       password VARCHAR(100) NOT NULL
   );
   ```
3. Update the database credentials in the `DatabaseHelper` class:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/msuchatbot";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```

---

### 3️⃣ Import the Project into IntelliJ IDEA
1. Open IntelliJ IDEA and select **File > Open**.
2. Navigate to the cloned project folder and open it.
3. Ensure Maven dependencies are imported automatically.

### 4️⃣ Run the Application
1. Locate the `Main` class in the `src/main/java/com/example/msuai` package.
2. Right-click on the `Main` class and select **Run 'Main.main()'**. 🚀

---

## 🎨 Customizing CSS
The **CSS styling** is located at:
```
src/main/resources/com/example/msuai/style.css
```
Feel free to modify it to give the app your personal touch! 💅

---

## 📂 Project Structure
```plaintext
msuchatbot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.msuai/
│   │   │       ├── Main.java          // Entry point of the application
│   │   │       ├── LoginPage.java     // Handles login functionality
│   │   │       ├── SignUpPage.java    // Manages user registration
│   │   │       ├── ChatScreen.java    // Interface for chatting
│   │   │       └── DatabaseHelper.java // Database operations
│   │   └── resources/
│   │       └── com.example.msuai/
│   │           └── style.css          // CSS file for UI styling
└── pom.xml                             // Maven configuration file
```

---

## 🧩 Dependencies
The project uses the following:
- **JavaFX**: For UI components and interactions.
- **MySQL Connector/J**: To connect with the MySQL database.

### Adding Dependencies
1. Add the JavaFX SDK to the project. Use the following in your VM options:
   ```plaintext
   --module-path "path/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml
   ```
2. Ensure the MySQL Connector/J `.jar` file is added to the classpath.

---

## 🛡 Troubleshooting
- **Database Errors**: Confirm MySQL is running and credentials are correct.
- **UI Not Styled**: Check the CSS path in the `Main` class.
- **JavaFX Issues**: Verify the JavaFX SDK path in your IntelliJ settings.

---

## 🤝 Contributing
Contributions are welcome! Fork the repo and submit a pull request to suggest improvements or fix bugs. 🛠

---

## 📜 License
This project is licensed under the **MIT License**. 📄

---

Made with ❤️ by [@ngetimani](https://github.com/ngetimani)
```

This version adds animated-style lines, emojis, and a clean structure for better readability and presentation on GitHub. Let me know if you'd like further tweaks! 🎉
