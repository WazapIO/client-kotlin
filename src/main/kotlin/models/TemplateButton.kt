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
 * @param title 
 * @param type Valid types are replyButton, urlButton & callButton
 * @param buttonId Make sure this is unique
 * @param payload 
 */


data class TemplateButton (

    @Json(name = "title")
    val title: kotlin.String,

    /* Valid types are replyButton, urlButton & callButton */
    @Json(name = "type")
    val type: kotlin.String,

    /* Make sure this is unique */
    @Json(name = "button_id")
    val buttonId: kotlin.String? = null,

    @Json(name = "payload")
    val payload: kotlin.String? = null

)

