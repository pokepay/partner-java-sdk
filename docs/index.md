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

- [ListTransactions](#list-transactions): 取引履歴を取得する
- [CreateTransaction](#create-transaction): チャージする(廃止予定)
- [CreateTopupTransaction](#create-topup-transaction): チャージする
- [CreatePaymentTransaction](#create-payment-transaction): 支払いする
- [CreateTransferTransaction](#create-transfer-transaction): 個人間送金
- [CreateExchangeTransaction](#create-exchange-transaction): 
- [GetTransaction](#get-transaction): 取引情報を取得する
- [ListTransfers](#list-transfers): 
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
- [ListAccountBalances](#list-account-balances): エンドユーザーの残高内訳を表示する
- [ListAccountExpiredBalances](#list-account-expired-balances): エンドユーザーの失効済みの残高内訳を表示する
- [CreateCustomerAccount](#create-customer-account): 新規エンドユーザーウォレットを追加する
- [ListCustomerTransactions](#list-customer-transactions): 取引履歴を取得する
- [ListShops](#list-shops): 店舗一覧を取得する
- [CreateShop](#create-shop): 新規店舗を追加する(廃止予定)
- [CreateShopV2](#create-shop-v): 新規店舗を追加する
- [GetShop](#get-shop): 店舗情報を表示する
- [UpdateShop](#update-shop): 店舗情報を更新する
- [ListUserAccounts](#list-user-accounts): エンドユーザー、店舗ユーザーのウォレット一覧を表示する
- [GetPrivateMoneys](#get-private-moneys): マネー一覧を取得する
- [GetPrivateMoneyOrganizationSummaries](#get-private-money-organization-summaries): 決済加盟店の取引サマリを取得する
- [BulkCreateTransaction](#bulk-create-transaction): CSVファイル一括取引
### Transaction
<a name="list-transactions"></a>
#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2021-03-07T22:47:08.000000+09:00") // 開始日時
        .to("2022-03-08T10:30:46.000000+09:00")   // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 端末ID
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .setModified(true)                        // キャンセルフラグ
        .types(new String[]{"topup","payment"});  // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
```

---
`from`  
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
`page`  
取得したいページ番号です。

---
`perPage`  
1ページ分の取引数です。

---
`shopId`  
店舗IDです。

フィルターとして使われ、指定された店舗での取引のみ一覧に表示されます。

---
`customerId`  
エンドユーザーIDです。

フィルターとして使われ、指定されたエンドユーザーでの取引のみ一覧に表示されます。

---
`customerName`  
エンドユーザー名です。

フィルターとして使われ、入力された名前に部分一致するエンドユーザーでの取引のみ一覧に表示されます。

---
`terminalId`  
端末IDです。

フィルターとして使われ、指定された端末での取引のみ一覧に表示されます。

---
`transactionId`  
取引IDです。

フィルターとして使われ、指定された取引のみ一覧に表示されます。

---
`organizationCode`  
組織コードです。

フィルターとして使われ、指定された組織での取引のみ一覧に表示されます。

---
`privateMoneyId`  
マネーIDです。

フィルターとして使われ、指定したマネーでの取引のみ一覧に表示されます。

---
`setModified`  
キャンセルフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
デフォルト値はfalseで、キャンセルの有無にかかわらず一覧に表示されます。

---
`types`  
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

---
成功したときは[PaginatedTransaction](#paginated-transaction)クラスのインスタンスを返します
<a name="create-transaction"></a>
#### チャージする(廃止予定)
チャージ取引を作成します。このAPIは廃止予定です。以降は `CreateTopupTransaction` を使用してください。
```java
Request request = new CreateTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
)
        .moneyAmount(1421)
        .pointAmount(2284)
        .pointExpiresAt("2024-09-29T14:09:13.000000+09:00") // ポイント有効期限
        .description("dnW1ooZFRDSiyltrhPzNi7jenj4X3xdXKxR7POl5XLEB6rdcoyFq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL");
```

---
`pointExpiresAt`  
ポイントをチャージした場合の、付与されるポイントの有効期限です。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
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
        .moneyAmount(8760)                        // マネー額
        .pointAmount(2312)                        // ポイント額
        .pointExpiresAt("2023-08-31T03:26:11.000000+09:00") // ポイント有効期限
        .description("初夏のチャージキャンペーン");            // 取引履歴に表示する説明文
```

---
`shopId`  
店舗IDです。

送金元の店舗を指定します。

---
`customerId`  
エンドユーザーIDです。

送金先のエンドユーザーを指定します。

---
`privateMoneyId`  
マネーIDです。

マネーを指定します。

---
`bearPointShopId`  
ポイント支払時の負担店舗IDです。

ポイント支払い時に実際お金を負担する店舗を指定します。

---
`moneyAmount`  
マネー額です。

送金するマネー額を指定します。

---
`pointAmount`  
ポイント額です。

送金するポイント額を指定します。

---
`pointExpiresAt`  
ポイントをチャージした場合の、付与されるポイントの有効期限です。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

---
`description`  
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
<a name="create-payment-transaction"></a>
#### 支払いする
支払取引を作成します。
支払い時には、エンドユーザーの残高のうち、ポイント残高から優先的に消費されます。

```java
Request request = new CreatePaymentTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    3693                                          // amount: 支払い額
)
        .description("たい焼き(小倉)");                 // 取引履歴に表示する説明文
```

---
`shopId`  
店舗IDです。

送金先の店舗を指定します。

---
`customerId`  
エンドユーザーIDです。

送金元のエンドユーザーを指定します。

---
`privateMoneyId`  
マネーIDです。

マネーを指定します。

---
`amount`  
マネー額です。

送金するマネー額を指定します。

---
`description`  
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
<a name="create-transfer-transaction"></a>
#### 個人間送金
エンドユーザー間での送金取引(個人間送金)を作成します。
個人間送金で送れるのはマネーのみで、ポイントを送ることはできません。送金元のマネー残高のうち、有効期限が最も遠いものから順に送金されます。

```java
Request request = new CreateTransferTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // senderId: 送金元ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // receiverId: 受取ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    6392                                          // amount: 送金額
)
        .description("たい焼き(小倉)");                 // 取引履歴に表示する説明文
```

---
`senderId`  
エンドユーザーIDです。

送金元のエンドユーザー(送り主)を指定します。

---
`receiverId`  
エンドユーザーIDです。

送金先のエンドユーザー(受け取り人)を指定します。

---
`privateMoneyId`  
マネーIDです。

マネーを指定します。

---
`amount`  
マネー額です。

送金するマネー額を指定します。

---
`description`  
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
<a name="create-exchange-transaction"></a>
#### 
```java
Request request = new CreateExchangeTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    9228
)
        .description("NxSNDBAB21jRDnDfUt4YgIyZaTsiHOmcCShoExxXDzwmu0NmtxroKVUk7sDu4lw8ZxL5ooBCUmbexHlOYPdRDRXfcFEKebPAHiatKRmL7K8IMJIBW1vB1RC8WQ75Zq2CPEph5LyiHrKKZHYeA6K");
```
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
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
取引IDです。

フィルターとして使われ、指定した取引IDの取引を取得します。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
<a name="list-transfers"></a>
#### 
```java
Request request = new ListTransfers()
        .from("2017-10-07T19:44:21.000000+09:00")
        .to("2018-06-17T19:03:29.000000+09:00")
        .page(4180)
        .perPage(4035)
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .shopName("kbfNhFw")
        .customerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .customerName("jSSUkqouGV2ULftf3KLiOm0u6OdTYvY1WMa6BMdHbor9Bi8VjYjeAF8N8XvRYyNjj6LzPNoFY0NPc7gW3tdaerbfAUj6MGuDCQRgbbh69IfOOqdFvcvTYHWhMSc2JtDSCuxpXIBKjX0wbEINtuhWyJmxhctiEpL1KlL20SY28CEIpXvCz2lX0WFgkUTJYHHOr63hjnglJCcSZdRjCOwyap0lsb8d4Dc5yMU1TN0yX6wxY6IPoPyEr8klncfG")
        .transactionId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
        .setModified(false)
        .transactionTypes(new String[]{"exchange","transfer","payment","topup"})
        .transferTypes(new String[]{"topup","transfer","exchange","payment"});
```
成功したときは[PaginatedTransfers](#paginated-transfers)クラスのインスタンスを返します
### Check
店舗ユーザが発行し、エンドユーザーがポケペイアプリから読み取ることでチャージ取引が発生するQRコードです。

チャージQRコードを解析すると次のようなURLになります(URLは環境によって異なります)。

`https://www-sandbox.pokepay.jp/checks/xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx`

QRコードを読み取る方法以外にも、このURLリンクを直接スマートフォン(iOS/Android)上で開くことによりアプリが起動して取引が行われます。(注意: 上記URLはsandbox環境であるため、アプリもsandbox環境のものである必要があります) 上記URL中の `xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx` の部分がチャージQRコードのIDです。

<a name="create-topup-transaction-with-check"></a>
#### チャージQRコードを読み取ることでチャージする
通常チャージQRコードはエンドユーザーのアプリによって読み取られ、アプリとポケペイサーバとの直接通信によって取引が作られます。 もしエンドユーザーとの通信をパートナーのサーバのみに限定したい場合、パートナーのサーバがチャージQRの情報をエンドユーザーから代理受けして、サーバ間連携APIによって実際のチャージ取引をリクエストすることになります。

エンドユーザーから受け取ったチャージ用QRコードのIDをエンドユーザーIDと共に渡すことでチャージ取引が作られます。

```java
Request request = new CreateTopupTransactionWithCheck(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // checkId: チャージ用QRコードのID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // customerId: エンドユーザーのID
);
```

---
`checkId`  
チャージ用QRコードのIDです。

QRコード生成時に送金元店舗のウォレット情報や、送金額などが登録されています。

---
`customerId`  
エンドユーザーIDです。

送金先のエンドユーザーを指定します。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します
### Bill
支払いQRコード
<a name="list-bills"></a>
#### 支払いQRコード一覧を表示する
支払いQRコード一覧を表示します。
```java
Request request = new ListBills()
        .page(1083)                               // ページ番号
        .perPage(8979)                            // 1ページの表示数
        .billId("OqOmjPQj")                       // 支払いQRコードのID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .organizationCode("v-n")                  // 組織コード
        .description("test bill")                 // 取引説明文
        .createdFrom("2022-01-25T23:24:31.000000+09:00") // 作成日時(起点)
        .createdTo("2016-11-01T22:58:21.000000+09:00") // 作成日時(終点)
        .shopName("bill test shop1")              // 店舗名
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .lowerLimitAmount(5690)                   // 金額の範囲によるフィルタ(下限)
        .upperLimitAmount(7721)                   // 金額の範囲によるフィルタ(上限)
        .setDisabled(true);                       // 支払いQRコードが無効化されているかどうか
```

---
`page`  
取得したいページ番号です。

---
`perPage`  
1ページに表示する支払いQRコードの数です。

---
`billId`  
支払いQRコードのIDを指定して検索します。IDは前方一致で検索されます。

---
`privateMoneyId`  
支払いQRコードの送金元ウォレットのマネーIDでフィルターします。

---
`organizationCode`  
支払いQRコードの送金元店舗が所属する組織の組織コードでフィルターします。

---
`description`  
支払いQRコードを読み取ることで作られた取引の説明文としてアプリなどに表示されます。

---
`createdFrom`  
支払いQRコードの作成日時でフィルターします。

これ以降に作成された支払いQRコードのみ一覧に表示されます。

---
`createdTo`  
支払いQRコードの作成日時でフィルターします。

これ以前に作成された支払いQRコードのみ一覧に表示されます。

---
`shopName`  
支払いQRコードを作成した店舗名でフィルターします。店舗名は部分一致で検索されます。

---
`shopId`  
支払いQRコードを作成した店舗IDでフィルターします。

---
`lowerLimitAmount`  
支払いQRコードの金額の下限を指定してフィルターします。

---
`upperLimitAmount`  
支払いQRコードの金額の上限を指定してフィルターします。

---
`setDisabled`  
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
        .amount(4286)                             // 支払い額
        .description("test bill");                // 説明文(アプリ上で取引の説明文として表示される)
```

---
`amount`  
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
        .amount(3562)                             // 支払い額
        .description("test bill")                 // 説明文
        .setDisabled(true);                       // 無効化されているかどうか
```

---
`billId`  
更新対象の支払いQRコードのIDです。

---
`amount`  
支払いQRコードを支払い額を指定します。nullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

---
`description`  
支払いQRコードの詳細説明文です。アプリ上で取引の説明文として表示されます。

---
`setDisabled`  
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
    3128                                          // amount: 金額
)
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .expiresIn(8103);                         // 失効時間(秒)
```

---
`privateMoneyId`  
取引対象のマネーのIDです(必須項目)。

---
`shopId`  
店舗のユーザーIDです(必須項目)。

---
`amount`  
マネー額です(必須項目)。
正の値を与えるとチャージになり、負の値を与えると支払いとなります。

---
`description`  
Cashtrayを読み取ったときに作られる取引の説明文です(最大200文字、任意項目)。
アプリや管理画面などの取引履歴に表示されます。デフォルトでは空文字になります。

---
`expiresIn`  
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
        .amount(9905)                             // 金額
        .description("たい焼き(小倉)")                  // 取引履歴に表示する説明文
        .expiresIn(2635);                         // 失効時間(秒)
```

---
`cashtrayId`  
更新対象のCashtrayのIDです。

---
`amount`  
マネー額です(任意項目)。
正の値を与えるとチャージになり、負の値を与えると支払いとなります。

---
`description`  
Cashtrayを読み取ったときに作られる取引の説明文です(最大200文字、任意項目)。
アプリや管理画面などの取引履歴に表示されます。

---
`expiresIn`  
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
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレットを取得します。

---
成功したときは[AccountDetail](#account-detail)クラスのインスタンスを返します
<a name="update-account"></a>
#### ウォレット情報を更新する
ウォレットの状態を更新します。現在はウォレットの凍結/凍結解除の切り替えにのみ対応しています。
```java
Request request = new UpdateAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .setSuspended(false);                     // ウォレットが凍結されているかどうか
```

---
`accountId`  
ウォレットIDです。

指定したウォレットIDのウォレットの状態を更新します。

---
`setSuspended`  
ウォレットの凍結状態です。真にするとウォレットが凍結され、そのウォレットでは新規取引ができなくなります。偽にすると凍結解除されます。

---
成功したときは[AccountDetail](#account-detail)クラスのインスタンスを返します
<a name="list-account-balances"></a>
#### エンドユーザーの残高内訳を表示する
エンドユーザーのウォレット毎の残高を有効期限別のリストとして取得します。
```java
Request request = new ListAccountBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(6492)                               // ページ番号
        .perPage(8200)                            // 1ページ分の取引数
        .expiresAtFrom("2023-02-10T06:31:24.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2015-10-25T22:32:38.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
        .direction("asc");                        // 有効期限によるソート順序
```

---
`accountId`  
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

---
`page`  
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
1ページ分のウォレット残高数です。デフォルト値は30です。

---
`expiresAtFrom`  
有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`expiresAtTo`  
有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`direction`  
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
        .page(6728)                               // ページ番号
        .perPage(2052)                            // 1ページ分の取引数
        .expiresAtFrom("2022-12-01T19:24:55.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2017-01-20T20:17:45.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
        .direction("desc");                       // 有効期限によるソート順序
```

---
`accountId`  
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

---
`page`  
取得したいページ番号です。デフォルト値は1です。

---
`perPage`  
1ページ分のウォレット残高数です。デフォルト値は30です。

---
`expiresAtFrom`  
有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

---
`expiresAtTo`  
有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

---
`direction`  
有効期限によるソートの順序を指定します。デフォルト値はdesc (降順)です。

---
成功したときは[PaginatedAccountBalance](#paginated-account-balance)クラスのインスタンスを返します
<a name="create-customer-account"></a>
#### 新規エンドユーザーウォレットを追加する
指定したマネーのウォレットを作成し、同時にそのウォレットを保有するユーザも作成します。
```java
Request request = new CreateCustomerAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .userName("ポケペイ太郎")                       // ユーザー名
        .accountName("ポケペイ太郎のアカウント");             // アカウント名
```

---
`privateMoneyId`  
マネーIDです。

これによって作成するウォレットのマネーを指定します。

---
`userName`  
ウォレットと共に作成するユーザ名です。省略した場合は空文字となります。

---
`accountName`  
作成するウォレット名です。省略した場合は空文字となります。

---
成功したときは[AccountWithUser](#account-with-user)クラスのインスタンスを返します
<a name="list-customer-transactions"></a>
#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListCustomerTransactions(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .senderCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 送金エンドユーザーID
        .receiverCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 受取エンドユーザーID
        .type("Srp")                              // 取引種別、チャージ=topup、支払い=payment、個人間送金=transfer
        .setModified(false)                       // キャンセル済みかどうか
        .from("2017-07-25T12:50:19.000000+09:00") // 開始日時
        .to("2016-03-31T11:27:56.000000+09:00")   // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```

---
`privateMoneyId`  
マネーIDです。
フィルターとして使われ、指定したマネーでの取引のみ一覧に表示されます。

---
`senderCustomerId`  
送金ユーザーIDです。

フィルターとして使われ、指定された送金ユーザーでの取引のみ一覧に表示されます。

---
`receiverCustomerId`  
受取ユーザーIDです。

フィルターとして使われ、指定された受取ユーザーでの取引のみ一覧に表示されます。

---
`type`  
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

---
`setModified`  
キャンセル済みかどうかを判定するフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
falseを指定するとキャンセルされていない取引のみ一覧に表示されます
何も指定しなければキャンセルの有無にかかわらず一覧に表示されます。

---
`from`  
抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

---
`to`  
抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

---
`page`  
取得したいページ番号です。

---
`perPage`  
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
        .postalCode("5102030")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("02-200-2918")                       // 店舗の電話番号
        .email("fbLwdjVaS9@Jydp.com")             // 店舗のメールアドレス
        .externalId("qXjqW7D3u")                  // 店舗の外部ID
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```

---
`organizationCode`  
このパラメータを渡すとその組織の店舗のみが返され、省略すると加盟店も含む店舗が返されます。


---
`privateMoneyId`  
このパラメータを渡すとそのマネーのウォレットを持つ店舗のみが返されます。


---
`name`  
このパラメータを渡すとその名前の店舗のみが返されます。


---
`postalCode`  
このパラメータを渡すとその郵便番号が登録された店舗のみが返されます。


---
`address`  
このパラメータを渡すとその住所が登録された店舗のみが返されます。


---
`tel`  
このパラメータを渡すとその電話番号が登録された店舗のみが返されます。


---
`email`  
このパラメータを渡すとそのメールアドレスが登録された店舗のみが返されます。


---
`externalId`  
このパラメータを渡すとその外部IDが登録された店舗のみが返されます。


---
`page`  
取得したいページ番号です。

---
`perPage`  
1ページ分の取引数です。

---
成功したときは[PaginatedShops](#paginated-shops)クラスのインスタンスを返します
<a name="create-shop"></a>
#### 新規店舗を追加する(廃止予定)
新規店舗を追加します。このAPIは廃止予定です。以降は `CreateShopV2` を使用してください。
```java
Request request = new CreateShop(
    "oxスーパー三田店"                                   // shopName: 店舗名
)
        .shopPostalCode("373-4054")               // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("083-779-345")                   // 店舗の電話番号
        .shopEmail("dPl4JIrQmL@FWJx.com")         // 店舗のメールアドレス
        .shopExternalId("GB9NLriuIsMTYyCUoOEa9YZaUNPTMagDSPeH") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは[User](#user)クラスのインスタンスを返します
<a name="create-shop-v"></a>
#### 新規店舗を追加する
```java
Request request = new CreateShopV2(
    "oxスーパー三田店"                                   // name: 店舗名
)
        .postalCode("9873173")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("0097712-9463")                      // 店舗の電話番号
        .email("oPTyGfjAlv@bOwB.com")             // 店舗のメールアドレス
        .externalId("ftL3mTfJhTjDs9c8QNU")        // 店舗の外部ID
        .organizationCode("ox-supermarket")       // 組織コード
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}); // 店舗でチャージ可能にするマネーIDの配列
```

---
`name`  
店舗名です。

同一組織内に同名の店舗があった場合は`name_conflict`エラーが返ります。

---
`privateMoneyIds`  
店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
このパラメータを省略したときは、店舗が所属する組織が発行または加盟している全てのマネーのウォレットができます。

---
`canTopupPrivateMoneyIds`  
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
        .postalCode("841-5932")                   // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("0870057651")                        // 店舗の電話番号
        .email("6qe5BUa3mr@tCxk.com")             // 店舗のメールアドレス
        .externalId("ktMbdZ0Ff5nebRZC0vDYNEW")    // 店舗の外部ID
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{}); // 店舗でチャージ可能にするマネーIDの配列
```

---
`name`  
店舗名です。

同一組織内に同名の店舗があった場合は`shop_name_conflict`エラーが返ります。

---
`postalCode`  
店舗住所の郵便番号(7桁の数字)です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

---
`tel`  
店舗の電話番号です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

---
`email`  
店舗の連絡先メールアドレスです。明示的に空の値を設定するにはNULLを指定します。

---
`externalId`  
店舗の外部IDです(最大36文字)。明示的に空の値を設定するにはNULLを指定します。

---
`privateMoneyIds`  
店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
店舗が既にウォレットを持っている場合に、ここでそのウォレットのマネーIDを指定しないで更新すると、そのマネーのウォレットは凍結(無効化)されます。

---
`canTopupPrivateMoneyIds`  
店舗でチャージ可能にするマネーIDの配列を指定します。

このパラメータは発行体のみが指定でき、発行しているマネーのみを指定できます。加盟店が他発行体のマネーに加盟している場合でも、そのチャージ可否を変更することはできません。
省略したときは対象店舗のその発行体の全てのマネーのアカウントがチャージ不可となります。

---
成功したときは[ShopWithAccounts](#shop-with-accounts)クラスのインスタンスを返します
### Account
<a name="list-user-accounts"></a>
#### エンドユーザー、店舗ユーザーのウォレット一覧を表示する
ユーザーIDを指定してそのユーザーのウォレット一覧を取得します。
```java
Request request = new ListUserAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // userId: ユーザーID
);
```

---
`userId`  
ユーザーIDです。

指定したユーザーIDのウォレット一覧を取得します。パートナーキーと紐づく組織が発行しているマネーのウォレットのみが表示されます。

---
成功したときは[PaginatedAccounts](#paginated-accounts)クラスのインスタンスを返します
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
パートナーキーの管理者が発行体組織に属している場合、発行マネーのうち、この組織コードで指定した決済加盟店組織が加盟しているマネーの一覧を返します。決済加盟店組織の管理者は自組織以外を指定することはできません。

---
成功したときは[PaginatedPrivateMoneys](#paginated-private-moneys)クラスのインスタンスを返します
<a name="get-private-money-organization-summaries"></a>
#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2021-10-16T13:57:56.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2019-06-24T18:12:50.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
`from`と`to`は同時に指定する必要があります。

成功したときは[PaginatedPrivateMoneyOrganizationSummaries](#paginated-private-money-organization-summaries)クラスのインスタンスを返します
### Bulk
<a name="bulk-create-transaction"></a>
#### CSVファイル一括取引
CSVファイルから一括取引をします。
```java
Request request = new BulkCreateTransaction(
    "XSVHRY4YZdsEswklf9tWgAr9K",                  // name: 一括取引タスク名
    "jsUzeefEv",                                  // content: 取引する情報のCSV
    "U98BI4BdtnYVFOF5IXA6lNw66Yqs62ry4EX0"        // requestId: リクエストID
)
        .description("5SsjBGi2vt3IVLujfoeXIyA6Ao821XE55hc29pv4sZBooZY5wA4Og2kdAYLVTxSOsaSsUmdY0"); // 一括取引の説明
```

---
`name`  
一括取引タスクの管理用の名前です。

---
`description`  
一括取引タスクの管理用の説明文です。

---
`content`  
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
重複したリクエストを判断するためのユニークID。ランダムな36字の文字列を生成して渡してください。

---
成功したときは[BulkTransaction](#bulk-transaction)クラスのインスタンスを返します
## Responses


<a name="account-with-user"></a>
## AccountWithUser
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="account-detail"></a>
## AccountDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getBalance() double`: 
* `getMoneyBalance() double`: 
* `getPointBalance() double`: 
* `getPrivateMoney() PrivateMoney`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

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

<a name="transaction"></a>
## Transaction
* `getId() String`: 取引ID
* `getType() String`: 取引種別 (チャージ=topup, 支払い=payment)
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 決済総額 (マネー額 + ポイント額)
* `getMoneyAmount() double`: 決済マネー額
* `getPointAmount() double`: 決済ポイント額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

<a name="shop-with-accounts"></a>
## ShopWithAccounts
* `getId() String`: 店舗ID
* `getName() String`: 店舗名
* `getOrganizationCode() String`: 組織コード
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

<a name="paginated-private-money-organization-summaries"></a>
## PaginatedPrivateMoneyOrganizationSummaries
* `getRows() PrivateMoneyOrganizationSummary[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoneyOrganizationSummary](#private-money-organization-summary) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transaction"></a>
## PaginatedTransaction
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transfers"></a>
## PaginatedTransfers
* `getRows() Transfer[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-accounts"></a>
## PaginatedAccounts
* `getRows() Account[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Account](#account) クラスのインスタンスの配列を返します。

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
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか

`getOrganization`は [Organization](#organization) クラスのインスタンスを返します。

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
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

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
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID
