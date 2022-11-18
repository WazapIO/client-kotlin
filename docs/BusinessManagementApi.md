# BusinessManagementApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchCatlog**](BusinessManagementApi.md#fetchCatlog) | **GET** /instances/{instance_key}/business/catalog | Fetches the catlog.
[**sendPaymentRequest**](BusinessManagementApi.md#sendPaymentRequest) | **POST** /instances/{instance_key}/business/payment-request | Send a payment request.


<a name="fetchCatlog"></a>
# **fetchCatlog**
> APIResponse fetchCatlog(instanceKey)

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
    val result : APIResponse = apiInstance.fetchCatlog(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessManagementApi#fetchCatlog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessManagementApi#fetchCatlog")
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

<a name="sendPaymentRequest"></a>
# **sendPaymentRequest**
> APIResponse sendPaymentRequest(instanceKey, `data`)

Send a payment request.

Sends an payment request to a user. Feature is still in beta.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = BusinessManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : PaymentRequestPayload =  // PaymentRequestPayload | Data
try {
    val result : APIResponse = apiInstance.sendPaymentRequest(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessManagementApi#sendPaymentRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessManagementApi#sendPaymentRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**PaymentRequestPayload**](PaymentRequestPayload.md)| Data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

