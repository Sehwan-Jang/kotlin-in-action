package kr.co.direa.kotlininaction

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): List<Test> {
        val tests = mutableListOf<Test>()
        val names = listOf("a", "b", "c")
        repeat(10) {
            val age = (1..100).random()
            tests.add(Test(name = names.random(), age = age))
        }
        return tests
    }
}

data class Test(
        val name : String,
        var age: Int? = null
)