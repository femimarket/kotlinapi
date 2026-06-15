
# Pay

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**kotlin.uuid.Uuid**](kotlin.uuid.Uuid.md) | uuid v7 |  |
| **provider** | [**PayProvider**](PayProvider.md) | Selects the verification path: Apple App Store vs Google Play. |  |
| **userId** | **kotlin.String** |  |  |
| **credit** | **kotlin.Long** |  |  [optional] |
| **currency** | **kotlin.String** |  |  [optional] |
| **jws** | **kotlin.String** | Signed transaction JWS from StoreKit; the input to Apple verification. |  [optional] |
| **loaded** | **kotlin.Boolean** |  |  [optional] |
| **orderId** | **kotlin.String** | Google&#39;s per-purchase &#x60;orderId&#x60;, returned by the Play Developer API (not the client). Not used for dedup — &#x60;ref_id&#x60; is — because promo-code purchases may have no &#x60;orderId&#x60;. |  [optional] |
| **packageName** | **kotlin.String** |  |  [optional] |
| **price** | **kotlin.Long** |  |  [optional] |
| **productId** | **kotlin.String** |  |  [optional] |
| **refId** | **kotlin.String** | Globally-unique purchase id, used as the idempotency key for both stores. Apple: the &#x60;transactionId&#x60;, extracted server-side from the verified JWS   (empty on the incoming request — the server fills it in). Google: the &#x60;purchaseToken&#x60;, sent by the client. It is both the input to   Play Developer API verification and the idempotency key. |  [optional] |
| **status** | [**PayStatus**](PayStatus.md) |  |  [optional] |



