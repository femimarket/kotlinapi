
# Qwen3ForcedAligner06B

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **audio** | **kotlin.String** | input audio as base64 of raw 16 kHz mono f32 LE PCM (client-decoded; no container) |  |
| **characters** | [**kotlin.collections.List&lt;CharacterAlignment&gt;**](CharacterAlignment.md) | return |  |
| **lyrics** | **kotlin.String** | lyrics to align to the audio — supply them, or get them from TranscribeSong first |  |
| **type** | [**inline**](#Type) |  |  |
| **words** | [**kotlin.collections.List&lt;WordAlignment&gt;**](WordAlignment.md) | return |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | Qwen3ForcedAligner0_6B |



