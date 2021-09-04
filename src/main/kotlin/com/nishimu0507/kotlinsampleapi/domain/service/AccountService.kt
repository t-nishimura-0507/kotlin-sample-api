package com.nishimu0507.kotlinsampleapi.domain.service

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import com.nishimu0507.kotlinsampleapi.domain.repository.AccountRepository
import com.nishimu0507.kotlinsampleapi.domain.value.MemberId
import com.nishimu0507.kotlinsampleapi.infrastructure.repositoryImpl.AccountRepositoryImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * アカウントのサービス
 */
@Service
class AccountService {

    @Autowired
    private lateinit var accountRepository: AccountRepositoryImpl

    fun getByMemberId(id: String): AccountEntity {
        return accountRepository.getByMemberId(MemberId(id))
    }
}