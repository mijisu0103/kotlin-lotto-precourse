package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
    }

    // TODO: Implement additional functions

    // Return the Lotto numbers sorted in ascending order
    fun getSortedNumbers(): List<Int> = numbers.sorted()

    // Count how many numbers match the winning numbers
    fun matchCount(winningNumbers: List<Int>): Int =

        // Count the number of matching numbers between the Lotto and the winning numbers
        numbers.count { it in winningNumbers }

}
