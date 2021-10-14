package advanced_classes

import kotlin.random.Random

class FoodEnvironment(vararg args: Actor): Environment(*args) {

    val scores = mutableMapOf<Actor, Int>()
    var animal: String? = null


    init {
        for (arg in args) {
            scores[arg] = 0
        }
    }

    override fun processAction(agent: Actor, act: Action) {

        var score = scores[agent] ?: 0

        when(act) {
            is ForageAction -> {
                scores[agent] = ++score
            }
            is HuntAction -> scores[agent] = score + 2
        }
    }

    override fun sense(agent: Actor) {
        if (animal == null) {
            agent.perceive()
        }else {
            agent.perceive(Percept("animal", "Dog"))
        }

    }

    override fun step() {
        val random = Random.nextDouble(0.0, 1.1)
        if (random >= 0.5) animal = "Dog"
        super.step()
    }

}