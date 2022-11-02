# InstanceApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesCreateGet**](InstanceApi.md#instancesCreateGet) | **GET** /instances/create | Creates a new instance key.
[**instancesInstanceKeyContactsGet**](InstanceApi.md#instancesInstanceKeyContactsGet) | **GET** /instances/{instance_key}/contacts | Get contacts.
[**instancesInstanceKeyDeleteDelete**](InstanceApi.md#instancesInstanceKeyDeleteDelete) | **DELETE** /instances/{instance_key}/delete | Delete Instance.
[**instancesInstanceKeyGet**](InstanceApi.md#instancesInstanceKeyGet) | **GET** /instances/{instance_key}/ | Get Instance.
[**instancesInstanceKeyLogoutDelete**](InstanceApi.md#instancesInstanceKeyLogoutDelete) | **DELETE** /instances/{instance_key}/logout | Logout Instance.
[**instancesInstanceKeyQrcodeGet**](InstanceApi.md#instancesInstanceKeyQrcodeGet) | **GET** /instances/{instance_key}/qrcode | Get QrCode.
[**instancesInstanceKeyWebhookPut**](InstanceApi.md#instancesInstanceKeyWebhookPut) | **PUT** /instances/{instance_key}/webhook | Change Webhook url.
[**instancesListGet**](InstanceApi.md#instancesListGet) | **GET** /instances/list | Get all instances.


<a name="instancesCreateGet"></a>
# **instancesCreateGet**
> MainAPIResponse instancesCreateGet(instanceKey)

Creates a new instance key.

This endpoint is used to create a new WhatsApp Web instance.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Insert instance key if you want to provide custom key
try {
    val result : MainAPIResponse = apiInstance.instancesCreateGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesCreateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesCreateGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Insert instance key if you want to provide custom key | [optional]

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyContactsGet"></a>
# **instancesInstanceKeyContactsGet**
> MainAPIResponse instancesInstanceKeyContactsGet(instanceKey)

Get contacts.

Fetches the list of contacts in the instance.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyContactsGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyContactsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyContactsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyDeleteDelete"></a>
# **instancesInstanceKeyDeleteDelete**
> MainAPIResponse instancesInstanceKeyDeleteDelete(instanceKey)

Delete Instance.

Deletes the instance with the provided key.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyDeleteDelete(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyDeleteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyDeleteDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGet"></a>
# **instancesInstanceKeyGet**
> MainAPIResponse instancesInstanceKeyGet(instanceKey)

Get Instance.

Returns the instance data of single instance with connection status.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyLogoutDelete"></a>
# **instancesInstanceKeyLogoutDelete**
> MainAPIResponse instancesInstanceKeyLogoutDelete(instanceKey)

Logout Instance.

Logouts of the instance with the provided key.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyLogoutDelete(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyLogoutDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyLogoutDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyQrcodeGet"></a>
# **instancesInstanceKeyQrcodeGet**
> MainAPIResponse instancesInstanceKeyQrcodeGet(instanceKey)

Get QrCode.

Returns the qrcode in the base64 format.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyQrcodeGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyQrcodeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyQrcodeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyWebhookPut"></a>
# **instancesInstanceKeyWebhookPut**
> MainAPIResponse instancesInstanceKeyWebhookPut(instanceKey, `data`)

Change Webhook url.

Changes the webhook url of an instance.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsWebhookPayload =  // StructsWebhookPayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyWebhookPut(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesInstanceKeyWebhookPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesInstanceKeyWebhookPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsWebhookPayload**](StructsWebhookPayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesListGet"></a>
# **instancesListGet**
> MainAPIResponse instancesListGet()

Get all instances.

Fetches the list of all Instances with login status.

### Example
```kotlin
// Import classes:
//import whatsapi.infrastructure.*
//import whatsapi.models.*

val apiInstance = InstanceApi()
try {
    val result : MainAPIResponse = apiInstance.instancesListGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstanceApi#instancesListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstanceApi#instancesListGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

