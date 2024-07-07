package com.shift2024.revertisoft.catalog_pizza.presentation

import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem

sealed interface CatalogState {

	data object Initial : CatalogState
	data object Loading : CatalogState
	data class Failure(val message: String?) : CatalogState
	data class Content(val catalogs: List<CatalogItem>) : CatalogState
}