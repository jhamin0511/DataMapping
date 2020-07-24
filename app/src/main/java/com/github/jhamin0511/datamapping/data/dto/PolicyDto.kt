package com.github.jhamin0511.datamapping.data.dto

data class PolicyDto(
    val id: Int = 0,
    val label: String = "label",
    val count: Int = 0,
    val fee: Double = 0.0,
    val discount: Int = 0,
    val manager: String = "manager"
)
