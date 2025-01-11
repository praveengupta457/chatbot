# Study Mate - Your Personal Study Companion 🤖📚

Welcome to "Study Mate", a mobile application designed to assist students and other users in getting instant answers to their questions. Powered by ChatGPT API and Google Firebase, this application delivers a seamless, AI-driven learning experience.

 Features 🌟
- AI Assistance: Leverages ChatGPT API for answering user queries.
- User-Friendly Interface: Intuitive and mobile-friendly design for smooth navigation.
- Secure Database: Utilizes Google Firebase for secure data management.
- Cross-Domain Support: Designed to cater to various fields of study and beyond.

---

## Technology Stack 🛠️
- Programming Language: Java, XML
- Backend: ChatGPT API integration
- Database: Google Firebase
- Platform: Android mobile application

---

Installation and Setup 🚀

Follow the steps below to clone the repository and set up the project on your local machine:

Prerequisites
1. Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install [Android Studio](https://developer.android.com/studio).
3. Set up a [Google Firebase](https://firebase.google.com/) project and download the `google-services.json` file.

Clone the Repository
Use the following command to clone the repository:

```bash
git clone https://github.com/praveengupta457/chatbot.git
```

Project Setup
1. Open the Project:
   - Open Android Studio.
   - Select "Open an existing project" and navigate to the cloned repository.
   
2. Add Firebase Configuration:
   - Place the `google-services.json` file in the `app/` directory of the project.

3. Set Up ChatGPT API:
   - Obtain your API key from [OpenAI](https://platform.openai.com/).
   - Add the API key in your `MainActivity.java` or wherever the API integration is implemented.

4. Sync Dependencies:
   - Open the `build.gradle` file and click **"Sync Now"** in Android Studio to ensure all dependencies are installed.

5. Run the Application:
   - Connect your Android device or emulator.
   - Click **Run** ▶️ in Android Studio to launch the app.

---

Usage 📖
1. Open the app and log in or register.
2. Enter your question in the text box.
3. Click "Ask" to get an instant answer powered by ChatGPT API.
4. Manage your data securely through Firebase integration.

---

 Git Workflow for Contributions
1. Clone the Repository:
   ```bash
   git clone https://github.com/praveengupta457/chatbot.git
   cd chatbot
   ```

2. Create a New Branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. Make Changes and Commit:
   ```bash
   git add .
   git commit -m "Add your commit message"
   ```

4. Push Changes:
   ```bash
   git push origin feature/your-feature-name
   ```

5. Create a Pull Request:
   - Go to the GitHub repository.
   - Navigate to the Pull Requests tab and click New Pull Request.

---

License 📜
This project is licensed under the [MIT License](LICENSE).

---

Acknowledgments 
- OpenAI for the ChatGPT API.
- Google Firebase for database and authentication.
- The open-source community for inspiring this project.

---
