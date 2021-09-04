package com.nishimu0507.kotlinsampleapi.infrastructure.repositoryImpl

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import com.nishimu0507.kotlinsampleapi.domain.repository.AccountRepository
import com.nishimu0507.kotlinsampleapi.domain.value.MemberId
import com.nishimu0507.kotlinsampleapi.infrastructure.mapper.AccountMaster
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class AccountRepositoryImpl : AccountRepository {

    @Autowired
    private lateinit var accountMaster: AccountMaster

    override fun getByMemberId(memberId: MemberId): AccountEntity {
        return accountMaster.getByMemberId(memberId.toString())[0]
    }
}