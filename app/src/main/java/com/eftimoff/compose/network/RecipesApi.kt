package com.eftimoff.compose.network

import com.eftimoff.compose.models.Recipes
import retrofit2.http.GET

interface RecipesApi {

    @GET("recipes/random?apiKey=35f639ffe8eb42fa8ce2b0279db43a77&number=30")
    suspend fun getRecipes(): Recipes

}