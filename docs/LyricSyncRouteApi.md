# LyricSyncRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**lyricSync**](LyricSyncRouteApi.md#lyricSync) | **POST** /lyric_sync |  |


<a id="lyricSync"></a>
# **lyricSync**
> LyricSync lyricSync(audio, id, lyrics, characters, credit, loss, userId, words)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = LyricSyncRouteApi()
val audio : kotlin.String = audio_example // kotlin.String | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val lyrics : kotlin.String = lyrics_example // kotlin.String | 
val characters : kotlin.collections.List<CharacterAlignment> =  // kotlin.collections.List<CharacterAlignment> | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loss : kotlin.Double = 1.2 // kotlin.Double | 
val userId : kotlin.String = userId_example // kotlin.String | 
val words : kotlin.collections.List<WordAlignment> =  // kotlin.collections.List<WordAlignment> | 
try {
    val result : LyricSync = apiInstance.lyricSync(audio, id, lyrics, characters, credit, loss, userId, words)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LyricSyncRouteApi#lyricSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LyricSyncRouteApi#lyricSync")
    e.printStackTrace()
}
```

### Parameters
| **audio** | **kotlin.String**|  | |
| **id** | **kotlin.uuid.Uuid**|  | |
| **lyrics** | **kotlin.String**|  | |
| **characters** | [**kotlin.collections.List&lt;CharacterAlignment&gt;**](CharacterAlignment.md)|  | [optional] |
| **credit** | **kotlin.Long**|  | [optional] |
| **loss** | **kotlin.Double**|  | [optional] |
| **userId** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **words** | [**kotlin.collections.List&lt;WordAlignment&gt;**](WordAlignment.md)|  | [optional] |

### Return type

[**LyricSync**](LyricSync.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

