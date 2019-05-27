fun main(args: Array<String>) {
//    println("Your fortune is: ${getFortuneCookie()}")
    runTenTimes()
}

fun getFortuneCookie() : String {
    val fortuneCookie = listOf("You will have a great day!", "Things will go well for you today.",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    val index = birthday.rem(fortuneCookie.size)
    return fortuneCookie[index]
}

fun runTenTimes(){
    var fortune: String
    for (i in 1.. 10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

