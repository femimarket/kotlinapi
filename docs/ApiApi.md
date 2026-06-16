# ApiApi

All URIs are relative to *https://api.earnfemi.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiHandler**](ApiApi.md#apiHandler) | **POST** /api |  |
| [**mediaGate**](ApiApi.md#mediaGate) | **GET** /{file} | Auth + per-GB debit gate in front of the &#x60;_upload&#x60; ServeDir on femi.market.   - not a media file → pass through (static site, app data, 404), free   - media file that isn&#39;t a real file in &#x60;_upload&#x60; → pass through, free   - media file in &#x60;_upload&#x60; → require Bearer, charge &#x60;size × pricing.gb&#x60;,     record a debit in the astc ledger, then let ServeDir stream the bytes. The gate only authorizes/charges; ServeDir still does the actual file streaming (range requests, mime, etc.). |


<a id="apiHandler"></a>
# **apiHandler**
> API apiHandler(API)



### Example
```kotlin
// Import classes:
//import market.femi.api.infrastructure.*
//import market.femi.api.models.*

val apiInstance = ApiApi()
val API : API =  // API | 
try {
    val result : API = apiInstance.apiHandler(API)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiApi#apiHandler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiApi#apiHandler")
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

