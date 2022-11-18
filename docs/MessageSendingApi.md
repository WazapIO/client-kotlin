# MessageSendingApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendAudio**](MessageSendingApi.md#sendAudio) | **POST** /instances/{instance_key}/send/audio | Send raw audio.
[**sendButtonMessage**](MessageSendingApi.md#sendButtonMessage) | **POST** /instances/{instance_key}/send/buttons | Send a button message.
[**sendButtonWithMedia**](MessageSendingApi.md#sendButtonWithMedia) | **POST** /instances/{instance_key}/send/button-media | Send a button message with a media header.
[**sendContact**](MessageSendingApi.md#sendContact) | **POST** /instances/{instance_key}/send/contact | Send a contact message.
[**sendDocument**](MessageSendingApi.md#sendDocument) | **POST** /instances/{instance_key}/send/document | Send raw document.
[**sendGroupInvite**](MessageSendingApi.md#sendGroupInvite) | **POST** /instances/{instance_key}/send/group-invite | Send a group invite message
[**sendImage**](MessageSendingApi.md#sendImage) | **POST** /instances/{instance_key}/send/image | Send raw image.
[**sendListMessage**](MessageSendingApi.md#sendListMessage) | **POST** /instances/{instance_key}/send/list | Send a List message.
[**sendLocation**](MessageSendingApi.md#sendLocation) | **POST** /instances/{instance_key}/send/location | Send a location message.
[**sendMediaMessage**](MessageSendingApi.md#sendMediaMessage) | **POST** /instances/{instance_key}/send/media | Send a media message.
[**sendPollMessage**](MessageSendingApi.md#sendPollMessage) | **POST** /instances/{instance_key}/send/poll | Send a Poll message.
[**sendTemplate**](MessageSendingApi.md#sendTemplate) | **POST** /instances/{instance_key}/send/template | Send a template message.
[**sendTemplateWithMedia**](MessageSendingApi.md#sendTemplateWithMedia) | **POST** /instances/{instance_key}/send/template-media | Send a template message with media.
[**sendTextMessage**](MessageSendingApi.md#sendTextMessage) | **POST** /instances/{instance_key}/send/text | Send a text message.
[**sendVideo**](MessageSendingApi.md#sendVideo) | **POST** /instances/{instance_key}/send/video | Send raw video.
[**uploadMedia**](MessageSendingApi.md#uploadMedia) | **POST** /instances/{instance_key}/send/upload | Upload media.


<a name="sendAudio"></a>
# **sendAudio**
> APIResponse sendAudio(instanceKey, to, sendAudioRequest, caption)

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
val sendAudioRequest : SendAudioRequest =  // SendAudioRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : APIResponse = apiInstance.sendAudio(instanceKey, to, sendAudioRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendAudio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendAudio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **sendAudioRequest** | [**SendAudioRequest**](SendAudioRequest.md)|  |
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

<a name="sendButtonMessage"></a>
# **sendButtonMessage**
> APIResponse sendButtonMessage(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendButtonMessage(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendButtonMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendButtonMessage")
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

<a name="sendButtonWithMedia"></a>
# **sendButtonWithMedia**
> APIResponse sendButtonWithMedia(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendButtonWithMedia(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendButtonWithMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendButtonWithMedia")
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

<a name="sendContact"></a>
# **sendContact**
> APIResponse sendContact(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendContact(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendContact")
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

<a name="sendDocument"></a>
# **sendDocument**
> APIResponse sendDocument(instanceKey, to, sendDocumentRequest, caption)

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
val sendDocumentRequest : SendDocumentRequest =  // SendDocumentRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : APIResponse = apiInstance.sendDocument(instanceKey, to, sendDocumentRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **sendDocumentRequest** | [**SendDocumentRequest**](SendDocumentRequest.md)|  |
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

<a name="sendGroupInvite"></a>
# **sendGroupInvite**
> APIResponse sendGroupInvite(instanceKey, `data`)

Send a group invite message

Sends a group invite message to the specified number. Don&#39;t include \&quot;https://chat.whatsapp.com/\&quot; in the invite code.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = MessageSendingApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : GroupInviteMessagePayload =  // GroupInviteMessagePayload | Message data
try {
    val result : APIResponse = apiInstance.sendGroupInvite(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendGroupInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendGroupInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**GroupInviteMessagePayload**](GroupInviteMessagePayload.md)| Message data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendImage"></a>
# **sendImage**
> APIResponse sendImage(instanceKey, to, updateProfilePicRequest, caption)

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
val updateProfilePicRequest : UpdateProfilePicRequest =  // UpdateProfilePicRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : APIResponse = apiInstance.sendImage(instanceKey, to, updateProfilePicRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **updateProfilePicRequest** | [**UpdateProfilePicRequest**](UpdateProfilePicRequest.md)|  |
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

<a name="sendListMessage"></a>
# **sendListMessage**
> APIResponse sendListMessage(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendListMessage(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendListMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendListMessage")
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

<a name="sendLocation"></a>
# **sendLocation**
> APIResponse sendLocation(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendLocation(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendLocation")
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

<a name="sendMediaMessage"></a>
# **sendMediaMessage**
> APIResponse sendMediaMessage(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendMediaMessage(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendMediaMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendMediaMessage")
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

<a name="sendPollMessage"></a>
# **sendPollMessage**
> APIResponse sendPollMessage(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendPollMessage(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendPollMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendPollMessage")
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

<a name="sendTemplate"></a>
# **sendTemplate**
> APIResponse sendTemplate(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendTemplate(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendTemplate")
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

<a name="sendTemplateWithMedia"></a>
# **sendTemplateWithMedia**
> APIResponse sendTemplateWithMedia(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendTemplateWithMedia(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendTemplateWithMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendTemplateWithMedia")
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

<a name="sendTextMessage"></a>
# **sendTextMessage**
> APIResponse sendTextMessage(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.sendTextMessage(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendTextMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendTextMessage")
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

<a name="sendVideo"></a>
# **sendVideo**
> APIResponse sendVideo(instanceKey, to, sendVideoRequest, caption)

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
val sendVideoRequest : SendVideoRequest =  // SendVideoRequest | 
val caption : kotlin.String = caption_example // kotlin.String | Attached caption
try {
    val result : APIResponse = apiInstance.sendVideo(instanceKey, to, sendVideoRequest, caption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#sendVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#sendVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **to** | **kotlin.String**| The recipient&#39;s number |
 **sendVideoRequest** | [**SendVideoRequest**](SendVideoRequest.md)|  |
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

<a name="uploadMedia"></a>
# **uploadMedia**
> APIResponse uploadMedia(instanceKey, type, uploadMediaRequest)

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
val uploadMediaRequest : UploadMediaRequest =  // UploadMediaRequest | 
try {
    val result : APIResponse = apiInstance.uploadMedia(instanceKey, type, uploadMediaRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageSendingApi#uploadMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageSendingApi#uploadMedia")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **type** | **kotlin.String**| Media type | [enum: image, video, audio, document]
 **uploadMediaRequest** | [**UploadMediaRequest**](UploadMediaRequest.md)|  |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

