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

import models.StructsFileUpload

import com.squareup.moshi.Json

/**
 * 
 *
 * @param mediaData 
 * @param mediaType 
 * @param to 
 * @param caption 
 * @param filename 
 */


data class StructsSendMediaPayload (

    @Json(name = "media_data")
    val mediaData: StructsFileUpload,

    @Json(name = "media_type")
    val mediaType: kotlin.String,

    @Json(name = "to")
    val to: kotlin.String,

    @Json(name = "caption")
    val caption: kotlin.String? = null,

    @Json(name = "filename")
    val filename: kotlin.String? = null

)
