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
}
