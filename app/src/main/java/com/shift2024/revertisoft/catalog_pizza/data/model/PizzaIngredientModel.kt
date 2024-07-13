package com.shift2024.revertisoft.catalog_pizza.data.model

import com.shift2024.revertisoft.common.domain.PizzaIngredientEnum
import kotlinx.serialization.Serializable

    @Serializable
    data class PizzaIngredientModel(
        val name: PizzaIngredientEnum,
        val cost:Long,
        val img: String,
    )
