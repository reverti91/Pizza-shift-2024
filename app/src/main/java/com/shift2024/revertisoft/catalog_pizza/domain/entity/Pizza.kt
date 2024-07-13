package com.shift2024.revertisoft.catalog_pizza.domain.entity


data class Pizza(
        val id: String,
        val name: String,
        val ingredients: List<PizzaIngredient>,
        val toppings:List<PizzaIngredient>,
        val description:String,
        val size: List<PizzaSize>,
        val doughs: List<PizzaDough>,
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
