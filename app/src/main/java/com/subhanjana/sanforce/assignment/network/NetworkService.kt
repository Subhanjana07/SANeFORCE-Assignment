package com.subhanjana.sanforce.assignment.network

import com.subhanjana.sanforce.assignment.model.ProductResponse
import okhttp3.Response
import retrofit2.http.GET

interface NetworkService {
    @GET()
    suspend fun getProductList():Response<List<ProductResponse>>

    companion object {
        const val BASE_URL = "http://sjdev.salesjump.in/server/native_Db_V13.php?axn=get/taskproducts&divisionCode=258"
    }
}