package advanced_classes
class FoodEnvironment(vararg args: Actor): Environment(*args) {

    val scores = mutableMapOf<Actor, Int>()

    init {
        for (arg in args) {
            scores[arg] = 0
        }
    }

    override fun processAction(agent: Actor, act: Action) {
        if (act is ForageAction) {
            var score = scores[agent] ?: 0
            scores[agent] = ++score
        }
//        when(act) {
//            is oop.ForageAction -> {
//                var score = scores[agent] ?: 0
//                scores[agent] = ++score
//            }
//        }
    }

    override fun sense(agent: Actor) {

    }

}