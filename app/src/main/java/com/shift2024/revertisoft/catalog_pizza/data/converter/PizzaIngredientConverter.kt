package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.PizzaIngredientModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.PizzaIngredient

class PizzaIngredientConverter (
    private val baseUrl: String
    ) {
        fun convert(from: PizzaIngredientModel): PizzaIngredient =
            with (from) {
                PizzaIngredient(
                    name = name,
                    cost = cost,
                    img = "$baseUrl$img"
                )
            }
    }
