package com.shift2024.revertisoft.catalog_pizza.domain.entity

import com.shift2024.revertisoft.common.domain.PizzaDough
import com.shift2024.revertisoft.common.domain.PizzaIngredient
import com.shift2024.revertisoft.common.domain.PizzaSize


data class CatalogItem(
	val id: String,
	val name: String,
	val ingredientName: PizzaIngredient,
	val ingredientCost: Long,
	val ingredientImg: String,
	val toppingsName:PizzaIngredient,
	val toppingsCost:Long,
	val toppingsImg:String,
	val description:String,
	val sizeName:PizzaSize,
	val sizePrice:Long,
	val doughsName:PizzaDough,
	val doughsPrice:Long,
	val calories:Long,
	val protein:String,
	val totalFat:String,
	val carbohydrates:String,
	val sodium:String,
	val allergens:String,
	val isVegetarian:Boolean,
	val isGlutenFree:Boolean,
	val isNew:Boolean,
	val isHit:Boolean,
	val img:String,
)