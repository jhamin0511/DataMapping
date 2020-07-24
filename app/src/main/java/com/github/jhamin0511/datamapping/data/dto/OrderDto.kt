package com.github.jhamin0511.datamapping.data.dto

data class OrderDto(
    val id: Int,
    val name: String = "name ${id}",
    val productList: List<ProductDto> = listOf(
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto(),
        ProductDto()
    ),
    val company: CompanyDto = CompanyDto(id),
    val amount: Double = 0.0,
    val user: UserDto = UserDto(id),
    val time: String = "time",
    val type: OrderType = OrderType.LOADING
)
