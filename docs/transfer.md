# Transfer

<a name="get-account-transfer-summary"></a>
## GetAccountTransferSummary: 
ウォレットを指定して取引明細種別毎の集計を返す

```JAVA
Request request = new GetAccountTransferSummary(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .from("2021-12-29T10:37:26.000000Z")      // 集計期間の開始時刻
        .to("2021-02-25T17:29:04.000000Z")        // 集計期間の終了時刻
        .transferTypes(new String[]{"topup","payment"}); // 取引明細種別 (複数指定可)

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

ここで指定したウォレットIDの取引明細レベルでの集計を取得します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`from`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`transferTypes`** 
  

取引明細の種別でフィルターします。
以下の種別を指定できます。

- payment
  エンドユーザーから店舗への送金取引(支払い取引)
- topup
  店舗からエンドユーザーへの送金取引(チャージ取引)
- campaign-topup
  キャンペーンによるエンドユーザーへのポイント付与取引(ポイントチャージ)
- use-coupon
  支払い時のクーポン使用による値引き取引
- refund-payment
  支払い取引に対するキャンセル取引
- refund-topup
  チャージ取引に対するキャンセル取引
- refund-campaign
  キャンペーンによるポイント付与取引に対するキャンセル取引
- refund-coupon
  クーポン使用による値引き取引に対するキャンセル取引
- exchange-inflow
  交換による他マネーからの流入取引
- exchange-outflow
  交換による他マネーへの流出取引
- refund-exchange-inflow
  交換による他マネーからの流入取引に対するキャンセル取引
- refund-exchange-outflow
  交換による他マネーへの流出取引に対するキャンセル取引

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": [
      "payment",
      "topup",
      "campaign-topup",
      "use-coupon",
      "refund-payment",
      "refund-topup",
      "refund-campaign",
      "refund-coupon",
      "exchange-inflow",
      "exchange-outflow",
      "refund-exchange-inflow",
      "refund-exchange-outflow"
    ]
  }
}
```



成功したときは
[AccountTransferSummary](./responses.md#account-transfer-summary)
を返します



---


<a name="list-transfers"></a>
## ListTransfers

```JAVA
Request request = new ListTransfers()
        .from("2021-01-30T20:49:05.000000Z")
        .to("2023-02-22T20:08:11.000000Z")
        .page(3365)
        .perPage(5071)
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .shopName("3p62KDWO8TDrLXiDq8ZM4HpSJ7ezaoKVM6PG4nVxadlDXYh8F3jX5Rw62VEObOlMsiJRl1b2ESaJKCDCVaIjvXY9buv1PGDaqpxNAcB7XJ2PMH0HA7mMCx")
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .customerName("ziaJ1nphI9ySRxw6pdyrj7YEb5BIbPwZWptKeWMAfjTzhjO10bQwyTU6ZUhrOp80a47LYIcD579HHiydYwYbStQsIHShYuqMOfry8huKLaun9")
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .setModified(false)
        .transactionTypes(new String[]{"topup","cashback","transfer","expire","exchange","payment"})
        .transferTypes(new String[]{"exchange"})  // 取引明細の種類でフィルターします。
        .description("店頭QRコードによる支払い");            // 取引詳細説明文

```



### Parameters
**`from`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`page`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```

**`shopId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`shopName`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`customerId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`customerName`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`transactionId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`setModified`** 
  


```json
{
  "type": "boolean"
}
```

**`transactionTypes`** 
  


```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": [
      "topup",
      "payment",
      "transfer",
      "exchange",
      "cashback",
      "expire"
    ]
  }
}
```

**`transferTypes`** 
  

取引明細の種類でフィルターします。

以下の種類を指定できます。

1. topup
店舗からエンドユーザーへの送金取引(チャージ)、またはそのキャンセル取引

2. payment
エンドユーザーから店舗への送金取引(支払い)、またはそのキャンセル取引

3. exchange
他マネーへの流出/流入

4. campaign
取引に対するポイント還元キャンペーンによるポイント付与、またはそのキャンセル取引

5. coupon
クーポンによる値引き処理、またはそのキャンセル取引

6. cashback
退会時の返金取引

7. expire
退会時失効取引

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": [
      "topup",
      "payment",
      "exchange",
      "transfer",
      "coupon",
      "campaign",
      "cashback",
      "expire"
    ]
  }
}
```

**`description`** 
  

取引詳細を指定の取引詳細説明文でフィルターします。

取引詳細説明文が完全一致する取引のみ抽出されます。取引詳細説明文は最大200文字で記録されています。

```json
{
  "type": "string",
  "maxLength": 200
}
```



成功したときは
[PaginatedTransfers](./responses.md#paginated-transfers)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|NULL|NULL|NULL|
|503|temporarily_unavailable||Service Unavailable|



---


<a name="list-transfers-v2"></a>
## ListTransfersV2

```JAVA
Request request = new ListTransfersV2()
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .shopName("pzYekawpUouvYHKlj0G")          // 店舗名
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("L0Fcnz7fEngR6pF3m54VmwYrgFgT3RyUt1Kexb2ZIYN08OgDDQYpUk9QvTpwbva3X3fUufQzzx2hzebS68SpNEGkfmS3Uyy5Zn41VzLKUg3om1YNfeeKoLdFE8Hmt9R8Bv1AJsBz3l6W699PQnfTErfIkmiU4i2bFcYt3zvnnQAgg6WKGNaTc3A08bOic61u1yVQPNCQEFIkbwhO9RJiR7") // エンドユーザー名
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 取引ID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .transactionTypes(new String[]{"exchange","payment","cashback","expire"}) // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
        .nextPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 次ページへ遷移する際に起点となるtransferのID
        .prevPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 前ページへ遷移する際に起点となるtransferのID
        .perPage(50)                              // 1ページ分の取引数
        .transferTypes(new String[]{"transfer","exchange","coupon","cashback","payment","topup"}) // 取引明細種別 (複数指定可)
        .description("店頭QRコードによる支払い")             // 取引詳細説明文
        .from("2020-02-10T06:55:29.000000Z")      // 開始日時
        .to("2024-03-31T15:07:15.000000Z");       // 終了日時

