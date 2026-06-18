# ApiHandlerApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiHandler**](ApiHandlerApi.md#apiHandler) | **POST** /api |  |


<a id="apiHandler"></a>
# **apiHandler**
> API apiHandler(API)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApiHandlerApi()
val API : API =  // API | 
try {
    val result : API = apiInstance.apiHandler(API)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiHandlerApi#apiHandler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiHandlerApi#apiHandler")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **API** | [**API**](API.md)|  | |

### Return type

[**API**](API.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

