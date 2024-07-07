package com.shift2024.revertisoft.catalog_pizza.data.model

import com.shift2024.revertisoft.common.domain.PizzaDough
import com.shift2024.revertisoft.common.domain.PizzaIngredient
import com.shift2024.revertisoft.common.domain.PizzaSize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CatalogItemModel(
	val id: String,
	@SerialName("name")
	val name: String,
	val ingredientName: PizzaIngredient,
	val ingredientCost:Long,
	@SerialName("ingredientImg")
	val ingredientImg:String,
	val toppingsName:PizzaIngredient,
	val toppingsCost:Long,
	@SerialName("toppingsImg")
	val toppingsImg:String,
	@SerialName("description")
	val description:String,
	val sizeName: PizzaSize,
	val sizePrice:Long,
	val doughsName: PizzaDough,
	val doughsPrice:Long,
	val calories:Long,
	@SerialName("protein")
	val protein:String,
	@SerialName("totalFat")
	val totalFat:String,
	@SerialName("carbohydrates")
	val carbohydrates:String,
	@SerialName("sodium")
	val sodium:String,
	@SerialName("allergens")
	val allergens:String,
	val isVegetarian:Boolean,
	val isGlutenFree:Boolean,
	val isNew:Boolean,
	val isHit:Boolean,
	val img:String,

)