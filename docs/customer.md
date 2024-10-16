# Customer

<a name="delete-account"></a>
## DeleteAccount: ウォレットを退会する
ウォレットを退会します。一度ウォレットを退会した後は、そのウォレットを再び利用可能な状態に戻すことは出来ません。

```JAVA
Request request = new DeleteAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .cashback(false);                         // 返金有無

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

指定したウォレットIDのウォレットを退会します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`cashback`** 
  

退会時の返金有無です。エンドユーザに返金を行う場合、真を指定して下さい。現在のマネー残高を全て現金で返金したものとして記録されます。

```json
{
  "type": "boolean"
}
```



成功したときは
[AccountDeleted](./responses.md#account-deleted)
を返します



---


<a name="get-account"></a>
## GetAccount: ウォレット情報を表示する
ウォレットを取得します。

```JAVA
Request request = new GetAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
);

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレットを取得します。

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[AccountDetail](./responses.md#account-detail)
を返します



---


<a name="update-account"></a>
## UpdateAccount: ウォレット情報を更新する
ウォレットの状態を更新します。
以下の項目が変更できます。

- ウォレットの凍結/凍結解除の切り替え(エンドユーザー、店舗ユーザー共通)
- 店舗でチャージ可能かどうか(店舗ユーザのみ)

エンドユーザーのウォレット情報更新には UpdateCustomerAccount が使用できます。

```JAVA
Request request = new UpdateAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .setSuspended(true)                       // ウォレットが凍結されているかどうか
        .status("active")                         // ウォレット状態
        .canTransferTopup(false);                 // チャージ可能かどうか

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

指定したウォレットIDのウォレットの状態を更新します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`setSuspended`** 
  

ウォレットの凍結状態です。真にするとウォレットが凍結され、そのウォレットでは新規取引ができなくなります。偽にすると凍結解除されます。

```json
{
  "type": "boolean"
}
```

**`status`** 
  

ウォレットの状態です。

```json
{
  "type": "string",
  "enum": [
    "active",
    "suspended",
    "pre-closed"
  ]
}
```

**`canTransferTopup`** 
  

店舗ユーザーがエンドユーザーにチャージ可能かどうかです。真にするとチャージ可能となり、偽にするとチャージ不可能となります。

```json
{
  "type": "boolean"
}
```



成功したときは
[AccountDetail](./responses.md#account-detail)
を返します



---


<a name="list-account-balances"></a>
## ListAccountBalances: エンドユーザーの残高内訳を表示する
エンドユーザーのウォレット毎の残高を有効期限別のリストとして取得します。

```JAVA
Request request = new ListAccountBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(7941)                               // ページ番号
        .perPage(3708)                            // 1ページ分の取引数
        .expiresAtFrom("2021-10-09T23:01:25.000000Z") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2023-02-28T03:03:13.000000Z") // 有効期限の期間によるフィルター(終了時点)
        .direction("desc");                       // 有効期限によるソート順序

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`page`** 
  

取得したいページ番号です。デフォルト値は1です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページ分のウォレット残高数です。デフォルト値は30です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`expiresAtFrom`** 
  

有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`expiresAtTo`** 
  

有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`direction`** 
  

有効期限によるソートの順序を指定します。デフォルト値はasc (昇順)です。

```json
{
  "type": "string",
  "enum": [
    "asc",
    "desc"
  ]
}
```



成功したときは
[PaginatedAccountBalance](./responses.md#paginated-account-balance)
を返します



---


<a name="list-account-expired-balances"></a>
## ListAccountExpiredBalances: エンドユーザーの失効済みの残高内訳を表示する
エンドユーザーのウォレット毎の失効済みの残高を有効期限別のリストとして取得します。

```JAVA
Request request = new ListAccountExpiredBalances(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .page(2601)                               // ページ番号
        .perPage(9562)                            // 1ページ分の取引数
        .expiresAtFrom("2021-09-14T00:24:39.000000Z") // 有効期限の期間によるフィルター(開始時点)
        .expiresAtTo("2020-04-28T23:50:47.000000Z") // 有効期限の期間によるフィルター(終了時点)
        .direction("asc");                        // 有効期限によるソート順序

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

フィルターとして使われ、指定したウォレットIDのウォレット残高を取得します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`page`** 
  

取得したいページ番号です。デフォルト値は1です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページ分のウォレット残高数です。デフォルト値は30です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`expiresAtFrom`** 
  

有効期限の期間によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`expiresAtTo`** 
  

有効期限の期間によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`direction`** 
  

有効期限によるソートの順序を指定します。デフォルト値はdesc (降順)です。

```json
{
  "type": "string",
  "enum": [
    "asc",
    "desc"
  ]
}
```



成功したときは
[PaginatedAccountBalance](./responses.md#paginated-account-balance)
を返します



---


<a name="update-customer-account"></a>
## UpdateCustomerAccount: エンドユーザーのウォレット情報を更新する
エンドユーザーのウォレットの状態を更新します。

```JAVA
Request request = new UpdateCustomerAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // accountId: ウォレットID
)
        .status("suspended")                      // ウォレット状態
        .accountName("MgU5LJ8nedbEkL6VCbZlYCZFu0YjXrv") // アカウント名
        .externalId("ck1kbCzvMElblaTUskxDWTi4syFdijXYZ6Fkp0v2rO") // 外部ID
        .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}"); // ウォレットに付加するメタデータ

