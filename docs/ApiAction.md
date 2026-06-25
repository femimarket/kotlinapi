
# ApiAction

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **kotlin.String** |  |  |
| **type** | [**inline**](#Type) |  |  |
| **falRequestId** | **kotlin.String** |  |  |
| **file** | **kotlin.String** | base64 return |  |
| **prompt** | **kotlin.String** |  |  |
| **audio** | **kotlin.String** | input audio as base64 — a real container (mp3/m4a/wav); data URI (web) or raw base64 (android/ios) |  |
| **comfyRequestId** | **kotlin.String** |  |  |
| **image** | **kotlin.String** | input image as base64 — data URI (web) or raw base64 (android/ios); type detected server-side |  |
| **image2** | **kotlin.String** | reference image as base64 — data URI (web) or raw base64 (android/ios); type detected server-side |  |
| **messages** | [**kotlin.collections.List&lt;ApiChatMessage&gt;**](ApiChatMessage.md) |  |  |
| **credit** | **kotlin.Long** |  |  |
| **currency** | **kotlin.String** |  |  |
| **jws** | **kotlin.String** |  |  |
| **loaded** | **kotlin.Boolean** |  |  |
| **price** | **kotlin.Long** |  |  |
| **productId** | **kotlin.String** |  |  |
| **transactionId** | **kotlin.String** |  |  |
| **packageName** | **kotlin.String** |  |  |
| **purchaseToken** | **kotlin.String** |  |  |
| **characters** | [**kotlin.collections.List&lt;CharacterAlignment&gt;**](CharacterAlignment.md) | return |  |
| **lyrics** | **kotlin.String** | transcribed lyrics (return) |  |
| **words** | [**kotlin.collections.List&lt;WordAlignment&gt;**](WordAlignment.md) | return |  |
| **orderId** | **kotlin.String** |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | Charge, ZImageTurbo, NanoBanana2, Flux2Pro, Ltx2_3A2V, Flux2KleinI2I, Flux2DevI2I, ClaudeSonnet4_6, Qwen3_6_35bA3b, ApplePay, GooglePay, Qwen3ForcedAligner0_6B, Qwen3AsrFlash |



