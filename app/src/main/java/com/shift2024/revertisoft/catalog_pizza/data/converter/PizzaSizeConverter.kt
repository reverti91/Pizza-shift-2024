package com.shift2024.revertisoft.catalog_pizza.data.converter

import com.shift2024.revertisoft.catalog_pizza.data.model.PizzaSizeModel
import com.shift2024.revertisoft.catalog_pizza.domain.entity.PizzaSize

class PizzaSizeConverter {


    fun convert(from:PizzaSizeModel):PizzaSize= with(from){
        PizzaSize(
            name =name,
            price=price,
        )
    }
}