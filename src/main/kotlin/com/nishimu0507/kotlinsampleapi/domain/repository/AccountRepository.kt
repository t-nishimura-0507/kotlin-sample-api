package com.nishimu0507.kotlinsampleapi.domain.repository

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import com.nishimu0507.kotlinsampleapi.domain.value.MemberId

interface AccountRepository {
    fun getByMemberId(memberId: MemberId): AccountEntity

}