# Partner API SDK for Java
## Getting started

Partner APIとの通信は`PartnerAPI`クラスを通じて行います。

```java
PartnerAPI client = new PartnerAPI(new File("./config.properties"));
```

設定はINI形式のファイルに記述し、`PartnerAPI`のコンストラクタに指定します。  

SDKプロジェクトルートの`sample.properties`というファイルがありますので、それを元に必要な情報を記述してください。  
特に以下の情報は通信の安全性のため必要な項目です。これらはパートナー契約時にお渡ししているものです。

* `CLIENT_ID`: パートナーAPI クライアントID
* `CLIENT_SECRET`: パートナーAPI クライアント秘密鍵
* `SSL_KEY_FILE`: SSL秘密鍵ファイルパス
* `SSL_CERT_FILE`: SSL証明書ファイルパス

また、この設定ファイルには認証に必要な情報が含まれるため、ファイルの管理・取り扱いに十分注意してください。

## Overview

### APIリクエスト
Partner APIとの通信はリクエストオブジェクトを作り、`PartnerAPI#send`メソッドに渡すことで行われます。

- `PartnerAPI#send(request)`: リクエストを送信します。返り値はリクエストに応じた型にキャストする必要があります。

リクエストクラスは`jp.pokepay.partnerapi.request`以下に定義されます。

例として、送信した内容をそのまま返すSendEchoを下記に記します。

```java
Request request = new SendEcho("hello");
Echo echo = (Echo) client.send(request);
System.out.println(echo.getStatus()); // => "ok"
System.out.println(echo.getMessage()); // => "hello"
```

リクエストパラメータには必須パラメータと省略可能パラメータが存在します。
必須パラメータはリクエストクラスのインスタンス引数として渡し、省略可能パラメータはリクエストクラスのメソッドを用いて渡します。

```java
Request request = new CreateHoge("xxx")
    .param1(100)
    .param2("aa");
```

上記の例では`CreateHoge`引数の`"xxx"`が必須パラメータであり`param1`と`param2`メソッドで設定した値が省略可能パラメータです。

