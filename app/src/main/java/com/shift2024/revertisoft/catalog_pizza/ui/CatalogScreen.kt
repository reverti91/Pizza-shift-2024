package com.shift2024.revertisoft.catalog_pizza.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.shift2024.revertisoft.R
import com.shift2024.revertisoft.catalog_pizza.presentation.CatalogState
import com.shift2024.revertisoft.catalog_pizza.presentation.CatalogViewModel


@Composable
fun CatalogScreen(catalogViewModel: CatalogViewModel, onItemSelected: (catalogId: Long) -> Unit, ) {
	val catalogState by catalogViewModel.state.collectAsState()

	LaunchedEffect(Unit) {
		catalogViewModel.loadCatalog()
	}

	Column(modifier = Modifier.fillMaxSize()) {
		Text(
			modifier = Modifier
				.fillMaxWidth()
				.padding(vertical = 12.dp, horizontal = 8.dp),
			text = stringResource(id = R.string.Catalog_title),
			style = MaterialTheme.typography.titleLarge,
		)

		when (val state = catalogState) {
			is CatalogState.Initial,
			is CatalogState.Loading -> LoadingComponent()
			is CatalogState.Failure -> ErrorComponent(
				message = state.message ?: stringResource(id = R.string.error_unknown_error),
				onRetry = { catalogViewModel.loadCatalog() },
			)

			is CatalogState.Content -> ContentComponent(
				catalogs = state.catalogs,
				onItemClicked = onItemSelected,
			)
		}
	}
}