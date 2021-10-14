package oop

class SimpleAgent(val agent: String) : Actor {

    override val name: String = agent

    override fun act(): Action {
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return name
    }

}