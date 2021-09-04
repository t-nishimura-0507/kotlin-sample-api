package com.nishimu0507.kotlinsampleapi.domain.entity

data class AccountEntity(
    val memberId: String,
    val email: String,
    val status: String,
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