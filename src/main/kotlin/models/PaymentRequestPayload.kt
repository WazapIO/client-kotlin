/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param amount 
 * @param currency 
 * @param expiryMinutes 
 * @param to 
 */


data class PaymentRequestPayload (

    @Json(name = "amount")
    val amount: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "expiry_minutes")
    val expiryMinutes: kotlin.Int? = null,

    @Json(name = "to")
    val to: kotlin.String? = null

)

