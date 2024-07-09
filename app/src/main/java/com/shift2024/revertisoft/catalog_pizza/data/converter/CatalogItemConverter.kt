package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogItemModel
import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogListModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogList

class CatalogItemConverter {

	fun convertAll(model: CatalogItemModel): CatalogItem =
		CatalogItem(
			success = model.success,

			reason = model.reason,
			catalogs =model.catalog,

		)

	fun convertCatalogList(modelCatalogList: CatalogListModel): CatalogList =
		CatalogList(
		id = modelCatalogList.id,
		name = modelCatalogList.name,
		ingredientName = modelCatalogList.ingredientName,
		ingredientCost = modelCatalogList.ingredientCost,
		ingredientImg = modelCatalogList.ingredientImg,
		toppingsName=modelCatalogList.toppingsName,
		toppingsCost=modelCatalogList.toppingsCost,
		toppingsImg=modelCatalogList.toppingsImg,
		description=modelCatalogList.description,
		sizeName=modelCatalogList.sizeName,
		sizePrice=modelCatalogList.sizePrice,
		doughsName=modelCatalogList.doughsName,
		doughsPrice=modelCatalogList.doughsPrice,
		calories=modelCatalogList.calories,
		protein=modelCatalogList.protein,
		totalFat=modelCatalogList.totalFat,
		carbohydrates=modelCatalogList.carbohydrates,
		sodium=modelCatalogList.sodium,
		allergens=modelCatalogList.allergens,
		isVegetarian=modelCatalogList.isVegetarian,
		isGlutenFree=modelCatalogList.isGlutenFree,
		isNew=modelCatalogList.isNew,
		isHit=modelCatalogList.isHit,
		img=modelCatalogList.img,
	)


}