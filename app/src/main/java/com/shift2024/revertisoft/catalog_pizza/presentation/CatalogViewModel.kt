package com.shift2024.revertisoft.catalog_pizza.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CatalogViewModel(
	private val catalogItemsUseCase: CatalogItemsUseCase, ) : ViewModel() {

	private val _state = MutableStateFlow<CatalogState>(CatalogState.Initial)
	val state: StateFlow<CatalogState> = _state

	fun loadCatalog() {
		viewModelScope.launch {
			_state.value = CatalogState.Loading

			try {
				val catalog = catalogItemsUseCase()
				_state.value = CatalogState.Content(catalog)
			} catch (ce: CancellationException) {
				throw ce
			} catch (ex: Exception) {
				_state.value = CatalogState.Failure(ex.localizedMessage.orEmpty())
			}
		}
	}
}