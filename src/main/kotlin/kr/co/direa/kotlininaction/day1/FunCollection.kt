package kr.co.direa.kotlininaction.day1

import kr.co.direa.kotlininaction.Test
import kr.co.direa.kotlininaction.TestController

fun maxExpression(a: Int, b: Int) = if (a > b) a else b
fun maxStatement(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    println(maxExpression(1, 2))
    println(maxStatement(1, 2))
    val a = maxStatement(3,4)
    val test = Test("name", if (a < 3) a else 0)
    println("max is ${test.age}")
    val e  = EmployerKt(1L, "name", 32, "email")
    println("is old? ${e.isOld}")


}