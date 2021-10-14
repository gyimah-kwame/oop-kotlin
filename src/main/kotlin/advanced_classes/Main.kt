package advanced_classes

fun main(args: Array<String>) {

    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)

    println("********************************")

    val env1 = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
    for (i in 1..100)
        env1.step()
    println(env1.scores)

    println("********************************")

    val env3 = FoodEnvironment()
    for (i in 1..10) {
        env3.step()
        println(env.animal)
    }

    println("********************************")

    val env4 = FoodEnvironment(CleverAgent("Charlie"), RandomAgent("Bob", 0.2), SimpleAgent("Alice"))
    for (i in 1..100) {
        env4.step()
    }
    println(env4.scores)
}