package com.shift2024.revertisoft.catalog_pizza.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase

class CatalogViewModelFactory(
	private val catalogItemsUseCase: CatalogItemsUseCase, ) : ViewModelProvider.Factory {

	override fun <T : ViewModel> create(modelClass: Class<T>): T {
		require(modelClass == CatalogViewModel::class.java) { "Unknown ViewModel: $modelClass" }
		return CatalogViewModel(catalogItemsUseCase) as T
	}
}