package com.shift2024.revertisoft.catalog_pizza.data.repository

import android.util.Log
import com.shift2024.revertisoft.catalog_pizza.data.converter.PizzaConverter
import com.shift2024.revertisoft.catalog_pizza.data.model.CatalogItemModel
import com.shift2024.revertisoft.catalog_pizza.data.network.CatalogApi
import com.shift2024.revertisoft.catalog_pizza.domain.entity.Pizza
import com.shift2024.revertisoft.catalog_pizza.domain.repository.PizzaRepository
import kotlin.coroutines.cancellation.CancellationException


class PizzaRepositoryImpl(
	private val catalogApi: CatalogApi,
	private val pizzaConverter: PizzaConverter,
) : PizzaRepository {

	override suspend fun getAll(): List<Pizza> {

		return  try {
			val response: CatalogItemModel = catalogApi.getAll()
			Log.i("PizzaRepositoryImpl", "API ответ : $response")
			if (response.success) {
				val pizzas = response.catalog.map { pizzaConverter.convertPizza(it) }
				Log.i("PizzaRepositoryImpl", "Конвертировали :) : $pizzas")
				pizzas
			} else {
				Log.i("PizzaRepositoryImpl", "API провал :( : ${response.reason}")
				emptyList()
			}
		} catch (e: CancellationException) {
			throw e
		} catch (e: Exception) {
			Log.e("PizzaRepositoryImpl", "Exception: ${e.localizedMessage}")
			emptyList()
		}
	}



}