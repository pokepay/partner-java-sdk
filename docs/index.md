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
リクエストクラスは`jp.pokepay.partnerapi.request`以下に定義されます。

例として、送信した内容をそのまま返すCreateEchoは下記の通りです。

```java
Request request = new CreateEcho("hello");
Echo echo = (Echo) client.send(request);
System.out.println(echo.getStatus()); // => "ok"
System.out.println(echo.getMessage()); // => "hello"
```

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

- `getRawJson() string`: エラーレスポンスのjsonを文字列で返します。

<a name="api-operations"></a>
## API Operations

### Transaction

#### 取引情報を取得する
取引を取得します。
```java
Request request = new GetTransaction(
    "3c844ad7-8127-4792-b8c6-2ad5ef29289b"        // 取引ID
);
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
* getId (String): 取引ID
* getType (String): 取引種別 (チャージ=topup, 支払い=payment)
* isModified (boolean): 返金された取引か
* getSender (User): 送金者情報
* getSenderAccount (Account): 送金口座情報
* getReceiver (User): 受取者情報
* getReceiverAccount (Account): 受取口座情報
* getAmount (double): 決済総額 (マネー額 + ポイント額)
* getMoneyAmount (double): 決済マネー額
* getPointAmount (double): 決済ポイント額
* getDoneAt (String): 取引日時
* getDescription (String): 取引説明文

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

#### チャージする
チャージ取引を作成します。
```java
Request request = new CreateTopupTransaction(
    "34c63fc8-4f24-4de5-bd8c-12cfd2902f61",       // 店舗ID
    "0a373395-f48c-406a-bc5d-d3a562665f70",       // エンドユーザーのID
    "a7b9aff5-0547-42d5-9ba8-67d179104144"        // マネーID
)
        .bearPointShopId("c864d97b-1bb7-457b-8fd0-fc079f9a7607") // ポイント支払時の負担店舗ID
        .moneyAmount(421)                         // マネー額
        .pointAmount(1979)                        // ポイント額
        .description("初夏のチャージキャンペーン");            // 取引履歴に表示する説明文
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
* getId (String): 取引ID
* getType (String): 取引種別 (チャージ=topup, 支払い=payment)
* isModified (boolean): 返金された取引か
* getSender (User): 送金者情報
* getSenderAccount (Account): 送金口座情報
* getReceiver (User): 受取者情報
* getReceiverAccount (Account): 受取口座情報
* getAmount (double): 決済総額 (マネー額 + ポイント額)
* getMoneyAmount (double): 決済マネー額
* getPointAmount (double): 決済ポイント額
* getDoneAt (String): 取引日時
* getDescription (String): 取引説明文

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

#### 支払いする
支払取引を作成します。
```java
Request request = new CreatePaymentTransaction(
    "ba28055c-fec1-445c-aa3f-69181195b207",       // 店舗ID
    "1fa4aabb-7c9a-4b1e-af85-c01213c27add",       // エンドユーザーID
    "6d6de5e3-0f00-4d48-a5f3-7750a1414031",       // マネーID
    2477                                          // 支払い額
)
        .description("たい焼き(小倉)");                 // 取引履歴に表示する説明文
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
* getId (String): 取引ID
* getType (String): 取引種別 (チャージ=topup, 支払い=payment)
* isModified (boolean): 返金された取引か
* getSender (User): 送金者情報
* getSenderAccount (Account): 送金口座情報
* getReceiver (User): 受取者情報
* getReceiverAccount (Account): 受取口座情報
* getAmount (double): 決済総額 (マネー額 + ポイント額)
* getMoneyAmount (double): 決済マネー額
* getPointAmount (double): 決済ポイント額
* getDoneAt (String): 取引日時
* getDescription (String): 取引説明文

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

#### 取引履歴を取得する
取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2020-12-13T05-28-12+09:00")        // 開始日時
        .to("2017-12-20T19-55-09+09:00")          // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("ab211939-7978-4c25-a21f-0ccd90b68362") // 店舗ID
        .customerId("8c701049-d664-4b3b-8e9d-7564ec2e0349") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("7d0c6d15-6469-4e36-a7cc-59ed761eae6f") // 端末ID
        .transactionId("7d1cae2a-a795-4776-b5ef-4756fa35f219") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("b6383f81-c09d-49e7-8aa7-4806b1fb76e8") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .types(new String[]{"topup","payment"});  // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
```
成功したときは以下のメソッドを含む`PaginatedTransaction`クラスのインスタンスを返します。
* getRows (Transaction[]): 
* getCount (int): 
* getPagination (Pagination): 

