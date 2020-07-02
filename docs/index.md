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
```java
Request request = new GetTransaction(
    "631e65c2-6d34-49a9-992f-16533cac55b0"        // 取引ID
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

`getReceiver`と`getSender`には`User`クラスのインスタンスが入ります。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`には`Account`クラスのインスタンスが入ります。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`には`PrivateMoney`クラスのインスタンスが入ります。
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

`getOrganization`には`Organization`クラスのインスタンスが入ります。
* getCode (String): 組織コード
* getName (String): 組織名

#### チャージ取引を作成します。
```java
Request request = new CreateTopupTransaction(
    "66ba1260-1409-4191-8444-519f1ed3871c",       // 店舗ID
    "06ccf98e-cf4f-4ca9-9746-da427172e2bd",       // エンドユーザーのID
    "6e33579e-8626-4e42-a03a-469e67897545"        // マネーID
)
        .bearPointShopId("1e44d5cb-d5cd-4a81-8b5c-8bdcc91fe2b0") // ポイント支払時の負担店舗ID
        .moneyAmount(9984)                        // マネー額
        .pointAmount(6039)                        // ポイント額
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

`getReceiver`と`getSender`には`User`クラスのインスタンスが入ります。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`には`Account`クラスのインスタンスが入ります。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`には`PrivateMoney`クラスのインスタンスが入ります。
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

`getOrganization`には`Organization`クラスのインスタンスが入ります。
* getCode (String): 組織コード
* getName (String): 組織名

#### 支払取引を作成します。
```java
Request request = new CreatePaymentTransaction(
    "c4696ba7-a857-482c-a432-49f0e54daeaf",       // マネー店舗IDです。
    "fbd64354-8cfe-43ce-81a8-88c44278fbc6",       // エンドユーザーIDです。
    "58d50580-639d-4979-9222-de2f04629efb",       // マネーIDです。
    4968                                          // マネー額です。
)
        .description("たい焼き(小倉)");                 // 取引説明文です。
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

`getReceiver`と`getSender`には`User`クラスのインスタンスが入ります。
* getId (String): ユーザー (または店舗) ID
* getName (String): ユーザー (または店舗) 名
* isMerchant (boolean): 店舗ユーザーかどうか

`getReceiverAccount`と`getSenderAccount`には`Account`クラスのインスタンスが入ります。
* getId (String): 口座ID
* getName (String): 口座名
* isSuspended (boolean): 口座が凍結されているか
* getPrivateMoney (PrivateMoney): 設定マネー情報

`getPrivateMoney`には`PrivateMoney`クラスのインスタンスが入ります。
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

`getOrganization`には`Organization`クラスのインスタンスが入ります。
* getCode (String): 組織コード
* getName (String): 組織名

#### 取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2024-07-23T07-55-57+09:00")        // 開始日時
        .to("2022-06-11T17-44-20+09:00")          // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("af6b5e1b-bdeb-4877-82d4-cf3973584a6a") // 店舗ID
        .customerId("3f1499b2-ca53-4392-8206-ac1dd62a59c2") // エンドユーザーID
        .customerName("太郎")                       // エンドユーザー名
        .terminalId("ae078dd9-5b8a-48b2-b273-ab1c39244431") // 端末ID
        .transactionId("20896631-904f-4880-98a7-bfdc28a38389") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("4cafbfb9-43d0-4bae-99ad-60440185726e") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .types(new String[]{"topup","payment"});  // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
```
成功したときは以下のメソッドを含む`PaginatedTransaction`クラスのインスタンスを返します。
* getRows (Transaction[]): 
* getCount (int): 
* getPagination (Pagination): 

`getPagination`には`Pagination`クラスのインスタンスが入ります。
* getCurrent (int): 
* getPerPage (int): 
* getMaxPage (int): 
* getHasPrev (boolean): 
* getHasNext (boolean): 

