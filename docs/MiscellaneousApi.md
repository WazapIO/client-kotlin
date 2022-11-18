# MiscellaneousApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadMedia**](MiscellaneousApi.md#downloadMedia) | **POST** /instances/{instance_key}/misc/download | Download media
[**getProfilePic**](MiscellaneousApi.md#getProfilePic) | **GET** /instances/{instance_key}/misc/profile-pic | Get profile pic.
[**getUsersInfo**](MiscellaneousApi.md#getUsersInfo) | **POST** /instances/{instance_key}/misc/user-info | Fetches the users info.
[**setChatPresence**](MiscellaneousApi.md#setChatPresence) | **POST** /instances/{instance_key}/misc/chat-presence | Set chat presence
[**updateProfilePic**](MiscellaneousApi.md#updateProfilePic) | **PUT** /instances/{instance_key}/misc/profile-pic | Update profile picture


<a name="downloadMedia"></a>
# **downloadMedia**
> APIResponse downloadMedia(instanceKey, fileType, `data`, responseType)

Download media

Downloads the media from the given media keys.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val fileType : kotlin.String = fileType_example // kotlin.String | File type
val `data` : FileUpload =  // FileUpload | Media data
val responseType : kotlin.String = responseType_example // kotlin.String | Response type (file, base64)
try {
    val result : APIResponse = apiInstance.downloadMedia(instanceKey, fileType, `data`, responseType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#downloadMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#downloadMedia")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **fileType** | **kotlin.String**| File type | [enum: image, video, audio, document]
 **&#x60;data&#x60;** | [**FileUpload**](FileUpload.md)| Media data |
 **responseType** | **kotlin.String**| Response type (file, base64) | [optional]

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

<a name="setChatPresence"></a>
# **setChatPresence**
> APIResponse setChatPresence(instanceKey, jid, presence)

Set chat presence

Sets the presence of the given chat. (Typing, Recording, Paused) Options: typing, recording, paused

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val jid : kotlin.String = jid_example // kotlin.String | JID
val presence : kotlin.String = presence_example // kotlin.String | Presence
try {
    val result : APIResponse = apiInstance.setChatPresence(instanceKey, jid, presence)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#setChatPresence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#setChatPresence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **jid** | **kotlin.String**| JID |
 **presence** | **kotlin.String**| Presence |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateProfilePic"></a>
# **updateProfilePic**
> APIResponse updateProfilePic(instanceKey, updateProfilePicRequest)

Update profile picture

Changes the profile pic of the current logged in user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MiscellaneousApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val updateProfilePicRequest : UpdateProfilePicRequest =  // UpdateProfilePicRequest | 
try {
    val result : APIResponse = apiInstance.updateProfilePic(instanceKey, updateProfilePicRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#updateProfilePic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#updateProfilePic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **updateProfilePicRequest** | [**UpdateProfilePicRequest**](UpdateProfilePicRequest.md)|  |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

