# GroupManagementApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParticipant**](GroupManagementApi.md#addParticipant) | **POST** /instances/{instance_key}/groups/{group_id}/participants/add | Add participant.
[**createGroup**](GroupManagementApi.md#createGroup) | **POST** /instances/{instance_key}/groups/create | Create group.
[**demoteParticipant**](GroupManagementApi.md#demoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/demote | Demote participant.
[**getAdminGroups**](GroupManagementApi.md#getAdminGroups) | **GET** /instances/{instance_key}/groups/admin | Get admin groups.
[**getAllGroups**](GroupManagementApi.md#getAllGroups) | **GET** /instances/{instance_key}/groups/ | Get all groups.
[**getAllParticipants**](GroupManagementApi.md#getAllParticipants) | **GET** /instances/{instance_key}/groups/{group_id}/participants | Get all participants.
[**getGroup**](GroupManagementApi.md#getGroup) | **GET** /instances/{instance_key}/groups/{group_id} | Get group.
[**getGroupFromInviteLink**](GroupManagementApi.md#getGroupFromInviteLink) | **GET** /instances/{instance_key}/groups/invite-info | Get group from invite link.
[**getGroupInviteCode**](GroupManagementApi.md#getGroupInviteCode) | **GET** /instances/{instance_key}/groups/{group_id}/invite-code | Get group invite code.
[**joinGroupWithLink**](GroupManagementApi.md#joinGroupWithLink) | **GET** /instances/{instance_key}/groups/join | Join group with invite code.
[**leaveGroup**](GroupManagementApi.md#leaveGroup) | **DELETE** /instances/{instance_key}/groups/{group_id}/ | Leaves the group.
[**promoteParticipant**](GroupManagementApi.md#promoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/promote | Promote participant.
[**removeParticipant**](GroupManagementApi.md#removeParticipant) | **DELETE** /instances/{instance_key}/groups/{group_id}/participants/remove | Remove participant.
[**setGroupAnnounce**](GroupManagementApi.md#setGroupAnnounce) | **PUT** /instances/{instance_key}/groups/{group_id}/announce | Set group announce.
[**setGroupDescription**](GroupManagementApi.md#setGroupDescription) | **PUT** /instances/{instance_key}/groups/{group_id}/description | Set group description.
[**setGroupLocked**](GroupManagementApi.md#setGroupLocked) | **PUT** /instances/{instance_key}/groups/{group_id}/lock | Set group locked.
[**setGroupName**](GroupManagementApi.md#setGroupName) | **PUT** /instances/{instance_key}/groups/{group_id}/name | Set group name.
[**setGroupPicture**](GroupManagementApi.md#setGroupPicture) | **PUT** /instances/{instance_key}/groups/{group_id}/profile-pic | Set group picture.


<a name="addParticipant"></a>
# **addParticipant**
> APIResponse addParticipant(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.addParticipant(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#addParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#addParticipant")
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

<a name="createGroup"></a>
# **createGroup**
> APIResponse createGroup(instanceKey, `data`)

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
    val result : APIResponse = apiInstance.createGroup(instanceKey, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#createGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#createGroup")
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

<a name="demoteParticipant"></a>
# **demoteParticipant**
> APIResponse demoteParticipant(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.demoteParticipant(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#demoteParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#demoteParticipant")
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

<a name="getAdminGroups"></a>
# **getAdminGroups**
> APIResponse getAdminGroups(instanceKey)

Get admin groups.

Returns list of all groups in which you are admin.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
try {
    val result : APIResponse = apiInstance.getAdminGroups(instanceKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getAdminGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getAdminGroups")
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

<a name="getAllGroups"></a>
# **getAllGroups**
> APIResponse getAllGroups(instanceKey, includeParticipants)

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
    val result : APIResponse = apiInstance.getAllGroups(instanceKey, includeParticipants)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getAllGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getAllGroups")
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

<a name="getAllParticipants"></a>
# **getAllParticipants**
> APIResponse getAllParticipants(instanceKey, groupId)

Get all participants.

Returns all participants of the group.

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val groupId : kotlin.String = groupId_example // kotlin.String | Group id of the group
try {
    val result : APIResponse = apiInstance.getAllParticipants(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getAllParticipants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getAllParticipants")
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

<a name="getGroup"></a>
# **getGroup**
> APIResponse getGroup(instanceKey, groupId)

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
    val result : APIResponse = apiInstance.getGroup(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getGroup")
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

<a name="getGroupFromInviteLink"></a>
# **getGroupFromInviteLink**
> APIResponse getGroupFromInviteLink(instanceKey, inviteLink)

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
    val result : APIResponse = apiInstance.getGroupFromInviteLink(instanceKey, inviteLink)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getGroupFromInviteLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getGroupFromInviteLink")
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

<a name="getGroupInviteCode"></a>
# **getGroupInviteCode**
> APIResponse getGroupInviteCode(instanceKey, groupId)

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
    val result : APIResponse = apiInstance.getGroupInviteCode(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#getGroupInviteCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#getGroupInviteCode")
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

<a name="joinGroupWithLink"></a>
# **joinGroupWithLink**
> APIResponse joinGroupWithLink(instanceKey, inviteCode)

Join group with invite code.

Joins a group with group invite link. An invite link is a link that can be used to join a group. It is usually in the format https://chat.whatsapp.com/{invitecode} You have to put invite_code in the url of the request. The invite code is the part after https://chat.whatsapp.com/ For example, if the invite link is https://chat.whatsapp.com/dsfsf34r3d3dsds, then the invite code is &#x60;dsfsf34r3d3dsds“

### Example
```kotlin
// Import classes:
//import WhatsAPI.infrastructure.*
//import models.*

val apiInstance = GroupManagementApi()
val instanceKey : kotlin.String = instanceKey_example // kotlin.String | Instance key
val inviteCode : kotlin.String = inviteCode_example // kotlin.String | The invite code of group you want to join
try {
    val result : APIResponse = apiInstance.joinGroupWithLink(instanceKey, inviteCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#joinGroupWithLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#joinGroupWithLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **inviteCode** | **kotlin.String**| The invite code of group you want to join |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="leaveGroup"></a>
# **leaveGroup**
> APIResponse leaveGroup(instanceKey, groupId)

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
    val result : APIResponse = apiInstance.leaveGroup(instanceKey, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#leaveGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#leaveGroup")
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

<a name="promoteParticipant"></a>
# **promoteParticipant**
> APIResponse promoteParticipant(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.promoteParticipant(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#promoteParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#promoteParticipant")
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

<a name="removeParticipant"></a>
# **removeParticipant**
> APIResponse removeParticipant(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.removeParticipant(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#removeParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#removeParticipant")
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

<a name="setGroupAnnounce"></a>
# **setGroupAnnounce**
> APIResponse setGroupAnnounce(instanceKey, announce, groupId)

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
    val result : APIResponse = apiInstance.setGroupAnnounce(instanceKey, announce, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#setGroupAnnounce")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#setGroupAnnounce")
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

<a name="setGroupDescription"></a>
# **setGroupDescription**
> APIResponse setGroupDescription(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.setGroupDescription(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#setGroupDescription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#setGroupDescription")
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

<a name="setGroupLocked"></a>
# **setGroupLocked**
> APIResponse setGroupLocked(instanceKey, locked, groupId)

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
    val result : APIResponse = apiInstance.setGroupLocked(instanceKey, locked, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#setGroupLocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#setGroupLocked")
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

<a name="setGroupName"></a>
# **setGroupName**
> APIResponse setGroupName(instanceKey, groupId, `data`)

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
    val result : APIResponse = apiInstance.setGroupName(instanceKey, groupId, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#setGroupName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#setGroupName")
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

<a name="setGroupPicture"></a>
# **setGroupPicture**
> APIResponse setGroupPicture(instanceKey, groupId, setGroupPictureRequest)

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
val setGroupPictureRequest : SetGroupPictureRequest =  // SetGroupPictureRequest | 
try {
    val result : APIResponse = apiInstance.setGroupPicture(instanceKey, groupId, setGroupPictureRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupManagementApi#setGroupPicture")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupManagementApi#setGroupPicture")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceKey** | **kotlin.String**| Instance key |
 **groupId** | **kotlin.String**| Group id of the group |
 **setGroupPictureRequest** | [**SetGroupPictureRequest**](SetGroupPictureRequest.md)|  |

### Return type

[**APIResponse**](APIResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

