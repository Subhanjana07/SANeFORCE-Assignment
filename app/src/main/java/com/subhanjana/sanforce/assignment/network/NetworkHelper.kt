package com.subhanjana.sanforce.assignment.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

suspend fun <T> safeApiCall(apiCall: suspend ()-> Response<T>): Resource<T> {
    return withContext(Dispatchers.IO) {
        try {
            val response : Response<T> = apiCall()
            if(response.isSuccessful)
                Resource.Success(data = response.body()!!)
            else
                Resource.Error(message = "Something went wrong. Please try again")

        } catch (e: Exception) {
            Resource.Error(message = e.message?: "Something went wrong")
        }
    }
}