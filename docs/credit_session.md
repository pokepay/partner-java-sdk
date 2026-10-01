# CreditSession
クレジットカード決済セッションを管理するためのAPIです。
Veritrans（決済ゲートウェイ）との連携でクレジットカード決済を実現します。
セッションには有効期限があり、セッション作成後に取引の実行や売上確定（キャプチャ）を行います。
3Dセキュア認証にも対応しています。


<a name="post-credit-session"></a>
## PostCreditSession: Create credit session

```JAVA
Request request = new PostCreditSession(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "2020-10-05T13:35:21.000000Z"                 // expiresAt: セッション有効期限
)
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // 冪等性キー

```



### Parameters
#### `customerId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `privateMoneyId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `cardId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `expiresAt`
セッション有効期限
制約: リクエスト時刻から30日以内
例: "2024-01-15T10:30:00+00:00"

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `requestId`
冪等性キー
同一のrequest_idを持つリクエストは冪等に処理されます。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>



成功したときは
[CreditSession](./responses.md#credit-session)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|503|temporarily_unavailable||Service Unavailable|



---


<a name="create-credit-session-transaction"></a>
## CreateCreditSessionTransaction: Create transaction with credit session
クレジットセッションを使用して取引を作成します。
セッションIDと取引金額を指定します。

```JAVA
Request request = new CreateCreditSessionTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // sessionId: クレジットセッションID
    793.0                                         // amount: 取引金額
)
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .description("xGnpm1kxDBXzRf1f9JiZjCJBrJjt5kCWz5zMWjynyv6KSgRW4BSGACMY5nowhDUZD5IZKMp0STmYDwTtHP0EcP6hogkn6nAjgTjLkVtsanieCAlqrCK8PwmGod9YcEsgY2DC2Vj8cKXwgERagqKSGsUKboeeiIHlMn") // 取引説明
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // 冪等性キー

```



### Parameters
#### `sessionId`
クレジットセッションID

事前に作成されたクレジットセッションのIDを指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `amount`
取引金額
支払い金額を指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "number",
  "minimum": 0
}
```

</details>

#### `shopId`
店舗ID
支払いを行う店舗のIDを指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `description`
取引説明
取引の説明や備考を指定します。省略時は空文字列になります。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "maxLength": 200
}
```

</details>

#### `requestId`
冪等性キー
同一のrequest_idを持つリクエストは冪等に処理されます。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>



成功したときは
[CreditSessionTransactionResult](./responses.md#credit-session-transaction-result)
を返します



---


<a name="capture-credit-session"></a>
## CaptureCreditSession: Capture credit session
クレジットセッションの売上確定（キャプチャ）を行います。
セッション内で行われた支払いの合計金額をクレジットカードに請求します。

```JAVA
Request request = new CaptureCreditSession(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // sessionId: クレジットセッションID
)
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // 冪等性キー

```



### Parameters
#### `sessionId`
クレジットセッションID

キャプチャ対象のクレジットセッションのIDを指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `requestId`
冪等性キー
同一のrequest_idを持つリクエストは冪等に処理されます。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>



成功したときは
[CapturedCreditSession](./responses.md#captured-credit-session)
を返します



---



