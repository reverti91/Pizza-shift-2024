package com.shift2024.revertisoft.catalog_pizza.data.model

import com.shift2024.revertisoft.common.domain.PizzaDoughEnum
import com.shift2024.revertisoft.common.domain.PizzaIngredientEnum
import com.shift2024.revertisoft.common.domain.PizzaSizeEnum
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CatalogItemModel(
	val success:Boolean,
	@SerialName("reason")
	val reason:String,
	@SerialName("catalog")
	val catalog:List<PizzaModel>,
)
