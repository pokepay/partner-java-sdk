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

### Transaction

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

#### チャージする
チャージ取引を作成します。
```java
Request request = new CreateTopupTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーのID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .bearPointShopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント支払時の負担店舗ID
        .moneyAmount(8354)                        // マネー額
        .pointAmount(8000)                        // ポイント額
        .description("初夏のチャージキャンペーン");            // 取引履歴に表示する説明文
```

---
`shopId`  
マネー店舗IDです。

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
`description`  
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します

#### 支払いする
支払取引を作成します。
```java
Request request = new CreatePaymentTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    5952                                          // amount: 支払い額
)
        .description("たい焼き(小倉)");                 // 取引履歴に表示する説明文
```

---
`shopId`  
マネー店舗IDです。

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

#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2023-05-12T17:29:05.000000+09:00") // 開始日時
        .to("2024-08-08T16:15:47.000000+09:00")   // 終了日時
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

#### 返金する
```java
Request request = new RefundTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // transactionId: 取引ID
)
        .description("返品対応のため");                  // 取引履歴に表示する返金事由
```
成功したときは[Transfer](#transfer)クラスのインスタンスを返します

### チャージQRコード

店舗ユーザが発行し、エンドユーザがポケペイアプリから読み取ることでチャージ取引が発生するQRコードです。

チャージQRコードを解析すると次のようなURLになります(URLは環境によって異なります)。

`https://www-sandbox.pokepay.jp/checks/xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx`

QRコードを読み取る方法以外にも、このURLリンクを直接スマートフォン(iOS/Android)上で開くことによりアプリが起動して取引が行われます。(注意: 上記URLはsandbox環境であるため、アプリもsandbox環境のものである必要があります) 上記URL中の `xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx` の部分がチャージQRコードのIDです。

#### チャージQRコードの発行
```java
Request request = new CreateCheck(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: 送金元の店舗アカウントID
)
        .moneyAmount(3925)                        // 付与マネー額
        .pointAmount(6817)                        // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(true)                         // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(6724)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2017-02-09T05:45:59.000000+09:00") // チャージQR自体の失効日時
        .pointExpiresAt("2020-01-16T22:55:00.000000+09:00") // チャージQRによって付与されるポイントの失効日時
        .pointExpiresInDays(60)                   // チャージQRによって付与されるポイントの有効期限(相対指定、単位は日)
        .bearPointAccount("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // ポイント額を負担する店舗アカウントのID
```
`moneyAmount`と`pointAmount`の少なくとも一方は指定する必要があります。


---
`setOnetime`  
チャージQRコードが一度の読み取りで失効するときに`true`にします。デフォルト値は`true`です。
`false`の場合、そのチャージQRコードは1ユーザについては1回きりですが、複数ユーザによって読み取り可能なQRコードになります。


---
`usageLimit`  
複数ユーザによって読み取り可能なチャージQRコードの読み取り回数に制限をつけるために指定します。
省略すると無制限に読み取り可能なチャージQRコードになります。
チャージQRコードは管理画面からいつでも無効化(有効化)することができます。


---
成功したときは[Check](#check)クラスのインスタンスを返します

#### チャージQRコードを読み取ることでチャージする
通常チャージQRコードはエンドユーザのアプリによって読み取られ、アプリとポケペイサーバとの直接通信によって取引が作られます。 もしエンドユーザとの通信をパートナーのサーバのみに限定したい場合、パートナーのサーバがチャージQRの情報をエンドユーザから代理受けして、サーバ間連携APIによって実際のチャージ取引をリクエストすることになります。

エンドユーザから受け取ったチャージ用QRコードのIDをエンドユーザIDと共に渡すことでチャージ取引が作られます。

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

### Customer

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

#### エンドユーザーのウォレット情報を表示する
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

#### エンドユーザーの残高内訳を表示する
エンドユーザーの残高は有効期限別のリストとして取得できます。
```java
Request request = new ListAccountBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(5926)                               // ページ番号
        .perPage(7268);                           // 1ページ分の取引数
```

---
`accountId`  
ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

---
`page`  
取得したいページ番号です。

---
`perPage`  
1ページ分のウォレット残高数です。

---
成功したときは[PaginatedAccountBalance](#paginated-account-balance)クラスのインスタンスを返します

### Organization

#### 新規加盟店組織を追加する
```java
Request request = new CreateOrganization(
    "ox_supermarket",                             // code: 新規組織コード
    "oxスーパー",                                     // name: 新規組織名
    new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}, // privateMoneyIds: 加盟店組織で有効にするマネーIDの配列
    "w3PX7IImkv@l5vC.com",                        // issuerAdminUserEmail: 発行体担当者メールアドレス
    "AHh7QD95u0@YIcm.com"                         // memberAdminUserEmail: 新規組織担当者メールアドレス
)
        .bankName("XYZ銀行")                        // 銀行名
        .bankCode("99X")                          // 銀行金融機関コード
        .bankBranchName("ABC支店")                  // 銀行支店名
        .bankBranchCode("99X")                    // 銀行支店コード
        .bankAccountType("saving")                // 銀行口座種別 (普通=saving, 当座=current, その他=other)
        .bankAccount(9999999)                     // 銀行口座番号
        .bankAccountHolderName("ﾌｸｻﾞﾜﾕｷﾁ")        // 口座名義人名
        .contactName("佐藤清");                      // 担当者名
```
成功したときは[Organization](#organization)クラスのインスタンスを返します

### Shop

#### 新規店舗を追加する
```java
Request request = new CreateShop(
    "oxスーパー三田店"                                   // shopName: 店舗名
)
        .shopPostalCode("0330522")                // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("06-16-8947")                    // 店舗の電話番号
        .shopEmail("kJp5ENq52O@LTcJ.com")         // 店舗のメールアドレス
        .shopExternalId("lnsa7zuy1tusdwen7Z1wrrgdxWfKkMLw") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは[User](#user)クラスのインスタンスを返します

### Private Money

#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2018-06-10T11:50:19.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2018-05-11T20:25:55.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
`from`と`to`は同時に指定する必要があります。

成功したときは[PaginatedPrivateMoneyOrganizationSummaries](#paginated-private-money-organization-summaries)クラスのインスタンスを返します

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

<a name="check"></a>
## Check
* `getId() String`: チャージQRコードのID
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
* `getToken() String`: チャージQRコードを解析したときに出てくるURL

`getUser`は [User](#user) クラスのインスタンスを返します。

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="user"></a>
## User
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

<a name="organization"></a>
## Organization
* `getCode() String`: 組織コード
* `getName() String`: 組織名

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

<a name="paginated-private-money-organization-summaries"></a>
## PaginatedPrivateMoneyOrganizationSummaries
* `getRows() PrivateMoneyOrganizationSummary[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoneyOrganizationSummary](#private-money-organization-summary) クラスのインスタンスを返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transaction"></a>
## PaginatedTransaction
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスを返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-account-balance"></a>
## PaginatedAccountBalance
* `getRows() AccountBalance[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountBalance](#account-balance) クラスのインスタンスを返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。
