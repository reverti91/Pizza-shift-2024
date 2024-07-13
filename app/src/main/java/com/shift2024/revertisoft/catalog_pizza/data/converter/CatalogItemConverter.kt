package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogItemModel

import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza

class CatalogItemConverter (
private val pizzaConverter: PizzaConverter
){

	fun convertAll(model: CatalogItemModel): CatalogItem =
		CatalogItem(
			success = model.success,
			reason = model.reason,
			catalogs =model.catalog.map{pizzaConverter.convertPizza(it)},
		)

}