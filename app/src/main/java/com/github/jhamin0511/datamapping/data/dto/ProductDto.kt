package com.github.jhamin0511.datamapping.data.dto

data class ProductDto(
    val id: Int = 0,
    val addressDto: AddressDto = AddressDto(id),
    val policyDto: PolicyDto = PolicyDto(),
    val name: String = "name",
    val company: CompanyDto = CompanyDto(id)
)
