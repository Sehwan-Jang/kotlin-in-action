package kr.co.direa.kotlininaction.day2

abstract class Person : Walkable, Workable {
    abstract val age : Int
    override fun walk() {
        println("walk")
    }

    override fun work() {
        println("work")
    }

    override fun doSomething() {
        super<Workable>.doSomething()
        super<Walkable>.doSomething()
    }
    open fun validateAge() : Boolean {
        return age in 0.. 150
    }
}

open class FakePerson : Person() {
    final override val age
        get() = 10
    override fun validateAge(): Boolean {
        return true
    }
    fun lie() {
        println("lie")
    }
}

class Prisoner (var crimes: Int) : FakePerson() {
    constructor(vararg names: String) : this(names.size) {
        crimes = crimes.inc()
    }

    val name: String = "Prisoner$crimes"
    val isInPrison : Boolean
        get() = crimes > 0
    override fun validateAge(): Boolean {
        return !super.validateAge()
    }
    fun info() {
        println("committed $crimes crimes")
    }
}

fun main() {
    val walk = object : Walkable {
        override fun walk() {

        }
    }
    val person = FakePerson()
    person.doSomething()
    var prisoner : Walkable = Prisoner("a","b","c")

    if (prisoner is Prisoner) {
        println(prisoner.crimes)
        println(prisoner.age)
        prisoner.name
    }

//    println(prisoner.validateAge())
}

interface Walkable {

    fun walk()
    fun doSomething() {
        println("Doing walk")
    }
}

interface Workable {

    fun work()
    fun doSomething() {
        println("Doing work")
    }
}