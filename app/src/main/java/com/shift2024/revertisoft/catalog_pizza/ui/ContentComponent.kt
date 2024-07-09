package com.shift2024.revertisoft.catalog_pizza.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shift2024.revertisoft.R
import com.shift2024.revertisoft.catalog_pizza.domain.entity.CatalogItem
import com.shift2024.revertisoft.formatAmountText


@Composable
fun ContentComponent(
	catalogs: List<CatalogItem>
) {
	LazyColumn(modifier = Modifier.fillMaxHeight()) {
		items(catalogs) { catalog ->
			CatalogItem(catalog)

		}
	}
}

@Composable
private fun CatalogItem(item: CatalogItem) {
	Row(modifier = Modifier.padding(all = 8.dp)) {
		Image(
			painter = painterResource(R.drawable.ic_launcher_background),
			contentDescription = "Loading pizza...",
			modifier = Modifier
				// Set image size to 40 dp
				.size(60.dp)
				// Clip image to be shaped as a circle
				.clip(CircleShape)
		)

		// Add a horizontal space between the image and the column
		Spacer(modifier = Modifier.width(8.dp))


		Column(
			Modifier
				.fillMaxWidth()
				.padding(vertical = 8.dp, horizontal = 16.dp)
		) {

				Text(
					text =  item.name,
					style = MaterialTheme.typography.headlineMedium,
				)
				Text(
					text = item.description, //formatLoanStatus(status = item.status),
					style = MaterialTheme.typography.bodySmall,
				)

				Text(
					text = formatAmountText(amount = item.sizePrice),
					style = MaterialTheme.typography.bodyMedium,
				)
		}
	}
}
