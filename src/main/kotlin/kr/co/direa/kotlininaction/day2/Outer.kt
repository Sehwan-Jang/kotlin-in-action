package kr.co.direa.kotlininaction.day2

class Outer {
    private val name = "Outer"

    internal inner class Inner {

        fun getOuter(): Outer = this@Outer
        fun getInner(): Inner = this
        fun printName() {
            println(name)
        }
    }

    internal class StaticInner {
        fun printName() {
            println("Outer")
        }
    }
}
