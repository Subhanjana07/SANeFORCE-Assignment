package com.subhanjana.sanforce.assignment.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ProductResponse(
    @SerializedName("product_code")
    val prodCode: String,
    @SerializedName("product_name")
    val prodName: String? = "",
    @SerializedName("product_unit")
    val prodUnit: String? = "",
    @SerializedName("convQty")
    val prodQuantity: String? = ""
): Serializable
