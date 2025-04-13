package com.subhanjana.sanforce.assignment.network

sealed class Resource<T>(
    val data: T? = null,
    val errorMessage: String? = null
) {
    class Success<T>(data: T): Resource<T>(data = data)
    class Error<T>(message: String): Resource<T>(errorMessage = message)
    class Loading<T>: Resource<T>()
}