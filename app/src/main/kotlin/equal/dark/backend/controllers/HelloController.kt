package equal.dark.backend.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class HelloController {
    @GetMapping
    fun get(): String {
        return "Hello, World!"
    }
}
