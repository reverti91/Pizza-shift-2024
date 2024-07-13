package com.shift2024.revertisoft

import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.util.concurrent.TimeUnit

class NetworkModule {

	 companion object {

		const val BASE_URL = "https://shift-backend.onrender.com/pizza/"
		const val CONNECT_TIMEOUT = 10L
		const val WRITE_TIMEOUT = 10L
		const val READ_TIMEOUT = 10L
	}

	val retrofit = Retrofit.Builder()
		.client(provideOkHttpClientWithProgress())
		.baseUrl(BASE_URL)
		.addConverterFactory(provideKotlinXSerializationFactory())
		.build()

	private fun provideOkHttpClientWithProgress(): OkHttpClient =
		OkHttpClient().newBuilder()
			.connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
			.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
			.readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
			.addInterceptor(provideLoggingInterceptor())
			.build()

	private fun provideKotlinXSerializationFactory(): Converter.Factory =
		Json.asConverterFactory("application/json; charset=UTF8".toMediaType())

	private fun provideLoggingInterceptor(): Interceptor =
		HttpLoggingInterceptor().apply {
			level = HttpLoggingInterceptor.Level.BODY
		}
}