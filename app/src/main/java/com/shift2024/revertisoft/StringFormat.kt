package com.shift2024.revertisoft

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import java.text.NumberFormat
import java.util.Locale



@Composable
fun formatAmountText(amount: Long): String {
	val numberFormatter = NumberFormat.getNumberInstance(Locale.getDefault())
	return stringResource(R.string.at)+ numberFormatter.format(amount) + stringResource(R.string.ruble)
}

/*
@Composable
fun formatPizzaName(name:String):String{
	stringResource(name.)
}*/


