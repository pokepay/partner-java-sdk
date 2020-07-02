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
    "e5efa092-664c-4d27-90aa-f717085e237c"        // 取引ID
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
    "194c8833-d289-47ab-8ff3-53484d034df0",       // 店舗ID
    "c994adda-36fb-48fb-9562-cc6cbe872d1b",       // エンドユーザーのID
    "6010aaaa-cd77-491d-91e9-90c2e5c8415b"        // マネーID
)
        .bearPointShopId("bbc414f5-127c-4cb8-90ea-a1c3db098f80") // ポイント支払時の負担店舗ID
        .moneyAmount(5801)                        // マネー額
        .pointAmount(8114)                        // ポイント額
        .description("NxmvSo3IMgKOG9RqgqLtsxscDVj4qDxwlIsjYdDsgNzWfMVYN8tFORiCKaN1GSBk"); // 取引履歴に表示する説明文
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
    "231de2cd-5cb8-4af6-b493-88353c1d5427",       // マネー店舗IDです。
    "f7fcf589-fc92-45ad-ae29-c3c83b55f334",       // エンドユーザーIDです。
    "2de2da13-df57-4b57-aa02-e21a113057bd",       // マネーIDです。
    6575                                          // マネー額です。
)
        .description("snETZgON7wI25XD4LDGgtc1eHQx1a38fcy9G2ru7CIugZBUKc64A8KJDFHDE0sPhVLSmxr0FU3DnW6KqsDEeelMkJvsg1mQveiZolVhKjCQVZw"); // 取引説明文です。
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
        .from("2020-07-26T11-09-37+09:00")        // 開始日時
        .to("2023-07-06T17-00-30+09:00")          // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .shopId("f41fe1d8-e8d8-45f4-b52f-b9e30ef638c9") // 店舗ID
        .customerId("4f09a72f-8db7-4f1a-81e6-34ef7ac3ed4d") // エンドユーザーID
        .customerName("9X")                       // エンドユーザー名
        .terminalId("0ed7596e-6f24-4ee8-91ef-57c96d4a6310") // 端末ID
        .transactionId("ca9c8455-2d28-4300-b6c4-e9b8c930eedb") // 取引ID
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("f807a66c-1f81-47ea-b028-dc62bd716b83") // マネーID
        .setModified(false)                       // キャンセルフラグ
        .types(new String[]{"exchange_outflow","topup"}); // 取引種別 (複数指定可)、チャージ=topup、支払い=payment
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

