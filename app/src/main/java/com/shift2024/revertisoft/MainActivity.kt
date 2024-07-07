package com.shift2024.revertisoft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shift2024.revertisoft.details.data.converter.LoanConverter
import com.shift2024.revertisoft.details.data.network.LoanApi
import com.shift2024.revertisoft.details.data.repository.LoanRepositoryImpl
import com.shift2024.revertisoft.details.domain.usecase.GetLoanUseCase
import com.shift2024.revertisoft.catalog_pizza.data.converter.CatalogItemConverter
import com.shift2024.revertisoft.catalog_pizza.data.network.LoanHistoryApi
import com.shift2024.revertisoft.catalog_pizza.data.repository.CatalogRepositoryImpl
import com.shift2024.revertisoft.catalog_pizza.domain.repository.LoanHistoryRepository
import com.shift2024.revertisoft.catalog_pizza.domain.usecase.CatalogItemsUseCase
import com.shift2024.revertisoft.ui.theme.ShiftIntensiveLiveCodingTheme

class MainActivity : ComponentActivity() {

	private val networkModule = NetworkModule()

	private val loanHistoryApi = networkModule.retrofit.create(LoanHistoryApi::class.java)
	private val catalogItemConverter = CatalogItemConverter()
	private val loanHistoryRepository: LoanHistoryRepository = CatalogRepositoryImpl(loanHistoryApi, catalogItemConverter)
	private val catalogItemsUseCase = CatalogItemsUseCase(loanHistoryRepository)

	private val loanApi = networkModule.retrofit.create(LoanApi::class.java)
	private val loanConverter = LoanConverter()
	private val loanRepository = LoanRepositoryImpl(loanApi, loanConverter)
	private val getLoanUseCase = GetLoanUseCase(loanRepository)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ShiftIntensiveLiveCodingTheme {
				MainScreen(
					catalogItemsUseCase = catalogItemsUseCase,
					getLoanUseCase = getLoanUseCase,
				)
			}
		}
	}
}