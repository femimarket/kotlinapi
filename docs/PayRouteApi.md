# PayRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pay**](PayRouteApi.md#pay) | **POST** /pay |  |


<a id="pay"></a>
# **pay**
> Pay pay(id, provider, userId, credit, currency, jws, loaded, orderId, packageName, price, productId, refId, status)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = PayRouteApi()
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | uuid v7
val provider : PayProvider =  // PayProvider | Selects the verification path: Apple App Store vs Google Play.
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val currency : kotlin.String = currency_example // kotlin.String | 
val jws : kotlin.String = jws_example // kotlin.String | Signed transaction JWS from StoreKit; the input to Apple verification.
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val orderId : kotlin.String = orderId_example // kotlin.String | Google's per-purchase `orderId`, returned by the Play Developer API (not the client). Not used for dedup — `ref_id` is — because promo-code purchases may have no `orderId`.
val packageName : kotlin.String = packageName_example // kotlin.String | 
val price : kotlin.Long = 789 // kotlin.Long | 
val productId : kotlin.String = productId_example // kotlin.String | 
val refId : kotlin.String = refId_example // kotlin.String | Globally-unique purchase id, used as the idempotency key for both stores. Apple: the `transactionId`, extracted server-side from the verified JWS   (empty on the incoming request — the server fills it in). Google: the `purchaseToken`, sent by the client. It is both the input to   Play Developer API verification and the idempotency key.
val status : PayStatus =  // PayStatus | 
try {
    val result : Pay = apiInstance.pay(id, provider, userId, credit, currency, jws, loaded, orderId, packageName, price, productId, refId, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayRouteApi#pay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayRouteApi#pay")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.uuid.Uuid**| uuid v7 | |
| **provider** | [**PayProvider**](PayProvider.md)| Selects the verification path: Apple App Store vs Google Play. | [enum: Apple, Google] |
| **userId** | **kotlin.String**|  | |
| **credit** | **kotlin.Long**|  | [optional] |
| **currency** | **kotlin.String**|  | [optional] |
| **jws** | **kotlin.String**| Signed transaction JWS from StoreKit; the input to Apple verification. | [optional] |
| **loaded** | **kotlin.Boolean**|  | [optional] |
| **orderId** | **kotlin.String**| Google&#39;s per-purchase &#x60;orderId&#x60;, returned by the Play Developer API (not the client). Not used for dedup — &#x60;ref_id&#x60; is — because promo-code purchases may have no &#x60;orderId&#x60;. | [optional] |
| **packageName** | **kotlin.String**|  | [optional] |
| **price** | **kotlin.Long**|  | [optional] |
| **productId** | **kotlin.String**|  | [optional] |
| **refId** | **kotlin.String**| Globally-unique purchase id, used as the idempotency key for both stores. Apple: the &#x60;transactionId&#x60;, extracted server-side from the verified JWS   (empty on the incoming request — the server fills it in). Google: the &#x60;purchaseToken&#x60;, sent by the client. It is both the input to   Play Developer API verification and the idempotency key. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**PayStatus**](PayStatus.md)|  | [optional] [enum: Pending, Completed, Failed] |

### Return type

[**Pay**](Pay.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

