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
        .moneyAmount(9829)                        // マネー額
        .pointAmount(3839)                        // ポイント額
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
`description`  
取引説明文です。

任意入力で、取引履歴に表示される説明文です。

---
成功したときは[Transaction](#transaction)クラスのインスタンスを返します

#### 支払いする
支払取引を作成します。
支払い時には、エンドユーザーの残高のうち、ポイント残高から優先的に消費されます。

```java
Request request = new CreatePaymentTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    9578                                          // amount: 支払い額
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

#### 個人間送金
エンドユーザー間での送金取引(個人間送金)を作成します。
個人間送金で送れるのはマネーのみで、ポイントを送ることはできません。送金元のマネー残高のうち、有効期限が最も遠いものから順に送金されます。

```java
Request request = new CreateTransferTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // senderId: 送金元ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // receiverId: 受取ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    2298                                          // amount: 送金額
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

#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2022-12-14T10:46:43.000000+09:00") // 開始日時
        .to("2024-01-27T16:51:48.000000+09:00")   // 終了日時
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
        .moneyAmount(4826)                        // 付与マネー額
        .pointAmount(2394)                        // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(true)                         // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(3826)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2019-02-22T16:57:44.000000+09:00") // チャージQR自体の失効日時
        .pointExpiresAt("2024-02-13T17:41:07.000000+09:00") // チャージQRによって付与されるポイントの失効日時
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

### 支払いQRコード

#### 支払いQRコード一覧を表示する
支払いQRコード一覧を表示します。
```java
Request request = new ListBills()
        .page(6649)                               // ページ番号
        .perPage(2896)                            // 1ページの表示数
        .billId("3x6r1")                          // 支払いQRコードのID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .organizationCode("70s2krAk--iSH3DW--7--d----N") // 組織コード
        .description("test bill")                 // 取引説明文
        .createdFrom("2022-07-07T06:17:16.000000+09:00") // 作成日時(起点)
        .createdTo("2024-09-06T18:44:09.000000+09:00") // 作成日時(終点)
        .shopName("bill test shop1")              // 店舗名
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .lowerLimitAmount(8780)                   // 金額の範囲によるフィルタ(下限)
        .upperLimitAmount(8338)                   // 金額の範囲によるフィルタ(上限)
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
支払いQRコードのIDを指定して検索します。IDは部分一致で検索できます。

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
支払いQRコードを作成した店舗名でフィルターします。

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

#### 支払いQRコードの発行
支払いQRコードの内容を更新します。支払い先の店舗ユーザーは指定したマネーのウォレットを持っている必要があります。
```java
Request request = new CreateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: 支払いマネーのマネーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 支払い先(受け取り人)の店舗ID
)
        .amount(9137)                             // 支払い額
        .description("test bill");                // 説明文(アプリ上で取引の説明文として表示される)
```

---
`amount`  
支払いQRコードを支払い額を指定します。省略するかnullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

---
成功したときは[Bill](#bill)クラスのインスタンスを返します

#### 支払いQRコードの更新
支払いQRコードの内容を更新します。パラメータは全て省略可能で、指定したもののみ更新されます。
```java
Request request = new UpdateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // billId: 支払いQRコードのID
)
        .amount(8582)                             // 支払い額
        .description("test bill")                 // 説明文
        .setDisabled(false);                      // 無効化されているかどうか
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

#### エンドユーザーの残高内訳を表示する
エンドユーザーのウォレット毎の残高を有効期限別のリストとして取得します。
```java
Request request = new ListAccountBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(1912)                               // ページ番号
        .perPage(4503)                            // 1ページ分の取引数
        .expiresAtFrom("2021-11-26T22:06:49.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2019-12-08T14:37:45.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
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

#### エンドユーザーの失効済みの残高内訳を表示する
エンドユーザーのウォレット毎の失効済みの残高を有効期限別のリストとして取得します。
```java
Request request = new ListAccountExpiredBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(7446)                               // ページ番号
        .perPage(9384)                            // 1ページ分の取引数
        .expiresAtFrom("2020-08-10T16:38:08.000000+09:00") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2024-03-31T04:16:45.000000+09:00") // 有効期限の期間によるフィルター(終了時点)
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
有効期限によるソートの順序を指定します。デフォルト値はdesc (降順)です。

