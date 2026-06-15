# ProjectRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**project**](ProjectRouteApi.md#project) | **POST** /project |  |


<a id="project"></a>
# **project**
> Project project(about, audio, audioLines, faqs, genre, id, playlist, seasons, summary, userId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ProjectRouteApi()
val about : kotlin.String = about_example // kotlin.String | 
val audio : kotlin.String = audio_example // kotlin.String | 
val audioLines : kotlin.collections.List<AudioLine> =  // kotlin.collections.List<AudioLine> | 
val faqs : kotlin.collections.List<Faq> =  // kotlin.collections.List<Faq> | 
val genre : kotlin.String = genre_example // kotlin.String | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val playlist : kotlin.String = playlist_example // kotlin.String | 
val seasons : kotlin.collections.List<Season> =  // kotlin.collections.List<Season> | 
val summary : kotlin.String = summary_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : Project = apiInstance.project(about, audio, audioLines, faqs, genre, id, playlist, seasons, summary, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRouteApi#project")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRouteApi#project")
    e.printStackTrace()
}
```

### Parameters
| **about** | **kotlin.String**|  | |
| **audio** | **kotlin.String**|  | |
| **audioLines** | [**kotlin.collections.List&lt;AudioLine&gt;**](AudioLine.md)|  | |
| **faqs** | [**kotlin.collections.List&lt;Faq&gt;**](Faq.md)|  | |
| **genre** | **kotlin.String**|  | |
| **id** | **kotlin.uuid.Uuid**|  | |
| **playlist** | **kotlin.String**|  | |
| **seasons** | [**kotlin.collections.List&lt;Season&gt;**](Season.md)|  | |
| **summary** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**Project**](Project.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

