package com.github.jhamin0511.datamapping.data.dto

data class AddressDto(
    val id: Int,
    val latitude: Long = 0,
    val longitude: Long = 0,
    val number: String = "number",
    val label: String = "addressLabel ${id}"
)
