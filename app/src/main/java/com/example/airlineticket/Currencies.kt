package com.example.airlineticket

import com.example.airlineticket.model.CurrencyData

object Currencies {

    fun currency() : ArrayList<CurrencyData> {
        val allCurrencies  = arrayListOf<CurrencyData>()

        allCurrencies.add(CurrencyData("NGN", "Nigerian Naira", R.drawable.nigeria))
        allCurrencies.add(CurrencyData("AED", "United Arab Emirates Dirham", R.drawable.uae))
        allCurrencies.add(CurrencyData("CAD", "Canadian Dollar", R.drawable.canada))
        allCurrencies.add(CurrencyData("EUR", "Euro", R.drawable.euro))
        allCurrencies.add(CurrencyData("GHS", "Ghanaian Cedi", R.drawable.ghana))
        allCurrencies.add(CurrencyData("USD", "US Dollar", R.drawable.usd))
        allCurrencies.add(CurrencyData("GBP", "British Pound Sterling", R.drawable.euro))

        return  allCurrencies
    }

}