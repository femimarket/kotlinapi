# SquareRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**square**](SquareRouteApi.md#square) | **POST** /square |  |


<a id="square"></a>
# **square**
> Square square(amountCents, id, status, userId, credit, loaded, paymentUrl, squareOrderId, squarePaymentId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = SquareRouteApi()
val amountCents : kotlin.Long = 789 // kotlin.Long | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val status : Status =  // Status | 
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val paymentUrl : kotlin.String = paymentUrl_example // kotlin.String | 
val squareOrderId : kotlin.String = squareOrderId_example // kotlin.String | 
val squarePaymentId : kotlin.String = squarePaymentId_example // kotlin.String | 
try {
    val result : Square = apiInstance.square(amountCents, id, status, userId, credit, loaded, paymentUrl, squareOrderId, squarePaymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SquareRouteApi#square")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SquareRouteApi#square")
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
| **squareOrderId** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **squarePaymentId** | **kotlin.String**|  | [optional] |

### Return type

[**Square**](Square.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

