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

import models.ListItem

import com.squareup.moshi.Json

/**
 * 
 *
 * @param rows 
 * @param title 
 */


data class ListSection (

    @Json(name = "rows")
    val rows: kotlin.collections.List<ListItem>,

    @Json(name = "title")
    val title: kotlin.String

)

