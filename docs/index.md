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

例として、送信した内容をそのまま返すCreateEchoを下記に記します。

```java
Request request = new CreateEcho("hello");
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
    "cfdfee98-1634-4e77-9fd5-1b1652baf491"        // 取引ID
);
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
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

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* `getId() String`: ウォレットID
* `getName() String`: ウォレット
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

#### チャージする
チャージ取引を作成します。
```java
Request request = new CreateTopupTransaction(
    "95ecd0c0-50ec-49be-8197-907a09ef17c9",       // 店舗ID
    "f436f635-85a1-4e54-b6bd-546b31a181c3",       // エンドユーザーのID
    "b5a43491-d8c2-4da7-8052-d3df107b84ad"        // マネーID
)
        .bearPointShopId("7c4e0d26-2a69-4ea9-80ef-55c77f23bfe7") // ポイント支払時の負担店舗ID
        .moneyAmount(3910)                        // マネー額
        .pointAmount(9264)                        // ポイント額
        .description("初夏のチャージキャンペーン");            // 取引履歴に表示する説明文
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
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

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* `getId() String`: ウォレットID
* `getName() String`: ウォレット
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

#### 支払いする
支払取引を作成します。
```java
Request request = new CreatePaymentTransaction(
    "3f3641d6-fcf7-45f5-8f72-1cb41b179ab1",       // 店舗ID
    "994c0cac-3ff6-498f-8877-753e5cc3b3dc",       // エンドユーザーID
    "c16c533d-4227-411a-9b20-1012364cedc2",       // マネーID
    4027                                          // 支払い額
)
        .description("たい焼き(小倉)");                 // 取引履歴に表示する説明文
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
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

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* `getId() String`: ウォレットID
* `getName() String`: ウォレット
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2021-03-24T21:56:27.000000+09:00") // 開始日時
        .to("2023-11-05T08:03:49.000000+09:00")   // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("c08a6e92-9a5c-43b8-b645-65e45c08636a") // 店舗ID
        .customerId("f8ec26a8-7ce1-4e5a-9df5-d30a7a8e05a0") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("f45c3d6c-c381-46fb-9461-3a7ad7bb5372") // 端末ID
        .transactionId("9427984f-75e5-4891-a7a6-9551766dc348") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("5bda6d11-aba5-4874-a4c1-0990800c264d") // マネーID
        .setModified(true)                        // キャンセルフラグ
        .types(new String[]{"topup","payment"});  // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
```
成功したときは以下のメソッドを含む`PaginatedTransaction`クラスのインスタンスを返します。
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は`Transaction`クラスのインスタンスを返します。
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

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* `getId() String`: ウォレットID
* `getName() String`: ウォレット
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

`getPagination`は`Pagination`クラスのインスタンスを返します。
* `getCurrent() int`: 
* `getPerPage() int`: 
* `getMaxPage() int`: 
* `getHasPrev() boolean`: 
* `getHasNext() boolean`: 

### チャージQRコード

店舗ユーザが発行し、エンドユーザがポケペイアプリから読み取ることでチャージ取引が発生するQRコードです。

チャージQRコードを解析すると次のようなURLになります(URLは環境によって異なります)。

https://www-sandbox.pokepay.jp/checks/xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx

QRコードを読み取る方法以外にも、このURLリンクを直接スマートフォン(iOS/Android)上で開くことによりアプリが起動して取引が行われます。(注意: 上記URLはsandbox環境であるため、アプリもsandbox環境のものである必要があります) 上記URL中の xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx の部分がチャージQRコードのIDです。

#### チャージQRコードの発行
```java
Request request = new CreateCheck(
    "d5ba80be-6a6b-4420-8c7c-18b8da477c97"        // 送金元の店舗アカウントID
)
        .moneyAmount(1274)                        // 付与マネー額
        .pointAmount(2111)                        // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(true)                         // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(2232)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2023-07-05T22:30:41.000000+09:00") // チャージQR自体の失効日時
        .pointExpiresAt("2023-11-24T10:52:14.000000+09:00") // チャージQRによって付与されるポイントの失効日時
        .pointExpiresInDays(60)                   // チャージQRによって付与されるポイントの有効期限(相対指定、単位は日)
        .bearPointAccount("3130f7b6-b750-49a5-a797-abf15ee1244d"); // ポイント額を負担する店舗アカウントのID
```
成功したときは以下のメソッドを含む`Check`クラスのインスタンスを返します。
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

`getUser`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

#### チャージQRコードを読み取ることでチャージする
通常チャージQRコードはエンドユーザのアプリによって読み取られ、アプリとポケペイサーバとの直接通信によって取引が作られます。 もしエンドユーザとの通信をパートナーのサーバのみに限定したい場合、パートナーのサーバがチャージQRの情報をエンドユーザから代理受けして、サーバ間連携APIによって実際のチャージ取引をリクエストすることになります。