```



### Parameters
**`shopId`** 
  

店舗IDです。

フィルターとして使われ、指定された店舗での取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`shopName`** 
  

店舗名です。

フィルターとして使われ、入力された名前に部分一致する店舗での取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`customerId`** 
  

エンドユーザーIDです。

フィルターとして使われ、指定されたエンドユーザーの取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`customerName`** 
  

エンドユーザー名です。

フィルターとして使われ、入力された名前に部分一致するエンドユーザーでの取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`transactionId`** 
  

取引IDです。

フィルターとして使われ、指定された取引IDに部分一致(前方一致)する取引のみが一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  

マネーIDです。

指定したマネーでの取引が一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`setModified`** 
  

キャンセルフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
デフォルト値はfalseで、キャンセルの有無にかかわらず一覧に表示されます。

```json
{
  "type": "boolean"
}
```

**`transactionTypes`** 
  

取引の種類でフィルターします。

以下の種類を指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)

2. payment
   エンドユーザーから店舗への送金取引(支払い)

3. exchange-outflow
   他マネーへの流出
   private_money_idが指定されたとき、そのマネーから見て流出方向の交換取引が抽出されます。
   private_money_idを省略した場合は表示されません。

4. exchange-inflow
   他マネーからの流入
   private_money_idが指定されたとき、そのマネーから見て流入方向の交換取引が抽出されます。
   private_money_idを省略した場合は表示されません。

5. cashback
   退会時返金取引

6. expire
   退会時失効取引

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": [
      "topup",
      "payment",
      "transfer",
      "exchange",
      "cashback",
      "expire"
    ]
  }
}
```

**`nextPageCursorId`** 
  

次ページへ遷移する際に起点となるtransferのID(前ページの末尾要素のID)です。
本APIのレスポンスにもnext_page_cursor_idが含まれており、これがnull値の場合は最後のページであることを意味します。
UUIDである場合は次のページが存在することを意味し、このnext_page_cursor_idをリクエストパラメータに含めることで次ページに遷移します。

next_page_cursor_idのtransfer自体は次のページには含まれません。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`prevPageCursorId`** 
  

前ページへ遷移する際に起点となるtransferのID(次ページの先頭要素のID)です。

本APIのレスポンスにもprev_page_cursor_idが含まれており、これがnull値の場合は先頭のページであることを意味します。
UUIDである場合は前のページが存在することを意味し、このprev_page_cursor_idをリクエストパラメータに含めることで前ページに遷移します。

prev_page_cursor_idのtransfer自体は前のページには含まれません。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`perPage`** 
  

1ページ分の取引数です。

デフォルト値は50です。

```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 1000
}
```

**`transferTypes`** 
  

取引明細の種類でフィルターします。

以下の種類を指定できます。

1. topup
店舗からエンドユーザーへの送金取引(チャージ)、またはそのキャンセル取引

2. payment
エンドユーザーから店舗への送金取引(支払い)、またはそのキャンセル取引

3. exchange
他マネーへの流出/流入

4. campaign
取引に対するポイント還元キャンペーンによるポイント付与、またはそのキャンセル取引

5. coupon
クーポンによる値引き処理、またはそのキャンセル取引

6. cashback
退会時の返金取引

7. expire
退会時失効取引

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": [
      "topup",
      "payment",
      "exchange",
      "transfer",
      "coupon",
      "campaign",
      "cashback",
      "expire"
    ]
  }
}
```

**`description`** 
  

取引詳細を指定の取引詳細説明文でフィルターします。

取引詳細説明文が完全一致する取引のみ抽出されます。取引詳細説明文は最大200文字で記録されています。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`from`** 
  

抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  

抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```



成功したときは
[PaginatedTransfersV2](./responses.md#paginated-transfers-v2)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|503|temporarily_unavailable||Service Unavailable|



---



