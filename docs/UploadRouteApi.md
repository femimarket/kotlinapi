# UploadRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**upload**](UploadRouteApi.md#upload) | **POST** /upload |  |


<a id="upload"></a>
# **upload**
> Upload upload(credit, file, id, userId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = UploadRouteApi()
val credit : kotlin.Long = 789 // kotlin.Long | 
val file : kotlin.String = file_example // kotlin.String | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | uuid v7
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : Upload = apiInstance.upload(credit, file, id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadRouteApi#upload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadRouteApi#upload")
    e.printStackTrace()
}
```

### Parameters
| **credit** | **kotlin.Long**|  | |
| **file** | **kotlin.String**|  | |
| **id** | **kotlin.uuid.Uuid**| uuid v7 | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**Upload**](Upload.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

