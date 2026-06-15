# ApplePayRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**applePay**](ApplePayRouteApi.md#applePay) | **POST** /apple_pay |  |


<a id="applePay"></a>
# **applePay**
> ApplePay applePay(credit, currency, id, jws, loaded, price, productId, status, transactionId, userId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApplePayRouteApi()
val credit : kotlin.Long = 789 // kotlin.Long | 
val currency : kotlin.String = currency_example // kotlin.String | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | uuid v7
val jws : kotlin.String = jws_example // kotlin.String | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val price : kotlin.Long = 789 // kotlin.Long | 
val productId : kotlin.String = productId_example // kotlin.String | 
val status : ApplePayStatus =  // ApplePayStatus | 
val transactionId : kotlin.String = transactionId_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : ApplePay = apiInstance.applePay(credit, currency, id, jws, loaded, price, productId, status, transactionId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplePayRouteApi#applePay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplePayRouteApi#applePay")
    e.printStackTrace()
}
```

### Parameters
| **credit** | **kotlin.Long**|  | |
| **currency** | **kotlin.String**|  | |
| **id** | **kotlin.uuid.Uuid**| uuid v7 | |
| **jws** | **kotlin.String**|  | |
| **loaded** | **kotlin.Boolean**|  | |
| **price** | **kotlin.Long**|  | |
| **productId** | **kotlin.String**|  | |
| **status** | [**ApplePayStatus**](ApplePayStatus.md)|  | [enum: Pending, Completed, Failed] |
| **transactionId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**ApplePay**](ApplePay.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

