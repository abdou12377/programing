# Simple Kotlin AI Chatbot

This is a very simple command-line AI chatbot written in Kotlin. It will echo back anything you type.

## Prerequisites

*   Java Development Kit (JDK)
*   Kotlin Compiler (`kotlinc`)

On Debian-based Linux distributions, you can install them with:
`bash
sudo apt-get update
sudo apt-get install -y default-jdk kotlin
`

## How to Compile

1.  Open a terminal in the project root directory.
2.  Run the following command to compile the source code into a JAR file:

`bash
kotlinc src/main/kotlin/Main.kt -include-runtime -d app.jar
`

## How to Run

1.  After compiling, run the application with the following command:

`bash
java -jar app.jar
`

2.  The application will start, and you can start typing.
3.  To exit the application, type `exit` or `quit`.
