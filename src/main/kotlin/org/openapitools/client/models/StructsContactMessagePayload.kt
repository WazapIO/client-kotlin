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

package org.openapitools.client.models

import org.openapitools.client.models.StructsContactMessagePayloadVcard

import com.squareup.moshi.Json

/**
 * 
 *
 * @param to 
 * @param vcard 
 */


data class StructsContactMessagePayload (

    @Json(name = "to")
    val to: kotlin.String,

    @Json(name = "vcard")
    val vcard: StructsContactMessagePayloadVcard

)

