package com.revolut.converter.domain.entity

import java.math.BigDecimal

/**
 * Data class that holds currency description
 */
data class Currency(
    val code: String,
    val name: String,
    val image: Int
)

/**
 * Specifies exchange rate for currency
 */
data class CurrencyRate(
    val currency: Currency,
    val rate: BigDecimal
)

/**
 * Holds all information needed to perform exchange
 * baseCurrency is for currency we want to exchange
 */
data class ExchangeRates(
    val baseCurrency: Currency,
    val rates: List<CurrencyRate>
)


/**
 * Holds information about already performed exchange
 * amount specifies calculated price of purchase
 */
open class ConvertedCurrency(
    val currency: Currency,
    val amount: BigDecimal
)

/**
 * Info for base currency used for exchange
 * amount specifies how much currency we wanted to sell
 */
class BaseConvertedCurrency(
    currency: Currency,
    amount: BigDecimal
): ConvertedCurrency(currency, amount)