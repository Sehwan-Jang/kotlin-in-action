package kr.co.direa.kotlininaction.day1

import kr.co.direa.kotlininaction.Test

fun maxExpression(a: Int, b: Int) = if (a > b) a else b
fun maxStatement(a: Int, b: Int): Int {
    return if (a > b) a else b
}
fun <T> joinToString(collection: Collection<T>
                     , separator : String = ","
                     , prefix: String = "["
                     , postfix: String = "]"): String  {
    val stringBuilder = StringBuilder()
    stringBuilder.append(prefix)
    for ((index, value) in collection.withIndex()) {
        if (index > 0) {
            stringBuilder.append(separator)
        }
        stringBuilder.append(value)
    }
    stringBuilder.append(postfix)
    return stringBuilder.toString()
}

val intMap = mapOf(1 to "one", 2 to "two").toString()

fun EmployerKt.sendEmail() = println("$name is sending mail : $email and ${sayName()}")

fun main() {
    println(maxExpression(1, 2))
    println(maxStatement(1, 2))
    val a = maxStatement(3,4)
    val test = Test("name", if (a < 3) a else 0)
    println("max is ${test.age}")
    val e  = EmployerKt(1L, "name", 32, "email")
    e.sendEmail()
    e.sayName()
    println("is old? ${e.isOld}")

    val listOf = listOf(1, 2, 3)
    val mutableListOf = mutableListOf(1, 2, 3)
    println(listOf.plus(mutableListOf))
    println("$listOf  $mutableListOf")
    println(joinToString(prefix = "{", collection = listOf, postfix = ")", separator = ", "))
    println(joinToString(listOf))
}