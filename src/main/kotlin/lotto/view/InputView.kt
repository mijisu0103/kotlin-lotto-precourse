package lotto.view

import camp.nextstep.edu.missionutils.Console

object InputView {

    // Read user's input for the purchase amount and return it as an integer
    fun readPurchaseAmount(): Int {
        println("Please enter the purchase amount. ")
        return Console.readLine().toInt()
    }

    // Read last week's winning numbers input from the user
    fun readWinningNumbers(): List<Int> {

        // Prompt the user to enter last week's winning numbers
        println("\nPlease enter last week's winning numbers.")

        // Read the input, split by commas, and trim spaces, and convert to integers
        return Console.readLine().split(",").map { it.trim().toInt() }

    }

    // Read the bonus number input from the user
    fun readBonusNumber(): Int {

        // Prompt the user to enter the bonus number
        println("\nPlease enter the bonus number.")

        // Read the input and convert it to an integer
        return Console.readLine().toInt()
    }

}