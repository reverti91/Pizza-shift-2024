package com.shift2024.revertisoft.catalog_pizza.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable

data class PizzaModel(
    val id: String,
    @SerialName("name")
    val name: String,
    val ingredients:List<PizzaIngredientModel>,
    val toppings:List<PizzaIngredientModel>,
    @SerialName("description")
    val description:String,
    val size:List<PizzaSizeModel>,
    val doughs:List<PizzaDoughModel>,
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