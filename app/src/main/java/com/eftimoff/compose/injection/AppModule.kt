package com.eftimoff.compose.injection

import com.eftimoff.compose.api.ReceiptApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideReceiptApi(): ReceiptApi {
        return Retrofit.Builder()
            .baseUrl("https://api.spoonacular.com/")
            .client(OkHttpClient.Builder().build())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(ReceiptApi::class.java)
    }

}