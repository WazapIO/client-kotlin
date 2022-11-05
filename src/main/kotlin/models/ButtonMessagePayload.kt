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

import models.ReplyButton

import com.squareup.moshi.Json

/**
 * 
 *
 * @param buttons 
 * @param footerText 
 * @param headerText 
 * @param text 
 * @param to 
 */


data class ButtonMessagePayload (

    @Json(name = "buttons")
    val buttons: kotlin.collections.List<ReplyButton>? = null,

    @Json(name = "footer_text")
    val footerText: kotlin.String? = null,

    @Json(name = "header_text")
    val headerText: kotlin.String? = null,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "to")
    val to: kotlin.String? = null

)
