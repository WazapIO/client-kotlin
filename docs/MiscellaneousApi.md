# MiscellaneousApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesInstanceKeyMiscProfilePicGet**](MiscellaneousApi.md#instancesInstanceKeyMiscProfilePicGet) | **GET** /instances/{instance_key}/misc/profile-pic | Get profile pic.
[**instancesInstanceKeyMiscUserInfoPost**](MiscellaneousApi.md#instancesInstanceKeyMiscUserInfoPost) | **POST** /instances/{instance_key}/misc/user-info | Fetches the users info.


<a name="instancesInstanceKeyMiscProfilePicGet"></a>
# **instancesInstanceKeyMiscProfilePicGet**
> MainAPIResponse instancesInstanceKeyMiscProfilePicGet(instanceKey, jid)

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
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyMiscProfilePicGet(instanceKey, jid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#instancesInstanceKeyMiscProfilePicGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#instancesInstanceKeyMiscProfilePicGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **jid** | **kotlin.String**| JID |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyMiscUserInfoPost"></a>
# **instancesInstanceKeyMiscUserInfoPost**
> MainAPIResponse instancesInstanceKeyMiscUserInfoPost(instanceKey, `data`)

Fetches the users info.

Gets the user info for the given user ids. This does not checks if user is registered or not

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsUserInfoPayload =  // StructsUserInfoPayload | Data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyMiscUserInfoPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#instancesInstanceKeyMiscUserInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#instancesInstanceKeyMiscUserInfoPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsUserInfoPayload**](StructsUserInfoPayload.md)| Data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