利用可能なAPIについては[API Operations](#api-operations) で紹介します。

### エラーレスポンス

このSDKでは3種類のExceptionが存在します。

#### SSLInitializeError
SSLの初期化に関するエラーに使われます

#### ProcessingError
設定ファイルが存在しない場合や設定ファイルの内容に不備があるなど、一般的なプログラムに関するエラーに使われます。

#### PartnerRequestError
APIサーバがエラーレスポンスを返した場合に使われます。

##### Methods
- `getType() string`: エラーレスポンスの種類を表す文字列を返します。

- `getMessage() string`: エラーレスポンスの種類に対応するメッセージを文字列で返します。

- `getRawJson() string`: エラーレスポンスを表すjsonを文字列で返します。

<a name="api-operations"></a>
## API Operations

- [GetCpmToken](#get-cpm-token): CPMトークンの状態取得
- [ListTransactions](#list-transactions): 【廃止】取引履歴を取得する
- [CreateTransaction](#create-transaction): 【廃止】チャージする
- [ListTransactionsV2](#list-transactions-v2): 取引履歴を取得する
- [CreateTopupTransaction](#create-topup-transaction): チャージする
- [CreatePaymentTransaction](#create-payment-transaction): 支払いする
- [CreateCpmTransaction](#create-cpm-transaction): CPMトークンによる取引作成
- [CreateTransferTransaction](#create-transfer-transaction): 個人間送金
- [CreateExchangeTransaction](#create-exchange-transaction): 
- [GetTransaction](#get-transaction): 取引情報を取得する
- [RefundTransaction](#refund-transaction): 取引をキャンセルする
- [GetTransactionByRequestId](#get-transaction-by-request-id): リクエストIDから取引情報を取得する
- [RequestUserStats](#request-user-stats): 指定期間内の顧客が行った取引の統計情報をCSVでダウンロードする
- [GetAccountTransferSummary](#get-account-transfer-summary): 
- [ListTransfers](#list-transfers): 
- [ListTransfersV2](#list-transfers-v2): 
- [CreateCheck](#create-check): チャージQRコードの発行
- [CreateTopupTransactionWithCheck](#create-topup-transaction-with-check): チャージQRコードを読み取ることでチャージする
- [ListBills](#list-bills): 支払いQRコード一覧を表示する
- [CreateBill](#create-bill): 支払いQRコードの発行
- [UpdateBill](#update-bill): 支払いQRコードの更新
- [CreateCashtray](#create-cashtray): Cashtrayを作る
- [GetCashtray](#get-cashtray): Cashtrayの情報を取得する
- [CancelCashtray](#cancel-cashtray): Cashtrayを無効化する
- [UpdateCashtray](#update-cashtray): Cashtrayの情報を更新する
- [GetAccount](#get-account): ウォレット情報を表示する
- [UpdateAccount](#update-account): ウォレット情報を更新する
- [DeleteAccount](#delete-account): ウォレットを退会する
- [ListAccountBalances](#list-account-balances): エンドユーザーの残高内訳を表示する
- [ListAccountExpiredBalances](#list-account-expired-balances): エンドユーザーの失効済みの残高内訳を表示する
- [UpdateCustomerAccount](#update-customer-account): エンドユーザーのウォレット情報を更新する
- [GetCustomerAccounts](#get-customer-accounts): エンドユーザーのウォレット一覧を表示する
- [CreateCustomerAccount](#create-customer-account): 新規エンドユーザーをウォレットと共に追加する
- [GetShopAccounts](#get-shop-accounts): 店舗ユーザーのウォレット一覧を表示する
- [ListCustomerTransactions](#list-customer-transactions): 取引履歴を取得する
- [ListShops](#list-shops): 店舗一覧を取得する
- [CreateShop](#create-shop): 【廃止】新規店舗を追加する
- [CreateShopV2](#create-shop-v2): 新規店舗を追加する
- [GetShop](#get-shop): 店舗情報を表示する
- [UpdateShop](#update-shop): 店舗情報を更新する
- [ListUserAccounts](#list-user-accounts): エンドユーザー、店舗ユーザーのウォレット一覧を表示する
- [CreateUserAccount](#create-user-account): エンドユーザーのウォレットを作成する
- [GetPrivateMoneys](#get-private-moneys): マネー一覧を取得する
- [GetPrivateMoneyOrganizationSummaries](#get-private-money-organization-summaries): 決済加盟店の取引サマリを取得する
- [GetPrivateMoneySummary](#get-private-money-summary): 取引サマリを取得する
- [BulkCreateTransaction](#bulk-create-transaction): CSVファイル一括取引
- [CreateExternalTransaction](#create-external-transaction): ポケペイ外部取引を作成する
- [RefundExternalTransaction](#refund-external-transaction): ポケペイ外部取引をキャンセルする
- [CreateCampaign](#create-campaign): ポイント付与キャンペーンを作る
- [ListCampaigns](#list-campaigns): キャンペーン一覧を取得する
- [GetCampaign](#get-campaign): キャンペーンを取得する
- [UpdateCampaign](#update-campaign): ポイント付与キャンペーンを更新する
- [CreateWebhook](#create-webhook): webhookの作成
- [ListWebhooks](#list-webhooks): 作成したWebhookの一覧を返す
- [UpdateWebhook](#update-webhook): Webhookの更新
- [DeleteWebhook](#delete-webhook): Webhookの削除
### Transaction
<a name="get-cpm-token"></a>
#### CPMトークンの状態取得
CPMトークンの現在の状態を取得します。CPMトークンの有効期限やCPM取引の状態を返します。
```java
Request request = new GetCpmToken(
    "pPzDCyUBg3VaVg5lQKirhr"                      // cpmToken: CPMトークン
);
```

---
`cpmToken`  
```json
{
  "type": "string",
  "minLength": 22,
  "maxLength": 22
}
```
CPM取引時にエンドユーザーが店舗に提示するバーコードを解析して得られる22桁の文字列です。

---
成功したときは[CpmToken](#cpm-token)クラスのインスタンスを返します
<a name="list-transactions"></a>
#### 【廃止】取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2025-05-09T15:07:50.000000+09:00") // 開始日時
        .to("2018-10-18T14:03:35.000000+09:00")   // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 端末ID
        .transactionId("bFT")                     // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .types(new String[]{"topup","payment"})   // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
        .description("店頭QRコードによる支払い");            // 取引説明文
```

---
`from`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分の取引数です。

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

フィルターとして使われ、指定された店舗での取引のみ一覧に表示されます。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

フィルターとして使われ、指定されたエンドユーザーでの取引のみ一覧に表示されます。

---
`customerName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
エンドユーザー名です。

フィルターとして使われ、入力された名前に部分一致するエンドユーザーでの取引のみ一覧に表示されます。

---
`terminalId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
端末IDです。

フィルターとして使われ、指定された端末での取引のみ一覧に表示されます。

---
`transactionId`  
```json
{ "type": "string" }
```
取引IDです。

フィルターとして使われ、指定された取引IDに部分一致(前方一致)する取引のみが一覧に表示されます。

---
`organizationCode`  
```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```
組織コードです。

フィルターとして使われ、指定された組織での取引のみ一覧に表示されます。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

フィルターとして使われ、指定したマネーでの取引のみ一覧に表示されます。

---
`setModified`  
```json
{ "type": "boolean" }
```
キャンセルフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
デフォルト値はfalseで、キャンセルの有無にかかわらず一覧に表示されます。

---
`types`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "topup": "payment",
      "exchange_outflow": "exchange_inflow",
      "cashback": "expire"
    }
  }
}
```
取引の種類でフィルターします。

以下の種類を指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)

2. payment
   エンドユーザーから店舗への送金取引(支払い)

3. exchange-outflow
   他マネーへの流出

4. exchange-inflow
   他マネーからの流入

5. cashback
   退会時返金取引

6. expire
   退会時失効取引

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引を指定の取引説明文でフィルターします。

取引説明文が完全一致する取引のみ抽出されます。取引説明文は最大200文字で記録されています。

---
成功したときは[PaginatedTransaction](#paginated-transaction)クラスのインスタンスを返します
<a name="create-transaction"></a>
#### 【廃止】チャージする
チャージ取引を作成します。このAPIは廃止予定です。以降は `CreateTopupTransaction` を使用してください。
```java
Request request = new CreateTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
)
        .moneyAmount(5804)
        .pointAmount(6343)
        .pointExpiresAt("2023-07-08T10:36:27.000000+09:00") // ポイント有効期限
        .description("4vRn0V1KmKqNhpuD1AS4IxvpFPGaTF6gXtd3nJyyNe74Q2bvFtD");
```

---
`pointExpiresAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ポイントをチャージした場合の、付与されるポイントの有効期限です。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="list-transactions-v2"></a>
#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactionsV2()
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .organizationCode("pocketchange")         // 組織コード
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .terminalId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 端末ID
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .description("店頭QRコードによる支払い")             // 取引説明文
        .transactionId("ku")                      // 取引ID
        .setModified(false)                       // キャンセルフラグ
        .types(new String[]{"topup","payment"})   // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
        .from("2023-03-18T03:40:39.000000+09:00") // 開始日時
        .to("2021-05-28T16:59:46.000000+09:00")   // 終了日時
        .nextPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 次ページへ遷移する際に起点となるtransactionのID
        .prevPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 前ページへ遷移する際に起点となるtransactionのID
        .perPage(50);                             // 1ページ分の取引数
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

指定したマネーでの取引が一覧に表示されます。

---
`organizationCode`  
```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```
組織コードです。

フィルターとして使われ、指定された組織の店舗での取引のみ一覧に表示されます。

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

フィルターとして使われ、指定された店舗での取引のみ一覧に表示されます。

---
`terminalId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
端末IDです。

フィルターとして使われ、指定された端末での取引のみ一覧に表示されます。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

フィルターとして使われ、指定されたエンドユーザーの取引のみ一覧に表示されます。

---
`customerName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
エンドユーザー名です。

フィルターとして使われ、入力された名前に部分一致するエンドユーザーでの取引のみ一覧に表示されます。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引を指定の取引説明文でフィルターします。

取引説明文が完全一致する取引のみ抽出されます。取引説明文は最大200文字で記録されています。

---
`transactionId`  
```json
{ "type": "string" }
```
取引IDです。

フィルターとして使われ、指定された取引IDに部分一致(前方一致)する取引のみが一覧に表示されます。

---
`setModified`  
```json
{ "type": "boolean" }
```
キャンセルフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
デフォルト値はfalseで、キャンセルの有無にかかわらず一覧に表示されます。

---
`types`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "topup": "payment",
      "exchange_outflow": "exchange_inflow",
      "cashback": "expire"
    }
  }
}
```
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

---
`from`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
`nextPageCursorId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
次ページへ遷移する際に起点となるtransactionのID(前ページの末尾要素のID)です。
本APIのレスポンスにもnext_page_cursor_idが含まれており、これがnull値の場合は最後のページであることを意味します。
UUIDである場合は次のページが存在することを意味し、このnext_page_cursor_idをリクエストパラメータに含めることで次ページに遷移します。

next_page_cursor_idのtransaction自体は次のページには含まれません。

---
`prevPageCursorId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
前ページへ遷移する際に起点となるtransactionのID(次ページの先頭要素のID)です。

本APIのレスポンスにもprev_page_cursor_idが含まれており、これがnull値の場合は先頭のページであることを意味します。
UUIDである場合は前のページが存在することを意味し、このprev_page_cursor_idをリクエストパラメータに含めることで前ページに遷移します。

prev_page_cursor_idのtransaction自体は前のページには含まれません。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 1000
}
```
1ページ分の取引数です。

デフォルト値は50です。

---
成功したときは[PaginatedTransactionV2](#paginated-transaction-v2)クラスのインスタンスを返します
<a name="create-topup-transaction"></a>
#### チャージする
チャージ取引を作成します。
```java
Request request = new CreateTopupTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーのID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .bearPointShopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント支払時の負担店舗ID
        .moneyAmount(8144)                        // マネー額
        .pointAmount(2143)                        // ポイント額
        .pointExpiresAt("2018-12-10T10:08:07.000000+09:00") // ポイント有効期限
        .description("初夏のチャージキャンペーン")             // 取引履歴に表示する説明文
        .metadata("{\"key\":\"value\"}")          // 取引メタデータ
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

送金元の店舗を指定します。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

送金先のエンドユーザーを指定します。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

マネーを指定します。

---
`bearPointShopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ポイント支払時の負担店舗IDです。

ポイント支払い時に実際お金を負担する店舗を指定します。

---
`moneyAmount`  
```json
{
  "type": "integer",
  "minimum": 0
}
```
マネー額です。

送金するマネー額を指定します。
デフォルト値は0で、money_amountとpoint_amountの両方が0のときにはinvalid_parameter_both_point_and_money_are_zero(エラーコード400)が返ります。

---
`pointAmount`  
```json
{
  "type": "integer",
  "minimum": 0
}
```
ポイント額です。

送金するポイント額を指定します。
デフォルト値は0で、money_amountとpoint_amountの両方が0のときにはinvalid_parameter_both_point_and_money_are_zero(エラーコード400)が返ります。

---
`pointExpiresAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ポイントをチャージした場合の、付与されるポイントの有効期限です。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
取引作成時に指定されるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSON文字列で指定します。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="create-payment-transaction"></a>
#### 支払いする
支払取引を作成します。
支払い時には、エンドユーザーの残高のうち、ポイント残高から優先的に消費されます。

```java
JsonObject items = new JsonObject();
items.addProperty("jan_code", "abc");
items.addProperty("name", "name1");
items.addProperty("unit_price", 100);
items.addProperty("price", 100);
items.addProperty("is_discounted", false);
items.addProperty("other", "{}");
Request request = new CreatePaymentTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    6174                                          // amount: 支払い額
)
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .metadata("{\"key\":\"value\"}")          // 取引メタデータ
        .products(new Object[]{items})            // 商品情報データ
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

送金先の店舗を指定します。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

送金元のエンドユーザーを指定します。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

マネーを指定します。

---
`amount`  
```json
{
  "type": "integer",
  "minimum": 0
}
```
マネー額です。

送金するマネー額を指定します。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
取引作成時に指定されるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSON文字列で指定します。

---
`products`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
一つの取引に含まれる商品情報データです。
以下の内容からなるJSONオブジェクトの配列で指定します。

- `jan_code`: JANコード。64字以下の文字列
- `name`: 商品名。256字以下の文字列
- `unit_price`: 商品単価。0以上の数値
- `price`: 全体の金額(例: 商品単価 × 個数)。0以上の数値
- `is_discounted`: 賞味期限が近いなどの理由で商品が値引きされているかどうかのフラグ。boolean
- `other`: その他商品に関する情報。JSONオブジェクトで指定します。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="create-cpm-transaction"></a>
#### CPMトークンによる取引作成
CPMトークンにより取引を作成します。
CPMトークンに設定されたスコープの取引を作ることができます。

```java
JsonObject items = new JsonObject();
items.addProperty("jan_code", "abc");
items.addProperty("name", "name1");
items.addProperty("unit_price", 100);
items.addProperty("price", 100);
items.addProperty("is_discounted", false);
items.addProperty("other", "{}");
JsonObject items2 = new JsonObject();
items2.addProperty("jan_code", "abc");
items2.addProperty("name", "name1");
items2.addProperty("unit_price", 100);
items2.addProperty("price", 100);
items2.addProperty("is_discounted", false);
items2.addProperty("other", "{}");
JsonObject items3 = new JsonObject();
items3.addProperty("jan_code", "abc");
items3.addProperty("name", "name1");
items3.addProperty("unit_price", 100);
items3.addProperty("price", 100);
items3.addProperty("is_discounted", false);
items3.addProperty("other", "{}");
Request request = new CreateCpmTransaction(
    "J09whlF6CVlMKFHkTHEGRW",                     // cpmToken: CPMトークン
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    9429.0                                        // amount: 取引金額
)
        .description("たい焼き(小倉)")                  // 取引説明文
        .metadata("{\"key\":\"value\"}")          // 店舗側メタデータ
        .products(new Object[]{items,items2,items3}) // 商品情報データ
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`cpmToken`  
```json
{
  "type": "string",
  "minLength": 22,
  "maxLength": 22
}
```
エンドユーザーによって作られ、アプリなどに表示され、店舗に対して提示される22桁の文字列です。

エンドユーザーによって許可された取引のスコープを持っています。

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

支払いやチャージを行う店舗を指定します。

---
`amount`  
```json
{ "type": "number" }
```
取引金額を指定します。

正の値を与えるとチャージになり、負の値を与えると支払いとなります。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引説明文です。

エンドユーザーアプリの取引履歴などに表示されます。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
取引作成時に店舗側から指定されるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSON文字列で指定します。

---
`products`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
一つの取引に含まれる商品情報データです。
以下の内容からなるJSONオブジェクトの配列で指定します。

- `jan_code`: JANコード。64字以下の文字列
- `name`: 商品名。256字以下の文字列
- `unit_price`: 商品単価。0以上の数値
- `price`: 全体の金額(例: 商品単価 × 個数)。0以上の数値
- `is_discounted`: 賞味期限が近いなどの理由で商品が値引きされているかどうかのフラグ。boolean
- `other`: その他商品に関する情報。JSONオブジェクトで指定します。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="create-transfer-transaction"></a>
#### 個人間送金
エンドユーザー間での送金取引(個人間送金)を作成します。
個人間送金で送れるのはマネーのみで、ポイントを送ることはできません。送金元のマネー残高のうち、有効期限が最も遠いものから順に送金されます。

```java
Request request = new CreateTransferTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // senderId: 送金元ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // receiverId: 受取ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    1493.0                                        // amount: 送金額
)
        .metadata("{\"key\":\"value\"}")          // 取引メタデータ
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`senderId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

送金元のエンドユーザー(送り主)を指定します。

---
`receiverId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

送金先のエンドユーザー(受け取り人)を指定します。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

マネーを指定します。

---
`amount`  
```json
{
  "type": "number",
  "minimum": 0
}
```
マネー額です。

送金するマネー額を指定します。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
取引作成時に指定されるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSON文字列で指定します。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="create-exchange-transaction"></a>
#### 
```java
Request request = new CreateExchangeTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    8667.0
)
        .description("rmAxzFUF6ihvlI4uoOEnKraNjpsN9SjDxtxrgs7e0dkiAAa8jwX6FLCB1XlvzBazSCE1hEG2EkkP2VIPy7HW7Ee7skB9BB1YNClE0n87A30l6vspNWH9u8x4Yq2mxjIub5W9d4fa79SnOHSfjKkp3QkI11kPUOWIOCC9XRXSkWvgwMdC6Y")
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="get-transaction"></a>
#### 取引情報を取得する
取引を取得します。
```java
Request request = new GetTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // transactionId: 取引ID
);
```

---
`transactionId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引IDです。

フィルターとして使われ、指定した取引IDの取引を取得します。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="refund-transaction"></a>
#### 取引をキャンセルする
取引IDを指定して取引をキャンセルします。

発行体の管理者は自組織の直営店、または発行しているマネーの決済加盟店組織での取引をキャンセルできます。
キャンセル対象の取引に付随するポイント還元キャンペーンやクーポン適用も取り消されます。

チャージ取引のキャンセル時に返金すべき残高が足りないときは `account_balance_not_enough (422)` エラーが返ります。
取引をキャンセルできるのは1回きりです。既にキャンセルされた取引を重ねてキャンセルしようとすると `transaction_already_refunded (422)` エラーが返ります。
```java
Request request = new RefundTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // transactionId: 取引ID
)
        .description("返品対応のため")                   // 取引履歴に表示する返金事由
        .returningPointExpiresAt("2023-05-18T16:12:43.000000+09:00"); // 返却ポイントの有効期限
```

---
`returningPointExpiresAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ポイント支払いを含む支払い取引をキャンセルする際にユーザへ返却されるポイントの有効期限です。デフォルトでは未指定です。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="get-transaction-by-request-id"></a>
#### リクエストIDから取引情報を取得する
取引を取得します。
```java
Request request = new GetTransactionByRequestId(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // requestId: リクエストID
);
```

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成時にクライアントが生成し指定するリクエストIDです。

リクエストIDに対応する取引が存在すればその取引を返し、無ければNotFound(404)を返します。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
<a name="request-user-stats"></a>
#### 指定期間内の顧客が行った取引の統計情報をCSVでダウンロードする
期間を指定して、期間内に発行マネーの全顧客が行った取引の総額・回数などをCSVでダウンロードする機能です。
CSVの作成は非同期で行われるため完了まで少しの間待つ必要がありますが、完了時にダウンロードできるURLをレスポンスとして返します。
このURLの有効期限はリクエスト日時から7日間です。

ダウンロードできるCSVのデータは以下のものです。

* organization_code: 取引を行った組織コード
* private_money_id: 取引されたマネーのID
* private_money_name: 取引されたマネーの名前
* user_id: 決済したユーザーID
* user_external_id: 決済したユーザーの外部ID
* payment_money_amount: 指定期間内に決済に使ったマネーの総額
* payment_point_amount: 指定期間内に決済に使ったポイントの総額
* payment_transaction_count: 指定期間内に決済した回数。キャンセルされた取引は含まない

また、指定期間より前の決済を時間をおいてキャンセルした場合などには payment_money_amount, payment_point_amount, payment_transaction_count が負の値になることもあることに留意してください。
```java
Request request = new RequestUserStats(
    "2018-02-28T13:08:51.000000+09:00",           // from: 集計期間の開始時刻
    "2018-12-16T23:27:41.000000+09:00"            // to: 集計期間の終了時刻
);
```

---
`from`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
集計する期間の開始時刻をISO8601形式で指定します。
時刻は現在時刻、及び `to` で指定する時刻以前である必要があります。

---
`to`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
集計する期間の終了時刻をISO8601形式で指定します。
時刻は現在時刻、及び `from` で指定する時刻の間である必要があります。

---
成功したときは[UserStatsOperation](#user-stats-operation)クラスのインスタンスを返します
### Transfer
<a name="get-account-transfer-summary"></a>
#### 
ウォレットを指定して取引明細種別毎の集計を返す
```java
Request request = new GetAccountTransferSummary(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .from("2020-12-19T23:33:50.000000+09:00") // 集計期間の開始時刻
        .to("2016-12-17T09:16:50.000000+09:00")   // 集計期間の終了時刻
        .transferTypes(new String[]{"topup","payment"}); // 取引明細種別 (複数指定可)
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

ここで指定したウォレットIDの取引明細レベルでの集計を取得します。

---
`transferTypes`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "payment": "topup",
      "campaign-topup": "use-coupon",
      "refund-payment": "refund-topup",
      "refund-campaign": "refund-coupon",
      "exchange-inflow": "exchange-outflow",
      "refund-exchange-inflow": "refund-exchange-outflow"
    }
  }
}
```
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

---
成功したときは[AccountTransferSummary](#account-transfer-summary)クラスのインスタンスを返します
<a name="list-transfers"></a>
#### 
```java
Request request = new ListTransfers()
        .from("2018-05-14T03:56:54.000000+09:00")
        .to("2017-04-04T00:36:19.000000+09:00")
        .page(7508)
        .perPage(2765)
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .shopName("TB4phpjbt6QHeDKxXdEg3OxGlsZaVSpjoQ6ffYAe6kpXiCTiSBUIe5iqIMOcjyqBKlSFGLuqDn2oMYRFh8c")
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .customerName("nV2spFoKb7jYgx3gTJKy6dBb3ykYYVRZ4jdyfDGYQa0QPCC60HT399N8hkxoSQFYDUU0HuG332kYdREQC39nZBUv4F8J7UzyDYEv7bctcmIqdmvTV8")
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .setModified(true)
        .transactionTypes(new String[]{"transfer"})
        .transferTypes(new String[]{"campaign"})  // 取引明細の種類でフィルターします。
        .description("店頭QRコードによる支払い");            // 取引詳細説明文
```

---
`transferTypes`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "topup": "payment",
      "exchange": "transfer",
      "coupon": "campaign",
      "cashback": "expire"
    }
  }
}
```
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

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引詳細を指定の取引詳細説明文でフィルターします。

取引詳細説明文が完全一致する取引のみ抽出されます。取引詳細説明文は最大200文字で記録されています。

---
成功したときは[PaginatedTransfers](#paginated-transfers)クラスのインスタンスを返します
<a name="list-transfers-v2"></a>
#### 
```java
Request request = new ListTransfersV2()
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .shopName("KZWoUeORL98QDv9TW3tonru5DxxR1kiR4daTST401zYU9O5bmxo5R8HDeIrg38UDixRQOsOxJyiut30oRsSLi4FAWjvNFlMGhO7MjoFiHLtN9Yqy7R5Sel4rqjqD6mB2gz0FIdNSbIrXOBo1I3rdkLB5vuUQlHHWHdfJKJGJOe4o3A7Ast7GZKKewMQbpvWdRIf0j2NcGpd9kTg7fbzWuGj28bjzoMkUfQZyG6ql9kvIc3ugQfVc") // 店舗名
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("KEOAlMUYblAnOJUw5uYgLUj2LWIHcZ5Kh7Upt9fM2ThdFR4ZGmC3lYSdkRdIHlBo7iMGslQeLzTg9FCP6boJkANEWZ0xko5rtXdkjCZ6KXkiMx1kHTVbpRx7") // エンドユーザー名
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 取引ID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .transactionTypes(new String[]{"payment","transfer","expire","cashback","exchange"}) // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
        .nextPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 次ページへ遷移する際に起点となるtransferのID
        .prevPageCursorId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 前ページへ遷移する際に起点となるtransferのID
        .perPage(50)                              // 1ページ分の取引数
        .transferTypes(new String[]{"expire","transfer","exchange","coupon"}) // 取引明細種別 (複数指定可)
        .description("店頭QRコードによる支払い")             // 取引詳細説明文
        .from("2016-07-14T11:16:11.000000+09:00") // 開始日時
        .to("2018-03-28T03:30:46.000000+09:00");  // 終了日時
```

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

フィルターとして使われ、指定された店舗での取引のみ一覧に表示されます。

---
`shopName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
店舗名です。

フィルターとして使われ、入力された名前に部分一致する店舗での取引のみ一覧に表示されます。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

フィルターとして使われ、指定されたエンドユーザーの取引のみ一覧に表示されます。

---
`customerName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
エンドユーザー名です。

フィルターとして使われ、入力された名前に部分一致するエンドユーザーでの取引のみ一覧に表示されます。

---
`transactionId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引IDです。

フィルターとして使われ、指定された取引IDに部分一致(前方一致)する取引のみが一覧に表示されます。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

指定したマネーでの取引が一覧に表示されます。

---
`setModified`  
```json
{ "type": "boolean" }
```
キャンセルフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
デフォルト値はfalseで、キャンセルの有無にかかわらず一覧に表示されます。

---
`transactionTypes`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "topup": "payment",
      "transfer": "exchange",
      "cashback": "expire"
    }
  }
}
```
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

---
`nextPageCursorId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
次ページへ遷移する際に起点となるtransferのID(前ページの末尾要素のID)です。
本APIのレスポンスにもnext_page_cursor_idが含まれており、これがnull値の場合は最後のページであることを意味します。
UUIDである場合は次のページが存在することを意味し、このnext_page_cursor_idをリクエストパラメータに含めることで次ページに遷移します。

next_page_cursor_idのtransfer自体は次のページには含まれません。

---
`prevPageCursorId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
前ページへ遷移する際に起点となるtransferのID(次ページの先頭要素のID)です。

本APIのレスポンスにもprev_page_cursor_idが含まれており、これがnull値の場合は先頭のページであることを意味します。
UUIDである場合は前のページが存在することを意味し、このprev_page_cursor_idをリクエストパラメータに含めることで前ページに遷移します。

prev_page_cursor_idのtransfer自体は前のページには含まれません。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 1000
}
```
1ページ分の取引数です。

デフォルト値は50です。

---
`transferTypes`  
```json
{
  "type": "array",
  "items": {
    "type": "string",
    "enum": {
      "topup": "payment",
      "exchange": "transfer",
      "coupon": "campaign",
      "cashback": "expire"
    }
  }
}
```
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

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引詳細を指定の取引詳細説明文でフィルターします。

取引詳細説明文が完全一致する取引のみ抽出されます。取引詳細説明文は最大200文字で記録されています。

---
`from`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
成功したときは[PaginatedTransfersV2](#paginated-transfers-v2)クラスのインスタンスを返します
### Check
店舗ユーザが発行し、エンドユーザーがポケペイアプリから読み取ることでチャージ取引が発生するQRコードです。

チャージQRコードを解析すると次のようなURLになります(URLは環境によって異なります)。

`https://www-sandbox.pokepay.jp/checks/xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx`

QRコードを読み取る方法以外にも、このURLリンクを直接スマートフォン(iOS/Android)上で開くことによりアプリが起動して取引が行われます。(注意: 上記URLはsandbox環境であるため、アプリもsandbox環境のものである必要があります) 上記URL中の `xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx` の部分がチャージQRコードのIDです。

<a name="create-check"></a>
#### チャージQRコードの発行
```java
Request request = new CreateCheck(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: 送金元の店舗アカウントID
)
        .moneyAmount(9783.0)                      // 付与マネー額
        .pointAmount(9330.0)                      // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(true)                         // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(1011)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2016-02-26T02:02:37.000000+09:00") // チャージQR自体の失効日時
        .pointExpiresAt("2022-01-18T23:10:53.000000+09:00") // チャージQRによって付与されるポイントの失効日時
        .pointExpiresInDays(60)                   // チャージQRによって付与されるポイントの有効期限(相対指定、単位は日)
        .bearPointAccount("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // ポイント額を負担する店舗アカウントのID
```
`moneyAmount`と`pointAmount`の少なくとも一方は指定する必要があります。


---
`setOnetime`  
```json
{ "type": "boolean" }
```
チャージQRコードが一度の読み取りで失効するときに`true`にします。デフォルト値は`true`です。
`false`の場合、そのチャージQRコードは1ユーザについては1回きりですが、複数ユーザによって読み取り可能なQRコードになります。


---
`usageLimit`  
```json
{ "type": "integer" }
```
複数ユーザによって読み取り可能なチャージQRコードの読み取り回数に制限をつけるために指定します。
省略すると無制限に読み取り可能なチャージQRコードになります。
チャージQRコードは管理画面からいつでも無効化(有効化)することができます。


---
成功したときは[Check](#check)クラスのインスタンスを返します
<a name="create-topup-transaction-with-check"></a>
#### チャージQRコードを読み取ることでチャージする
通常チャージQRコードはエンドユーザーのアプリによって読み取られ、アプリとポケペイサーバとの直接通信によって取引が作られます。 もしエンドユーザーとの通信をパートナーのサーバのみに限定したい場合、パートナーのサーバがチャージQRの情報をエンドユーザーから代理受けして、サーバ間連携APIによって実際のチャージ取引をリクエストすることになります。

エンドユーザーから受け取ったチャージ用QRコードのIDをエンドユーザーIDと共に渡すことでチャージ取引が作られます。

```java
Request request = new CreateTopupTransactionWithCheck(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // checkId: チャージ用QRコードのID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // customerId: エンドユーザーのID
)
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`checkId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
チャージ用QRコードのIDです。

QRコード生成時に送金元店舗のウォレット情報や、送金額などが登録されています。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

送金先のエンドユーザーを指定します。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[TransactionDetail](#transaction-detail)クラスのインスタンスを返します
### Bill
支払いQRコード
<a name="list-bills"></a>
#### 支払いQRコード一覧を表示する
支払いQRコード一覧を表示します。
```java
Request request = new ListBills()
        .page(8115)                               // ページ番号
        .perPage(5226)                            // 1ページの表示数
        .billId("oMxDsfU3T")                      // 支払いQRコードのID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .organizationCode("-4s-j37-AdJTY1-JCB-g") // 組織コード
        .description("test bill")                 // 取引説明文
        .createdFrom("2024-03-31T10:39:01.000000+09:00") // 作成日時(起点)
        .createdTo("2021-10-19T12:11:09.000000+09:00") // 作成日時(終点)
        .shopName("bill test shop1")              // 店舗名
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .lowerLimitAmount(3198)                   // 金額の範囲によるフィルタ(下限)
        .upperLimitAmount(1259)                   // 金額の範囲によるフィルタ(上限)
        .setDisabled(false);                      // 支払いQRコードが無効化されているかどうか
```

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページに表示する支払いQRコードの数です。

---
`billId`  
```json
{ "type": "string" }
```
支払いQRコードのIDを指定して検索します。IDは前方一致で検索されます。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
支払いQRコードの送金元ウォレットのマネーIDでフィルターします。

---
`organizationCode`  
```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```
支払いQRコードの送金元店舗が所属する組織の組織コードでフィルターします。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
支払いQRコードを読み取ることで作られた取引の説明文としてアプリなどに表示されます。

---
`createdFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
支払いQRコードの作成日時でフィルターします。

これ以降に作成された支払いQRコードのみ一覧に表示されます。

---
`createdTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
支払いQRコードの作成日時でフィルターします。

これ以前に作成された支払いQRコードのみ一覧に表示されます。

---
`shopName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
支払いQRコードを作成した店舗名でフィルターします。店舗名は部分一致で検索されます。

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
支払いQRコードを作成した店舗IDでフィルターします。

---
`lowerLimitAmount`  
```json
{
  "type": "integer",
  "format": "decimal",
  "minimum": 0
}
```
支払いQRコードの金額の下限を指定してフィルターします。

---
`upperLimitAmount`  
```json
{
  "type": "integer",
  "format": "decimal",
  "minimum": 0
}
```
支払いQRコードの金額の上限を指定してフィルターします。

---
`setDisabled`  
```json
{ "type": "boolean" }
```
支払いQRコードが無効化されているかどうかを表します。デフォルト値は偽(有効)です。

---
成功したときは[PaginatedBills](#paginated-bills)クラスのインスタンスを返します
<a name="create-bill"></a>
#### 支払いQRコードの発行
支払いQRコードの内容を更新します。支払い先の店舗ユーザーは指定したマネーのウォレットを持っている必要があります。
```java
Request request = new CreateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: 支払いマネーのマネーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 支払い先(受け取り人)の店舗ID
)
        .amount(9035.0)                           // 支払い額
        .description("test bill");                // 説明文(アプリ上で取引の説明文として表示される)
```

---
`amount`  
```json
{
  "type": "number",
  "format": "decimal",
  "minimum": 0
}
```
支払いQRコードを支払い額を指定します。省略するかnullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

---
成功したときは[Bill](#bill)クラスのインスタンスを返します
<a name="update-bill"></a>
#### 支払いQRコードの更新
支払いQRコードの内容を更新します。パラメータは全て省略可能で、指定したもののみ更新されます。
```java
Request request = new UpdateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // billId: 支払いQRコードのID
)
        .amount(4778.0)                           // 支払い額
        .description("test bill")                 // 説明文
        .setDisabled(false);                      // 無効化されているかどうか
```

---
`billId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
更新対象の支払いQRコードのIDです。

---
`amount`  
```json
{
  "type": "number",
  "format": "decimal",
  "minimum": 0
}
```
支払いQRコードを支払い額を指定します。nullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
支払いQRコードの詳細説明文です。アプリ上で取引の説明文として表示されます。

---
`setDisabled`  
```json
{ "type": "boolean" }
```
支払いQRコードが無効化されているかどうかを指定します。真にすると無効化され、偽にすると有効化します。

---
成功したときは[Bill](#bill)クラスのインスタンスを返します
### Cashtray
Cashtrayは支払いとチャージ両方に使えるQRコードで、店舗ユーザとエンドユーザーの間の主に店頭などでの取引のために用いられます。
Cashtrayによる取引では、エンドユーザーがQRコードを読み取った時点で即時取引が作られ、ユーザに対して受け取り確認画面は表示されません。
Cashtrayはワンタイムで、一度読み取りに成功するか、取引エラーになると失効します。
また、Cashtrayには有効期限があり、デフォルトでは30分で失効します。

<a name="create-cashtray"></a>
#### Cashtrayを作る
Cashtrayを作成します。

エンドユーザーに対して支払いまたはチャージを行う店舗の情報(店舗ユーザーIDとマネーID)と、取引金額が必須項目です。
店舗ユーザーIDとマネーIDから店舗ウォレットを特定します。

その他に、Cashtrayから作られる取引に対する説明文や失効時間を指定できます。

```java
Request request = new CreateCashtray(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ユーザーID
    4380.0                                        // amount: 金額
)
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .expiresIn(8824);                         // 失効時間(秒)
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引対象のマネーのIDです(必須項目)。

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗のユーザーIDです(必須項目)。

---
`amount`  
```json
{ "type": "number" }
```
マネー額です(必須項目)。
正の値を与えるとチャージになり、負の値を与えると支払いとなります。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
Cashtrayを読み取ったときに作られる取引の説明文です(最大200文字、任意項目)。
アプリや管理画面などの取引履歴に表示されます。デフォルトでは空文字になります。

---
`expiresIn`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
Cashtrayが失効するまでの時間を秒単位で指定します(任意項目、デフォルト値は1800秒(30分))。

---
成功したときは[Cashtray](#cashtray)クラスのインスタンスを返します
<a name="get-cashtray"></a>
#### Cashtrayの情報を取得する
Cashtrayの情報を取得します。

Cashtrayの現在の状態に加え、エンドユーザーのCashtray読み取りの試行結果、Cashtray読み取りによって作られた取引情報が取得できます。

レスポンス中の `attempt` には、このCashtrayをエンドユーザーが読み取った試行結果が入ります。
`account` はエンドユーザーのウォレット情報です。
成功時には `attempt` 内の `status_code` に200が入ります。

まだCashtrayが読み取られていない場合は `attempt` の内容は `NULL` になります。
エンドユーザーのCashtray読み取りの際には、様々なエラーが起き得ます。
エラーの詳細は `attempt` 中の `error_type` と `error_message` にあります。主なエラー型と対応するステータスコードを以下に列挙します。

- `cashtray_already_proceed (422)`
  - 既に処理済みのCashtrayをエンドユーザーが再び読み取ったときに返されます
- `cashtray_expired (422)`
  - 読み取り時点でCashtray自体の有効期限が切れているときに返されます。Cashtrayが失効する時刻はレスポンス中の `expires_at` にあります
- `cashtray_already_canceled (422)`
  - 読み取り時点でCashtrayが無効化されているときに返されます
- `account_balance_not_enough (422)`
  - 支払い時に、エンドユーザーの残高が不足していて取引が完了できなかったときに返されます
- `account_balance_exceeded`
  - チャージ時に、エンドユーザーのウォレット上限を超えて取引が完了できなかったときに返されます
- `account_transfer_limit_exceeded (422)`
  - マネーに設定されている一度の取引金額の上限を超えたため、取引が完了できなかったときに返されます
- `account_money_topup_transfer_limit_exceeded (422)`
  - マネーに設定されている一度のマネーチャージ金額の上限を超えたため、取引が完了できなかったときに返されます
- `account_not_found (422)`
  - Cashtrayに設定されたマネーのウォレットをエンドユーザーが持っていなかったときに返されます


レスポンス中の `transaction` には、このCashtrayをエンドユーザーが読み取ることによって作られる取引データが入ります。まだCashtrayが読み取られていない場合は `NULL` になります。

以上をまとめると、Cashtrayの状態は以下のようになります。

- エンドユーザーのCashtray読み取りによって取引が成功した場合
  - レスポンス中の `attempt` と `transaction` にそれぞれ値が入ります
- 何らかの理由で取引が失敗した場合
  - レスポンス中の `attempt` にエラー内容が入り、 `transaction` には `NULL` が入ります
- まだCashtrayが読み取られていない場合
  - レスポンス中の `attempt` と `transaction` にそれぞれ `NULL` が入ります。Cashtrayの `expires_at` が現在時刻より前の場合は有効期限切れ状態です。

Cashtrayの取り得る全ての状態を擬似コードで記述すると以下のようになります。
```
if (attempt == null) {
  // 状態は未確定
  if (canceled_at != null) {
    // 無効化済み
  } else if (expires_at < now) {
    // 失効済み
  } else {
    // まだ有効で読み取られていない
  }
} else if (transaction != null) {
  // 取引成功確定。attempt で読み取ったユーザなどが分かる
} else {
  // 取引失敗確定。attempt で失敗理由などが分かる
}
```
```java
Request request = new GetCashtray(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // cashtrayId: CashtrayのID
);
```

---
`cashtrayId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
情報を取得するCashtrayのIDです。

---
成功したときは[CashtrayWithResult](#cashtray-with-result)クラスのインスタンスを返します
<a name="cancel-cashtray"></a>
#### Cashtrayを無効化する
Cashtrayを無効化します。

これにより、 `GetCashtray` のレスポンス中の `canceled_at` に無効化時点での現在時刻が入るようになります。
エンドユーザーが無効化されたQRコードを読み取ると `cashtray_already_canceled` エラーとなり、取引は失敗します。
```java
Request request = new CancelCashtray(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // cashtrayId: CashtrayのID
);
```

---
`cashtrayId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
無効化するCashtrayのIDです。

---
成功したときは[Cashtray](#cashtray)クラスのインスタンスを返します
<a name="update-cashtray"></a>
#### Cashtrayの情報を更新する
Cashtrayの内容を更新します。bodyパラメーターは全て省略可能で、指定したもののみ更新されます。
```java
Request request = new UpdateCashtray(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // cashtrayId: CashtrayのID
)
        .amount(8566.0)                           // 金額
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .expiresIn(4091);                         // 失効時間(秒)
```

---
`cashtrayId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
更新対象のCashtrayのIDです。

---
`amount`  
```json
{ "type": "number" }
```
マネー額です(任意項目)。
正の値を与えるとチャージになり、負の値を与えると支払いとなります。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
Cashtrayを読み取ったときに作られる取引の説明文です(最大200文字、任意項目)。
アプリや管理画面などの取引履歴に表示されます。

---
`expiresIn`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
Cashtrayが失効するまでの時間を秒で指定します(任意項目、デフォルト値は1800秒(30分))。

---
成功したときは[Cashtray](#cashtray)クラスのインスタンスを返します
### Customer
<a name="get-account"></a>
#### ウォレット情報を表示する
ウォレットを取得します。
```java
Request request = new GetAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
);
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレットを取得します。

---
成功したときは[AccountDetail](#account-detail)クラスのインスタンスを返します
<a name="update-account"></a>
#### ウォレット情報を更新する
ウォレットの状態を更新します。
以下の項目が変更できます。

- ウォレットの凍結/凍結解除の切り替え(エンドユーザー、店舗ユーザー共通)
- 店舗でチャージ可能かどうか(店舗ユーザのみ)

エンドユーザーのウォレット情報更新には UpdateCustomerAccount が使用できます。
```java
Request request = new UpdateAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .setSuspended(true)                       // ウォレットが凍結されているかどうか
        .status("pre-closed")                     // ウォレット状態
        .canTransferTopup(true);                  // チャージ可能かどうか
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

指定したウォレットIDのウォレットの状態を更新します。

---
`setSuspended`  
```json
{ "type": "boolean" }
```
ウォレットの凍結状態です。真にするとウォレットが凍結され、そのウォレットでは新規取引ができなくなります。偽にすると凍結解除されます。

---
`status`  
```json
{
  "type": "string",
  "enum": [ "active", "suspended", "pre-closed" ]
}
```
ウォレットの状態です。

---
`canTransferTopup`  
```json
{ "type": "boolean" }
```
店舗ユーザーがエンドユーザーにチャージ可能かどうかです。真にするとチャージ可能となり、偽にするとチャージ不可能となります。

---
成功したときは[AccountDetail](#account-detail)クラスのインスタンスを返します
<a name="delete-account"></a>
#### ウォレットを退会する
ウォレットを退会します。一度ウォレットを退会した後は、そのウォレットを再び利用可能な状態に戻すことは出来ません。
```java
Request request = new DeleteAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .cashback(true);                          // 返金有無
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

指定したウォレットIDのウォレットを退会します。

---
`cashback`  
```json
{ "type": "boolean" }
```
退会時の返金有無です。エンドユーザに返金を行う場合、真を指定して下さい。現在のマネー残高を全て現金で返金したものとして記録されます。

---
成功したときは[AccountDeleted](#account-deleted)クラスのインスタンスを返します
<a name="list-account-balances"></a>
#### エンドユーザーの残高内訳を表示する
エンドユーザーのウォレット毎の残高を有効期限別のリストとして取得します。
```java
Request request = new ListAccountBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(5419)                               // ページ番号
        .perPage(687)                             // 1ページ分の取引数
        .expiresAtFrom("2020-01-11T03:39:56.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2024-08-20T20:53:10.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
        .direction("asc");                        // 有効期限によるソート順序
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分のウォレット残高数です。デフォルト値は30です。

---
`expiresAtFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`expiresAtTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`direction`  
```json
{
  "type": "string",
  "enum": { "asc": "desc" }
}
```
有効期限によるソートの順序を指定します。デフォルト値はasc (昇順)です。

---
成功したときは[PaginatedAccountBalance](#paginated-account-balance)クラスのインスタンスを返します
<a name="list-account-expired-balances"></a>
#### エンドユーザーの失効済みの残高内訳を表示する
エンドユーザーのウォレット毎の失効済みの残高を有効期限別のリストとして取得します。
```java
Request request = new ListAccountExpiredBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(1280)                               // ページ番号
        .perPage(6724)                            // 1ページ分の取引数
        .expiresAtFrom("2016-09-29T10:11:54.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2023-06-19T00:00:20.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
        .direction("desc");                       // 有効期限によるソート順序
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分のウォレット残高数です。デフォルト値は30です。

---
`expiresAtFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`expiresAtTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`direction`  
```json
{
  "type": "string",
  "enum": { "asc": "desc" }
}
```
有効期限によるソートの順序を指定します。デフォルト値はdesc (降順)です。

---
成功したときは[PaginatedAccountBalance](#paginated-account-balance)クラスのインスタンスを返します
<a name="update-customer-account"></a>
#### エンドユーザーのウォレット情報を更新する
エンドユーザーのウォレットの状態を更新します。
```java
Request request = new UpdateCustomerAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .status("pre-closed")                     // ウォレット状態
        .accountName("RIokrSMcAe6DLpfhwjho9qAj035em2B0e1zQxL4LWrEkUrKUADYaUMS4V1xY0z6q9RliuqOBINm4Q77ByqizVQoe2X9mQJiEELVlycfdA0sn1Jp9ctBvXrxjspmUg2Jofbfd8lI7ca3oyQQIsUl3rCM2ZMpE4WDor4IADTHdTPsjhUsWbuhnbIUFlfvobOclFXKfvdQivs3hjtD1VYnThEQOLtlkRPIAeI3C1kLwoSJ0t0xwzgZ3SAsjp") // アカウント名
        .externalId("AuPQ")                       // 外部ID
        .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}"); // ウォレットに付加するメタデータ
```

---
`accountId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ウォレットIDです。

指定したウォレットIDのウォレットの状態を更新します。

---
`status`  
```json
{
  "type": "string",
  "enum": [ "active", "suspended", "pre-closed" ]
}
```
ウォレットの状態です。

---
`accountName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
変更するウォレット名です。

---
`externalId`  
```json
{
  "type": "string",
  "maxLength": 50
}
```
変更する外部IDです。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
ウォレットに付加するメタデータをJSON文字列で指定します。
指定できるJSON文字列には以下のような制約があります。
- フラットな構造のJSONを文字列化したものであること。
- keyは最大32文字の文字列(同じkeyを複数指定することはできません)
- valueには128文字以下の文字列が指定できます

更新時に指定した内容でメタデータ全体が置き換えられることに注意してください。
例えば、元々のメタデータが以下だったときに、

'{"key1":"foo","key2":"bar"}'

更新APIで以下のように更新するとします。

'{"key1":"baz"}'

このときkey1はfooからbazに更新され、key2に対するデータは消去されます。

---
成功したときは[AccountWithUser](#account-with-user)クラスのインスタンスを返します
<a name="get-customer-accounts"></a>
#### エンドユーザーのウォレット一覧を表示する
マネーを指定してエンドユーザーのウォレット一覧を取得します。
```java
Request request = new GetCustomerAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .page(5240)                               // ページ番号
        .perPage(4048)                            // 1ページ分のウォレット数
        .createdAtFrom("2018-08-31T22:45:10.000000+09:00") // ウォレット作成日によるフィルター(開始時点)
        .createdAtTo("2020-10-28T17:56:29.000000+09:00") // ウォレット作成日によるフィルター(終了時点)
        .setSuspended(false)                      // ウォレットが凍結状態かどうかでフィルターする
        .status("pre-closed")                     // ウォレット状態
        .externalId("1w6i")                       // 外部ID
        .tel("0957034591")                        // エンドユーザーの電話番号
        .email("j7jJ1Xazd0@M0QE.com");            // エンドユーザーのメールアドレス
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

一覧するウォレットのマネーを指定します。このパラメータは必須です。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分のウォレット数です。デフォルト値は30です。

---
`createdAtFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ウォレット作成日によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`createdAtTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ウォレット作成日によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`setSuspended`  
```json
{ "type": "boolean" }
```
このパラメータが指定されている場合、ウォレットの凍結状態で結果がフィルターされます。デフォルトでは未指定です。

---
`status`  
```json
{
  "type": "string",
  "enum": [ "active", "suspended", "pre-closed" ]
}
```
このパラメータが指定されている場合、ウォレットの状態で結果がフィルターされます。デフォルトでは未指定です。

---
`externalId`  
```json
{
  "type": "string",
  "maxLength": 50
}
```
外部IDでのフィルタリングです。デフォルトでは未指定です。

---
`tel`  
```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```
エンドユーザーの電話番号でのフィルタリングです。デフォルトでは未指定です。

---
`email`  
```json
{
  "type": "string",
  "format": "email"
}
```
エンドユーザーのメールアドレスでのフィルタリングです。デフォルトでは未指定です。

---
成功したときは[PaginatedAccountWithUsers](#paginated-account-with-users)クラスのインスタンスを返します
<a name="create-customer-account"></a>
#### 新規エンドユーザーをウォレットと共に追加する
指定したマネーのウォレットを作成し、同時にそのウォレットを保有するユーザも新規に作成します。
このAPIにより作成されたユーザは認証情報を持たないため、モバイルSDKやポケペイ標準アプリからはログインすることはできません。
Partner APIのみから操作可能な特殊なユーザになります。
システム全体をPartner APIのみで構成する場合にのみ使用してください。
```java
Request request = new CreateCustomerAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .userName("ポケペイ太郎")                       // ユーザー名
        .accountName("ポケペイ太郎のアカウント")              // アカウント名
        .externalId("8si7WktomTSIs3sss0bSZ1");    // 外部ID
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

これによって作成するウォレットのマネーを指定します。

---
`userName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
ウォレットと共に作成するユーザ名です。省略した場合は空文字となります。

---
`accountName`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
作成するウォレット名です。省略した場合は空文字となります。

---
`externalId`  
```json
{
  "type": "string",
  "maxLength": 50
}
```
PAPIクライアントシステムから利用するPokepayユーザーのIDです。デフォルトでは未指定です。

---
成功したときは[AccountWithUser](#account-with-user)クラスのインスタンスを返します
<a name="get-shop-accounts"></a>
#### 店舗ユーザーのウォレット一覧を表示する
マネーを指定して店舗ユーザーのウォレット一覧を取得します。
```java
Request request = new GetShopAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .page(9981)                               // ページ番号
        .perPage(929)                             // 1ページ分のウォレット数
        .createdAtFrom("2017-01-14T04:40:22.000000+09:00") // ウォレット作成日によるフィルター(開始時点)
        .createdAtTo("2021-12-30T22:08:58.000000+09:00") // ウォレット作成日によるフィルター(終了時点)
        .setSuspended(false);                     // ウォレットが凍結状態かどうかでフィルターする
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

一覧するウォレットのマネーを指定します。このパラメータは必須です。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分のウォレット数です。デフォルト値は30です。

---
`createdAtFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ウォレット作成日によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`createdAtTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
ウォレット作成日によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`setSuspended`  
```json
{ "type": "boolean" }
```
このパラメータが指定されている場合、ウォレットの凍結状態で結果がフィルターされます。デフォルトでは未指定です。

---
成功したときは[PaginatedAccountWithUsers](#paginated-account-with-users)クラスのインスタンスを返します
<a name="list-customer-transactions"></a>
#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListCustomerTransactions(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .senderCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 送金エンドユーザーID
        .receiverCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 受取エンドユーザーID
        .type("expire")                           // 取引種別
        .setModified(true)                        // キャンセル済みかどうか
        .from("2024-12-17T15:40:05.000000+09:00") // 開始日時
        .to("2020-05-28T15:37:47.000000+09:00")   // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。
フィルターとして使われ、指定したマネーでの取引のみ一覧に表示されます。

---
`senderCustomerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
送金ユーザーIDです。

フィルターとして使われ、指定された送金ユーザーでの取引のみ一覧に表示されます。

---
`receiverCustomerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
受取ユーザーIDです。

フィルターとして使われ、指定された受取ユーザーでの取引のみ一覧に表示されます。

---
`type`  
```json
{
  "type": "string",
  "enum": {
    "topup": "payment",
    "exchange": "transfer",
    "cashback": "expire"
  }
}
```
取引の種類でフィルターします。

以下の種類を指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)
2. payment
   エンドユーザーから店舗への送金取引(支払い)
3. exchange
   他マネーへの流出(outflow)/他マネーからの流入(inflow)
4. transfer
   個人間送金
5. cashback
   ウォレット退会時返金
6. expire
   ウォレット退会時失効

---
`setModified`  
```json
{ "type": "boolean" }
```
キャンセル済みかどうかを判定するフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
falseを指定するとキャンセルされていない取引のみ一覧に表示されます
何も指定しなければキャンセルの有無にかかわらず一覧に表示されます。

---
`from`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分の取引数です。

---
成功したときは[PaginatedTransaction](#paginated-transaction)クラスのインスタンスを返します
### Organization
### Shop
<a name="list-shops"></a>
#### 店舗一覧を取得する
```java
Request request = new ListShops()
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .name("oxスーパー三田店")                        // 店舗名
        .postalCode("6854789")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("0422-161289")                       // 店舗の電話番号
        .email("vRehYIZbMh@6MfS.com")             // 店舗のメールアドレス
        .externalId("8D")                         // 店舗の外部ID
        .withDisabled(true)                       // 無効な店舗を含める
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```

---
`organizationCode`  
```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```
このパラメータを渡すとその組織の店舗のみが返され、省略すると加盟店も含む店舗が返されます。


---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
このパラメータを渡すとそのマネーのウォレットを持つ店舗のみが返されます。


---
`name`  
```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```
このパラメータを渡すとその名前の店舗のみが返されます。


---
`postalCode`  
```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```
このパラメータを渡すとその郵便番号が登録された店舗のみが返されます。


---
`address`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
このパラメータを渡すとその住所が登録された店舗のみが返されます。


---
`tel`  
```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```
このパラメータを渡すとその電話番号が登録された店舗のみが返されます。


---
`email`  
```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```
このパラメータを渡すとそのメールアドレスが登録された店舗のみが返されます。


---
`externalId`  
```json
{
  "type": "string",
  "maxLength": 36
}
```
このパラメータを渡すとその外部IDが登録された店舗のみが返されます。


---
`withDisabled`  
```json
{ "type": "boolean" }
```
このパラメータを渡すと無効にされた店舗を含めて返されます。デフォルトでは無効にされた店舗は返されません。


---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分の取引数です。

---
成功したときは[PaginatedShops](#paginated-shops)クラスのインスタンスを返します
<a name="create-shop"></a>
#### 【廃止】新規店舗を追加する
新規店舗を追加します。このAPIは廃止予定です。以降は `CreateShopV2` を使用してください。
```java
Request request = new CreateShop(
    "oxスーパー三田店"                                   // shopName: 店舗名
)
        .shopPostalCode("0057170")                // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("0474-10124")                    // 店舗の電話番号
        .shopEmail("epxhXvfJrq@wCwz.com")         // 店舗のメールアドレス
        .shopExternalId("vGv5tXB9341AdQSvr2jD2CPBEg6qDX") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは[User](#user)クラスのインスタンスを返します
<a name="create-shop-v2"></a>
#### 新規店舗を追加する
```java
Request request = new CreateShopV2(
    "oxスーパー三田店"                                   // name: 店舗名
)
        .postalCode("8388169")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("05-038240")                         // 店舗の電話番号
        .email("tA7T3E2nC8@JZcq.com")             // 店舗のメールアドレス
        .externalId("IcqZB2nkhw5Vunnh29qWQZz")    // 店舗の外部ID
        .organizationCode("ox-supermarket")       // 組織コード
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}); // 店舗でチャージ可能にするマネーIDの配列
```

---
`name`  
```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```
店舗名です。

同一組織内に同名の店舗があった場合は`name_conflict`エラーが返ります。

---
`privateMoneyIds`  
```json
{
  "type": "array",
  "minItems": 1,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```
店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
このパラメータを省略したときは、店舗が所属する組織が発行または加盟している全てのマネーのウォレットができます。

---
`canTopupPrivateMoneyIds`  
```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```
店舗でチャージ可能にするマネーIDの配列を指定します。

このパラメータは発行体のみが指定でき、自身が発行しているマネーのみを指定できます。加盟店が他発行体のマネーに加盟している場合でも、そのチャージ可否を変更することはできません。
省略したときは対象店舗のその発行体の全てのマネーのアカウントがチャージ不可となります。

---
成功したときは[ShopWithAccounts](#shop-with-accounts)クラスのインスタンスを返します
<a name="get-shop"></a>
#### 店舗情報を表示する
店舗情報を表示します。

権限に関わらず自組織の店舗情報は表示可能です。それに加え、発行体は自組織の発行しているマネーの加盟店組織の店舗情報を表示できます。
```java
Request request = new GetShop(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 店舗ユーザーID
);
```
成功したときは[ShopWithAccounts](#shop-with-accounts)クラスのインスタンスを返します
<a name="update-shop"></a>
#### 店舗情報を更新する
店舗情報を更新します。bodyパラメーターは全て省略可能で、指定したもののみ更新されます。
```java
Request request = new UpdateShop(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 店舗ユーザーID
)
        .name("oxスーパー三田店")                        // 店舗名
        .postalCode("4188912")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("06-3471052")                        // 店舗の電話番号
        .email("B61vcOZ1uN@BAdr.com")             // 店舗のメールアドレス
        .externalId("6")                          // 店舗の外部ID
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗でチャージ可能にするマネーIDの配列
        .status("active");                        // 店舗の状態
```

---
`name`  
```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```
店舗名です。

同一組織内に同名の店舗があった場合は`shop_name_conflict`エラーが返ります。

---
`postalCode`  
```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```
店舗住所の郵便番号(7桁の数字)です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

---
`tel`  
```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```
店舗の電話番号です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

---
`email`  
```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```
店舗の連絡先メールアドレスです。明示的に空の値を設定するにはNULLを指定します。

---
`externalId`  
```json
{
  "type": "string",
  "maxLength": 36
}
```
店舗の外部IDです(最大36文字)。明示的に空の値を設定するにはNULLを指定します。

---
`privateMoneyIds`  
```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```
店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
店舗が既にウォレットを持っている場合に、ここでそのウォレットのマネーIDを指定しないで更新すると、そのマネーのウォレットは凍結(無効化)されます。

---
`canTopupPrivateMoneyIds`  
```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```
店舗でチャージ可能にするマネーIDの配列を指定します。

このパラメータは発行体のみが指定でき、発行しているマネーのみを指定できます。加盟店が他発行体のマネーに加盟している場合でも、そのチャージ可否を変更することはできません。
省略したときは対象店舗のその発行体の全てのマネーのアカウントがチャージ不可となります。

---
`status`  
```json
{
  "type": "string",
  "enum": { "active": "disabled" }
}
```
店舗の状態です。activeを指定すると有効となり、disabledを指定するとリスト表示から除外されます。

---
成功したときは[ShopWithAccounts](#shop-with-accounts)クラスのインスタンスを返します
### Account
<a name="list-user-accounts"></a>
#### エンドユーザー、店舗ユーザーのウォレット一覧を表示する
ユーザーIDを指定してそのユーザーのウォレット一覧を取得します。
```java
Request request = new ListUserAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // userId: ユーザーID
)
        .page(9709)                               // ページ番号
        .perPage(2279);                           // 1ページ分の取引数
```

---
`userId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ユーザーIDです。

指定したユーザーIDのウォレット一覧を取得します。パートナーキーと紐づく組織が発行しているマネーのウォレットのみが表示されます。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ当たりのウォレット数です。デフォルト値は50です。

---
成功したときは[PaginatedAccountDetails](#paginated-account-details)クラスのインスタンスを返します
<a name="create-user-account"></a>
#### エンドユーザーのウォレットを作成する
既存のエンドユーザーに対して、指定したマネーのウォレットを新規作成します
```java
Request request = new CreateUserAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // userId: ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .name("zbfqKlnsG40wZo0RT90mTv9ime")       // ウォレット名
        .externalId("iY62Bc0n5yxxXvK")            // 外部ID
        .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}"); // ウォレットに付加するメタデータ
```

---
`userId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ユーザーIDです。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

作成するウォレットのマネーを指定します。このパラメータは必須です。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
ウォレットに付加するメタデータをJSON文字列で指定します。
指定できるJSON文字列には以下のような制約があります。
- フラットな構造のJSONを文字列化したものであること。
- keyは最大32文字の文字列(同じkeyを複数指定することはできません)
- valueには128文字以下の文字列が指定できます

---
成功したときは[AccountDetail](#account-detail)クラスのインスタンスを返します
### Private Money
<a name="get-private-moneys"></a>
#### マネー一覧を取得する
マネーの一覧を取得します。
パートナーキーの管理者が発行体組織に属している場合、自組織が加盟または発行しているマネーの一覧を返します。また、`organization_code`として決済加盟店の組織コードを指定した場合、発行マネーのうち、その決済加盟店組織が加盟しているマネーの一覧を返します。
パートナーキーの管理者が決済加盟店組織に属している場合は、自組織が加盟しているマネーの一覧を返します。
```java
Request request = new GetPrivateMoneys()
        .organizationCode("ox-supermarket")       // 組織コード
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数
```

---
`organizationCode`  
```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```
パートナーキーの管理者が発行体組織に属している場合、発行マネーのうち、この組織コードで指定した決済加盟店組織が加盟しているマネーの一覧を返します。決済加盟店組織の管理者は自組織以外を指定することはできません。

---
成功したときは[PaginatedPrivateMoneys](#paginated-private-moneys)クラスのインスタンスを返します
<a name="get-private-money-organization-summaries"></a>
#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2022-09-18T15:04:46.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2018-12-07T10:58:12.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
`from`と`to`は同時に指定する必要があります。

成功したときは[PaginatedPrivateMoneyOrganizationSummaries](#paginated-private-money-organization-summaries)クラスのインスタンスを返します
<a name="get-private-money-summary"></a>
#### 取引サマリを取得する
```java
Request request = new GetPrivateMoneySummary(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2023-02-25T18:42:58.000000+09:00") // 開始日時
        .to("2016-04-20T13:30:00.000000+09:00");  // 終了日時
```
成功したときは[PrivateMoneySummary](#private-money-summary)クラスのインスタンスを返します
### Bulk
<a name="bulk-create-transaction"></a>
#### CSVファイル一括取引
CSVファイルから一括取引をします。
```java
Request request = new BulkCreateTransaction(
    "c2v5NvERR1ovUoSMxuwois43hKOtAoX7",           // name: 一括取引タスク名
    "opuae7lO",                                   // content: 取引する情報のCSV
    "58Ae6hTnrFSjbB1hiRjTNSU46DKPvyktKcWC"        // requestId: リクエストID
)
        .description("Km4tG2FzeWXxPN6RiMVhZmmGj0TMjPFLM0DLdwVX1nfPZtzGunVJbtCnsdFVcjFxpkr7nBijaa4uqZKlbpHQT4mZQDB6u1kMJt8otXLMwiqJK6MisPTXvJ9APW") // 一括取引の説明
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // マネーID
```

---
`name`  
```json
{
  "type": "string",
  "maxLength": 32
}
```
一括取引タスクの管理用の名前です。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 128
}
```
一括取引タスクの管理用の説明文です。

---
`content`  
```json
{ "type": "string" }
```
一括取引する情報を書いたCSVの文字列です。
1行目はヘッダ行で、2行目以降の各行にカンマ区切りの取引データを含みます。
カラムは以下の7つです。任意のカラムには空文字を指定します。

- `type`: 取引種別
  - 必須。'topup' または 'payment'
- `sender_id`: 送金ユーザーID
  - 必須。UUID
- `receiver_id`: 受取ユーザーID
  - 必須。UUID
- `private_money_id`: マネーID
  - 必須。UUID
- `money_amount`: マネー額
  - 任意。ただし `point_amount` といずれかが必須。0以上の数字
- `point_amount`: ポイント額
  - 任意。ただし `money_amount` といずれかが必須。0以上の数字
- `description`: 取引の説明文
  - 任意。200文字以内。取引履歴に表示される文章
- `bear_account_id`: ポイント負担ウォレットID
  - `point_amount` があるときは必須。UUID
- `point_expires_at`: ポイントの有効期限
  - 任意。指定がないときはマネーに設定された有効期限を適用

---
`requestId`  
```json
{
  "type": "string",
  "minLength": 36,
  "maxLength": 36
}
```
重複したリクエストを判断するためのユニークID。ランダムな36字の文字列を生成して渡してください。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。 マネーを指定します。

---
成功したときは[BulkTransaction](#bulk-transaction)クラスのインスタンスを返します
### Event
<a name="create-external-transaction"></a>
#### ポケペイ外部取引を作成する
ポケペイ外部取引を作成します。

ポケペイ外の現金決済やクレジットカード決済に対してポケペイのポイントを付けたいというときに使用します。

```java
JsonObject items = new JsonObject();
items.addProperty("jan_code", "abc");
items.addProperty("name", "name1");
items.addProperty("unit_price", 100);
items.addProperty("price", 100);
items.addProperty("is_discounted", false);
items.addProperty("other", "{}");
Request request = new CreateExternalTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    1277                                          // amount: 取引額
)
        .description("たい焼き(小倉)")                  // 取引説明文
        .metadata("{\"key\":\"value\"}")          // ポケペイ外部取引メタデータ
        .products(new Object[]{items})            // 商品情報データ
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID
```

---
`shopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
店舗IDです。

ポケペイ外部取引が行なう店舗を指定します。

---
`customerId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
エンドユーザーIDです。

エンドユーザーを指定します。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

マネーを指定します。

---
`amount`  
```json
{
  "type": "integer",
  "minimum": 0
}
```
取引金額です。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
`metadata`  
```json
{
  "type": "string",
  "format": "json"
}
```
ポケペイ外部取引作成時に指定され、取引と紐付けられるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSONで指定します。

---
`products`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
一つの取引に含まれる商品情報データです。
以下の内容からなるJSONオブジェクトの配列で指定します。

- `jan_code`: JANコード。64字以下の文字列
- `name`: 商品名。256字以下の文字列
- `unit_price`: 商品単価。0以上の数値
- `price`: 全体の金額(例: 商品単価 × 個数)。0以上の数値
- `is_discounted`: 賞味期限が近いなどの理由で商品が値引きされているかどうかのフラグ。boolean
- `other`: その他商品に関する情報。JSONオブジェクトで指定します。

---
`requestId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

---
成功したときは[ExternalTransaction](#external-transaction)クラスのインスタンスを返します
<a name="refund-external-transaction"></a>
#### ポケペイ外部取引をキャンセルする
取引IDを指定して取引をキャンセルします。

発行体の管理者は自組織の直営店、または発行しているマネーの決済加盟店組織での取引をキャンセルできます。
キャンセル対象のポケペイ外部取引に付随するポイント還元キャンペーンも取り消されます。

取引をキャンセルできるのは1回きりです。既にキャンセルされた取引を重ねてキャンセルしようとすると `transaction_already_refunded (422)` エラーが返ります。
```java
Request request = new RefundExternalTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // eventId: 取引ID
)
        .description("返品対応のため");                  // 取引履歴に表示する返金事由
```
成功したときは[ExternalTransaction](#external-transaction)クラスのインスタンスを返します
### Campaign
<a name="create-campaign"></a>
#### ポイント付与キャンペーンを作る
ポイント付与キャンペーンを作成します。

```java
JsonObject items = new JsonObject();
items.addProperty("point_amount", 5);
items.addProperty("point_amount_unit", "percent");
items.addProperty("subject_more_than_or_equal", 1000);
items.addProperty("subject_less_than", 5000);
JsonObject items2 = new JsonObject();
items2.addProperty("point_amount", 5);
items2.addProperty("point_amount_unit", "percent");
items2.addProperty("subject_more_than_or_equal", 1000);
items2.addProperty("subject_less_than", 5000);
JsonObject items3 = new JsonObject();
items3.addProperty("point_amount", 5);
items3.addProperty("point_amount_unit", "percent");
items3.addProperty("product_code", "4912345678904");
items3.addProperty("is_multiply_by_count", true);
items3.addProperty("required_count", 2);
JsonObject items4 = new JsonObject();
items4.addProperty("point_amount", 5);
items4.addProperty("point_amount_unit", "percent");
items4.addProperty("product_code", "4912345678904");
items4.addProperty("is_multiply_by_count", true);
items4.addProperty("required_count", 2);
JsonObject items5 = new JsonObject();
items5.addProperty("point_amount", 5);
items5.addProperty("point_amount_unit", "percent");
items5.addProperty("product_code", "4912345678904");
items5.addProperty("is_multiply_by_count", true);
items5.addProperty("required_count", 2);
JsonObject items6 = new JsonObject();
items6.addProperty("from", "12:00");
items6.addProperty("to", "23:59");
JsonObject items7 = new JsonObject();
items7.addProperty("from", "12:00");
items7.addProperty("to", "23:59");
JsonObject items8 = new JsonObject();
items8.addProperty("from", "12:00");
items8.addProperty("to", "23:59");
JsonObject applicable_account_metadata = new JsonObject();
applicable_account_metadata.addProperty("key", "sex");
applicable_account_metadata.addProperty("value", "male");
Request request = new CreateCampaign(
    "0nkI2cpiZrwht02dhTsSxNXBuhLAxPxLgPF7PH9jsPo3qRbXC06hH5q5N6rSqlhclxbbI1pwNVNkX1wbtHq7h4XHkBbxR0RnLtirGJS2N5S6EEO5Bp0TaBrmndiCNxXXwjFaRAeTxfe0YQCHzm8OG8zcqkOxIGcWZjjM6j3edDcpZu9iiEwcokneeQ36NR2IjhyB4vKQ7cGlo7SrCjimdlgwn9qvauQ2kDhj5HL", // name: キャンペーン名
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    "2016-01-07T20:06:22.000000+09:00",           // startsAt: キャンペーン開始日時
    "2024-01-18T05:58:41.000000+09:00",           // endsAt: キャンペーン終了日時
    3795,                                         // priority: キャンペーンの適用優先度
    "payment"                                     // event: イベント種別
)
        .bearPointShopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント負担先店舗ID
        .description("TCm30yK3y8WItCe9VYgMydEalG76qE4T1vOrKA4IwgS5AgijWRyxneekV8cIDT0hnm8h8evW68NKpdk") // キャンペーンの説明文
        .status("disabled")                       // キャンペーン作成時の状態
        .pointExpiresAt("2020-08-19T17:02:48.000000+09:00") // ポイント有効期限(絶対日時指定)
        .pointExpiresInDays(1620)                 // ポイント有効期限(相対日数指定)
        .setExclusive(false)                      // キャンペーンの重複設定
        .subject("money")                         // ポイント付与の対象金額の種別
        .amountBasedPointRules(new Object[]{items,items2}) // 取引金額ベースのポイント付与ルール
        .productBasedPointRules(new Object[]{items3,items4,items5}) // 商品情報ベースのポイント付与ルール
        .applicableDaysOfWeek(new Integer[]{1,2,1}) // キャンペーンを適用する曜日 (複数指定)
        .applicableTimeRanges(new Object[]{items6,items7,items8}) // キャンペーンを適用する時間帯 (複数指定)
        .applicableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象となる店舗IDのリスト
        .minimumNumberForCombinationPurchase(8021) // 複数種類の商品を同時購入するときの商品種別数の下限
        .existInEachProductGroups(true)           // 複数の商品グループにつき1種類以上の商品購入によって発火するキャンペーンの指定フラグ
        .maxPointAmount(1292)                     // キャンペーンによって付与されるポイントの上限
        .maxTotalPointAmount(7665)                // キャンペーンによって付与されるの1人当たりの累計ポイントの上限
        .destPrivateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント付与先となるマネーID
        .applicableAccountMetadata(applicable_account_metadata); // ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
```

---
`name`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
キャンペーン名です(必須項目)。

ポイント付与によってできるチャージ取引の説明文に転記されます。取引説明文はエンドユーザーからも確認できます。

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
キャンペーン対象のマネーのIDです(必須項目)。

---
`startsAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン開始日時です(必須項目)。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

---
`endsAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン終了日時です(必須項目)。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

---
`priority`  
```json
{ "type": "integer" }
```
キャンペーンの適用優先度です。

優先度が大きいものから順に適用判定されていきます。
キャンペーン期間が重なっている同一の優先度のキャンペーンが存在するとcampaign_period_overlapsエラー(422)になります。

---
`event`  
```json
{
  "type": "string",
  "enum": [ "topup", "payment", "external-transaction" ]
}
```
キャンペーンのトリガーとなるイベントの種類を指定します(必須項目)。

以下のいずれかを指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)
2. payment
   エンドユーザーから店舗への送金取引(支払い)
3. external-transaction
   ポケペイ外の取引(現金決済など)

---
`bearPointShopId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
ポイントを負担する店舗のIDです。デフォルトではマネー発行体の本店が設定されます。
ポイント負担先店舗は後から更新することはできません。

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
キャンペーンの内容を記載します。管理画面などでキャンペーンを管理するための説明文になります。

---
`status`  
```json
{
  "type": "string",
  "enum": { "enabled": "disabled" }
}
```
キャンペーン作成時の状態を指定します。デフォルトではenabledです。

以下のいずれかを指定できます。

1. enabled
   有効
2. disabled
   無効

---
`pointExpiresAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーンによって付与されるポイントの有効期限を絶対日時で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`pointExpiresInDays`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与されるポイントの有効期限を相対日数で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`setExclusive`  
```json
{ "type": "boolean" }
```
キャンペーンの重ね掛けを行うかどうかのフラグです。

これにtrueを指定すると他のキャンペーンと同時適用されません。デフォルト値はtrueです。
falseを指定すると次の優先度の重ね掛け可能なキャンペーンの適用判定に進みます。

---
`subject`  
```json
{
  "type": "string",
  "enum": { "money": "all" }
}
```
ポイント付与額を計算する対象となる金額の種類を指定します。デフォルト値はallです。
eventとしてexternal-transactionを指定した場合はポイントとマネーの区別がないためsubjectの指定に関わらず常にallとなります。

以下のいずれかを指定できます。

1. money
moneyを指定すると決済額の中で「マネー」を使って支払った額を対象にします

2. all
all を指定すると決済額全体を対象にします (「ポイント」での取引額を含む)
注意: event を topup にしたときはポイントの付与に対しても適用されます

---
`amountBasedPointRules`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
金額をベースとしてポイント付与を行うルールを指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
各ルールは一つのみ適用され、条件に重複があった場合は先に記載されたものが優先されます。

例:
```javascript
[
  // 1000円以上、5000円未満の決済には 5％
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 1000,
    "subject_less_than": 5000
  },
  // 5000円以上の決済には 10%
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 5000
  },
]
```

---
`productBasedPointRules`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
商品情報をベースとしてポイント付与を行うルールを指定します。
ルールは商品ごとに設定可能で、ルールの配列として指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
event が payment か external-transaction の時のみ有効です。
各ルールの順序は問わず、適用可能なものは全て適用されます。
一つの決済の中で複数の商品がキャンペーン適用可能な場合はそれぞれの商品についてのルールが適用され、ポイント付与額はその合算になります。

例:
```javascript
[
  // 対象商品の購入額から5%ポイント付与。複数購入時は単価の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
  },
  // 対象商品の購入額から5%ポイント付与。複数購入時は購入総額の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
    "is_multiply_by_count": true,
  },
  // 対象商品を2つ以上購入したら500ポイント付与(固定額付与)
  {
    "point_amount": 500,
    "point_amount_unit": "absolute",
    "product_code": "4912345678904",
    "required_count": 2
  },
  // 書籍は10%ポイント付与
  // ※ISBNの形式はレジがポケペイに送信する形式に準じます
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-%",
  },
  // 一部の出版社の書籍は10%ポイント付与
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-4-01-%", // 旺文社
  }
]
```

---
`minimumNumberForCombinationPurchase`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
複数種別の商品を同時購入したとき、同時購入キャンペーンの対象となる商品種別数の下限です。デフォルトでは未指定で、指定する場合は1以上の整数を指定します。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定されている必要があります。
例えば、A商品とB商品とC商品のうち、キャンペーンの発火のために2商品以上が同時購入される必要があるときは 2 を指定します。

例1: 商品A, Bが同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード"
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード"
    }
  ]
}
```

例2: 商品A, Bが3個ずつ以上同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード",
      "required_count": 3
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード",
      "required_count": 3
    }
  ]
}
```

例2: 商品A, B, Cのうち2商品以上が同時購入されたときに総額の10%ポイントが付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Aの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Bの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Cの商品コード",
      "is_multiply_by_count": true,
    }
  ]
}
```

---
`existInEachProductGroups`  
```json
{ "type": "boolean" }
```
複数の商品グループの各グループにつき1種類以上の商品が購入されることによって発火するキャンペーンであるときに真を指定します。デフォルトは偽です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定され、さらにその中でgroup_idが指定されている必要があります。group_idは正の整数です。
exist_in_each_product_groupsが指定されているにも関わらず商品毎のルールでgroup_idが指定されていないものが含まれている場合はinvalid_parametersエラー(missing group_id, エラーコード400)が返ります。

例えば、商品グループA(商品コードa1, a2)、商品グループB(商品コードb1, b2)の2つの商品グループがあるとします。
このとき、各商品グループからそれぞれ少なくとも1種類以上の商品が購入されることにより発火するキャンペーンに対するリクエストパラメータは以下のようなものになります。

```javascript
{
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になります。つまり100 + 200=300がポイント付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

ポイント付与値を各商品毎のルールの総和ではなく固定値にしたい場合には、max_point_amountを指定します。
例えば以下のようなリクエストパラメータ指定の場合を考えます。

```javascript
{
  max_point_amount: 100,
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になりますが、付与値の上限が100ポイントになります。つまり100 + 200=300と計算されますが上限額の100ポイントが実際の付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600ですが上限額の100がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

---
`maxPointAmount`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与されるポイントの上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、amount_based_point_rules や product_based_point_rules によって計算されるポイント付与値がmax_point_amountを越えている場合、max_point_amountの値がポイント付与値となり、越えていない場合はその値がポイント付与値となります。

---
`maxTotalPointAmount`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与される1人当たりの累計ポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、各ユーザに対してそのキャンペーンによって過去付与されたポイントの累積値が記録されるようになります。
累積ポイント数がmax_total_point_amountを超えない限りにおいてキャンペーンで算出されたポイントが付与されます。

---
`destPrivateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
キャンペーンを駆動するイベントのマネーとは「別のマネー」に対してポイントを付けたいときに、そのマネーIDを指定します。

ポイント付与先のマネーはキャンペーンを駆動するイベントのマネーと同一発行体が発行しているものに限ります。その他のマネーIDが指定された場合は private_money_not_found (422) が返ります。
エンドユーザー、店舗、ポイント負担先店舗はポイント付与先マネーのウォレットを持っている必要があります。持っていない場合はポイントは付きません。
元のイベントのマネーと異なる複数のマネーに対して同時にポイントを付与することはできません。重複可能に設定されている複数のキャンペーンで別々のポイント付与先マネーを指定した場合は最も優先度の高いものが処理され、残りは無視されます。
キャンペーンのポイント付与先マネーは後から更新することはできません。
デフォルトではポイント付与先はキャンペーンを駆動するイベントのマネー(private_money_idで指定したマネー)になります。

別マネーに対するポイント付与は別のtransactionとなります。 RefundTransaction で元のイベントをキャンセルしたときはポイント付与のtransactionもキャンセルされ、逆にポイント付与のtransactionをキャンセルしたときは連動して元のイベントがキャンセルされます。

---
`applicableAccountMetadata`  
```json
{ "type": "object" }
```
ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
ウォレットのメタデータはCreateUserAccountやUpdateCustomerAccountで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引が行なわれたウォレットのメタデータに住所として東京が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo"
}
```

例2: 取引が行なわれたウォレットのメタデータに住所として東京以外が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo",
  "test": "not-equal"
}
```

---
成功したときは[Campaign](#campaign)クラスのインスタンスを返します
<a name="list-campaigns"></a>
#### キャンペーン一覧を取得する
マネーIDを指定してキャンペーンを取得します。
発行体の組織マネージャ権限で、自組織が発行するマネーのキャンペーンについてのみ閲覧可能です。
閲覧権限がない場合は unpermitted_admin_user エラー(422)が返ります。
```java
Request request = new ListCampaigns(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .setOngoing(false)                        // 現在適用可能なキャンペーンかどうか
        .availableFrom("2017-09-20T00:55:25.000000+09:00") // 指定された日時以降に適用可能期間が含まれているか
        .availableTo("2022-12-12T17:57:42.000000+09:00") // 指定された日時以前に適用可能期間が含まれているか
        .page(1)                                  // ページ番号
        .perPage(20);                             // 1ページ分の取得数
```

---
`privateMoneyId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
マネーIDです。

フィルターとして使われ、指定したマネーでのキャンペーンのみ一覧に表示されます。

---
`setOngoing`  
```json
{ "type": "boolean" }
```
有効化されており、現在キャンペーン期間内にあるキャンペーンをフィルターするために使われます。
真であれば適用可能なもののみを抽出し、偽であれば適用不可なもののみを抽出します。
デフォルトでは未指定(フィルターなし)です。

---
`availableFrom`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン終了日時が指定された日時以降であるキャンペーンをフィルターするために使われます。
デフォルトでは未指定(フィルターなし)です。

---
`availableTo`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン開始日時が指定された日時以前であるキャンペーンをフィルターするために使われます。
デフォルトでは未指定(フィルターなし)です。

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 50
}
```
1ページ分の取得数です。デフォルトでは 20 になっています。

---
成功したときは[PaginatedCampaigns](#paginated-campaigns)クラスのインスタンスを返します
<a name="get-campaign"></a>
#### キャンペーンを取得する
IDを指定してキャンペーンを取得します。
発行体の組織マネージャ権限で、自組織が発行するマネーのキャンペーンについてのみ閲覧可能です。
閲覧権限がない場合は unpermitted_admin_user エラー(422)が返ります。
```java
Request request = new GetCampaign(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // campaignId: キャンペーンID
);
```

---
`campaignId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
キャンペーンIDです。

指定したIDのキャンペーンを取得します。存在しないIDを指定した場合は404エラー(NotFound)が返ります。

---
成功したときは[Campaign](#campaign)クラスのインスタンスを返します
<a name="update-campaign"></a>
#### ポイント付与キャンペーンを更新する
ポイント付与キャンペーンを更新します。

```java
JsonObject items = new JsonObject();
items.addProperty("point_amount", 5);
items.addProperty("point_amount_unit", "percent");
items.addProperty("subject_more_than_or_equal", 1000);
items.addProperty("subject_less_than", 5000);
JsonObject items2 = new JsonObject();
items2.addProperty("point_amount", 5);
items2.addProperty("point_amount_unit", "percent");
items2.addProperty("subject_more_than_or_equal", 1000);
items2.addProperty("subject_less_than", 5000);
JsonObject items3 = new JsonObject();
items3.addProperty("point_amount", 5);
items3.addProperty("point_amount_unit", "percent");
items3.addProperty("subject_more_than_or_equal", 1000);
items3.addProperty("subject_less_than", 5000);
JsonObject items4 = new JsonObject();
items4.addProperty("point_amount", 5);
items4.addProperty("point_amount_unit", "percent");
items4.addProperty("product_code", "4912345678904");
items4.addProperty("is_multiply_by_count", true);
items4.addProperty("required_count", 2);
JsonObject items5 = new JsonObject();
items5.addProperty("from", "12:00");
items5.addProperty("to", "23:59");
JsonObject applicable_account_metadata = new JsonObject();
applicable_account_metadata.addProperty("key", "sex");
applicable_account_metadata.addProperty("value", "male");
Request request = new UpdateCampaign(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // campaignId: キャンペーンID
)
        .name("NTXOxFwqhkpZVaDhpFPp5bfKVt9DPYJAVzV6vyI6ywfpyKilj5zg8pn57kF0DYbPLXjuwrpeD0A9IDYP4sAiFNwaac9r9GBqh0SVIl9M1spjv4mKXU1rVLf6U0K44BovHKqYzk7GBG1DZKj2tBRFerhSuL22gGga7pF0nmLMfnIYTQdqHJZ8WnDHEVfpIBtEOMP2U7IkYygmkkDxd3MzpkzvPsPo2vcZvKaf470D") // キャンペーン名
        .startsAt("2017-08-21T07:17:22.000000+09:00") // キャンペーン開始日時
        .endsAt("2019-07-11T06:41:51.000000+09:00") // キャンペーン終了日時
        .priority(2974)                           // キャンペーンの適用優先度
        .event("topup")                           // イベント種別
        .description("I6SeAOBDBgRAgmjxZGGCqaBwJ9iXjXSEfbkdsvlfnd1NOUEcUOGTeYua5DveJsn8lhIUcgIkY0oNU4ZtZZObHmdr0N6vylnlZRhGDMxuj8A7eDOAWeoDpeF6vcSyg1N9plx7jjHK1E1PUQiuVz") // キャンペーンの説明文
        .status("enabled")                        // キャンペーン作成時の状態
        .pointExpiresAt("2021-01-26T19:18:50.000000+09:00") // ポイント有効期限(絶対日時指定)
        .pointExpiresInDays(8789)                 // ポイント有効期限(相対日数指定)
        .setExclusive(true)                       // キャンペーンの重複設定
        .subject("money")                         // ポイント付与の対象金額の種別
        .amountBasedPointRules(new Object[]{items,items2,items3}) // 取引金額ベースのポイント付与ルール
        .productBasedPointRules(new Object[]{items4}) // 商品情報ベースのポイント付与ルール
        .applicableDaysOfWeek(new Integer[]{2,6}) // キャンペーンを適用する曜日 (複数指定)
        .applicableTimeRanges(new Object[]{items5}) // キャンペーンを適用する時間帯 (複数指定)
        .applicableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象となる店舗IDのリスト
        .minimumNumberForCombinationPurchase(2650) // 複数種類の商品を同時購入するときの商品種別数の下限
        .existInEachProductGroups(true)           // 複数の商品グループにつき1種類以上の商品購入によって発火するキャンペーンの指定フラグ
        .maxPointAmount(9815)                     // キャンペーンによって付与されるポイントの上限
        .maxTotalPointAmount(7119)                // キャンペーンによって付与されるの1人当たりの累計ポイントの上限
        .applicableAccountMetadata(applicable_account_metadata); // ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
```

---
`campaignId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
キャンペーンIDです。

指定したIDのキャンペーンを更新します。存在しないIDを指定した場合は404エラー(NotFound)が返ります。

---
`name`  
```json
{
  "type": "string",
  "maxLength": 256
}
```
キャンペーン名です。

ポイント付与によってできるチャージ取引の説明文に転記されます。取引説明文はエンドユーザーからも確認できます。

---
`startsAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン開始日時です。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

---
`endsAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーン終了日時です。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

---
`priority`  
```json
{ "type": "integer" }
```
キャンペーンの適用優先度です。

優先度が大きいものから順に適用判定されていきます。
キャンペーン期間が重なっている同一の優先度のキャンペーンが存在するとcampaign_period_overlapsエラー(422)になります。

---
`event`  
```json
{
  "type": "string",
  "enum": [ "topup", "payment", "external-transaction" ]
}
```
キャンペーンのトリガーとなるイベントの種類を指定します。

以下のいずれかを指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)
2. payment
   エンドユーザーから店舗への送金取引(支払い)
3. external-transaction
   ポケペイ外の取引(現金決済など)

---
`description`  
```json
{
  "type": "string",
  "maxLength": 200
}
```
キャンペーンの内容を記載します。管理画面などでキャンペーンを管理するための説明文になります。

---
`status`  
```json
{
  "type": "string",
  "enum": { "enabled": "disabled" }
}
```
キャンペーン作成時の状態を指定します。デフォルトではenabledです。

以下のいずれかを指定できます。

1. enabled
   有効
2. disabled
   無効

---
`pointExpiresAt`  
```json
{
  "type": "string",
  "format": "date-time"
}
```
キャンペーンによって付与されるポイントの有効期限を絶対日時で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`pointExpiresInDays`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与されるポイントの有効期限を相対日数で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`setExclusive`  
```json
{ "type": "boolean" }
```
キャンペーンの重ね掛けを行うかどうかのフラグです。

これにtrueを指定すると他のキャンペーンと同時適用されません。デフォルト値はtrueです。
falseを指定すると次の優先度の重ね掛け可能なキャンペーンの適用判定に進みます。

---
`subject`  
```json
{
  "type": "string",
  "enum": { "money": "all" }
}
```
ポイント付与額を計算する対象となる金額の種類を指定します。デフォルト値はallです。
eventとしてexternal-transactionを指定した場合はポイントとマネーの区別がないためsubjectの指定に関わらず常にallとなります。

以下のいずれかを指定できます。

1. money
moneyを指定すると決済額の中で「マネー」を使って支払った額を対象にします

2. all
all を指定すると決済額全体を対象にします (「ポイント」での取引額を含む)
注意: event を topup にしたときはポイントの付与に対しても適用されます

---
`amountBasedPointRules`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
金額をベースとしてポイント付与を行うルールを指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
各ルールは一つのみ適用され、条件に重複があった場合は先に記載されたものが優先されます。

例:
```javascript
[
  // 1000円以上、5000円未満の決済には 5％
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 1000,
    "subject_less_than": 5000
  },
  // 5000円以上の決済には 10%
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 5000
  },
]
```

---
`productBasedPointRules`  
```json
{
  "type": "array",
  "items": { "type": "object" }
}
```
商品情報をベースとしてポイント付与を行うルールを指定します。
ルールは商品ごとに設定可能で、ルールの配列として指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
event が payment か external-transaction の時のみ有効です。
各ルールの順序は問わず、適用可能なものは全て適用されます。
一つの決済の中で複数の商品がキャンペーン適用可能な場合はそれぞれの商品についてのルールが適用され、ポイント付与額はその合算になります。

例:
```javascript
[
  // 対象商品の購入額から5%ポイント付与。複数購入時は単価の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
  },
  // 対象商品の購入額から5%ポイント付与。複数購入時は購入総額の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
    "is_multiply_by_count": true,
  },
  // 対象商品を2つ以上購入したら500ポイント付与(固定額付与)
  {
    "point_amount": 500,
    "point_amount_unit": "absolute",
    "product_code": "4912345678904",
    "required_count": 2
  },
  // 書籍は10%ポイント付与
  // ※ISBNの形式はレジがポケペイに送信する形式に準じます
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-%",
  },
  // 一部の出版社の書籍は10%ポイント付与
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-4-01-%", // 旺文社
  }
]
```

---
`minimumNumberForCombinationPurchase`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
複数種別の商品を同時購入したとき、同時購入キャンペーンの対象となる商品種別数の下限です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定されている必要があります。
例えば、A商品とB商品とC商品のうち、キャンペーンの発火のために2商品以上が同時購入される必要があるときは 2 を指定します。

例1: 商品A, Bが同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード"
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード"
    }
  ]
}
```

例2: 商品A, Bが3個ずつ以上同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード",
      "required_count": 3
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード",
      "required_count": 3
    }
  ]
}
```

例2: 商品A, B, Cのうち2商品以上が同時購入されたときに総額の10%ポイントが付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Aの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Bの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Cの商品コード",
      "is_multiply_by_count": true,
    }
  ]
}
```

---
`existInEachProductGroups`  
```json
{ "type": "boolean" }
```
複数の商品グループの各グループにつき1種類以上の商品が購入されることによって発火するキャンペーンであるときに真を指定します。デフォルトは偽です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定され、さらにその中でgroup_idが指定されている必要があります。group_idは正の整数です。
exist_in_each_product_groupsが指定されているにも関わらず商品毎のルールでgroup_idが指定されていないものが含まれている場合はinvalid_parametersエラー(missing group_id, エラーコード400)が返ります。

例えば、商品グループA(商品コードa1, a2)、商品グループB(商品コードb1, b2)の2つの商品グループがあるとします。
このとき、各商品グループからそれぞれ少なくとも1種類以上の商品が購入されることにより発火するキャンペーンに対するリクエストパラメータは以下のようなものになります。

```javascript
{
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になります。つまり100 + 200=300がポイント付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

ポイント付与値を各商品毎のルールの総和ではなく固定値にしたい場合には、max_point_amountを指定します。
例えば以下のようなリクエストパラメータ指定の場合を考えます。

```javascript
{
  max_point_amount: 100,
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になりますが、付与値の上限が100ポイントになります。つまり100 + 200=300と計算されますが上限額の100ポイントが実際の付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600ですが上限額の100がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

---
`maxPointAmount`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与される1取引当たりのポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、amount_based_point_rules や product_based_point_rules によって計算されるポイント付与値がmax_point_amountを越えている場合、max_point_amountの値がポイント付与値となり、越えていない場合はその値がポイント付与値となります。

---
`maxTotalPointAmount`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
キャンペーンによって付与される1人当たりの累計ポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、各ユーザに対してそのキャンペーンによって過去付与されたポイントの累積値が記録されるようになります。
累積ポイント数がmax_total_point_amountを超えない限りにおいてキャンペーンで算出されたポイントが付与されます。

---
`applicableAccountMetadata`  
```json
{ "type": "object" }
```
ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
ウォレットのメタデータはCreateUserAccountやUpdateCustomerAccountで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引が行なわれたウォレットのメタデータに住所として東京が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo"
}
```

例2: 取引が行なわれたウォレットのメタデータに住所として東京以外が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo",
  "test": "not-equal"
}
```

---
成功したときは[Campaign](#campaign)クラスのインスタンスを返します
### Webhook
Webhookは特定のワーカータスクでの処理が完了した事を通知します。
WebHookにはURLとタスク名、有効化されているかを設定することが出来ます。
通知はタスク完了時、事前に設定したURLにPOSTリクエストを行います。

<a name="create-webhook"></a>
#### webhookの作成
ワーカータスクの処理が終了したことを通知するためのWebhookを登録します
このAPIにより指定したタスクの終了時に、指定したURLにPOSTリクエストを送信します。
このとき、リクエストボディは `{"task": <タスク名>}` という値になります。
```java
Request request = new CreateWebhook(
    "process_user_stats_operation",               // task: タスク名
    "khGiOaJk"                                    // url: URL
);
```

---
`task`  
```json
{
  "type": "string",
  "enum": { "bulk_shops": "process_user_stats_operation" }
}
```
ワーカータスク名を指定します

---
`url`  
```json
{ "type": "string" }
```
通知先のURLを指定します

---
成功したときは[OrganizationWorkerTaskWebhook](#organization-worker-task-webhook)クラスのインスタンスを返します
<a name="list-webhooks"></a>
#### 作成したWebhookの一覧を返す
```java
Request request = new ListWebhooks()
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数
```

---
`page`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
取得したいページ番号です。

---
`perPage`  
```json
{
  "type": "integer",
  "minimum": 1
}
```
1ページ分の取得数です。デフォルトでは 50 になっています。

---
成功したときは[PaginatedOrganizationWorkerTaskWebhook](#paginated-organization-worker-task-webhook)クラスのインスタンスを返します
<a name="update-webhook"></a>
#### Webhookの更新
指定したWebhookの内容を更新します
```java
Request request = new UpdateWebhook(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // webhookId: Webhook ID
)
        .url("HWWbXOMsy")                         // URL
        .setActive(true)                          // 有効/無効
        .task("process_user_stats_operation");    // タスク名
```

---
`webhookId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
更新するWebhookのIDです。

---
`url`  
```json
{ "type": "string" }
```
変更するURLを指定します

---
`setActive`  
```json
{ "type": "boolean" }
```
trueならWebhookによる通知が有効になり、falseなら無効になります

---
`task`  
```json
{
  "type": "string",
  "enum": { "bulk_shops": "process_user_stats_operation" }
}
```
指定したタスクが終了したときにWebhookによる通知がされます

---
成功したときは[OrganizationWorkerTaskWebhook](#organization-worker-task-webhook)クラスのインスタンスを返します
<a name="delete-webhook"></a>
#### Webhookの削除
指定したWebhookを削除します
```java
Request request = new DeleteWebhook(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // webhookId: Webhook ID
);
```

---
`webhookId`  
```json
{
  "type": "string",
  "format": "uuid"
}
```
削除するWebhookのIDです。

---
成功したときは[OrganizationWorkerTaskWebhook](#organization-worker-task-webhook)クラスのインスタンスを返します
## Responses


<a name="account-with-user"></a>
## AccountWithUser
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="account-detail"></a>
## AccountDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getBalance() double`: 
* `getMoneyBalance() double`: 
* `getPointBalance() double`: 
* `getPointDebt() double`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 
* `getExternalId() String`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="account-deleted"></a>
## AccountDeleted

<a name="bill"></a>
## Bill
* `getId() String`: 支払いQRコードのID
* `getAmount() double`: 支払い額
* `getMaxAmount() double`: 支払い額を範囲指定した場合の上限
* `getMinAmount() double`: 支払い額を範囲指定した場合の下限
* `getDescription() String`: 支払いQRコードの説明文(アプリ上で取引の説明文として表示される)
* `getAccount() AccountWithUser`: 支払いQRコード発行ウォレット
* `isDisabled() boolean`: 無効化されているかどうか
* `getToken() String`: 支払いQRコードを解析したときに出てくるURL

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="check"></a>
## Check
* `getId() String`: チャージQRコードのID
* `getCreatedAt() String`: チャージQRコードの作成日時
* `getAmount() double`: チャージマネー額 (deprecated)
* `getMoneyAmount() double`: チャージマネー額
* `getPointAmount() double`: チャージポイント額
* `getDescription() String`: チャージQRコードの説明文(アプリ上で取引の説明文として表示される)
* `getUser() User`: 送金元ユーザ情報
* `isOnetime() boolean`: 使用回数が一回限りかどうか
* `isDisabled() boolean`: 無効化されているかどうか
* `getExpiresAt() String`: チャージQRコード自体の失効日時
* `getPrivateMoney() PrivateMoney`: 対象マネー情報
* `getUsageLimit() int`: 一回限りでない場合の最大読み取り回数
* `getUsageCount() double`: 一回限りでない場合の現在までに読み取られた回数
* `getPointExpiresAt() String`: ポイント有効期限(絶対日数指定)
* `getPointExpiresInDays() int`: ポイント有効期限(相対日数指定)
* `getToken() String`: チャージQRコードを解析したときに出てくるURL

`getUser`は [User](#user) クラスのインスタンスを返します。

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="cpm-token"></a>
## CpmToken
* `getCpmToken() String`: 
* `getAccount() AccountDetail`: 
* `getTransaction() Transaction`: 
* `getEvent() ExternalTransaction`: 
* `getScopes() String[]`: 許可された取引種別
* `getExpiresAt() String`: CPMトークンの失効日時
* `getMetadata() String`: エンドユーザー側メタデータ

`getAccount`は [AccountDetail](#account-detail) クラスのインスタンスを返します。

`getTransaction`は [Transaction](#transaction) クラスのインスタンスを返します。

`getEvent`は [ExternalTransaction](#external-transaction) クラスのインスタンスを返します。

<a name="cashtray"></a>
## Cashtray
* `getId() String`: Cashtray自体のIDです。
* `getAmount() double`: 取引金額
* `getDescription() String`: Cashtrayの説明文
* `getAccount() AccountWithUser`: 発行店舗のウォレット
* `getExpiresAt() String`: Cashtrayの失効日時
* `getCanceledAt() String`: Cashtrayの無効化日時。NULLの場合は無効化されていません
* `getToken() String`: CashtrayのQRコードを解析したときに出てくるURL

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="cashtray-with-result"></a>
## CashtrayWithResult
* `getId() String`: CashtrayのID
* `getAmount() double`: 取引金額
* `getDescription() String`: Cashtrayの説明文(アプリ上で取引の説明文として表示される)
* `getAccount() AccountWithUser`: 発行店舗のウォレット
* `getExpiresAt() String`: Cashtrayの失効日時
* `getCanceledAt() String`: Cashtrayの無効化日時。NULLの場合は無効化されていません
* `getToken() String`: CashtrayのQRコードを解析したときに出てくるURL
* `getAttempt() CashtrayAttempt`: Cashtray読み取り結果
* `getTransaction() Transaction`: 取引結果

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

`getAttempt`は [CashtrayAttempt](#cashtray-attempt) クラスのインスタンスを返します。

`getTransaction`は [Transaction](#transaction) クラスのインスタンスを返します。

<a name="user"></a>
## User
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

<a name="transaction-detail"></a>
## TransactionDetail
* `getId() String`: 取引ID
* `getType() String`: 取引種別
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 取引総額 (マネー額 + ポイント額)
* `getMoneyAmount() double`: 取引マネー額
* `getPointAmount() double`: 取引ポイント額(キャンペーン付与ポイント合算)
* `getRawPointAmount() double`: 取引ポイント額
* `getCampaignPointAmount() double`: キャンペーンによるポイント付与額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文
* `getTransfers() Transfer[]`: 

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

`getTransfers`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

<a name="shop-with-accounts"></a>
## ShopWithAccounts
* `getId() String`: 店舗ID
* `getName() String`: 店舗名
* `getOrganizationCode() String`: 組織コード
* `getStatus() String`: 店舗の状態
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID
* `getAccounts() ShopAccount[]`: 

`getAccounts`は [ShopAccount](#shop-account) クラスのインスタンスの配列を返します。

<a name="bulk-transaction"></a>
## BulkTransaction
* `getId() String`: 
* `getRequestId() String`: リクエストID
* `getName() String`: バルク取引管理用の名前
* `getDescription() String`: バルク取引管理用の説明文
* `getStatus() String`: バルク取引の状態
* `getError() String`: バルク取引のエラー種別
* `getErrorLineno() int`: バルク取引のエラーが発生した行番号
* `getSubmittedAt() String`: バルク取引が登録された日時
* `getUpdatedAt() String`: バルク取引が更新された日時

<a name="external-transaction"></a>
## ExternalTransaction
* `getId() String`: ポケペイ外部取引ID
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 決済額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

<a name="paginated-private-money-organization-summaries"></a>
## PaginatedPrivateMoneyOrganizationSummaries
* `getRows() PrivateMoneyOrganizationSummary[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoneyOrganizationSummary](#private-money-organization-summary) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="private-money-summary"></a>
## PrivateMoneySummary
* `getTopupAmount() double`: 
* `getRefundedTopupAmount() double`: 
* `getPaymentAmount() double`: 
* `getRefundedPaymentAmount() double`: 
* `getAddedPointAmount() double`: 
* `getRefundedAddedPointAmount() double`: 
* `getExchangeInflowAmount() double`: 
* `getExchangeOutflowAmount() double`: 
* `getTransactionCount() int`: 

<a name="user-stats-operation"></a>
## UserStatsOperation
* `getId() String`: 集計処理ID
* `getFrom() String`: 集計期間の開始時刻
* `getTo() String`: 集計期間の終了時刻
* `getStatus() String`: 集計処理の実行ステータス
* `getErrorReason() String`: エラーとなった理由
* `getDoneAt() String`: 集計処理の完了時刻
* `getFileUrl() String`: 集計結果のCSVのダウンロードURL
* `getRequestedAt() String`: 集計リクエストを行った時刻

<a name="paginated-transaction"></a>
## PaginatedTransaction
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transaction-v2"></a>
## PaginatedTransactionV2
* `getRows() Transaction[]`: 
* `getPerPage() int`: 
* `getCount() int`: 
* `getNextPageCursorId() String`: 
* `getPrevPageCursorId() String`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

<a name="paginated-transfers"></a>
## PaginatedTransfers
* `getRows() Transfer[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transfers-v2"></a>
## PaginatedTransfersV2
* `getRows() Transfer[]`: 
* `getPerPage() int`: 
* `getCount() int`: 
* `getNextPageCursorId() String`: 
* `getPrevPageCursorId() String`: 

`getRows`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

<a name="paginated-account-with-users"></a>
## PaginatedAccountWithUsers
* `getRows() AccountWithUser[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountWithUser](#account-with-user) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-account-details"></a>
## PaginatedAccountDetails
* `getRows() AccountDetail[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountDetail](#account-detail) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-account-balance"></a>
## PaginatedAccountBalance
* `getRows() AccountBalance[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountBalance](#account-balance) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-shops"></a>
## PaginatedShops
* `getRows() ShopWithMetadata[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [ShopWithMetadata](#shop-with-metadata) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-bills"></a>
## PaginatedBills
* `getRows() Bill[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Bill](#bill) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-private-moneys"></a>
## PaginatedPrivateMoneys
* `getRows() PrivateMoney[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoney](#private-money) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="campaign"></a>
## Campaign
* `getId() String`: キャンペーンID
* `getName() String`: キャペーン名
* `getApplicableShops() User[]`: キャンペーン適用対象の店舗リスト
* `isExclusive() boolean`: キャンペーンの重複を許すかどうかのフラグ
* `getStartsAt() String`: キャンペーン開始日時
* `getEndsAt() String`: キャンペーン終了日時
* `getPointExpiresAt() String`: キャンペーンによって付与されるポイントの失効日時
* `getPointExpiresInDays() int`: キャンペーンによって付与されるポイントの有効期限(相対指定、単位は日)
* `getPriority() int`: キャンペーンの優先順位
* `getDescription() String`: キャンペーン説明文
* `getBearPointShop() User`: ポイントを負担する店舗
* `getPrivateMoney() PrivateMoney`: キャンペーンを適用するマネー
* `getDestPrivateMoney() PrivateMoney`: ポイントを付与するマネー
* `getMaxTotalPointAmount() int`: 一人当たりの累計ポイント上限
* `getPointCalculationRule() String`: ポイント計算ルール (banklisp表記)
* `getPointCalculationRuleObject() String`: ポイント計算ルール (JSON文字列による表記)
* `getStatus() String`: キャンペーンの現在の状態

`getApplicableShops`は [User](#user) クラスのインスタンスの配列を返します。

`getBearPointShop`は [User](#user) クラスのインスタンスを返します。

`getDestPrivateMoney`と`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="paginated-campaigns"></a>
## PaginatedCampaigns
* `getRows() Campaign[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Campaign](#campaign) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="account-transfer-summary"></a>
## AccountTransferSummary
* `getSummaries() AccountTransferSummaryElement[]`: 

`getSummaries`は [AccountTransferSummaryElement](#account-transfer-summary-element) クラスのインスタンスの配列を返します。

<a name="organization-worker-task-webhook"></a>
## OrganizationWorkerTaskWebhook
* `getId() String`: 
* `getOrganizationCode() String`: 
* `getTask() String`: 
* `getUrl() String`: 
* `getContentType() String`: 
* `isActive() boolean`: 

<a name="paginated-organization-worker-task-webhook"></a>
## PaginatedOrganizationWorkerTaskWebhook
* `getRows() OrganizationWorkerTaskWebhook[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [OrganizationWorkerTaskWebhook](#organization-worker-task-webhook) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="private-money"></a>
## PrivateMoney
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: ウォレットの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getMoneyTopupTransferLimit() double`: マネーチャージ取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`:  (deprecated)
* `getDisplayMoneyAndPoint() String`: 

`getOrganization`は [Organization](#organization) クラスのインスタンスを返します。

<a name="transaction"></a>
## Transaction
* `getId() String`: 取引ID
* `getType() String`: 取引種別
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 取引総額 (マネー額 + ポイント額)
* `getMoneyAmount() double`: 取引マネー額
* `getPointAmount() double`: 取引ポイント額(キャンペーン付与ポイント合算)
* `getRawPointAmount() double`: 取引ポイント額
* `getCampaignPointAmount() double`: キャンペーンによるポイント付与額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

<a name="cashtray-attempt"></a>
## CashtrayAttempt
* `getAccount() AccountWithUser`: エンドユーザーのウォレット
* `getStatusCode() double`: ステータスコード
* `getErrorType() String`: エラー型
* `getErrorMessage() String`: エラーメッセージ
* `getCreatedAt() String`: Cashtray読み取り記録の作成日時

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="account"></a>
## Account
* `getId() String`: ウォレットID
* `getName() String`: ウォレット名
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getStatus() String`: 
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="transfer"></a>
## Transfer
* `getId() String`: 
* `getSenderAccount() AccountWithoutPrivateMoneyDetail`: 
* `getReceiverAccount() AccountWithoutPrivateMoneyDetail`: 
* `getAmount() double`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 
* `getDoneAt() String`: 
* `getType() String`: 
* `getDescription() String`: 
* `getTransactionId() String`: 

`getReceiverAccount`と`getSenderAccount`は [AccountWithoutPrivateMoneyDetail](#account-without-private-money-detail) クラスのインスタンスを返します。

<a name="shop-account"></a>
## ShopAccount
* `getId() String`: ウォレットID
* `getName() String`: ウォレット名
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getCanTransferTopup() boolean`: チャージ可能かどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="private-money-organization-summary"></a>
## PrivateMoneyOrganizationSummary
* `getOrganizationCode() String`: 
* `getTopup() OrganizationSummary`: 
* `getPayment() OrganizationSummary`: 

`getPayment`と`getTopup`は [OrganizationSummary](#organization-summary) クラスのインスタンスを返します。

<a name="pagination"></a>
## Pagination
* `getCurrent() int`: 
* `getPerPage() int`: 
* `getMaxPage() int`: 
* `getHasPrev() boolean`: 
* `getHasNext() boolean`: 

<a name="account-balance"></a>
## AccountBalance
* `getExpiresAt() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 

<a name="shop-with-metadata"></a>
## ShopWithMetadata
* `getId() String`: 店舗ID
* `getName() String`: 店舗名
* `getOrganizationCode() String`: 組織コード
* `getStatus() String`: 店舗の状態
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID

<a name="account-transfer-summary-element"></a>
## AccountTransferSummaryElement
* `getTransferType() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 
* `getCount() double`: 

<a name="organization"></a>
## Organization
* `getCode() String`: 組織コード
* `getName() String`: 組織名

<a name="account-without-private-money-detail"></a>
## AccountWithoutPrivateMoneyDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getPrivateMoneyId() String`: 
* `getUser() User`: 

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="organization-summary"></a>
## OrganizationSummary
* `getCount() int`: 
* `getMoneyAmount() double`: 
* `getMoneyCount() int`: 
* `getPointAmount() double`: 
* `getPointCount() int`: 
