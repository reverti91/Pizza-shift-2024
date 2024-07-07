package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogItemModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem

class CatalogItemConverter {

	fun convert(model: CatalogItemModel): CatalogItem =
		CatalogItem(
			id = model.id.toString(),
			name = model.name,
			ingredientName = model.ingredientName,
			ingredientCost = model.ingredientCost,
			ingredientImg = model.ingredientImg,
			toppingsName=model.toppingsName,
			toppingsCost=model.toppingsCost,
			toppingsImg=model.toppingsImg,
			description=model.description,
			sizeName=model.sizeName,
			sizePrice=model.sizePrice,
			doughsName=model.doughsName,
			doughsPrice=model.doughsPrice,
			calories=model.calories,
			protein=model.protein,
			totalFat=model.totalFat,
			carbohydrates=model.carbohydrates,
			sodium=model.sodium,
			allergens=model.allergens,
			isVegetarian=model.isVegetarian,
			isGlutenFree=model.isGlutenFree,
			isNew=model.isNew,
	        isHit=model.isHit,
			img=model.img,
	)

}