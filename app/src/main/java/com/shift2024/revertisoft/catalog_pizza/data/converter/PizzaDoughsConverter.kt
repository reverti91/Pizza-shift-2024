package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.PizzaDoughModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.PizzaDough

class PizzaDoughsConverter {

    fun convert(from: PizzaDoughModel):PizzaDough= with(from){
        PizzaDough(
            name=name,
            price=price,
        )

    }
}