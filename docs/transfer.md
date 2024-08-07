# Transfer

<a name="get-account-transfer-summary"></a>
## GetAccountTransferSummary: 
ウォレットを指定して取引明細種別毎の集計を返す

```JAVA
Request request = new GetAccountTransferSummary(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .from("2022-07-23T05:03:18.000000Z")      // 集計期間の開始時刻
        .to("2021-11-29T20:41:07.000000Z")        // 集計期間の終了時刻
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
        .from("2020-12-23T07:10:15.000000Z")
        .to("2020-02-09T21:54:30.000000Z")
        .page(5360)
        .perPage(3025)
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .shopName("LAa0LofoeILq2j1JbokM11iel9SifEKQQKEl5jTOYEn550ChTMJy5Ri4zQipR66DYXbWwtCBK4yI7b7ruIn1DQefV0LKmn0D6u1aqXUgLXLPq2aRw08a")
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .customerName("0rfHosccmXhG1yeE5aq4GKVSCfP0aoPIG5NuiBMU7rfLf6FhpORYw57l88LjJn33RIRSOmlXSQfzzTwn3Dxt4Xew7YzDaZ1J9OdsQM2IVUV93tsgTE0JEew3ek7732woVpaWAn4e207OnXy1NWRJfp7ZK3WimQaowti0F0S2aIOKkN5iwpVUwFU1amkd1FBZBysFgH8TiyAaF4dUSA")
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .setModified(true)
        .transactionTypes(new String[]{"payment","exchange","topup","cashback","transfer"})
        .transferTypes(new String[]{"coupon","exchange","expire","transfer","cashback"}) // 取引明細の種類でフィルターします。
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
        .shopName("iyJ302sQl233vCftoqwC5tymvF1K23X2uYu46ypSW9PxtiaID1SUCfz9y") // 店舗名
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("elMoF9a26c2RLHzQWOO42l0o0g8SXRzZ3pUKHHeXuuwg12Ygg3AsTOryINKyRmJ3gWCDcmsuvkMrJePtGFhv4aIw1aGtGR3fEQezBo8XnXONHGXDMcl8tuhVdB5KkP8PHvZEmmcBKkGsr9sdEDTBkey7pr4d2jpaf36YY6mrG9Y2ztoKUUUx5B1bSO8xEgnoe60dnW") // エンドユーザー名
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 取引ID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .setModified(true)                        // キャンセルフラグ
        .transactionTypes(new String[]{"exchange"}) // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
        .nextPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 次ページへ遷移する際に起点となるtransferのID
        .prevPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 前ページへ遷移する際に起点となるtransferのID
        .perPage(50)                              // 1ページ分の取引数
        .transferTypes(new String[]{"payment","topup","transfer","coupon","expire","exchange","campaign"}) // 取引明細種別 (複数指定可)
        .description("店頭QRコードによる支払い")             // 取引詳細説明文
        .from("2022-01-25T09:14:02.000000Z")      // 開始日時
        .to("2020-03-29T20:01:58.000000Z");       // 終了日時

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