エンドユーザから受け取ったチャージ用QRコードのIDをエンドユーザIDと共に渡すことでチャージ取引が作られます。

```java
Request request = new CreateTopupTransactionWithCheck(
    "48d5ae13-5ae1-4526-9990-84fe30f215a1",       // チャージ用QRコードのID
    "62be8c6a-fcf4-4e58-a6a4-3722b7fe8dda"        // エンドユーザーのID
);
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
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

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* `getId() String`: ウォレットID
* `getName() String`: ウォレット
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

### Customer

#### 新規エンドユーザーウォレットを追加する
指定したマネーのウォレットを作成し、同時にそのウォレットを保有するユーザも作成します。
```java
Request request = new CreateCustomerAccount(
    "a7402441-e7db-4e9b-a3fd-5cb2eb86a33e"        // マネーID
)
        .userName("ポケペイ太郎")                       // ユーザー名
        .accountName("ポケペイ太郎のアカウント");             // アカウント名
```
成功したときは以下のメソッドを含む`AccountWithUser`クラスのインスタンスを返します。
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

`getUser`は`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

#### エンドユーザーのウォレット情報を表示する
ウォレットを取得します。
```java
Request request = new GetAccount(
    "82fef953-ba5b-44de-a859-f5255a3014aa"        // ウォレットID
);
```
成功したときは以下のメソッドを含む`AccountDetail`クラスのインスタンスを返します。
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getBalance() double`: 
* `getMoneyBalance() double`: 
* `getPointBalance() double`: 
* `getPrivateMoney() PrivateMoney`: 

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: マネーの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`: 加盟店によるチャージが有効かどうか
* `getAccountImage() String`: マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

#### エンドユーザーの残高内訳を表示する
エンドユーザーの残高は有効期限別のリストとして取得できます。
```java
Request request = new ListAccountBalances(
    "b47431ec-1fbb-4631-a3d2-14d31e8520fb"        // ウォレットID
)
        .page(7666)                               // 取得したいページ番号です。
        .perPage(1461);                           // 1ページ分のウォレット残高数です。
```
成功したときは以下のメソッドを含む`PaginatedAccountBalance`クラスのインスタンスを返します。
* `getRows() AccountBalance[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は`AccountBalance`クラスのインスタンスを返します。
* `getExpiresAt() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 

`getPagination`は`Pagination`クラスのインスタンスを返します。
* `getCurrent() int`: 
* `getPerPage() int`: 
* `getMaxPage() int`: 
* `getHasPrev() boolean`: 
* `getHasNext() boolean`: 

### Organization

#### 新規加盟店組織を追加する
```java
Request request = new CreateOrganization(
    "ox_supermarket",                             // 新規組織コード
    "oxスーパー",                                     // 新規組織名
    new String[]{"0cf15fd3-3709-403c-b100-2ad20bfc2391"}, // 加盟店組織で有効にするマネーIDの配列
    "Wp1hKlNvpH@M0s7.com",                        // 発行体担当者メールアドレス
    "Dd9Uu6qWqC@0qUt.com"                         // 新規組織担当者メールアドレス
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
成功したときは以下のメソッドを含む`Organization`クラスのインスタンスを返します。
* `getCode() String`: 組織コード
* `getName() String`: 組織名

### Shop

#### 新規店舗を追加する
```java
Request request = new CreateShop(
    "oxスーパー三田店"                                   // 店舗名
)
        .shopPostalCode("179-4028")               // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("01-43346013")                   // 店舗の電話番号
        .shopEmail("2kusM3cVDM@OGMt.com")         // 店舗のメールアドレス
        .shopExternalId("pxWNvKR6Gcp6PWCiNymBaUIu6lQIyVNDYRt") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは以下のメソッドを含む`User`クラスのインスタンスを返します。
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

### Private Money

#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "71baf5ae-90b6-45f4-ad02-aa218aec93a1"        // マネーID
)
        .from("2024-08-03T21:24:23.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2020-09-16T14:27:50.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
成功したときは以下のメソッドを含む`PaginatedPrivateMoneyOrganizationSummaries`クラスのインスタンスを返します。
* `getRows() PrivateMoneyOrganizationSummary[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は`PrivateMoneyOrganizationSummary`クラスのインスタンスを返します。
* `getOrganizationCode() String`: 
* `getTopup() OrganizationSummary`: 
* `getPayment() OrganizationSummary`: 

`getPayment`と`getTopup`は`OrganizationSummary`クラスのインスタンスを返します。
* `getCount() int`: 
* `getMoneyAmount() double`: 
* `getMoneyCount() int`: 
* `getPointAmount() double`: 
* `getPointCount() int`: 

`getPagination`は`Pagination`クラスのインスタンスを返します。
* `getCurrent() int`: 
* `getPerPage() int`: 
* `getMaxPage() int`: 
* `getHasPrev() boolean`: 
* `getHasNext() boolean`: 

