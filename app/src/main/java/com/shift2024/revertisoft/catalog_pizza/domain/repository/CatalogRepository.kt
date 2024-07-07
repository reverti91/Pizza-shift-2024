package com.shift2024.revertisoft.catalog_pizza.domain.repository

import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem

interface CatalogRepository {

	suspend fun getAll(): List<CatalogItem>
}