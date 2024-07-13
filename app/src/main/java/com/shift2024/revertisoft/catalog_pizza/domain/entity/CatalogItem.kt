package com.shift2024.revertisoft.catalog_pizza.domain.entity


data class CatalogItem(
    val success: Boolean,
    val reason:String,
    val catalogs: List<Pizza>,

    )