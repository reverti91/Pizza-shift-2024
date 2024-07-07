package com.shift2024.revertisoft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shift2024.revertisoft.catalog_pizza.data.converter.CatalogItemConverter
import com.shift2024.revertisoft.catalog_pizza.data.network.CatalogApi
import com.shift2024.revertisoft.catalog_pizza.data.repository.CatalogRepositoryImpl
import com.shift2024.revertisoft.catalog_pizza.domain.repository.CatalogRepository
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase
import com.shift2024.revertisoft.ui.theme.ShiftIntensiveLiveCodingTheme

class MainActivity : ComponentActivity() {

	private val networkModule = NetworkModule()

	private val catalogApi = networkModule.retrofit.create(CatalogApi::class.java)
	private val catalogItemConverter = CatalogItemConverter()
	private val catalogRepository: CatalogRepository = CatalogRepositoryImpl(catalogApi, catalogItemConverter)
	private val catalogItemsUseCase = CatalogItemsUseCase(catalogRepository)


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ShiftIntensiveLiveCodingTheme {
				MainScreen(
					catalogItemsUseCase = catalogItemsUseCase,

				)
			}
		}
	}
}