# ApiApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**api**](ApiApi.md#api) | **POST** /api |  |
| [**mediaGate**](ApiApi.md#mediaGate) | **GET** /{file} | Auth + per-GB debit gate in front of the &#x60;_upload&#x60; ServeDir on femi.market.   - not a media file → pass through (static site, app data, 404), free   - media file that isn&#39;t a real file in &#x60;_upload&#x60; → pass through, free   - media file in &#x60;_upload&#x60; → require Bearer, charge &#x60;size × pricing.gb&#x60;,     record a debit in the astc ledger, then let ServeDir stream the bytes. The gate only authorizes/charges; ServeDir still does the actual file streaming (range requests, mime, etc.). |


<a id="api"></a>
# **api**
> API api(action, audio, balance, credit, file, id, image, messages, model, pay, pricing, prompt, requestId, status, userId)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApiApi()
val action : ApiAction =  // ApiAction | 
val audio : kotlin.String = audio_example // kotlin.String | filename of already uploaded audio else default
val balance : kotlin.Long = 789 // kotlin.Long | 
val credit : kotlin.Long = 789 // kotlin.Long | 
val file : kotlin.String = file_example // kotlin.String | filename of result to retrieve
val id : kotlin.uuid.Uuid = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.uuid.Uuid | uuid v7
val image : kotlin.String = image_example // kotlin.String | filename of already uploaded image else default
val messages : kotlin.collections.List<ApiChatMessage> =  // kotlin.collections.List<ApiChatMessage> | default value is non-empty array
val model : ApiAiModel =  // ApiAiModel | 
val pay : ApiPay =  // ApiPay | 
val pricing : ApiPricing =  // ApiPricing | 
val prompt : kotlin.String = prompt_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | transient, managed by server
val status : ApiStatus =  // ApiStatus | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : API = apiInstance.api(action, audio, balance, credit, file, id, image, messages, model, pay, pricing, prompt, requestId, status, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiApi#api")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiApi#api")
    e.printStackTrace()
}
```

### Parameters
| **action** | [**ApiAction**](ApiAction.md)|  | [enum: Generate, Poll, Pay, Chat, Balance, Pricing] |
| **audio** | **kotlin.String**| filename of already uploaded audio else default | |
| **balance** | **kotlin.Long**|  | |
| **credit** | **kotlin.Long**|  | |
| **file** | **kotlin.String**| filename of result to retrieve | |
| **id** | **kotlin.uuid.Uuid**| uuid v7 | |
| **image** | **kotlin.String**| filename of already uploaded image else default | |
| **messages** | [**kotlin.collections.List&lt;ApiChatMessage&gt;**](ApiChatMessage.md)| default value is non-empty array | |
| **model** | [**ApiAiModel**](ApiAiModel.md)|  | [enum: ZImageTurbo, NanoBanana2, Flux2Pro, Ltx2_3A2V] |
| **pay** | [**ApiPay**](ApiPay.md)|  | |
| **pricing** | [**ApiPricing**](ApiPricing.md)|  | |
| **prompt** | **kotlin.String**|  | |
| **requestId** | **kotlin.String**| transient, managed by server | |
| **status** | [**ApiStatus**](ApiStatus.md)|  | [enum: Pending, Completed, Failed] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**API**](API.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

<a id="mediaGate"></a>
# **mediaGate**
> kotlin.collections.List&lt;kotlin.Int&gt; mediaGate(file)

Auth + per-GB debit gate in front of the &#x60;_upload&#x60; ServeDir on femi.market.   - not a media file → pass through (static site, app data, 404), free   - media file that isn&#39;t a real file in &#x60;_upload&#x60; → pass through, free   - media file in &#x60;_upload&#x60; → require Bearer, charge &#x60;size × pricing.gb&#x60;,     record a debit in the astc ledger, then let ServeDir stream the bytes. The gate only authorizes/charges; ServeDir still does the actual file streaming (range requests, mime, etc.).

&#x60;#[utoipa::path]&#x60; here is doc-only — the fn runs as &#x60;from_fn&#x60; middleware, not a route handler, but the attribute still emits the spec entry so the generated clients get a typed &#x60;downloadMedia(file)&#x60;. &#x60;servers(...)&#x60; pins it to femi.market (the global server is api.earnfemi.com); &#x60;Request&#x60;/&#x60;Next&#x60; args aren&#39;t documentable extractors so utoipa ignores them and uses the explicit &#x60;params&#x60;.

### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApiApi()
val file : kotlin.String = file_example // kotlin.String | media filename in _upload
try {
    val result : kotlin.collections.List<kotlin.Int> = apiInstance.mediaGate(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiApi#mediaGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiApi#mediaGate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **kotlin.String**| media filename in _upload | |

### Return type

**kotlin.collections.List&lt;kotlin.Int&gt;**

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain

