# InstanceApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeWebhookUrl**](InstanceApi.md#changeWebhookUrl) | **PUT** /instances/{instance_key}/webhook | Change Webhook url.
[**createInstance**](InstanceApi.md#createInstance) | **POST** /instances/create | Creates a new instance key.
[**deleteInstance**](InstanceApi.md#deleteInstance) | **DELETE** /instances/{instance_key}/delete | Delete Instance.
[**getContacts**](InstanceApi.md#getContacts) | **GET** /instances/{instance_key}/contacts | Get contacts.
[**getInstance**](InstanceApi.md#getInstance) | **GET** /instances/{instance_key}/ | Get Instance.
[**getQrCode**](InstanceApi.md#getQrCode) | **GET** /instances/{instance_key}/qrcode | Get QrCode.
[**listInstances**](InstanceApi.md#listInstances) | **GET** /instances/list | Get all instances.
[**logoutInstance**](InstanceApi.md#logoutInstance) | **DELETE** /instances/{instance_key}/logout | Logout Instance.


<a name="changeWebhookUrl"></a>
# **changeWebhookUrl**
> APIResponse changeWebhookUrl(instanceKey, `data`)

Change Webhook url.

Changes the webhook url of an instance.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : WebhookPayload =  // WebhookPayload | Message data
try {
    val result : APIResponse = apiInstance.changeWebhookUrl(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#changeWebhookUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#changeWebhookUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**WebhookPayload**](WebhookPayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createInstance"></a>
# **createInstance**
> APIResponse createInstance(`data`)

Creates a new instance key.

This endpoint is used to create a new WhatsApp Web instance.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val `data` : CreateInstancePayload =  // CreateInstancePayload | Instance data
try {
    val result : APIResponse = apiInstance.createInstance(`data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#createInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#createInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;data&#x60;** | [**CreateInstancePayload**](CreateInstancePayload.md)| Instance data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteInstance"></a>
# **deleteInstance**
> APIResponse deleteInstance(instanceKey)

Delete Instance.

Deletes the instance with the provided key.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.deleteInstance(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#deleteInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#deleteInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContacts"></a>
# **getContacts**
> APIResponse getContacts(instanceKey)

Get contacts.

Fetches the list of contacts in the instance.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.getContacts(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#getContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#getContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInstance"></a>
# **getInstance**
> APIResponse getInstance(instanceKey)

Get Instance.

Returns the instance data of single instance with connection status.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.getInstance(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#getInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#getInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getQrCode"></a>
# **getQrCode**
> APIResponse getQrCode(instanceKey)

Get QrCode.

Returns the qrcode in the base64 format.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.getQrCode(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#getQrCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#getQrCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listInstances"></a>
# **listInstances**
> APIResponse listInstances()

Get all instances.

Fetches the list of all Instances with login status.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
try {
    val result : APIResponse = apiInstance.listInstances()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#listInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#listInstances")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="logoutInstance"></a>
# **logoutInstance**
> APIResponse logoutInstance(instanceKey)

Logout Instance.

Logouts of the instance with the provided key.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.logoutInstance(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#logoutInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#logoutInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

