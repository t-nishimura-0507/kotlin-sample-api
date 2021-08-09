package com.nishimu0507.kotlinsampleapi.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

// HOW TO : curl -X POST -H "Content-Type: application/json" http://localhost:8080/
@RestController
class SampleApiController {
    @PostMapping(path = ["/"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun sample(): String {
        return "{\"header\":{\"result_code\":\"0\", \"response_id\":\"1234\"},\"body\":{\"message\":\"sample\"}}"
    }
}