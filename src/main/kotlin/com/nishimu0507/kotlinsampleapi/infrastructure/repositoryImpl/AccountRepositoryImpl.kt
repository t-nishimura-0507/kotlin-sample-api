package com.nishimu0507.kotlinsampleapi.infrastructure.repositoryImpl

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import com.nishimu0507.kotlinsampleapi.domain.repository.AccountRepository
import com.nishimu0507.kotlinsampleapi.domain.value.MemberId
import org.springframework.stereotype.Repository

@Repository
class AccountRepositoryImpl : AccountRepository {

    override fun getByMemberId(memberId: MemberId): AccountEntity {
        //TODO: いったんダミー処理。。後々実装する。
        return AccountEntity(
            memberId,
            "example@example.com",
            AccountEntity.Status.ACTIVE,
            "2021-08-14",
            "tester",
            "2021-08-14",
            "tester"
        )
    }
}