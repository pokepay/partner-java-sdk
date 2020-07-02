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

## API Operations

### Transaction

#### 取引情報を取得する
取引を取得します。
```java
Request request = new GetTransaction(
    "c0acd8e7-326b-40f5-bd55-313ddb130d11"        // 取引ID
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
    "ade3a92a-7731-4028-b825-8c08d6789ff7",       // 店舗ID
    "4abd32b4-8a68-464f-a3ed-f62474f968d3",       // エンドユーザーのID
    "7d8d47e4-eaa6-42fe-bc99-7e705b0a794b"        // マネーID
)
        .bearPointShopId("63f86e7a-623d-4385-9ce2-b5a5c279f39d") // ポイント支払時の負担店舗ID
        .moneyAmount(2793)                        // マネー額
        .pointAmount(3244)                        // ポイント額
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
    "adb220ad-1550-45af-89ae-f12f883f3108",       // 店舗ID
    "d14a14d3-fab4-4920-ba4a-e299446f3d3b",       // エンドユーザーID
    "dbfe891e-7e54-494b-acd4-a0306f40467a",       // マネーID
    9637                                          // 支払い額
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
        .from("2018-09-10T03-33-16+09:00")        // 開始日時
        .to("2015-08-28T06-53-11+09:00")          // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("22c78980-7f06-43f5-bca1-574fc447f84e") // 店舗ID
        .customerId("e93ac158-6c7e-4a1e-ac88-ec0bffb52440") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("558f90d7-3d46-45e1-8324-076a181aa418") // 端末ID
        .transactionId("d42c5f79-be6e-4626-9311-95839686814b") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("4fecf85b-403b-4c1f-9cf5-3231587515ad") // マネーID
        .setModified(true)                        // キャンセルフラグ
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
    "b88648f8-857a-40fc-bf36-6c709bafba86"        // 送金元の店舗アカウントID
)
        .moneyAmount(1985)                        // 付与マネー額
        .pointAmount(4924)                        // 付与ポイント額
        .description("test check")                // 説明文(アプリ上で取引の説明文として表示される)
        .setOnetime(true)                         // ワンタイムかどうか。真の場合1度読み込まれた時点でそのチャージQRは失効する(デフォルト値は真)
        .usageLimit(7538)                         // ワンタイムでない場合、複数ユーザから読み取られ得る。その場合の最大読み取り回数
        .expiresAt("2016-01-05T14-06-30+09:00")   // チャージQR自体の失効日時
        .pointExpiresAt("2022-04-11T05-23-53+09:00") // チャージQRによって付与されるポイントの失効日時
        .pointExpiresInDays(60)                   // チャージQRによって付与されるポイントの有効期限(相対指定、単位は日)
        .bearPointAccount("55110f47-5621-47e0-83e4-ec73a2f8bb60"); // ポイント額を負担する店舗アカウントのID
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
    "d8c0b823-79ad-4360-a8aa-562c2523930c",       // チャージ用QRコードのID
    "167bc7e7-824b-4f31-bb3e-79d677e1d3f5"        // エンドユーザーのID
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
    "8b645909-e1ec-493d-a3d5-8b120f2a5fe3"        // マネーID
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
    "9ae3ab41-7f2f-4cbd-95e1-b5cff5bc8f2b"        // ウォレットID
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
    "9ad78a7d-be46-4367-923a-6e4f2ba1390f"        // ウォレットID
)
        .page(315)                                // 取得したいページ番号です。
        .perPage(777);                            // 1ページ分のウォレット残高数です。
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
    new String[]{"1fdb64d8-e2d8-46be-9c09-be7f34cfbb99"}, // 加盟店組織で有効にするマネーIDの配列
    "rgsQZQAnUY@eKIb.com",                        // 発行体担当者メールアドレス
    "ZQuPYAKNLv@TyMc.com"                         // 新規組織担当者メールアドレス
)
        .bankName("XYZ銀行")                        // 銀行名
        .bankCode("99X")                          // 銀行金融機関コード
        .bankBranchName("ABC支店")                  // 銀行支店名
        .bankBranchCode("99X")                    // 銀行支店コード
        .bankAccountType("current")               // 銀行口座種別 (普通=saving, 当座=current, その他=other)
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
        .shopPostalCode("939-0279")               // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("035848-068")                    // 店舗の電話番号
        .shopEmail("9LO3MtPyt1@wTnk.com")         // 店舗のメールアドレス
        .shopExternalId("tL8AYkBvD7caRgncONv")    // 店舗の外部ID
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
    "5e9a59da-396e-44a5-af89-bb02c20f8e26"        // マネーID
)
        .from("2024-04-02T03-01-23+09:00")        // 開始日時(toと同時に指定する必要有)
        .to("2018-11-12T13-37-28+09:00")          // 終了日時(fromと同時に指定する必要有)
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

