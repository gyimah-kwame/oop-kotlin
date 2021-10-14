package advanced_classes

interface Actor {
    val name : String
    fun act() : Action
    fun perceive(vararg facts : Percept) : Unit
}