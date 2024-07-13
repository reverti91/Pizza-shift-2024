package com.shift2024.revertisoft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shift2024.revertisoft.catalog_pizza.data.converter.CatalogItemConverter
import com.shift2024.revertisoft.catalog_pizza.data.converter.PizzaConverter
import com.shift2024.revertisoft.catalog_pizza.data.converter.PizzaDoughsConverter
import com.shift2024.revertisoft.catalog_pizza.data.converter.PizzaIngredientConverter
import com.shift2024.revertisoft.catalog_pizza.data.converter.PizzaSizeConverter
import com.shift2024.revertisoft.catalog_pizza.data.model.PizzaModel
import com.shift2024.revertisoft.catalog_pizza.data.network.CatalogApi
import com.shift2024.revertisoft.catalog_pizza.data.repository.PizzaRepositoryImpl
import com.shift2024.revertisoft.catalog_pizza.domain.repository.PizzaRepository
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase
import com.shift2024.revertisoft.ui.theme.PizzaShift2024

class MainActivity : ComponentActivity() {

	private val networkModule = NetworkModule()

	private val catalogApi = networkModule.retrofit.create(CatalogApi::class.java)
	private val pizzaSizeConverter= PizzaSizeConverter()
	private val pizzaIngredientConverter= PizzaIngredientConverter(NetworkModule.BASE_URL)
	private val pizzaDoughsConverter=PizzaDoughsConverter()

	private val pizzaConverter = PizzaConverter(pizzaIngredientConverter,pizzaSizeConverter,pizzaDoughsConverter,NetworkModule.BASE_URL)


	private val pizzaRepository: PizzaRepository = PizzaRepositoryImpl(catalogApi, pizzaConverter)
	private val catalogItemsUseCase = CatalogItemsUseCase(pizzaRepository)


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			PizzaShift2024 {
				MainScreen(
					catalogItemsUseCase = catalogItemsUseCase,

				)
			}
		}
	}
}