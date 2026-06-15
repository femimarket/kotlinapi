# WiseRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**wise**](WiseRouteApi.md#wise) | **POST** /wise |  |


<a id="wise"></a>
# **wise**
> Wise wise(amountCents, currency, id, reference, status, userId, credit, loaded, wiseCreditId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = WiseRouteApi()
val amountCents : kotlin.Long = 789 // kotlin.Long | 
val currency : kotlin.String = currency_example // kotlin.String | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val reference : kotlin.String = reference_example // kotlin.String | 
val status : Status =  // Status | 
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val wiseCreditId : kotlin.String = wiseCreditId_example // kotlin.String | 
try {
    val result : Wise = apiInstance.wise(amountCents, currency, id, reference, status, userId, credit, loaded, wiseCreditId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WiseRouteApi#wise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WiseRouteApi#wise")
    e.printStackTrace()
}
```

### Parameters
| **amountCents** | **kotlin.Long**|  | |
| **currency** | **kotlin.String**|  | |
| **id** | **kotlin.uuid.Uuid**|  | |
| **reference** | **kotlin.String**|  | |
| **status** | [**Status**](Status.md)|  | [enum: 1, 2, 3] |
| **userId** | **kotlin.String**|  | |
| **credit** | **kotlin.Long**|  | [optional] |
| **loaded** | **kotlin.Boolean**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **wiseCreditId** | **kotlin.String**|  | [optional] |

### Return type

[**Wise**](Wise.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

