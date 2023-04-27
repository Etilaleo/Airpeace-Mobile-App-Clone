package com.example.airlineticket

import com.example.airlineticket.model.CurrencyData
import com.example.airlineticket.model.SelectCityData

object Currencies {

    fun currency(): ArrayList<CurrencyData> {
        return arrayListOf(
            CurrencyData("NGN", "Nigerian Naira", R.drawable.nigeria),
            CurrencyData("AED", "United Arab Emirates Dirham", R.drawable.uae),
            CurrencyData("CAD", "Canadian Dollar", R.drawable.canada),
            CurrencyData("EUR", "Euro", R.drawable.euro),
            CurrencyData("GHS", "Ghanaian Cedi", R.drawable.ghana),
            CurrencyData("USD", "US Dollar", R.drawable.usd),
            CurrencyData("GBP", "British Pound Sterling", R.drawable.euro)
        )
    }

    fun selectCity() : ArrayList<SelectCityData> {
        return arrayListOf(
            SelectCityData("Akure", "AKR", "Nigeria")
        )
    }

    fun whereTo() : ArrayList<SelectCityData> {
        return arrayListOf(
            SelectCityData("Abuja", "ABJ", "Nigeria")
        )
    }

}