```



### Parameters
**`accountId`** 
  

ウォレットIDです。

指定したウォレットIDのウォレットの状態を更新します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`status`** 
  

ウォレットの状態です。

```json
{
  "type": "string",
  "enum": [
    "active",
    "suspended",
    "pre-closed"
  ]
}
```

**`accountName`** 
  

変更するウォレット名です。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`externalId`** 
  

変更する外部IDです。

```json
{
  "type": "string",
  "maxLength": 50
}
```

**`metadata`** 
  

ウォレットに付加するメタデータをJSON文字列で指定します。
指定できるJSON文字列には以下のような制約があります。
- フラットな構造のJSONを文字列化したものであること。
- keyは最大32文字の文字列(同じkeyを複数指定することはできません)
- valueには128文字以下の文字列が指定できます

更新時に指定した内容でメタデータ全体が置き換えられることに注意してください。
例えば、元々のメタデータが以下だったときに、

'{"key1":"foo","key2":"bar"}'

更新APIで以下のように更新するとします。

'{"key1":"baz"}'

このときkey1はfooからbazに更新され、key2に対するデータは消去されます。

```json
{
  "type": "string",
  "format": "json"
}
```



成功したときは
[AccountWithUser](./responses.md#account-with-user)
を返します



---


<a name="get-customer-accounts"></a>
## GetCustomerAccounts: エンドユーザーのウォレット一覧を表示する
マネーを指定してエンドユーザーのウォレット一覧を取得します。

```JAVA
Request request = new GetCustomerAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .page(1321)                               // ページ番号
        .perPage(4359)                            // 1ページ分のウォレット数
        .createdAtFrom("2023-03-20T21:15:42.000000Z") // ウォレット作成日によるフィルター(開始時点)
        .createdAtTo("2024-02-12T10:09:46.000000Z") // ウォレット作成日によるフィルター(終了時点)
        .setSuspended(true)                       // ウォレットが凍結状態かどうかでフィルターする
        .status("suspended")                      // ウォレット状態
        .externalId("KP7CaX5R9O7hnOQMfDj4u8or1Z5a") // 外部ID
        .tel("0629-6637554")                      // エンドユーザーの電話番号
        .email("vasIan6Df8@qsq2.com");            // エンドユーザーのメールアドレス

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。

一覧するウォレットのマネーを指定します。このパラメータは必須です。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`page`** 
  

取得したいページ番号です。デフォルト値は1です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページ分のウォレット数です。デフォルト値は30です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`createdAtFrom`** 
  

ウォレット作成日によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`createdAtTo`** 
  

ウォレット作成日によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`setSuspended`** 
  

このパラメータが指定されている場合、ウォレットの凍結状態で結果がフィルターされます。デフォルトでは未指定です。

```json
{
  "type": "boolean"
}
```

**`status`** 
  

このパラメータが指定されている場合、ウォレットの状態で結果がフィルターされます。デフォルトでは未指定です。

```json
{
  "type": "string",
  "enum": [
    "active",
    "suspended",
    "pre-closed"
  ]
}
```

**`externalId`** 
  

外部IDでのフィルタリングです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "maxLength": 50
}
```

**`tel`** 
  

エンドユーザーの電話番号でのフィルタリングです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```

**`email`** 
  

エンドユーザーのメールアドレスでのフィルタリングです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "email"
}
```



成功したときは
[PaginatedAccountWithUsers](./responses.md#paginated-account-with-users)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|private_money_not_found|マネーが見つかりません|Private money not found|



---


<a name="create-customer-account"></a>
## CreateCustomerAccount: 新規エンドユーザーをウォレットと共に追加する
指定したマネーのウォレットを作成し、同時にそのウォレットを保有するユーザも新規に作成します。
このAPIにより作成されたユーザは認証情報を持たないため、モバイルSDKやポケペイ標準アプリからはログインすることはできません。
Partner APIのみから操作可能な特殊なユーザになります。
システム全体をPartner APIのみで構成する場合にのみ使用してください。

```JAVA
Request request = new CreateCustomerAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .userName("ポケペイ太郎")                       // ユーザー名
        .accountName("ポケペイ太郎のアカウント")              // アカウント名
        .externalId("k3ETquM3SQujWFDE153B47G8gAIFr9"); // 外部ID

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。

