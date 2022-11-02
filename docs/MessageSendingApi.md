# MessageSendingApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesInstanceKeyBusinessCatalogGet**](MessageSendingApi.md#instancesInstanceKeyBusinessCatalogGet) | **GET** /instances/{instance_key}/business/catalog | Fetches the catlog.
[**instancesInstanceKeySendAudioPost**](MessageSendingApi.md#instancesInstanceKeySendAudioPost) | **POST** /instances/{instance_key}/send/audio | Send raw audio.
[**instancesInstanceKeySendButtonMediaPost**](MessageSendingApi.md#instancesInstanceKeySendButtonMediaPost) | **POST** /instances/{instance_key}/send/button-media | Send a button message with a media header.
[**instancesInstanceKeySendButtonsPost**](MessageSendingApi.md#instancesInstanceKeySendButtonsPost) | **POST** /instances/{instance_key}/send/buttons | Send a button message.
[**instancesInstanceKeySendContactPost**](MessageSendingApi.md#instancesInstanceKeySendContactPost) | **POST** /instances/{instance_key}/send/contact | Send a contact message.
[**instancesInstanceKeySendDocumentPost**](MessageSendingApi.md#instancesInstanceKeySendDocumentPost) | **POST** /instances/{instance_key}/send/document | Send raw document.
[**instancesInstanceKeySendImagePost**](MessageSendingApi.md#instancesInstanceKeySendImagePost) | **POST** /instances/{instance_key}/send/image | Send raw image.
[**instancesInstanceKeySendListPost**](MessageSendingApi.md#instancesInstanceKeySendListPost) | **POST** /instances/{instance_key}/send/list | Send a List message.
[**instancesInstanceKeySendLocationPost**](MessageSendingApi.md#instancesInstanceKeySendLocationPost) | **POST** /instances/{instance_key}/send/location | Send a location message.
[**instancesInstanceKeySendMediaPost**](MessageSendingApi.md#instancesInstanceKeySendMediaPost) | **POST** /instances/{instance_key}/send/media | Send a media message.
[**instancesInstanceKeySendPollPost**](MessageSendingApi.md#instancesInstanceKeySendPollPost) | **POST** /instances/{instance_key}/send/poll | Send a Poll message with media.
[**instancesInstanceKeySendTemplateMediaPost**](MessageSendingApi.md#instancesInstanceKeySendTemplateMediaPost) | **POST** /instances/{instance_key}/send/template-media | Send a template message with media.
[**instancesInstanceKeySendTemplatePost**](MessageSendingApi.md#instancesInstanceKeySendTemplatePost) | **POST** /instances/{instance_key}/send/template | Send a template message.
[**instancesInstanceKeySendTextPost**](MessageSendingApi.md#instancesInstanceKeySendTextPost) | **POST** /instances/{instance_key}/send/text | Send a text message.
[**instancesInstanceKeySendUploadPost**](MessageSendingApi.md#instancesInstanceKeySendUploadPost) | **POST** /instances/{instance_key}/send/upload | Upload media.
[**instancesInstanceKeySendVideoPost**](MessageSendingApi.md#instancesInstanceKeySendVideoPost) | **POST** /instances/{instance_key}/send/video | Send raw video.


<a name="instancesInstanceKeyBusinessCatalogGet"></a>
# **instancesInstanceKeyBusinessCatalogGet**
> MainAPIResponse instancesInstanceKeyBusinessCatalogGet(instanceKey)

Fetches the catlog.

Gets list of all products registered by you.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeyBusinessCatalogGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeyBusinessCatalogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeyBusinessCatalogGet")
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

<a name="instancesInstanceKeySendAudioPost"></a>
# **instancesInstanceKeySendAudioPost**
> MainAPIResponse instancesInstanceKeySendAudioPost(instanceKey, to, instancesInstanceKeySendAudioPostRequest, caption)

Send raw audio.

Sends a audio message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val to : kotlin.String = to_example // kotlin.String | The recipient's number
val instancesInstanceKeySendAudioPostRequest : InstancesInstanceKeySendAudioPostRequest =  // InstancesInstanceKeySendAudioPostRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendAudioPost(instanceKey, to, instancesInstanceKeySendAudioPostRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendAudioPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendAudioPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **instancesInstanceKeySendAudioPostRequest** | [**InstancesInstanceKeySendAudioPostRequest**](InstancesInstanceKeySendAudioPostRequest.md)|  |
 **caption** | **kotlin.String**| Attached caption | [optional]

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendButtonMediaPost"></a>
# **instancesInstanceKeySendButtonMediaPost**
> MainAPIResponse instancesInstanceKeySendButtonMediaPost(instanceKey, `data`)

Send a button message with a media header.

Sends an interactive button message to the given user. This message also has media header with it. Make sure that all the button ids are unique

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsButtonMessageWithMediaPayload =  // StructsButtonMessageWithMediaPayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendButtonMediaPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendButtonMediaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendButtonMediaPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsButtonMessageWithMediaPayload**](StructsButtonMessageWithMediaPayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendButtonsPost"></a>
# **instancesInstanceKeySendButtonsPost**
> MainAPIResponse instancesInstanceKeySendButtonsPost(instanceKey, `data`)

Send a button message.

Sends an interactive button message to the given user. Make sure that all the button ids are unique

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsButtonMessagePayload =  // StructsButtonMessagePayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendButtonsPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendButtonsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendButtonsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsButtonMessagePayload**](StructsButtonMessagePayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendContactPost"></a>
# **instancesInstanceKeySendContactPost**
> MainAPIResponse instancesInstanceKeySendContactPost(instanceKey, `data`)

Send a contact message.

Sends a contact (vcard) message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsContactMessagePayload =  // StructsContactMessagePayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendContactPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendContactPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendContactPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsContactMessagePayload**](StructsContactMessagePayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendDocumentPost"></a>
# **instancesInstanceKeySendDocumentPost**
> MainAPIResponse instancesInstanceKeySendDocumentPost(instanceKey, to, instancesInstanceKeySendDocumentPostRequest, caption)

Send raw document.

Sends a document message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val to : kotlin.String = to_example // kotlin.String | The recipient's number
val instancesInstanceKeySendDocumentPostRequest : InstancesInstanceKeySendDocumentPostRequest =  // InstancesInstanceKeySendDocumentPostRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendDocumentPost(instanceKey, to, instancesInstanceKeySendDocumentPostRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendDocumentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendDocumentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **instancesInstanceKeySendDocumentPostRequest** | [**InstancesInstanceKeySendDocumentPostRequest**](InstancesInstanceKeySendDocumentPostRequest.md)|  |
 **caption** | **kotlin.String**| Attached caption | [optional]

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendImagePost"></a>
# **instancesInstanceKeySendImagePost**
> MainAPIResponse instancesInstanceKeySendImagePost(instanceKey, to, instancesInstanceKeySendImagePostRequest, caption)

Send raw image.

Sends a image message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val to : kotlin.String = to_example // kotlin.String | The recipient's number
val instancesInstanceKeySendImagePostRequest : InstancesInstanceKeySendImagePostRequest =  // InstancesInstanceKeySendImagePostRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendImagePost(instanceKey, to, instancesInstanceKeySendImagePostRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendImagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendImagePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **instancesInstanceKeySendImagePostRequest** | [**InstancesInstanceKeySendImagePostRequest**](InstancesInstanceKeySendImagePostRequest.md)|  |
 **caption** | **kotlin.String**| Attached caption | [optional]

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendListPost"></a>
# **instancesInstanceKeySendListPost**
> MainAPIResponse instancesInstanceKeySendListPost(instanceKey, `data`)

Send a List message.

Sends an interactive List message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsListMessagePayload =  // StructsListMessagePayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendListPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsListMessagePayload**](StructsListMessagePayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendLocationPost"></a>
# **instancesInstanceKeySendLocationPost**
> MainAPIResponse instancesInstanceKeySendLocationPost(instanceKey, `data`)

Send a location message.

Sends a location message to the given user. This is static location and does not update Note: The Address and Url fields are optional

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsLocationMessagePayload =  // StructsLocationMessagePayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendLocationPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendLocationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendLocationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsLocationMessagePayload**](StructsLocationMessagePayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendMediaPost"></a>
# **instancesInstanceKeySendMediaPost**
> MainAPIResponse instancesInstanceKeySendMediaPost(instanceKey, `data`)

Send a media message.

Sends a media message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsSendMediaPayload =  // StructsSendMediaPayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendMediaPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendMediaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendMediaPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsSendMediaPayload**](StructsSendMediaPayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendPollPost"></a>
# **instancesInstanceKeySendPollPost**
> MainAPIResponse instancesInstanceKeySendPollPost(instanceKey, `data`)

Send a Poll message with media.

Sends an interactive poll message with a media header to the given user. The poll message is a new feature that is currently in beta.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsPollMessagePayload =  // StructsPollMessagePayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendPollPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendPollPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendPollPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsPollMessagePayload**](StructsPollMessagePayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTemplateMediaPost"></a>
# **instancesInstanceKeySendTemplateMediaPost**
> MainAPIResponse instancesInstanceKeySendTemplateMediaPost(instanceKey, `data`)

Send a template message with media.

Sends an interactive template message with a media header to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsTemplateButtonWithMediaPayload =  // StructsTemplateButtonWithMediaPayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendTemplateMediaPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendTemplateMediaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendTemplateMediaPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsTemplateButtonWithMediaPayload**](StructsTemplateButtonWithMediaPayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTemplatePost"></a>
# **instancesInstanceKeySendTemplatePost**
> MainAPIResponse instancesInstanceKeySendTemplatePost(instanceKey, `data`)

Send a template message.

Sends an interactive template message to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsTemplateButtonPayload =  // StructsTemplateButtonPayload | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendTemplatePost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendTemplatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendTemplatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsTemplateButtonPayload**](StructsTemplateButtonPayload.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTextPost"></a>
# **instancesInstanceKeySendTextPost**
> MainAPIResponse instancesInstanceKeySendTextPost(instanceKey, `data`)

Send a text message.

Sends a text message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : StructsTextMessage =  // StructsTextMessage | Message data
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendTextPost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendTextPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendTextPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**StructsTextMessage**](StructsTextMessage.md)| Message data |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendUploadPost"></a>
# **instancesInstanceKeySendUploadPost**
> MainAPIResponse instancesInstanceKeySendUploadPost(instanceKey, type, instancesInstanceKeySendUploadPostRequest)

Upload media.

Uploads media to WhatsApp servers and returns the media keys. Store the returned media keys, as you will need them to send media messages

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val type : kotlin.String = type_example // kotlin.String | Media type
val instancesInstanceKeySendUploadPostRequest : InstancesInstanceKeySendUploadPostRequest =  // InstancesInstanceKeySendUploadPostRequest | 
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendUploadPost(instanceKey, type, instancesInstanceKeySendUploadPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendUploadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendUploadPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **type** | **kotlin.String**| Media type | [enum: image, video, audio, document]
 **instancesInstanceKeySendUploadPostRequest** | [**InstancesInstanceKeySendUploadPostRequest**](InstancesInstanceKeySendUploadPostRequest.md)|  |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendVideoPost"></a>
# **instancesInstanceKeySendVideoPost**
> MainAPIResponse instancesInstanceKeySendVideoPost(instanceKey, to, instancesInstanceKeySendVideoPostRequest, caption)

Send raw video.

Sends a video message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val to : kotlin.String = to_example // kotlin.String | The recipient's number
val instancesInstanceKeySendVideoPostRequest : InstancesInstanceKeySendVideoPostRequest =  // InstancesInstanceKeySendVideoPostRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : MainAPIResponse = apiInstance.instancesInstanceKeySendVideoPost(instanceKey, to, instancesInstanceKeySendVideoPostRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#instancesInstanceKeySendVideoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#instancesInstanceKeySendVideoPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **instancesInstanceKeySendVideoPostRequest** | [**InstancesInstanceKeySendVideoPostRequest**](InstancesInstanceKeySendVideoPostRequest.md)|  |
 **caption** | **kotlin.String**| Attached caption | [optional]

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

