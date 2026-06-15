# StripeRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**stripe**](StripeRouteApi.md#stripe) | **POST** /stripe |  |


<a id="stripe"></a>
# **stripe**
> Model stripe(amountCents, id, status, userId, credit, loaded, paymentUrl, stripePaymentIntentId, stripeSessionId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = StripeRouteApi()
val amountCents : kotlin.Long = 789 // kotlin.Long | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val status : Status =  // Status | 
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val paymentUrl : kotlin.String = paymentUrl_example // kotlin.String | 
val stripePaymentIntentId : kotlin.String = stripePaymentIntentId_example // kotlin.String | 
val stripeSessionId : kotlin.String = stripeSessionId_example // kotlin.String | 
try {
    val result : Model = apiInstance.stripe(amountCents, id, status, userId, credit, loaded, paymentUrl, stripePaymentIntentId, stripeSessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StripeRouteApi#stripe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StripeRouteApi#stripe")
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
| **stripePaymentIntentId** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stripeSessionId** | **kotlin.String**|  | [optional] |

### Return type

[**Model**](Model.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

