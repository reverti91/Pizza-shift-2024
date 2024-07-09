package com.shift2024.revertisoft.catalog_pizza.data.repository

import com.shift2024.revertisoft.catalog_pizza.data.converter.CatalogItemConverter
import com.shift2024.revertisoft.catalog_pizza.data.network.CatalogApi
import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.catalog_pizza.domain.repository.CatalogRepository

class CatalogRepositoryImpl(
	private val catalogApi: CatalogApi,
	private val catalogItemConverter: CatalogItemConverter,
) : CatalogRepository {

	override suspend fun getAll(): List<CatalogItem> {
		val models = catalogApi.getAll()
		return catalogItemConverter.convertAll(models) }


}