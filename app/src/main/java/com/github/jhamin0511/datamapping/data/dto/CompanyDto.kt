package com.github.jhamin0511.datamapping.data.dto

data class CompanyDto(
    val id: Int,
    val name: String = "companyName ${id}",
    val address: AddressDto = AddressDto(id),
    val currencyCode: String = "currencyCode",
    val amount: Double = 0.0,
    val startAt: String = "startAt"
)