`getRows`は`Transaction`クラスのインスタンスを返します。
* getId (String): 取引ID
* getType (String): 取引種別 (チャージ=topup, 支払い=payment)
* isModified (boolean): 返金された取引か
* getSender (User): 送金者情報
* getSenderAccount (Account): 送金口座情報
* getReceiver (User): 受取者情報
* getReceiverAccount (Account): 受取口座情報
* getAmount (double): 決済総額 (マネー額 + ポイント額)
* getMoneyAmount (double): 決済マネー額
* getPointAmount (double): 決済ポイント額
* getDoneAt (String): 取引日時
* getDescription (String): 取引説明文

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

`getPagination`は`Pagination`クラスのインスタンスを返します。
* getCurrent (int): 
* getPerPage (int): 
* getMaxPage (int): 
* getHasPrev (boolean): 
* getHasNext (boolean): 

### チャージQRコード

店舗ユーザが発行し、エンドユーザがポケペイアプリから読み取ることでチャージ取引が発生するQRコードです。

チャージQRコードを解析すると次のようなURLになります(URLは環境によって異なります)。

https://www-sandbox.pokepay.jp/checks/xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx

QRコードを読み取る方法以外にも、このURLリンクを直接スマートフォン(iOS/Android)上で開くことによりアプリが起動して取引が行われます。(注意: 上記URLはsandbox環境であるため、アプリもsandbox環境のものである必要があります) 上記URL中の xxxxxxxx-xxxx-xxxxxxxxx-xxxxxxxxxxxx の部分がチャージQRコードのIDです。

#### チャージQRコードの発行
```java
Request request = new CreateCheck(
    "95db60a3-22ef-46da-86c7-38ffea0fe3bf"        // 送金元の店舗アカウントID
)
        .moneyAmount(3464)                        // 付与マネー額
        .pointAmount(6952)                        // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(false)                        // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(8269)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2025-05-06T16-00-19+09:00")   // チャージQR自体の失効日時
        .pointExpiresAt("2019-03-30T05-22-47+09:00") // チャージQRによって付与されるポイントの失効日時
        .pointExpiresInDays(60)                   // チャージQRによって付与されるポイントの有効期限(相対指定、単位は日)
        .bearPointAccount("62ed66e4-67eb-4fd7-a174-3f5d1ae4eb50"); // ポイント額を負担する店舗アカウントのID
```
成功したときは以下のメソッドを含む`Check`クラスのインスタンスを返します。
* getId (String): チャージQRコードのID
* getAmount (double): チャージマネー額 (deprecated)
* getMoneyAmount (double): チャージマネー額
* getPointAmount (double): チャージポイント額
* getDescription (String): チャージQRコードの説明文(アプリ上で取引の説明文として表示される)
* getUser (User): 送金元ユーザ情報
* isOnetime (boolean): 使用回数が一回限りかどうか
* isDisabled (boolean): 無効化されているかどうか
* getExpiresAt (String): チャージQRコード自体の失効日時
* getPrivateMoney (PrivateMoney): 対象マネー情報
* getUsageLimit (int): 一回限りでない場合の最大読み取り回数
* getUsageCount (double): 一回限りでない場合の現在までに読み取られた回数
* getToken (String): チャージQRコードを解析したときに出てくるURL

`getUser`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

