fun main() {
    println("AI: Hello! I am a simple echo AI. Type 'exit' or 'quit' to end the conversation.")

    while (true) {
        print("You: ")
        val input = readLine()

        if (input == null || input.equals("exit", ignoreCase = true) || input.equals("quit", ignoreCase = true)) {
            println("AI: Goodbye!")
            break
        }

        println("AI: $input")
    }
}
