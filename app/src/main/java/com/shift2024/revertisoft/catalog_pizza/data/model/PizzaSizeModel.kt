package com.shift2024.revertisoft.catalog_pizza.data.model

import com.shift2024.revertisoft.common.domain.PizzaSizeEnum
import kotlinx.serialization.Serializable


@Serializable
data class PizzaSizeModel(
    val name: PizzaSizeEnum,
    val price:Long,
    )