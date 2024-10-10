# Bill
支払いQRコード

<a name="list-bills"></a>
## ListBills: 支払いQRコード一覧を表示する
支払いQRコード一覧を表示します。

```JAVA
Request request = new ListBills()
        .page(2897)                               // ページ番号
        .perPage(1066)                            // 1ページの表示数
        .billId("r")                              // 支払いQRコードのID
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .organizationCode("b--BUl96")             // 組織コード
        .description("test bill")                 // 取引説明文
        .createdFrom("2020-02-16T12:28:09.000000Z") // 作成日時(起点)
        .createdTo("2022-11-02T03:28:47.000000Z") // 作成日時(終点)
        .shopName("bill test shop1")              // 店舗名
        .shopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // 店舗ID
        .lowerLimitAmount(8267)                   // 金額の範囲によるフィルタ(下限)
        .upperLimitAmount(7846)                   // 金額の範囲によるフィルタ(上限)
        .setDisabled(true);                       // 支払いQRコードが無効化されているかどうか

```



### Parameters
**`page`** 
  

取得したいページ番号です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  

1ページに表示する支払いQRコードの数です。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`billId`** 
  

支払いQRコードのIDを指定して検索します。IDは前方一致で検索されます。

```json
{
  "type": "string"
}
```

**`privateMoneyId`** 
  

支払いQRコードの送金元ウォレットのマネーIDでフィルターします。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`organizationCode`** 
  

支払いQRコードの送金元店舗が所属する組織の組織コードでフィルターします。

```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```

**`description`** 
  

支払いQRコードを読み取ることで作られた取引の説明文としてアプリなどに表示されます。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`createdFrom`** 
  

支払いQRコードの作成日時でフィルターします。

これ以降に作成された支払いQRコードのみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`createdTo`** 
  

支払いQRコードの作成日時でフィルターします。

これ以前に作成された支払いQRコードのみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`shopName`** 
  

支払いQRコードを作成した店舗名でフィルターします。店舗名は部分一致で検索されます。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`shopId`** 
  

支払いQRコードを作成した店舗IDでフィルターします。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`lowerLimitAmount`** 
  

支払いQRコードの金額の下限を指定してフィルターします。

```json
{
  "type": "integer",
  "format": "decimal",
  "minimum": 0
}
```

**`upperLimitAmount`** 
  

支払いQRコードの金額の上限を指定してフィルターします。

```json
{
  "type": "integer",
  "format": "decimal",
  "minimum": 0
}
```

**`setDisabled`** 
  

支払いQRコードが無効化されているかどうかを表します。デフォルト値は偽(有効)です。

```json
{
  "type": "boolean"
}
```



成功したときは
[PaginatedBills](./responses.md#paginated-bills)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|



---


<a name="create-bill"></a>
## CreateBill: 支払いQRコードの発行
支払いQRコードの内容を更新します。支払い先の店舗ユーザーは指定したマネーのウォレットを持っている必要があります。

```JAVA
Request request = new CreateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: 支払いマネーのマネーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 支払い先(受け取り人)の店舗ID
)
        .amount(7728.0)                           // 支払い額
        .description("test bill");                // 説明文(アプリ上で取引の説明文として表示される)

```



### Parameters
**`amount`** 
  

支払いQRコードを支払い額を指定します。省略するかnullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

```json
{
  "type": "number",
  "format": "decimal",
  "minimum": 0
}
```

**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`shopId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`description`** 
  


```json
{
  "type": "string",
  "maxLength": 200
}
```



成功したときは
[Bill](./responses.md#bill)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|shop_account_not_found|店舗アカウントが見つかりません|The shop account is not found|
|422|private_money_not_found|マネーが見つかりません|Private money not found|
|422|shop_user_not_found|店舗が見つかりません|The shop user is not found|
|422|account_closed|アカウントは退会しています|The account is closed|
|422|account_pre_closed|アカウントは退会準備中です|The account is pre-closed|
|422|account_suspended|アカウントは停止されています|The account is suspended|



---


<a name="update-bill"></a>
## UpdateBill: 支払いQRコードの更新
支払いQRコードの内容を更新します。パラメータは全て省略可能で、指定したもののみ更新されます。

```JAVA
Request request = new UpdateBill(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // billId: 支払いQRコードのID
)
        .amount(4321.0)                           // 支払い額
        .description("test bill")                 // 説明文
        .setDisabled(false);                      // 無効化されているかどうか

```



### Parameters
**`billId`** 
  

更新対象の支払いQRコードのIDです。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`amount`** 
  

支払いQRコードを支払い額を指定します。nullを渡すと任意金額の支払いQRコードとなり、エンドユーザーがアプリで読み取った際に金額を入力します。

```json
{
  "type": "number",
  "format": "decimal",
  "minimum": 0
}
```

**`description`** 
  

支払いQRコードの詳細説明文です。アプリ上で取引の説明文として表示されます。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`setDisabled`** 
  

支払いQRコードが無効化されているかどうかを指定します。真にすると無効化され、偽にすると有効化します。

```json
{
  "type": "boolean"
}
```



成功したときは
[Bill](./responses.md#bill)
を返します



---



