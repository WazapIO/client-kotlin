# MessageSendingApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesInstanceKeySendAudioPost**](MessageSendingApi.md#instancesInstanceKeySendAudioPost) | **POST** /instances/{instance_key}/send/audio | Send raw audio.
[**instancesInstanceKeySendButtonMediaPost**](MessageSendingApi.md#instancesInstanceKeySendButtonMediaPost) | **POST** /instances/{instance_key}/send/button-media | Send a button message with a media header.
[**instancesInstanceKeySendButtonsPost**](MessageSendingApi.md#instancesInstanceKeySendButtonsPost) | **POST** /instances/{instance_key}/send/buttons | Send a button message.
[**instancesInstanceKeySendContactPost**](MessageSendingApi.md#instancesInstanceKeySendContactPost) | **POST** /instances/{instance_key}/send/contact | Send a contact message.
[**instancesInstanceKeySendDocumentPost**](MessageSendingApi.md#instancesInstanceKeySendDocumentPost) | **POST** /instances/{instance_key}/send/document | Send raw document.
[**instancesInstanceKeySendImagePost**](MessageSendingApi.md#instancesInstanceKeySendImagePost) | **POST** /instances/{instance_key}/send/image | Send raw image.
[**instancesInstanceKeySendListPost**](MessageSendingApi.md#instancesInstanceKeySendListPost) | **POST** /instances/{instance_key}/send/list | Send a List message.
[**instancesInstanceKeySendLocationPost**](MessageSendingApi.md#instancesInstanceKeySendLocationPost) | **POST** /instances/{instance_key}/send/location | Send a location message.
[**instancesInstanceKeySendMediaPost**](MessageSendingApi.md#instancesInstanceKeySendMediaPost) | **POST** /instances/{instance_key}/send/media | Send a media message.
[**instancesInstanceKeySendPollPost**](MessageSendingApi.md#instancesInstanceKeySendPollPost) | **POST** /instances/{instance_key}/send/poll | Send a Poll message.
[**instancesInstanceKeySendTemplateMediaPost**](MessageSendingApi.md#instancesInstanceKeySendTemplateMediaPost) | **POST** /instances/{instance_key}/send/template-media | Send a template message with media.
[**instancesInstanceKeySendTemplatePost**](MessageSendingApi.md#instancesInstanceKeySendTemplatePost) | **POST** /instances/{instance_key}/send/template | Send a template message.
[**instancesInstanceKeySendTextPost**](MessageSendingApi.md#instancesInstanceKeySendTextPost) | **POST** /instances/{instance_key}/send/text | Send a text message.
[**instancesInstanceKeySendUploadPost**](MessageSendingApi.md#instancesInstanceKeySendUploadPost) | **POST** /instances/{instance_key}/send/upload | Upload media.
[**instancesInstanceKeySendVideoPost**](MessageSendingApi.md#instancesInstanceKeySendVideoPost) | **POST** /instances/{instance_key}/send/video | Send raw video.


<a name="instancesInstanceKeySendAudioPost"></a>
# **instancesInstanceKeySendAudioPost**
> APIResponse instancesInstanceKeySendAudioPost(instanceKey, to, instancesInstanceKeySendAudioPostRequest, caption)

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
    val result : APIResponse = apiInstance.instancesInstanceKeySendAudioPost(instanceKey, to, instancesInstanceKeySendAudioPostRequest, caption)
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

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendButtonMediaPost"></a>
# **instancesInstanceKeySendButtonMediaPost**
> APIResponse instancesInstanceKeySendButtonMediaPost(instanceKey, `data`)

Send a button message with a media header.

Sends an interactive button message to the given user. This message also has media header with it. Make sure that all the button ids are unique

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : ButtonMessageWithMediaPayload =  // ButtonMessageWithMediaPayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendButtonMediaPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**ButtonMessageWithMediaPayload**](ButtonMessageWithMediaPayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendButtonsPost"></a>
# **instancesInstanceKeySendButtonsPost**
> APIResponse instancesInstanceKeySendButtonsPost(instanceKey, `data`)

Send a button message.

Sends an interactive button message to the given user. Make sure that all the button ids are unique

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : ButtonMessagePayload =  // ButtonMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendButtonsPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**ButtonMessagePayload**](ButtonMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendContactPost"></a>
# **instancesInstanceKeySendContactPost**
> APIResponse instancesInstanceKeySendContactPost(instanceKey, `data`)

Send a contact message.

Sends a contact (vcard) message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : ContactMessagePayload =  // ContactMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendContactPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**ContactMessagePayload**](ContactMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendDocumentPost"></a>
# **instancesInstanceKeySendDocumentPost**
> APIResponse instancesInstanceKeySendDocumentPost(instanceKey, to, instancesInstanceKeySendDocumentPostRequest, caption)

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
    val result : APIResponse = apiInstance.instancesInstanceKeySendDocumentPost(instanceKey, to, instancesInstanceKeySendDocumentPostRequest, caption)
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

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendImagePost"></a>
# **instancesInstanceKeySendImagePost**
> APIResponse instancesInstanceKeySendImagePost(instanceKey, to, instancesInstanceKeySendImagePostRequest, caption)

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
    val result : APIResponse = apiInstance.instancesInstanceKeySendImagePost(instanceKey, to, instancesInstanceKeySendImagePostRequest, caption)
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

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendListPost"></a>
# **instancesInstanceKeySendListPost**
> APIResponse instancesInstanceKeySendListPost(instanceKey, `data`)

Send a List message.

Sends an interactive List message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : ListMessagePayload =  // ListMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendListPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**ListMessagePayload**](ListMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendLocationPost"></a>
# **instancesInstanceKeySendLocationPost**
> APIResponse instancesInstanceKeySendLocationPost(instanceKey, `data`)

Send a location message.

Sends a location message to the given user. This is static location and does not update Note: The Address and Url fields are optional

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : LocationMessagePayload =  // LocationMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendLocationPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**LocationMessagePayload**](LocationMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendMediaPost"></a>
# **instancesInstanceKeySendMediaPost**
> APIResponse instancesInstanceKeySendMediaPost(instanceKey, `data`)

Send a media message.

Sends a media message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : SendMediaPayload =  // SendMediaPayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendMediaPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**SendMediaPayload**](SendMediaPayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendPollPost"></a>
# **instancesInstanceKeySendPollPost**
> APIResponse instancesInstanceKeySendPollPost(instanceKey, `data`)

Send a Poll message.

Sends an interactive poll message to the given user. The poll message is a new feature that is currently in beta.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : PollMessagePayload =  // PollMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendPollPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**PollMessagePayload**](PollMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTemplateMediaPost"></a>
# **instancesInstanceKeySendTemplateMediaPost**
> APIResponse instancesInstanceKeySendTemplateMediaPost(instanceKey, `data`)

Send a template message with media.

Sends an interactive template message with a media header to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : TemplateButtonWithMediaPayload =  // TemplateButtonWithMediaPayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendTemplateMediaPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**TemplateButtonWithMediaPayload**](TemplateButtonWithMediaPayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTemplatePost"></a>
# **instancesInstanceKeySendTemplatePost**
> APIResponse instancesInstanceKeySendTemplatePost(instanceKey, `data`)

Send a template message.

Sends an interactive template message to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : TemplateButtonPayload =  // TemplateButtonPayload | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendTemplatePost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**TemplateButtonPayload**](TemplateButtonPayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendTextPost"></a>
# **instancesInstanceKeySendTextPost**
> APIResponse instancesInstanceKeySendTextPost(instanceKey, `data`)

Send a text message.

Sends a text message to the given user.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : TextMessage =  // TextMessage | Message data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeySendTextPost(instanceKey, `data`)
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
 **&#x60;data&#x60;** | [**TextMessage**](TextMessage.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendUploadPost"></a>
# **instancesInstanceKeySendUploadPost**
> APIResponse instancesInstanceKeySendUploadPost(instanceKey, type, instancesInstanceKeySendUploadPostRequest)

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
    val result : APIResponse = apiInstance.instancesInstanceKeySendUploadPost(instanceKey, type, instancesInstanceKeySendUploadPostRequest)
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

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeySendVideoPost"></a>
# **instancesInstanceKeySendVideoPost**
> APIResponse instancesInstanceKeySendVideoPost(instanceKey, to, instancesInstanceKeySendVideoPostRequest, caption)

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
    val result : APIResponse = apiInstance.instancesInstanceKeySendVideoPost(instanceKey, to, instancesInstanceKeySendVideoPostRequest, caption)
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

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

