
# ApiAction

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **kotlin.String** |  |  |
| **type** | [**inline**](#Type) |  |  |
| **falRequestId** | **kotlin.String** |  |  |
| **file** | **kotlin.String** | base64 return |  |
| **prompt** | **kotlin.String** |  |  |
| **audio** | **kotlin.String** | input image as base64 — data URI (web) or raw base64 (android/ios), empty if unused; type detected server-side |  |
| **comfyRequestId** | **kotlin.String** |  |  |
| **image** | **kotlin.String** | input image as base64 — data URI (web) or raw base64 (android/ios); type detected server-side |  |
| **image2** | **kotlin.String** | reference image as base64 — data URI (web) or raw base64 (android/ios); type detected server-side |  |
| **messages** | [**kotlin.collections.List&lt;ApiChatMessage&gt;**](ApiChatMessage.md) |  |  |
| **amountCents** | **kotlin.Long** |  |  |
| **credit** | **kotlin.Long** |  |  |
| **loaded** | **kotlin.Boolean** |  |  |
| **paymentUrl** | **kotlin.String** |  |  |
| **stripePaymentIntentId** | **kotlin.String** |  |  |
| **stripeSessionId** | **kotlin.String** |  |  |
| **currency** | **kotlin.String** |  |  |
| **jws** | **kotlin.String** |  |  |
| **price** | **kotlin.Long** |  |  |
| **productId** | **kotlin.String** |  |  |
| **transactionId** | **kotlin.String** |  |  |
| **packageName** | **kotlin.String** |  |  |
| **purchaseToken** | **kotlin.String** |  |  |
| **characters** | [**kotlin.collections.List&lt;CharacterAlignment&gt;**](CharacterAlignment.md) | return |  |
| **lyrics** | **kotlin.String** |  |  |
| **words** | [**kotlin.collections.List&lt;WordAlignment&gt;**](WordAlignment.md) | return |  |
| **orderId** | **kotlin.String** |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | Charge, ZImageTurbo, NanoBanana2, Flux2Pro, Ltx2_3A2V, Flux2KleinI2I, Flux2DevI2I, ClaudeSonnet4_6, Stripe, ApplePay, GooglePay, LyricSync |



