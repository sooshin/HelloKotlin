fun main(args: Array<String>) {

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy", 0))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday(getMood(), "rainy", 0))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {

    return when {
//        mood == "happy" && weather == "sunny" -> "go for a walk"
//        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
//        temperature > 35 -> "go swimming"
//        else -> "Stay home and read."

        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainyZero(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }

}

fun isHappySunny(mood: String, weather:String) = (mood == "happy" && weather == "sunny")
fun isSadRainyZero(mood: String, weather: String, temperature: Int) = (mood == "sad" && weather == "rainy" && temperature == 0)
fun isHot(temperature: Int) = temperature > 35

fun getMood() : String {
    println("\nEnter your mood: ")
    return readLine()!!
}