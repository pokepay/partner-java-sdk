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
    "d1fee732-faad-44be-88a6-b7e42b9ccc66"        // 取引ID
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
    "2556f358-5fdb-423c-baf7-d2518ffefb30",       // 店舗ID
    "be26edc9-580e-440b-a9ee-4104a9178dcd",       // エンドユーザーのID
    "a67ec27c-67f9-4010-a71c-9c6fe8fb380e"        // マネーID
)
        .bearPointShopId("327c53b8-2249-46ab-ba02-7268480db86f") // ポイント支払時の負担店舗ID
        .moneyAmount(939)                         // マネー額
        .pointAmount(7514)                        // ポイント額
        .description("bCHGDImjW34z4jE8W9hhkpYWEzZLn5uyvbNkfkqdGOYba42tK1ETZVrimXQx2toEzw7Z1gM6fgx4uEjyIUvTVKqmlOa23scUcryj4GBWTbDzAVeKXVTy"); // 取引履歴に表示する説明文
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
    "d9bf6ea4-4d77-4a2a-887a-c36c69287e39",       // マネー店舗IDです。
    "82f94916-c5cc-4108-8c22-6fe84432ff0c",       // エンドユーザーIDです。
    "04799040-1a4d-4363-84da-25b054e1a4e2",       // マネーIDです。
    5198                                          // マネー額です。
)
        .description("NAUp6ljdawfubjQ03lDRu1dHypEu4pqRk9KXyywxfAsvQQw8eNXwtPfKAW4UwDxtqXzHNdytk1inQrWiktMK0FHLyLnvzTdFf0Y1JODoBhEEJFs7RURiJHf"); // 取引説明文です。
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


(#<STRING-ARGUMENT-IR (:NAME NIL :VALUE "topup")> #<STRING-ARGUMENT-IR (:NAME NIL :VALUE "payment")>) #### 取引一覧を返します。
```java
Request request = new ListTransactions()
        .from("2023-10-23T09-09-51+09:00")        // 開始日時
        .to("2023-11-26T02-51-33+09:00")          // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("8770280c-07c7-45f5-a58e-a107bc31a5c8") // 店舗ID
        .customerId("663030e4-6160-4b12-9f0a-c21bd0d8677c") // エンドユーザーID
        .customerName("glgKA3t551AWYy2EKxgIvudVQKM3ivlyVYA6fe68jtm2G7nC3SW8MPeFKTYT7eEYLwvHQFKDImV0W8uMWRziTXMumFeaEHdh8PePoMZwnAEmuUL6pb761IWS7zT3jmF3XMzgKDKO5o6UqQsbMF41dYUnemzRdROKbGph7rD") // エンドユーザー名
        .terminalId("2f955a0a-9817-4765-932a-e23c92af0393") // 端末ID
        .transactionId("5452dbda-995d-4e0d-8dbc-ca5ec7b060d3") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("446aa24d-262d-4e72-a2d5-a0773f63d9fe") // マネーID
        .setModified(true)                        // キャンセルフラグ
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

