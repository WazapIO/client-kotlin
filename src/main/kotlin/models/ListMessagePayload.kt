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

import models.ListSection

import com.squareup.moshi.Json

/**
 * 
 *
 * @param sections 
 * @param to 
 * @param buttonText 
 * @param description 
 * @param multiSelect 
 * @param text 
 * @param title 
 */


data class ListMessagePayload (

    @Json(name = "sections")
    val sections: kotlin.collections.List<ListSection>,

    @Json(name = "to")
    val to: kotlin.String,

    @Json(name = "button_text")
    val buttonText: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "multi_select")
    val multiSelect: kotlin.Boolean? = null,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null

)

