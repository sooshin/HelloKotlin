import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {
    gamePlay(rollDice2(12))
}

val random1 = random()
val random2 = { random() }
// random1 has a value assigned at compile time, and the value never changes
// when the variable is accessed.
//
// random2 has a lambda assigned at compile time, and the lambda is executed
// every time the variable is referenced, returning a different value.

val rollDice = { Random().nextInt(12) + 1 }
val rollDice_2 = { sides: Int -> Random().nextInt(sides) + 1 }
val rollDice_3 = { sides:Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1 }

// 4. Create a new variable, rollDice2, for this same lambda using the function type notation.
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1 }

// Function type notation is more readable, which reduces errors,
// clearly showing the what type is passed in and what type is returned.

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}