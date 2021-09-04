package com.nishimu0507.kotlinsampleapi.infrastructure.mapper

import com.nishimu0507.kotlinsampleapi.domain.entity.AccountEntity
import org.apache.ibatis.annotations.Select

interface AccountMapper {
    @Select("""
        SELECT *
        FROM account
        WHERE member_id = 'D100testtest'
    """)
    fun getByMemberId(memberId: String): List<AccountEntity>
}