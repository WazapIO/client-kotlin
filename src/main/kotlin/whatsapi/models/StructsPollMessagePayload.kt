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

package whatsapi.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param options 
 * @param selectableOptionsCount 
 * @param title 
 * @param to 
 */


data class StructsPollMessagePayload (

    @Json(name = "options")
    val options: kotlin.collections.List<kotlin.String>,

    @Json(name = "selectable_options_count")
    val selectableOptionsCount: kotlin.Int,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "to")
    val to: kotlin.String

)

