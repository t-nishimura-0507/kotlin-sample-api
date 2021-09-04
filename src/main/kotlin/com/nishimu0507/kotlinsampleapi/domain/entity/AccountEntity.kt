package com.nishimu0507.kotlinsampleapi.domain.entity

import com.nishimu0507.kotlinsampleapi.domain.value.MemberId

data class AccountEntity(
    val memberId: MemberId,
    val email: String,
    val status: Status,
    val createdAt: String,
    val createdBy: String,
    val updatedAt: String,
    val updatedBy: String,
) {

    enum class Status(val status: String) {
        ACTIVE("active"),
        CANCEL("cancel")
    }

}