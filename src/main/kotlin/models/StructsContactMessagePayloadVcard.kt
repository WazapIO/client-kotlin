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
 * @param fullName 
 * @param organization 
 * @param phone 
 */


data class StructsContactMessagePayloadVcard (

    @Json(name = "full_name")
    val fullName: kotlin.String? = null,

    @Json(name = "organization")
    val organization: kotlin.String? = null,

    @Json(name = "phone")
    val phone: kotlin.String? = null

)

