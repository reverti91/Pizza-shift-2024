package com.shift2024.revertisoft.catalog_pizza.domain.entity

import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogListModel


data class CatalogItem(
	val success: Boolean,
	val reason:String,
	val catalogs: List<CatalogList>,

	)