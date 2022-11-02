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

package com.whatsapi.models

import com.whatsapi.models.StructsFileUpload
import com.whatsapi.models.StructsReplyButton

import com.squareup.moshi.Json

/**
 * 
 *
 * @param buttons 
 * @param footerText 
 * @param mediaData 
 * @param text 
 * @param to 
 */


data class StructsButtonMessageWithMediaPayload (

    @Json(name = "buttons")
    val buttons: kotlin.collections.List<StructsReplyButton>? = null,

    @Json(name = "footer_text")
    val footerText: kotlin.String? = null,

    @Json(name = "media_data")
    val mediaData: StructsFileUpload? = null,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "to")
    val to: kotlin.String? = null

)

