package lotto

import lotto.view.InputView

import lotto.view.OutputView

import lotto.domain.LottoMachine

fun main() {
    // TODO: Implement the program

    // Call the input function to receive the user's purchase amount input
    val purchaseAmount = InputView.readPurchaseAmount()

    // Issue Lotto tickets based on the purchase amount
    val tickets = LottoMachine.issueTickets(purchaseAmount)

    // Print the number of issued Lotto tickets
    OutputView.printTickets(tickets)

    // Read the winning numbers input from the user
    val winningNumbers = InputView.readWinningNumbers()

    // Read the bonus number input from the user
    val bonusNumber = InputView.readBonusNumber()

    // Print the header for the winning statistics
    println("\nWinning Statistics\n---")

    // Iterate through each ticket to check matching results
    tickets.forEach { ticket ->

        // Count how many numbers match the winning numbers
        val match = ticket.matchCount(winningNumbers)

        // Print the number of matches for the current ticket
        println("$match Matches")
    }


}
