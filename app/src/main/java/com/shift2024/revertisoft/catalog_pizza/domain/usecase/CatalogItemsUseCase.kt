package com.shift2024.revertisoft.catalog_pizza.domain.usecase

import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.catalog_pizza.domain.repository.CatalogRepository

class CatalogItemsUseCase(private val repository: CatalogRepository) {

	suspend operator fun invoke(): List<CatalogItem> =
		repository.getAll()
}