#### チャージQRコードを読み取ることでチャージする
通常チャージQRコードはエンドユーザのアプリによって読み取られ、アプリとポケペイサーバとの直接通信によって取引が作られます。 もしエンドユーザとの通信をパートナーのサーバのみに限定したい場合、パートナーのサーバがチャージQRの情報をエンドユーザから代理受けして、サーバ間連携APIによって実際のチャージ取引をリクエストすることになります。

エンドユーザから受け取ったチャージ用QRコードのIDをエンドユーザIDと共に渡すことでチャージ取引が作られます。

```java
Request request = new CreateTopupTransactionWithCheck(
    "be7937ae-b2bf-4ba7-9e21-4982276505a1",       // チャージ用QRコードのID
    "9e58ef3c-cc30-4b28-a8c5-7756b75ee9a8"        // エンドユーザーのID
);
```
成功したときは以下のメソッドを含む`Transaction`クラスのインスタンスを返します。
* getId (String): 取引ID
* getType (String): 取引種別 (チャージ=topup, 支払い=payment)
* isModified (boolean): 返金された取引か
* getSender (User): 送金者情報
* getSenderAccount (Account): 送金口座情報
* getReceiver (User): 受取者情報
* getReceiverAccount (Account): 受取口座情報
* getAmount (double): 決済総額 (マネー額 + ポイント額)
* getMoneyAmount (double): 決済マネー額
* getPointAmount (double): 決済ポイント額
* getDoneAt (String): 取引日時
* getDescription (String): 取引説明文

`getReceiver`と`getSender`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`は`Account`クラスのインスタンスを返します。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

### Customer

#### 新規エンドユーザー口座を追加する
指定したマネーのウォレットを作成し、同時にそのウォレットを保有するユーザも作成します。
```java
Request request = new CreateCustomerAccount(
    "ea31fcce-353f-462c-a2f4-19a827b1d4af"        // マネーID
)
        .userName("ポケペイ太郎")                       // ユーザー名
        .accountName("ポケペイ太郎のアカウント");             // アカウント名
```
成功したときは以下のメソッドを含む`AccountWithUser`クラスのインスタンスを返します。
* getId (String): 
* getName (String): 
* isSuspended (boolean): 
* getPrivateMoney (PrivateMoney): 
* getUser (User): 

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

`getUser`は`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

#### エンドユーザーの口座情報を表示する
ウォレットを取得します。
```java
Request request = new GetAccount(
    "778f85a9-ad27-402d-a6a0-ac8220082f57"        // ウォレットID
);
```
成功したときは以下のメソッドを含む`AccountDetail`クラスのインスタンスを返します。
* getId (String): 
* getName (String): 
* isSuspended (boolean): 
* getBalance (double): 
* getMoneyBalance (double): 
* getPointBalance (double): 
* getPrivateMoney (PrivateMoney): 

`getPrivateMoney`は`PrivateMoney`クラスのインスタンスを返します。
* getId (String): マネーID
* getName (String): マネー名
* getUnit (String): マネー単位 (例: 円)
* isExclusive (boolean): 会員制のマネーかどうか
* getDescription (String): マネー説明文
* getOnelineMessage (String): マネーの要約
* getOrganization (Organization): マネーを発行した組織
* getMaxBalance (double): 口座の上限金額
* getTransferLimit (double): マネーの取引上限額
* getType (String): マネー種別 (自家型=own, 第三者型=third-party)
* getExpirationType (String): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
* getEnableTopupByMember (boolean): 加盟店によるチャージが有効か
* getAccountImage (String): マネーの画像URL

`getOrganization`は`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

#### エンドユーザーの残高内訳を表示する
エンドユーザーの残高は有効期限別のリストとして取得できます。
```java
Request request = new ListAccountBalances(
    "46021182-60fb-440a-a1b5-3c2cf7bbd4cb"        // ウォレットID
)
        .page(8091)                               // 取得したいページ番号です。
        .perPage(3575);                           // 1ページ分のウォレット残高数です。
