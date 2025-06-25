package kr.co.direa.kotlininaction.day1

class EmployerKt(val id: Long?, val name: String?, val age: Int?, val email: String?) {
    val isOld: Boolean
        get() = if (age != null) age > 34 else false

    fun isOld() = if (age != null) age > 34 else false
}
