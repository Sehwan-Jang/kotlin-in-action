package kr.co.direa.kotlininaction.day1

class EmployerKt(private val id: Long?, val name: String?, val age: Int?, val email: String?) {
    val isOld: Boolean
        get() = if (age != null) age > 34 else false

    fun sayName() = "$id  $name"
}
