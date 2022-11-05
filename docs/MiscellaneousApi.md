# MiscellaneousApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfilePic**](MiscellaneousApi.md#getProfilePic) | **GET** /instances/{instance_key}/misc/profile-pic | Get profile pic.
[**getUsersInfo**](MiscellaneousApi.md#getUsersInfo) | **POST** /instances/{instance_key}/misc/user-info | Fetches the users info.


<a name="getProfilePic"></a>
# **getProfilePic**
> APIResponse getProfilePic(instanceKey, jid)

Get profile pic.

Returns the profile pic of the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val jid : kotlin.String = jid_example // kotlin.String | JID
try {
    val result : APIResponse = apiInstance.getProfilePic(instanceKey, jid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#getProfilePic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#getProfilePic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **jid** | **kotlin.String**| JID |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUsersInfo"></a>
# **getUsersInfo**
> APIResponse getUsersInfo(instanceKey, `data`)

Fetches the users info.

Gets the user info for the given user ids. This does not checks if user is registered or not

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : UserInfoPayload =  // UserInfoPayload | Data
try {
    val result : APIResponse = apiInstance.getUsersInfo(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#getUsersInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#getUsersInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**UserInfoPayload**](UserInfoPayload.md)| Data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

