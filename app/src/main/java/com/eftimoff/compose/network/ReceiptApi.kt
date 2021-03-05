package com.eftimoff.compose.network

import com.eftimoff.compose.models.Receipts
import retrofit2.http.GET

interface ReceiptApi {

    @GET("recipes/random?apiKey=35f639ffe8eb42fa8ce2b0279db43a77&number=30")
    suspend fun getReceipts(): Receipts

}