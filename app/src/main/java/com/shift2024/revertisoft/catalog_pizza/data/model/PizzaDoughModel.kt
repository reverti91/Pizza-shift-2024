package com.shift2024.revertisoft.catalog_pizza.data.model

import com.shift2024.revertisoft.common.domain.PizzaDoughEnum
import kotlinx.serialization.Serializable

@Serializable
data class PizzaDoughModel(
    val name: PizzaDoughEnum,
    val price: Long,
)