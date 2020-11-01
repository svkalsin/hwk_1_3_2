package ru.netology

fun main() {
    val typeCard = "Mastercard"
    val sumLastTransfers = 30000 * 100f //сумма в копейках
    val sumTransfer = 46000 * 100f //сумма в копейках

    print("коммиссия составила ${commission(typeCard, sumLastTransfers, sumTransfer) / 100} рублей")
}

fun commission(typeCard: String = "VK pay", sumLastTransfers: Float = 0f, sumTransfer: Float) :Double {

    when (typeCard) {
        "Mastercard", "Maestro" -> {
            if (sumTransfer + sumLastTransfers > 7500000) {
                return (sumTransfer * (0.006)) + 20
            }
        }
        "Visa", "Мир" -> {
            val commissionSum = sumTransfer * (0.0075)
            return if (commissionSum < 35) 35.0 else commissionSum
        }
    }
    return 0.0

}