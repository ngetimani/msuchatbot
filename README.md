
# MSU Chatbot 💬 🤖  

A **JavaFX-based chatbot** application designed to provide an intuitive and modern graphical user interface for user authentication and interaction.  

---

## ✨ Features  
- 🔐 **Login Screen**: Authenticate users with username and password.  
- 📝 **Signup Screen**: Register new users with validation.  
- 💬 **Chat Interface**: Engage in conversations through a responsive chatbot interface.  
- 🎨 **Custom Styling**: Modern UI with CSS animations and effects.  
- 💖 **Footer Animation**: Typing text animation that says: "Made with Love ❤️".  

---

## 🚀 Getting Started  

### 📥 Clone the Repository  
```bash
git clone https://github.com/ngetimani/msuchatbot.git
cd msuchatbot
```

### 🛠️ Prerequisites  
Ensure you have the following installed on your system:  
- **Java Development Kit (JDK)**: Version 17 or later.  
- **IntelliJ IDEA**: Community or Ultimate Edition.  
- **MySQL Database**: To manage user credentials.  

---

## 🗂️ Project Structure  

```plaintext
msuchatbot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.msuai/
│   │   │       ├── Main.java
│   │   │       ├── LoginPage.java
│   │   │       ├── SignUpPage.java
│   │   │       ├── ChatScreen.java
│   │   │       └── DatabaseHelper.java
│   │   └── resources/
│   │       └── com.example.msuai/
│   │           └── style.css
└── pom.xml
```

---

## ⚙️ Configuration  

### 1️⃣ Set Up the Database  
1. Create a MySQL database called `msuchatbot`.  
2. Run the following SQL to create the users table:  
   ```sql
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(50) UNIQUE NOT NULL,
       password VARCHAR(100) NOT NULL
   );
   ```
3. Update the `DatabaseHelper` class with your MySQL credentials:  
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/msuchatbot";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```

---

### 2️⃣ Run the Application in IntelliJ IDEA  
1. Open the project in IntelliJ IDEA.  
2. Configure the **JavaFX SDK** path:  
   - Go to `File > Project Structure > Libraries` and add the JavaFX SDK.  
   - Modify the VM Options in your Run/Debug Configuration:  
     ```text
     --module-path path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
     ```
3. Run the `Main` class to start the application.  

---

### 🎨 Styling and Animation  

#### CSS Enhancements  
The `style.css` file is located in `src/main/resources/com/example/msuai/style.css`. Customize it to style your application:  
- **Background Color**: Change the background to blue.  
- **Animated Partitions**: Use keyframe animations for decorative partition lines.  
- **Footer Text Animation**: Add a typing effect using CSS.  

```css
/* Example: Animated Footer Text */
@keyframes typing {
    from { width: 0; }
    to { width: 100%; }
}

.footer {
    color: #ffffff;
    font-size: 14px;
    font-family: 'Courier New', monospace;
    overflow: hidden;
    white-space: nowrap;
    border-right: 2px solid #fff;
    width: fit-content;
    animation: typing 4s steps(20, end), blink-caret 0.75s step-end infinite;
}

@keyframes blink-caret {
    from, to { border-color: transparent; }
    50% { border-color: white; }
}
```

#### Example Usage in JavaFX:  
```java
Label footer = new Label("Made with Love ❤️");
footer.getStyleClass().add("footer");
```

---

## 🧪 Testing  

- **Login**: Use valid credentials to log in.  
- **Signup**: Test various inputs, including mismatched passwords.  
- **Chat**: Interact with the chatbot and ensure it responds.  

---

## 🤝 Contributing  

Feel free to fork the repository, make improvements, and submit pull requests!  

---

## 📜 License  

This project is licensed under the MIT License.  

---

## Footer Animation Example  

```text
Made with Love ❤️  
```

The text appears as if typed letter by letter.
```markdown

---  
Developed by [ngetimani](https://github.com/ngetimani) with 💙 for Maseno AI.  
```

---

You can now push this file to your GitHub repository! Let me know if you need any further adjustments or additional features.
