package com.nishimu0507.kotlinsampleapi.controller

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import com.nishimu0507.kotlinsampleapi.domain.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

// HOW TO : curl -X POST -H "Content-Type: application/json" http://localhost:8080/
@RestController
class AccountController {

    @Autowired
    lateinit var accountService: AccountService

    @GetMapping(path = ["/account/{id}"])
    fun accountGet(@PathVariable id: String): AccountEntity {
        return accountService.getByMemberId(id)
    }
}