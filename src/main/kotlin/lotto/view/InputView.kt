package lotto.view

import camp.nextstep.edu.missionutils.Console

object InputView {

    // Read user's input for the purchase amount and return it as an integer
    fun readPurchaseAmount(): Int {
        println("Please enter the purchase amount. ")
        return Console.readLine().toInt()
    }

}