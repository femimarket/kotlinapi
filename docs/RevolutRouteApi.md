# RevolutRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**revolut**](RevolutRouteApi.md#revolut) | **POST** /revolut |  |


<a id="revolut"></a>
# **revolut**
> Revolut revolut(amountCents, id, status, userId, credit, loaded, paymentUrl, revolutOrderId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = RevolutRouteApi()
val amountCents : kotlin.Long = 789 // kotlin.Long | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val status : Status =  // Status | 
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val paymentUrl : kotlin.String = paymentUrl_example // kotlin.String | 
val revolutOrderId : kotlin.String = revolutOrderId_example // kotlin.String | 
try {
    val result : Revolut = apiInstance.revolut(amountCents, id, status, userId, credit, loaded, paymentUrl, revolutOrderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RevolutRouteApi#revolut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RevolutRouteApi#revolut")
    e.printStackTrace()
}
```

### Parameters
| **amountCents** | **kotlin.Long**|  | |
| **id** | **kotlin.uuid.Uuid**|  | |
| **status** | [**Status**](Status.md)|  | [enum: 1, 2, 3] |
| **userId** | **kotlin.String**|  | |
| **credit** | **kotlin.Long**|  | [optional] |
| **loaded** | **kotlin.Boolean**|  | [optional] |
| **paymentUrl** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revolutOrderId** | **kotlin.String**|  | [optional] |

### Return type

[**Revolut**](Revolut.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

