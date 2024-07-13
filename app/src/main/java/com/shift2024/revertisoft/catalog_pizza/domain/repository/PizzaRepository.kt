package com.shift2024.revertisoft.catalog_pizza.domain.repository

import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza

interface PizzaRepository {

	suspend fun getAll(): List<Pizza>
}