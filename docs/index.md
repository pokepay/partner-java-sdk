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
    "27dd0b80-d731-4c8b-8957-0680d56eaf48"        // 取引ID
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
    "ed2d2d73-63ba-4084-9c18-321ae6e93990",       // 店舗ID
    "93e0cdd8-ca05-45b0-a078-fa49d4cd269c",       // エンドユーザーのID
    "e1cd62bb-13b8-4baf-ac62-54c304ab9817"        // マネーID
)
        .bearPointShopId("1d3fcfec-b3c0-4690-b276-cef02d29f1da") // ポイント支払時の負担店舗ID
        .moneyAmount(7935)                        // マネー額
        .pointAmount(3660)                        // ポイント額
        .description("WZFMYYNQ77hNnDgeQkP6BrHNLW2TjgwJkClYsxYjLV6mNckmXWb6cDTOBEvT1fZYocBrtgwRLixenA1GWqf2JPqamqpbbuSj1PURjYRasH9ARntTDK9f1O2csoG3F5"); // 取引履歴に表示する説明文
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
    "54d0af02-c776-489a-a5ce-99e2cec69d50",       // マネー店舗IDです。
    "14ff6641-7f1b-4d45-a469-3edc2632b623",       // エンドユーザーIDです。
    "86c42069-1b18-4b26-b726-729e1849ce27",       // マネーIDです。
    6800                                          // マネー額です。
)
        .description("56fVMl4ovKtbbNMLWzz4xf72tklHyikvXSu1xVqKMzKtPMLBX6YLvmDqPAbWtH"); // 取引説明文です。
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
        .from("HRtQBqC")                          // 抽出期間の開始日時です。
        .to("sxk71kIOi")                          // 抽出期間の終了日時です。
        .page(1033)                               // 取得したいページ番号です。
        .perPage(1620)                            // 1ページ分の取引数です。
        .shopId("eb4986c9-9fe0-4c60-bc1a-16d76500e270") // 店舗IDです。
        .customerId("36e964a5-9ec5-442d-b1e4-624bd80012d0") // エンドユーザーIDです。
        .customerName("HcZ37iojnk7j2j33qMA4N2evwLBNS7QyCEhtgNDuAnxydB9u3o7ZMeTosoRh4S0mExQI1uCwHXvSS9xqXNJMeqv2rRxx8SeYgA5RTAZIE0d3whSKLF4xWXCgQOdSsQVPrApoltr") // エンドユーザー名です。
        .terminalId("fa0d8e92-dc12-4765-a636-a315d029cd54") // 端末IDです。
        .transactionId("b0cf08a5-3aaa-4663-8379-a1044a0723c7") // 取引IDです。
        .organizationCode("aA24-828CW--8-b6-7---2-684S") // 組織コードです。
        .privateMoneyId("4bee12ce-519d-494b-9479-a6cafa4e7fd2") // マネーIDです。
        .setModified(false)                       // キャンセルフラグです。
        .types(new String[]{"payment","topup","topup","topup","exchange_outflow"}); // 取引の種類でフィルターします。
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

