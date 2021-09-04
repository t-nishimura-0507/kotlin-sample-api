package com.nishimu0507.kotlinsampleapi.domain.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AccountServiceTest {

    @Autowired
    private lateinit var accountService: AccountService

    @Test
    fun アカウント取得が正常にできること() {
        val accountEntity = accountService.getByMemberId("D100testtest")
        Assertions.assertEquals(accountEntity.email, "example@example.com")
        Assertions.assertEquals(accountEntity.memberId, "D100testtest")
    }

}
