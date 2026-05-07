fun main() {
    while (true) {
        val line = readlnOrNull() ?: break
        println("Wasm received: $line")
    }
}