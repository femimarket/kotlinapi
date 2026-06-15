
# API

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ApiAction**](ApiAction.md) |  |  |
| **audio** | **kotlin.String** | filename of already uploaded audio else default |  |
| **balance** | **kotlin.Long** |  |  |
| **credit** | **kotlin.Long** |  |  |
| **file** | **kotlin.String** | filename of result to retrieve |  |
| **id** | [**kotlin.uuid.Uuid**](kotlin.uuid.Uuid.md) | uuid v7 |  |
| **image** | **kotlin.String** | filename of already uploaded image else default |  |
| **messages** | [**kotlin.collections.List&lt;ApiChatMessage&gt;**](ApiChatMessage.md) | default value is non-empty array |  |
| **model** | [**ApiAiModel**](ApiAiModel.md) |  |  |
| **pay** | [**ApiPay**](ApiPay.md) |  |  |
| **pricing** | [**ApiPricing**](ApiPricing.md) |  |  |
| **prompt** | **kotlin.String** |  |  |
| **requestId** | **kotlin.String** | transient, managed by server |  |
| **status** | [**ApiStatus**](ApiStatus.md) |  |  |
| **userId** | **kotlin.String** |  |  |



