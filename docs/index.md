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
GetTransaction request = new GetTransaction(
    "d67f3f86-9718-453b-a83f-a1e85ceba499"        // 取引ID
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
CreateTopupTransaction request = new CreateTopupTransaction(
    "df196872-6032-4697-be2a-8998f4fa19ea",       // 店舗ID
    "44da9104-d128-453e-af1e-3b4b0e35b1ab",       // エンドユーザーのID
    "d1bf6b28-88ef-459c-adaf-79f9be0042f8"        // マネーID
)
        .bearPointShopId("9f46d6d6-de68-43a3-8ed3-648b06ddac74") // ポイント支払時の負担店舗ID
        .moneyAmount(3138)                        // マネー額
        .pointAmount(256)                         // ポイント額
        .description("QBwAgsTow2Z3Uka1wds9TY9Bp5VDJiBPB1XeTNJcIKtWyeNc1zzlxW2hgOK8NI225RAsUHuuLFS4058hKDGnyjbxrF6zxkmTZedVWeLbSdWlORFkWxf1fgII7vrhxHZrOEIH6HNdDlfIrfFFwUdXhpSi4"); // 取引履歴に表示する説明文
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
CreatePaymentTransaction request = new CreatePaymentTransaction(
    "296aa0e5-7789-4017-a11a-76deace4697f",       // マネー店舗IDです。
    "88a118c3-c570-41c1-a8c7-aa226f46697a",       // エンドユーザーIDです。
    "53f796f0-a8f0-4456-9cad-7a5e1baef68b",       // マネーIDです。
    3946                                          // マネー額です。
)
        .description("2IcAxs47XeIzYlwiQaQGyn4Age91Y1cWNDBnv9RrzZK5kL8kuH9QZjAo"); // 取引説明文です。
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
ListTransactions request = new ListTransactions()
        .from("A9")                               // 抽出期間の開始日時です。
        .to("jz3xWF4f")                           // 抽出期間の終了日時です。
        .page(2812)                               // 取得したいページ番号です。
        .perPage(6475)                            // 1ページ分の取引数です。
        .shopId("5e1d2b2c-8382-4421-941e-37845bcd4583") // 店舗IDです。
        .customerId("b0a989af-6b4d-4279-8011-f2209be7f5ba") // エンドユーザーIDです。
        .customerName("tnG3Avmta20vIgud6F1UgGMHbk2IRflsvwuZxk0nQmXMvg0FcWUrBHOSV7LC2s46hfsRF0YKxTClCMK7WZ9OzNL") // エンドユーザー名です。
        .terminalId("50627f72-84ab-4df2-a4bb-89ce38154ac7") // 端末IDです。
        .transactionId("d19e5fda-fb65-4bc5-b13b-c69cff14e520") // 取引IDです。
        .organizationCode("zucpQ78F6rD68A")       // 組織コードです。
        .privateMoneyId("1e7e96b4-11b0-49eb-be7f-d2a08c17258e") // マネーIDです。
        .setModified(true)                        // キャンセルフラグです。
        .types(new String[]{});                   // 取引の種類でフィルターします。
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

