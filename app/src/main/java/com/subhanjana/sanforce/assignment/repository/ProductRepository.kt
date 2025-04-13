package com.subhanjana.sanforce.assignment.repository

import com.subhanjana.sanforce.assignment.model.ProductResponse
import com.subhanjana.sanforce.assignment.network.Resource
import com.subhanjana.sanforce.assignment.network.RetrofitInstance
import com.subhanjana.sanforce.assignment.network.safeApiCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okhttp3.Dispatcher

class ProductRepository {
    private val networkService = RetrofitInstance.networkService

    suspend fun getProductList() : Flow<Resource<List<ProductResponse>>> {
        return flow<Resource<List<ProductResponse>>> {
            emit(safeApiCall { networkService.getProductList() })
        }.flowOn(Dispatchers.IO)
    }
}