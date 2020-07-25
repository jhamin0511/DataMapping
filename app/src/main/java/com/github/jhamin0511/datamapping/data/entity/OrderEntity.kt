package com.github.jhamin0511.datamapping.data.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OrderEntity(
    val id: Int,
    var name: String,
    var userId: Int,
    var userName: String,
    var addressId: Int,
    var addressLabel: String,
    var companyId: Int,
    var companyName: String
) : Parcelable
