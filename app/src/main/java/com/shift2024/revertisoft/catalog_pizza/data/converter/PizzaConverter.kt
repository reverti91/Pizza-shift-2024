package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.PizzaModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza


class PizzaConverter(
    private val ingredientConverter: PizzaIngredientConverter,
    private val sizeConverter: PizzaSizeConverter,
    private val doughConverter: PizzaDoughsConverter,
    private val baseUrl: String
) {

    fun convertPizza(pizzaListModel: PizzaModel): Pizza =
        Pizza(
            id = pizzaListModel.id,
            name = pizzaListModel.name,
            ingredients =pizzaListModel.ingredients.map{ingredientConverter.convert(it)},
            toppings = pizzaListModel.toppings.map{ingredientConverter.convert(it)},
            description = pizzaListModel.description,
            size =pizzaListModel.size.map{sizeConverter.convert(it)},
            doughs =pizzaListModel.doughs.map{doughConverter.convert(it)},
            calories = pizzaListModel.calories,
            protein = pizzaListModel.protein,
            totalFat = pizzaListModel.totalFat,
            carbohydrates = pizzaListModel.carbohydrates,
            sodium = pizzaListModel.sodium,
            allergens = pizzaListModel.allergens,
            isVegetarian = pizzaListModel.isVegetarian,
            isGlutenFree = pizzaListModel.isGlutenFree,
            isNew = pizzaListModel.isNew,
            isHit = pizzaListModel.isHit,
            img = "$baseUrl$pizzaListModel.img",
        )

}