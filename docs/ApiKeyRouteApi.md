# ApiKeyRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiKey**](ApiKeyRouteApi.md#apiKey) | **POST** /api_key |  |


<a id="apiKey"></a>
# **apiKey**
> ApiKey apiKey(id, userId, key)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApiKeyRouteApi()
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val userId : kotlin.String = userId_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : ApiKey = apiInstance.apiKey(id, userId, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeyRouteApi#apiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeyRouteApi#apiKey")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.uuid.Uuid**|  | |
| **userId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**|  | [optional] |

### Return type

[**ApiKey**](ApiKey.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

