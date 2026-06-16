
# ApiPay

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **currency** | **kotlin.String** |  |  |
| **id** | [**kotlin.uuid.Uuid**](kotlin.uuid.Uuid.md) | uuid v7 |  |
| **jws** | **kotlin.String** | Signed transaction JWS from StoreKit; the input to Apple verification. |  |
| **loaded** | **kotlin.Boolean** |  |  |
| **packageName** | **kotlin.String** |  |  |
| **paymentUrl** | **kotlin.String** | Stripe only. Hosted-payment URL returned by &#x60;checkout.sessions.create&#x60; — empty until the server creates the session. |  |
| **price** | **kotlin.Long** |  |  |
| **productId** | **kotlin.String** |  |  |
| **provider** | [**ApiPayProvider**](ApiPayProvider.md) | Selects the verification path: Apple App Store vs Google Play. |  |
| **refId** | **kotlin.String** | Globally-unique purchase id, used as the idempotency key for both stores. Apple: the &#x60;transactionId&#x60;, extracted server-side from the verified JWS   (empty on the incoming request — the server fills it in). Google: the &#x60;purchaseToken&#x60;, sent by the client. It is both the input to   Play Developer API verification and the idempotency key. |  |
| **userId** | **kotlin.String** |  |  |
| **orderId** | **kotlin.String** | Google&#39;s per-purchase &#x60;orderId&#x60;, returned by the Play Developer API (not the client). Not used for dedup — &#x60;ref_id&#x60; is — because promo-code purchases may have no &#x60;orderId&#x60;. On the Stripe path, the same field carries the &#x60;payment_intent&#x60; id returned by &#x60;checkout.session.completed&#x60;. |  [optional] |



