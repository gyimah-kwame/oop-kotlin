package oop

fun main(args: Array<String>) {

    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)

    val env1 = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
    for (i in 1..100)
        env1.step()
    println(env1.scores)
}