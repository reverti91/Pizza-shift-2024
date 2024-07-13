package com.shift2024.revertisoft.catalog_pizza.domain.entity

import com.shift2024.revertisoft.common.domain.PizzaIngredientEnum

data class PizzaIngredient (
    val name: PizzaIngredientEnum,
    val cost:Long,
    val img: String,
)