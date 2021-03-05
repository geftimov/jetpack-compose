package com.eftimoff.compose.network.retrofit

import com.eftimoff.compose.network.RecipesApi
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    @Provides
    fun provideReceiptApi(
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): RecipesApi {
        return Retrofit.Builder()
            .baseUrl("https://api.spoonacular.com/")
            .client(okHttpClient)
            .addConverterFactory(moshiConverterFactory)
            .build()
            .create(RecipesApi::class.java)
    }

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides
    fun provideMoshiConverterFactory(moshi: Moshi): MoshiConverterFactory {
        return MoshiConverterFactory.create(moshi)
    }

}