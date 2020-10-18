package ru.netology

fun main() {
    val typeCard = "Mastercard"
    val sumLastTransfers = 30000*100f //сумма в копейках
    val sumTransfer = 46000*100f //сумма в копейках

    print("коммиссия составила ${commission(typeCard, sumLastTransfers, sumTransfer)/100} рублей")
}

fun commission(typeCard:String = "VK pay", sumLastTransfers: Float = 0f, sumTransfer: Float) :Double{
    var sumCommission: Double = 0.0

    when(typeCard){
        "Mastercard","Maestro" -> {
            if (sumTransfer+sumLastTransfers > 75000*100){
                sumCommission = (sumTransfer * (0.6/100))+20
            }
        }
        "Visa","Мир" ->{

            sumCommission = if (sumTransfer * (0.75/100) < 35 ) 35.0 else sumTransfer * (0.75/100)
        }
    }

    return  sumCommission
}