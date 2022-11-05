# GroupManagementApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instancesInstanceKeyGroupsAdminGet**](GroupManagementApi.md#instancesInstanceKeyGroupsAdminGet) | **GET** /instances/{instance_key}/groups/admin | Get admin groupss.
[**instancesInstanceKeyGroupsCreatePost**](GroupManagementApi.md#instancesInstanceKeyGroupsCreatePost) | **POST** /instances/{instance_key}/groups/create | Create group.
[**instancesInstanceKeyGroupsGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGet) | **GET** /instances/{instance_key}/groups/ | Get all groups.
[**instancesInstanceKeyGroupsGroupIdAnnouncePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdAnnouncePut) | **PUT** /instances/{instance_key}/groups/{group_id}/announce | Set group announce.
[**instancesInstanceKeyGroupsGroupIdDelete**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdDelete) | **DELETE** /instances/{instance_key}/groups/{group_id}/ | Leaves the group.
[**instancesInstanceKeyGroupsGroupIdDescriptionPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdDescriptionPut) | **PUT** /instances/{instance_key}/groups/{group_id}/description | Set group description.
[**instancesInstanceKeyGroupsGroupIdGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdGet) | **GET** /instances/{instance_key}/groups/{group_id} | Get group.
[**instancesInstanceKeyGroupsGroupIdInviteCodeGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdInviteCodeGet) | **GET** /instances/{instance_key}/groups/{group_id}/invite-code | Get group invite code.
[**instancesInstanceKeyGroupsGroupIdLockPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdLockPut) | **PUT** /instances/{instance_key}/groups/{group_id}/lock | Set group locked.
[**instancesInstanceKeyGroupsGroupIdNamePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdNamePut) | **PUT** /instances/{instance_key}/groups/{group_id}/name | Set group name.
[**instancesInstanceKeyGroupsGroupIdParticipantsAddPost**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsAddPost) | **POST** /instances/{instance_key}/groups/{group_id}/participants/add | Add participant.
[**instancesInstanceKeyGroupsGroupIdParticipantsDemotePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsDemotePut) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/demote | Demote participant.
[**instancesInstanceKeyGroupsGroupIdParticipantsPromotePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsPromotePut) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/promote | Promote participant.
[**instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete) | **DELETE** /instances/{instance_key}/groups/{group_id}/participants/remove | Remove participant.
[**instancesInstanceKeyGroupsGroupIdProfilePicPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdProfilePicPut) | **PUT** /instances/{instance_key}/groups/{group_id}/profile-pic | Set group picture.
[**instancesInstanceKeyGroupsInviteInfoGet**](GroupManagementApi.md#instancesInstanceKeyGroupsInviteInfoGet) | **GET** /instances/{instance_key}/groups/invite-info | Get group from invite link.


<a name="instancesInstanceKeyGroupsAdminGet"></a>
# **instancesInstanceKeyGroupsAdminGet**
> APIResponse instancesInstanceKeyGroupsAdminGet(instanceKey)

Get admin groupss.

Returns list of all groups in which you are admin.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsAdminGet(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsAdminGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsAdminGet")
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

<a name="instancesInstanceKeyGroupsCreatePost"></a>
# **instancesInstanceKeyGroupsCreatePost**
> APIResponse instancesInstanceKeyGroupsCreatePost(instanceKey, `data`)

Create group.

Creates a group with the participant data. The creator is automatically added to the group.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val `data` : GroupCreatePayload =  // GroupCreatePayload | Group create payload
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsCreatePost(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsCreatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **&#x60;data&#x60;** | [**GroupCreatePayload**](GroupCreatePayload.md)| Group create payload |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGet"></a>
# **instancesInstanceKeyGroupsGet**
> APIResponse instancesInstanceKeyGroupsGet(instanceKey, includeParticipants)

Get all groups.

Returns list of all groups with participants data. Set include_participants to false to exclude participants data.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val includeParticipants : kotlin.String = includeParticipants_example // kotlin.String | Include participants data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGet(instanceKey, includeParticipants)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **includeParticipants** | **kotlin.String**| Include participants data | [optional] [default to true] [enum: false, true]

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdAnnouncePut"></a>
# **instancesInstanceKeyGroupsGroupIdAnnouncePut**
> APIResponse instancesInstanceKeyGroupsGroupIdAnnouncePut(instanceKey, announce, groupId)

Set group announce.

Set if non-admins are allowed to send messages in groups

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val announce : kotlin.Boolean = true // kotlin.Boolean | Announce status
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdAnnouncePut(instanceKey, announce, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdAnnouncePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdAnnouncePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **announce** | **kotlin.Boolean**| Announce status | [default to false] [enum: true, false]
 **groupId** | **kotlin.String**| Group id of the group |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdDelete"></a>
# **instancesInstanceKeyGroupsGroupIdDelete**
> APIResponse instancesInstanceKeyGroupsGroupIdDelete(instanceKey, groupId)

Leaves the group.

Leaves the specified group.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdDelete(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdDescriptionPut"></a>
# **instancesInstanceKeyGroupsGroupIdDescriptionPut**
> APIResponse instancesInstanceKeyGroupsGroupIdDescriptionPut(instanceKey, groupId, `data`)

Set group description.

Changes the group description

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateDescriptionPayload =  // GroupUpdateDescriptionPayload | Group description data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdDescriptionPut(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDescriptionPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDescriptionPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateDescriptionPayload**](GroupUpdateDescriptionPayload.md)| Group description data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdGet"></a>
# **instancesInstanceKeyGroupsGroupIdGet**
> APIResponse instancesInstanceKeyGroupsGroupIdGet(instanceKey, groupId)

Get group.

Fetches the group data.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdGet(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdInviteCodeGet"></a>
# **instancesInstanceKeyGroupsGroupIdInviteCodeGet**
> APIResponse instancesInstanceKeyGroupsGroupIdInviteCodeGet(instanceKey, groupId)

Get group invite code.

Gets the invite code of the group.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdInviteCodeGet(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdInviteCodeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdInviteCodeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdLockPut"></a>
# **instancesInstanceKeyGroupsGroupIdLockPut**
> APIResponse instancesInstanceKeyGroupsGroupIdLockPut(instanceKey, locked, groupId)

Set group locked.

Set if non-admins are allowed to change the group dp and other stuff

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val locked : kotlin.Boolean = true // kotlin.Boolean | Locked status
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdLockPut(instanceKey, locked, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdLockPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdLockPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **locked** | **kotlin.Boolean**| Locked status | [default to false] [enum: true, false]
 **groupId** | **kotlin.String**| Group id of the group |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdNamePut"></a>
# **instancesInstanceKeyGroupsGroupIdNamePut**
> APIResponse instancesInstanceKeyGroupsGroupIdNamePut(instanceKey, groupId, `data`)

Set group name.

Changes the group name. The max limit is 22 chars

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateNamePayload =  // GroupUpdateNamePayload | Group name data
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdNamePut(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdNamePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdNamePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateNamePayload**](GroupUpdateNamePayload.md)| Group name data |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdParticipantsAddPost"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsAddPost**
> APIResponse instancesInstanceKeyGroupsGroupIdParticipantsAddPost(instanceKey, groupId, `data`)

Add participant.

Handles adding participants to a group. You must be admin in the group or the query will fail.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateParticipantsPayload =  // GroupUpdateParticipantsPayload | Group update payload
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsAddPost(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsAddPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdParticipantsDemotePut"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsDemotePut**
> APIResponse instancesInstanceKeyGroupsGroupIdParticipantsDemotePut(instanceKey, groupId, `data`)

Demote participant.

Demotes admins in groups. You must be admin in the group or the query will fail.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateParticipantsPayload =  // GroupUpdateParticipantsPayload | Group update payload
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsDemotePut(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsDemotePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsDemotePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdParticipantsPromotePut"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsPromotePut**
> APIResponse instancesInstanceKeyGroupsGroupIdParticipantsPromotePut(instanceKey, groupId, `data`)

Promote participant.

Promotes participants to admin. You must be admin in the group or the query will fail.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateParticipantsPayload =  // GroupUpdateParticipantsPayload | Group update payload
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsPromotePut(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsPromotePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsPromotePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete**
> APIResponse instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete(instanceKey, groupId, `data`)

Remove participant.

Handles removing participants from a group. You must be admin in the group or the query will fail.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val `data` : GroupUpdateParticipantsPayload =  // GroupUpdateParticipantsPayload | Group update payload
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **&#x60;data&#x60;** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsGroupIdProfilePicPut"></a>
# **instancesInstanceKeyGroupsGroupIdProfilePicPut**
> APIResponse instancesInstanceKeyGroupsGroupIdProfilePicPut(instanceKey, groupId, instancesInstanceKeyGroupsGroupIdProfilePicPutRequest)

Set group picture.

Changes the group profile picture. Currently it only seems to accept JPEG images only

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
val instancesInstanceKeyGroupsGroupIdProfilePicPutRequest : InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest =  // InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest | 
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsGroupIdProfilePicPut(instanceKey, groupId, instancesInstanceKeyGroupsGroupIdProfilePicPutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdProfilePicPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdProfilePicPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **instancesInstanceKeyGroupsGroupIdProfilePicPutRequest** | [**InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest**](InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest.md)|  |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="instancesInstanceKeyGroupsInviteInfoGet"></a>
# **instancesInstanceKeyGroupsInviteInfoGet**
> APIResponse instancesInstanceKeyGroupsInviteInfoGet(instanceKey, inviteLink)

Get group from invite link.

Gets a group info from an invite link. An invite link is a link that can be used to join a group. It is usually in the format https://chat.whatsapp.com/{invitecode}

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val inviteLink : kotlin.String = inviteLink_example // kotlin.String | The invite link to check
try {
    val result : APIResponse = apiInstance.instancesInstanceKeyGroupsInviteInfoGet(instanceKey, inviteLink)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#instancesInstanceKeyGroupsInviteInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#instancesInstanceKeyGroupsInviteInfoGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **inviteLink** | **kotlin.String**| The invite link to check |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

