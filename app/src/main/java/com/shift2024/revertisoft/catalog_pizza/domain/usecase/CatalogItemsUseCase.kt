package com.shift2024.revertisoft.catalog_pizza.domain.usecase

import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza
import com.shift2024.revertisoft.catalog_pizza.domain.repository.PizzaRepository

class CatalogItemsUseCase(private val repository: PizzaRepository) {

	suspend operator fun invoke(): List<Pizza> =
		repository.getAll()
}