これによって作成するウォレットのマネーを指定します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`userName`** 
  

ウォレットと共に作成するユーザ名です。省略した場合は空文字となります。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`accountName`** 
  

作成するウォレット名です。省略した場合は空文字となります。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`externalId`** 
  

PAPIクライアントシステムから利用するPokepayユーザーのIDです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "maxLength": 50
}
```



成功したときは
[AccountWithUser](./responses.md#account-with-user)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|user_not_found|ユーザーが見つかりません|The user is not found|
|422|private_money_not_found|マネーが見つかりません|Private money not found|
|422|invalid_metadata|メタデータの形式が不正です|Invalid metadata format|
|422|user_attributes_external_id_not_match|ユーザー属性情報の外部IDが一致しません|Not match external id of user attributes|
|422|user_attributes_not_found|ユーザー属性情報が存在しません|Not found the user attrubtes|
|422|account_closed|アカウントは退会しています|The account is closed|
|422|account_can_not_create|このマネーに新規アカウントを作る事は出来ません|Can not create an account with this money|



---


<a name="get-shop-accounts"></a>
## GetShopAccounts: 店舗ユーザーのウォレット一覧を表示する
マネーを指定して店舗ユーザーのウォレット一覧を取得します。

```JAVA
Request request = new GetShopAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .page(7547)                               // ページ番号
        .perPage(6106)                            // 1ページ分のウォレット数
        .createdAtFrom("2024-07-31T12:27:29.000000Z") // ウォレット作成日によるフィルター(開始時点)
        .createdAtTo("2020-01-10T02:36:55.000000Z") // ウォレット作成日によるフィルター(終了時点)
        .setSuspended(true);                      // ウォレットが凍結状態かどうかでフィルターする

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。

一覧するウォレットのマネーを指定します。このパラメータは必須です。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`page`** 
  

取得したいページ番号です。デフォルト値は1です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページ分のウォレット数です。デフォルト値は30です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`createdAtFrom`** 
  

ウォレット作成日によるフィルターの開始時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`createdAtTo`** 
  

ウォレット作成日によるフィルターの終了時点のタイムスタンプです。デフォルトでは未指定です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`setSuspended`** 
  

このパラメータが指定されている場合、ウォレットの凍結状態で結果がフィルターされます。デフォルトでは未指定です。

```json
{
  "type": "boolean"
}
```



成功したときは
[PaginatedAccountWithUsers](./responses.md#paginated-account-with-users)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|private_money_not_found|マネーが見つかりません|Private money not found|



---


<a name="list-customer-transactions"></a>
## ListCustomerTransactions: 取引履歴を取得する
取引一覧を返します。

```JAVA
Request request = new ListCustomerTransactions(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .senderCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 送金エンドユーザーID
        .receiverCustomerId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 受取エンドユーザーID
        .type("payment")                          // 取引種別
        .setModified(true)                        // キャンセル済みかどうか
        .from("2023-04-21T10:46:48.000000Z")      // 開始日時
        .to("2023-09-25T10:08:26.000000Z")        // 終了日時
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。
フィルターとして使われ、指定したマネーでの取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`senderCustomerId`** 
  

送金ユーザーIDです。

フィルターとして使われ、指定された送金ユーザーでの取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`receiverCustomerId`** 
  

受取ユーザーIDです。

フィルターとして使われ、指定された受取ユーザーでの取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`type`** 
  

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
5. cashback
   ウォレット退会時返金
6. expire
   ウォレット退会時失効

```json
{
  "type": "string",
  "enum": [
    "topup",
    "payment",
    "exchange",
    "transfer",
    "cashback",
    "expire"
  ]
}
```

**`setModified`** 
  

キャンセル済みかどうかを判定するフラグです。

これにtrueを指定するとキャンセルされた取引のみ一覧に表示されます。
falseを指定するとキャンセルされていない取引のみ一覧に表示されます
何も指定しなければキャンセルの有無にかかわらず一覧に表示されます。

```json
{
  "type": "boolean"
}
```

**`from`** 
  

抽出期間の開始日時です。

フィルターとして使われ、開始日時以降に発生した取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  

抽出期間の終了日時です。

フィルターとして使われ、終了日時以前に発生した取引のみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`page`** 
  

取得したいページ番号です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページ分の取引数です。

```json
{
  "type": "integer",
  "minimum": 1
}
```



成功したときは
[PaginatedTransaction](./responses.md#paginated-transaction)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|customer_user_not_found||The customer user is not found|
|422|private_money_not_found|マネーが見つかりません|Private money not found|
|503|temporarily_unavailable||Service Unavailable|



---



