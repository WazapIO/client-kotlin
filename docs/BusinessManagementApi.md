# BusinessManagementApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesInstanceKeyBusinessCatalogGet**](BusinessManagementApi.md#instancesInstanceKeyBusinessCatalogGet) | **GET** /instances/{instance_key}/business/catalog | Fetches the catlog.


<a name="instancesInstanceKeyBusinessCatalogGet"></a>
# **instancesInstanceKeyBusinessCatalogGet**
> APIResponse instancesInstanceKeyBusinessCatalogGet(instanceKey)

Fetches the catlog.

Gets list of all products registered by you.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = BusinessManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyBusinessCatalogGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessManagementApi#instancesInstanceKeyBusinessCatalogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessManagementApi#instancesInstanceKeyBusinessCatalogGet")
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

