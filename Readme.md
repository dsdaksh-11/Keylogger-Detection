# 🔐 Keylogger Behavior Detector (Java)

## 📌 Project Overview

The **Keylogger Behavior Detector** is a Java-based desktop application that analyzes system/process logs to identify **potential keylogger-like behavior** using heuristic and pattern-based detection techniques.

This project simulates how cybersecurity tools detect suspicious activities such as keystroke logging, hidden processes, and background input capture.

---

## 🎯 Features

* 📂 Load and scan log files (`.txt`)
* 🔍 Detect suspicious keywords and behavior patterns
* ⚠️ Risk classification:

  * 🟢 SAFE
  * 🟡 SUSPICIOUS
  * 🔴 HIGH RISK
* 🖥️ Interactive GUI built using Java Swing
* 📊 Displays scan results with risk levels
* 🧠 Heuristic-based detection logic

---

## 🛠️ Tech Stack

* **Language:** Java
* **GUI:** Swing
* **Concepts Used:**

  * File Handling
  * String Matching
  * Basic Cybersecurity Concepts (Keylogging, Heuristics)

---

## 📁 Project Structure

```
Keylogger-Detector/
│── src/
│   ├── Main.java
│   ├── GUI.java
│   ├── ScannerEngine.java
│   ├── RiskAnalyzer.java
│   ├── FileHandler.java
│── logs/
│   ├── sample_log.txt
│── screenshots/
│── README.md
```

---

## ▶️ How to Run

### 1️⃣ Compile the project

```bash
cd src
javac *.java
```

### 2️⃣ Run the application

```bash
java Main
```

### 3️⃣ Use the application

* Click **Scan File**
* Select a log file (e.g., `logs/sample_log.txt`)
* View the results in the output panel

---

## 📄 Sample Log File

```
chrome.exe running normally
background_listener.exe started
keyboard_hook activated
hidden_keylogger.exe capturing input
```

---

## 🧪 Sample Output

```
chrome.exe running normally --> SAFE
background_listener.exe started --> SUSPICIOUS
keyboard_hook activated --> HIGH RISK
hidden_keylogger.exe capturing input --> HIGH RISK
```

---

## 🧠 How It Works

The application reads log entries line-by-line and checks for suspicious keywords such as:

* keylogger
* keystroke
* hook
* listener
* hidden
* inject

Each keyword contributes to a **risk score**, which is used to classify the activity into different risk levels.

---

## ⚠️ Disclaimer

This project is a **simulation-based detection system** designed for educational purposes.
It does not perform real-time system monitoring or actual keylogger detection.

---

## 🚀 Future Enhancements

* Real-time process monitoring
* Advanced pattern detection
* Machine learning-based threat analysis
* Improved UI/UX design
* Export scan reports

---

## 📸 Screenshots

*(Add screenshots of your GUI here)*

---

## 👨‍💻 Author

Daksh Sharma

---

## ⭐ If you found this useful

Give this repository a ⭐ on GitHub!
