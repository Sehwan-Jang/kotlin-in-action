package kr.co.direa.kotlininaction.day1

import kr.co.direa.kotlininaction.day1.sendEmail as send

class Collections {

}

val list = listOf(1,2,3,4,5)
val mutable = mutableListOf(1,2,3,4,5)

fun main() {
    println(list.shuffled())
    println(list.last())
    println(list.sum())
    println(list)

    println(mutable.shuffled())
    println(mutable.last())
    println(mutable.sum())
    println(mutable)
    val employerKt = EmployerKt(2, "ddd", 33, "mail2")
    employerKt.send()
}