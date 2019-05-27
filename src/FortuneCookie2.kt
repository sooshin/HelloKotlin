fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }

//    var fortune: String = ""
//    repeat(10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }

//    var num = 1
//    while (num < 11) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//        num++
//    }

    // Solution
    var fortune: String = ""
    while (!fortune.contentEquals("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getFortune(birthday: Int) : String {
    val fortuneCookie = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val index = when(birthday) {
        in 1..7 -> 0
        28, 31 -> 2
        else -> birthday.rem(fortuneCookie.size)
    }
    return fortuneCookie[index]
}

fun getBirthday() : Int{
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}