---
成功したときは[PaginatedAccountBalance](#paginated-account-balance)クラスのインスタンスを返します

#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListCustomerTransactions(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .senderCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 送金エンドユーザーID
        .receiverCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 受取エンドユーザーID
        .type("sFsWbo7bpQ")                       // 取引種別、チャージ=topup、支払い=payment、個人間送金=transfer
        .setModified(true)                        // キャンセル済みかどうか
        .from("2021-04-11T02:43:13.000000+09:00") // 開始日時
        .to("2022-03-18T03:41:42.000000+09:00")   // 終了日時
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

#### 新規加盟店組織を追加する
```java
Request request = new CreateOrganization(
    "ox_supermarket",                             // code: 新規組織コード
    "oxスーパー",                                     // name: 新規組織名
    new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}, // privateMoneyIds: 加盟店組織で有効にするマネーIDの配列
    "PszkN335U1@t4DY.com",                        // issuerAdminUserEmail: 発行体担当者メールアドレス
    "suiE88p3Ho@g0k8.com"                         // memberAdminUserEmail: 新規組織担当者メールアドレス
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
        .shopPostalCode("805-5907")               // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("06-01122")                      // 店舗の電話番号
        .shopEmail("n8ATMTNMME@yVAp.com")         // 店舗のメールアドレス
        .shopExternalId("kaDeYuOtBoCZgc4gwc8RSE7") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは[User](#user)クラスのインスタンスを返します

#### 店舗一覧を取得する
```java
Request request = new ListShops()
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .name("oxスーパー三田店")                        // 店舗名
        .postalCode("257-1310")                   // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("0689-859-5517")                     // 店舗の電話番号
        .email("pb9AHk6UF1@UjWU.com")             // 店舗のメールアドレス
        .externalId("yw97H5Wi0UlM5hWRopq8fm3QjwrUJD") // 店舗の外部ID
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

### Account

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

#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2021-01-27T10:09:02.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2016-02-05T23:42:53.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
`from`と`to`は同時に指定する必要があります。

成功したときは[PaginatedPrivateMoneyOrganizationSummaries](#paginated-private-money-organization-summaries)クラスのインスタンスを返します

### バルクチャージ

#### CSVファイル一括取引
CSVファイルから一括取引をします。
```java
Request request = new BulkCreateTransaction(
    "IEgbGEOQG1PZp7fjd9",                         // name: 一括取引タスク名
    "1zgh1",                                      // content: 取引する情報のCSV
    "RHHtL55R7YEprCJ0U4QnLZWmGvTqLQwaZ9vO"        // requestId: リクエストID
)
        .description("v67spoRoPKUgWvYVa3Gv9xbfzvgScohGvfvszFZKZ0fsirdyb8N5N4uLXeppDXZ9aq2pYugtiiL7qWoYElTKmZkEzCv7OKUa8NeEnF41oUMWRj1"); // 一括取引の説明
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
- `sender_account_id`: 送金ウォレットID
  - 必須。UUID
- `receiver_account_id`: 受取ウォレットID
  - 必須。UUID
- `money_amount`: マネー額
  - 任意。ただし `point_amount` といずれかが必須。0以上の数字
- `point_amount`: ポイント額
  - 任意。ただし `money_amount` といずれかが必須。0以上の数字
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
* `getToken() String`: 

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

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

<a name="bulk-transaction"></a>
## BulkTransaction
* `getRequestId() String`: リクエストID
* `getName() String`: バルクチャージ管理用の名前
* `getDescription() String`: バルクチャージ管理用の説明文
* `getStatus() String`: バルクチャージの状態
* `getSubmittedAt() String`: バルクチャージが登録された日時
* `getUpdatedAt() String`: バルクチャージが更新された日時

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

`getRows`は [PrivateMoneyOrganizationSummary](#private-money-organization-summary) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transaction"></a>
## PaginatedTransaction
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

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
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は [Organization](#organization) クラスのインスタンスを返します。

<a name="account"></a>
## Account
* `getId() String`: ウォレットID
* `getName() String`: ウォレット名
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="account-without-private-money-detail"></a>
## AccountWithoutPrivateMoneyDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getPrivateMoneyId() String`: 
* `getUser() User`: 

`getUser`は [User](#user) クラスのインスタンスを返します。

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
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID
