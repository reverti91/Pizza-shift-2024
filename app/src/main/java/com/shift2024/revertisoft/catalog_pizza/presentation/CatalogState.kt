package com.shift2024.revertisoft.catalog_pizza.presentation

import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza

sealed interface CatalogState {

	data object Initial : CatalogState
	data object Loading : CatalogState
	data class Failure(val message: String?) : CatalogState
	data class Content(val catalogs: List<Pizza>) : CatalogState
}