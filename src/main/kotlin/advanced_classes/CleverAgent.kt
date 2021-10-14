package advanced_classes

class CleverAgent(val agent: String) : Actor {

    override val name: String = agent

    val percept: Percept? = null

    override fun act(): Action {
        return if (percept != null) HuntAction(percept.value) else ForageAction()
    }

    override fun perceive(vararg facts: Percept) {

    }

    override fun toString(): String {
        return name
    }
}