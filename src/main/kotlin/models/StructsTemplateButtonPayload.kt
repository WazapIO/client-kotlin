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

import models.StructsTemplateButton

import com.squareup.moshi.Json

/**
 * 
 *
 * @param buttons 
 * @param to 
 * @param contentText 
 * @param footer 
 * @param header 
 */


data class StructsTemplateButtonPayload (

    @Json(name = "buttons")
    val buttons: kotlin.collections.List<StructsTemplateButton>,

    @Json(name = "to")
    val to: kotlin.String,

    @Json(name = "content_text")
    val contentText: kotlin.String? = null,

    @Json(name = "footer")
    val footer: kotlin.String? = null,

    @Json(name = "header")
    val header: kotlin.String? = null

)

