
# API

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ApiAction**](ApiAction.md) |  |  |
| **audio** | **kotlin.String** | input audio as base64 — data URI (web) or raw base64 (android/ios), empty if unused; type detected server-side |  |
| **balance** | **kotlin.Long** |  |  |
| **credit** | **kotlin.Long** |  |  |
| **file** | **kotlin.String** | filename of result to retrieve |  |
| **id** | [**kotlin.uuid.Uuid**](kotlin.uuid.Uuid.md) | uuid v7 |  |
| **image** | **kotlin.String** | input image as base64 — data URI (web) or raw base64 (android/ios), empty if unused; type detected server-side |  |
| **messages** | [**kotlin.collections.List&lt;ApiChatMessage&gt;**](ApiChatMessage.md) | default value is non-empty array |  |
| **model** | [**ApiAiModel**](ApiAiModel.md) |  |  |
| **pay** | [**ApiPay**](ApiPay.md) |  |  |
| **prompt** | **kotlin.String** |  |  |
| **requestId** | **kotlin.String** | transient, managed by server |  |
| **status** | [**ApiStatus**](ApiStatus.md) |  |  |
| **userId** | **kotlin.String** |  |  |



