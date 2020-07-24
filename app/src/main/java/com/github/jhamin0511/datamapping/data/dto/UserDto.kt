package com.github.jhamin0511.datamapping.data.dto

data class UserDto(
    val id: Int,
    val name:String = "userName ${id}",
    val age:Int = 0,
    val address : AddressDto = AddressDto(id)
)