```
成功したときは以下のメソッドを含む`PaginatedAccountBalance`クラスのインスタンスを返します。
* getRows (AccountBalance[]): 
* getCount (int): 
* getPagination (Pagination): 

`getRows`は`AccountBalance`クラスのインスタンスを返します。
* getExpiresAt (String): 
* getMoneyAmount (double): 
* getPointAmount (double): 

`getPagination`は`Pagination`クラスのインスタンスを返します。
* getCurrent (int): 
* getPerPage (int): 
* getMaxPage (int): 
* getHasPrev (boolean): 
* getHasNext (boolean): 

### Organization

#### 新規加盟店組織を追加する
```java
Request request = new CreateOrganization(
    "ox_supermarket",                             // 新規組織コード
    "oxスーパー",                                     // 新規組織名
    new String[]{"39bb9d75-3d16-4dae-908d-cfb09d5f14f4","d5bda17b-5d1f-4c7c-9da0-c846fe42d9ad","82729211-15ed-48a4-8f65-80490b751b14"}, // 加盟店組織で有効にするマネーIDの配列
    "6Gcp6PWCiN@ymBa.com",                        // 発行体担当者メールアドレス
    "UIu6lQIyVN@DYRt.com"                         // 新規組織担当者メールアドレス
)
        .bankName("XYZ銀行")                        // 銀行名
        .bankCode("99X")                          // 銀行金融機関コード
        .bankBranchName("ABC支店")                  // 銀行支店名
        .bankBranchCode("99X")                    // 銀行支店コード
        .bankAccountType("saving")                // 銀行口座種別 (普通=saving, 当座=current, その他=other)
        .bankAccount("9999999")                   // 銀行口座番号
        .bankAccountHolderName("ﾌｸｻﾞﾜﾕｷﾁ")        // 口座名義人名
        .contactName("佐藤清");                      // 担当者名
```
成功したときは以下のメソッドを含む`Organization`クラスのインスタンスを返します。
* getCode (String): 組織コード
* getName (String): 組織名

### Shop

#### 新規店舗を追加する
```java
Request request = new CreateShop(
    "oxスーパー三田店"                                   // 店舗名
)
        .shopPostalCode("2384640")                // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("080-9248-021")                  // 店舗の電話番号
        .shopEmail("MuAdnXANii@xumu.com")         // 店舗のメールアドレス
        .shopExternalId("ncg7egxc7L05i8jkZ1Waa6h6AAgB9jXe") // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード
```
成功したときは以下のメソッドを含む`User`クラスのインスタンスを返します。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

### Private Money

#### 決済加盟店の取引サマリを取得する
```java
Request request = new GetPrivateMoneyOrganizationSummaries(
    "4a1eeda2-e4f3-4efd-8100-3563a6e50659"        // マネーID
)
        .from("2024-02-12T00-23-26+09:00")        // 開始日時(toと同時に指定する必要有)
        .to("2022-06-23T08-31-22+09:00")          // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数
```
成功したときは以下のメソッドを含む`PaginatedPrivateMoneyOrganizationSummaries`クラスのインスタンスを返します。
* getRows (PrivateMoneyOrganizationSummary[]): 
* getCount (int): 
* getPagination (Pagination): 

`getRows`は`PrivateMoneyOrganizationSummary`クラスのインスタンスを返します。
* getOrganizationCode (String): 
* getTopup (OrganizationSummary): 
* getPayment (OrganizationSummary): 

`getPayment`と`getTopup`は`OrganizationSummary`クラスのインスタンスを返します。
* getCount (int): 
* getMoneyAmount (double): 
* getMoneyCount (int): 
* getPointAmount (double): 
* getPointCount (int): 

`getPagination`は`Pagination`クラスのインスタンスを返します。
* getCurrent (int): 
* getPerPage (int): 
* getMaxPage (int): 
* getHasPrev (boolean): 
* getHasNext (boolean): 

