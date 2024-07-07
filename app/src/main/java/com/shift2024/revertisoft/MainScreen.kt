package com.shift2024.revertisoft

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

import com.shift2024.revertisoft.catalog_pizza.CatalogRoute
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase
import com.shift2024.revertisoft.catalog_pizza.presentation.CatalogViewModel
import com.shift2024.revertisoft.catalog_pizza.presentation.CatalogViewModelFactory
import com.shift2024.revertisoft.catalog_pizza.ui.CatalogScreen

@Composable
fun MainScreen(
    catalogItemsUseCase: CatalogItemsUseCase
) {
	val navController = rememberNavController()

	Surface {
		NavHost(navController = navController, startDestination = CatalogRoute) {
			composable<CatalogRoute> {
				val viewModel: CatalogViewModel = viewModel(factory = CatalogViewModelFactory(catalogItemsUseCase))
				CatalogScreen(
					viewModel
				)
			}
			/*composable<DetailsRoute> { DetailsRoute(/*...*/) }*/

			/*composable<DetailsRoute> {
				val destination = it.toRoute<DetailsRoute>()
				val viewModel = viewModel(DetailsViewModel::class.java, factory = DetailsViewModelFactory(destination.loanId, getLoanUseCase))
				DetailsScreen(
					viewModel
				)
			}*/
		}
	}
}