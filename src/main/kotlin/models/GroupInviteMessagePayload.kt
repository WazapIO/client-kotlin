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
 * @param caption 
 * @param expiryMinutes 
 * @param inviteCode 
 * @param to 
 */


data class GroupInviteMessagePayload (

    @Json(name = "caption")
    val caption: kotlin.String? = null,

    @Json(name = "expiry_minutes")
    val expiryMinutes: kotlin.Int? = null,

    @Json(name = "invite_code")
    val inviteCode: kotlin.String? = null,

    @Json(name = "to")
    val to: kotlin.String? = null

)

