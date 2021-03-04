package com.eftimoff.compose.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Receipts(
    @field:Json(name = "recipes")
    val recipes: List<Receipt>
)

@JsonClass(generateAdapter = true)
data class Receipt(
    @field:Json(name = "readyInMinutes")
    val readyInMinutes: Int,
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "title")
    val title: String,
    @field:Json(name = "servings")
    val servings: Int,
    @field:Json(name = "image")
    val image: String="",
    @field:Json(name = "summary")
    val summary: String,
    @field:Json(name = "steps")
    val steps: List<Step> = emptyList()
)

@JsonClass(generateAdapter = true)
data class Step(
    @field:Json(name = "number")
    val number: Int,
    @field:Json(name = "title")
    val title: String
)