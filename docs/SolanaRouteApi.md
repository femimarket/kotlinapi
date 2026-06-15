# SolanaRouteApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**solana**](SolanaRouteApi.md#solana) | **POST** /solana |  |


<a id="solana"></a>
# **solana**
> Solana solana(amountCents, id, pubkey, status, userId, credit, loaded, quotedOutUnits, requestId, signature, signedTx, unsignedTx)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = SolanaRouteApi()
val amountCents : kotlin.Long = 789 // kotlin.Long | 
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | 
val pubkey : kotlin.String = pubkey_example // kotlin.String | 
val status : Status =  // Status | 
val userId : kotlin.String = userId_example // kotlin.String | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val loaded : kotlin.Boolean = true // kotlin.Boolean | 
val quotedOutUnits : kotlin.Long = 789 // kotlin.Long | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
val signature : kotlin.String = signature_example // kotlin.String | 
val signedTx : kotlin.String = signedTx_example // kotlin.String | 
val unsignedTx : kotlin.String = unsignedTx_example // kotlin.String | 
try {
    val result : Solana = apiInstance.solana(amountCents, id, pubkey, status, userId, credit, loaded, quotedOutUnits, requestId, signature, signedTx, unsignedTx)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaRouteApi#solana")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaRouteApi#solana")
    e.printStackTrace()
}
```

### Parameters
| **amountCents** | **kotlin.Long**|  | |
| **id** | **kotlin.uuid.Uuid**|  | |
| **pubkey** | **kotlin.String**|  | |
| **status** | [**Status**](Status.md)|  | [enum: 1, 2, 3] |
| **userId** | **kotlin.String**|  | |
| **credit** | **kotlin.Long**|  | [optional] |
| **loaded** | **kotlin.Boolean**|  | [optional] |
| **quotedOutUnits** | **kotlin.Long**|  | [optional] |
| **requestId** | **kotlin.String**|  | [optional] |
| **signature** | **kotlin.String**|  | [optional] |
| **signedTx** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **unsignedTx** | **kotlin.String**|  | [optional] |

### Return type

[**Solana**](Solana.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

