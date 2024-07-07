package com.shift2024.revertisoft.catalog_pizza.data.network

import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogItemModel
import retrofit2.http.GET

interface CatalogApi {

	@GET("loans")
	suspend fun getAll(): List<CatalogItemModel>
}