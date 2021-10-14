package oop

import kotlin.random.Random

class RandomAgent(val agent: String, val probability: Double) : Actor {

    override val name: String = agent


    override fun act(): Action {
        val random = Random.nextDouble(0.0, 1.1)
        return if (probability >= random) ForageAction() else HuntAction("")
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return name
    }

}