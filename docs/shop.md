# Shop

<a name="list-shops"></a>
## ListShops: 店舗一覧を取得する

```JAVA
Request request = new ListShops()
        .organizationCode("pocketchange")         // 組織コード
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // マネーID
        .name("oxスーパー三田店")                        // 店舗名
        .postalCode("3903470")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("0341-24862")                        // 店舗の電話番号
        .email("5mN9clYyKl@8cUs.com")             // 店舗のメールアドレス
        .externalId("Yw8CW8rHVcmWZsjKlFT0f7di")   // 店舗の外部ID
        .withDisabled(true)                       // 無効な店舗を含める
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数

```



### Parameters
**`organizationCode`** 
  

このパラメータを渡すとその組織の店舗のみが返され、省略すると加盟店も含む店舗が返されます。


```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```

**`privateMoneyId`** 
  

このパラメータを渡すとそのマネーのウォレットを持つ店舗のみが返されます。


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`name`** 
  

このパラメータを渡すとその名前の店舗のみが返されます。


```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```

**`postalCode`** 
  

このパラメータを渡すとその郵便番号が登録された店舗のみが返されます。


```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```

**`address`** 
  

このパラメータを渡すとその住所が登録された店舗のみが返されます。


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`tel`** 
  

このパラメータを渡すとその電話番号が登録された店舗のみが返されます。


```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```

**`email`** 
  

このパラメータを渡すとそのメールアドレスが登録された店舗のみが返されます。


```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```

**`externalId`** 
  

このパラメータを渡すとその外部IDが登録された店舗のみが返されます。


```json
{
  "type": "string",
  "maxLength": 36
}
```

**`withDisabled`** 
  

このパラメータを渡すと無効にされた店舗を含めて返されます。デフォルトでは無効にされた店舗は返されません。


```json
{
  "type": "boolean"
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
[PaginatedShops](./responses.md#paginated-shops)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|private_money_not_found|マネーが見つかりません|Private money not found|
|422|organization_not_found||Organization not found|
|503|temporarily_unavailable||Service Unavailable|



---


<a name="create-shop"></a>
## CreateShop: 【廃止】新規店舗を追加する
新規店舗を追加します。このAPIは廃止予定です。以降は `CreateShopV2` を使用してください。

```JAVA
Request request = new CreateShop(
    "oxスーパー三田店"                                   // shopName: 店舗名
)
        .shopPostalCode("720-9003")               // 店舗の郵便番号
        .shopAddress("東京都港区芝...")                 // 店舗の住所
        .shopTel("06-5528-1163")                  // 店舗の電話番号
        .shopEmail("Ory7pQcwkQ@vvHf.com")         // 店舗のメールアドレス
        .shopExternalId("ZTUiaSBniTvgiFcfFWfXo")  // 店舗の外部ID
        .organizationCode("ox-supermarket");      // 組織コード

```



### Parameters
**`shopName`** 
  


```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```

**`shopPostalCode`** 
  


```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```

**`shopAddress`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`shopTel`** 
  


```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```

**`shopEmail`** 
  


```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```

**`shopExternalId`** 
  


```json
{
  "type": "string",
  "maxLength": 36
}
```

**`organizationCode`** 
  


```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```



成功したときは
[User](./responses.md#user)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|NULL|NULL|NULL|
|409|email_conflict|このメールアドレスは既に使われています|The E-mail address is already registered|
|409|shop_name_conflict||The shop name is already used|
|422|organization_not_member_organization||The specified organization is not a member organization of the organization accessing this API|
|422|organization_not_found||Organization not found|
|422|unavailable_private_money||Given private money(s) is/are not available|



---


<a name="create-shop-v2"></a>
## CreateShopV2: 新規店舗を追加する

```JAVA
Request request = new CreateShopV2(
    "oxスーパー三田店"                                   // name: 店舗名
)
        .postalCode("8426726")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("02-11-332")                         // 店舗の電話番号
        .email("xSJQCC2TKE@3m70.com")             // 店舗のメールアドレス
        .externalId("u0i2E7e3WCog3HknLhb4mGHjaX24j") // 店舗の外部ID
        .organizationCode("ox-supermarket")       // 組織コード
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}); // 店舗でチャージ可能にするマネーIDの配列

```



### Parameters
**`name`** 
  

店舗名です。

同一組織内に同名の店舗があった場合は`name_conflict`エラーが返ります。

```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```

**`postalCode`** 
  


```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```

**`address`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`tel`** 
  


```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```

**`email`** 
  


```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```

**`externalId`** 
  


```json
{
  "type": "string",
  "maxLength": 36
}
```

**`organizationCode`** 
  


```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```

**`privateMoneyIds`** 
  

店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
このパラメータを省略したときは、店舗が所属する組織が発行または加盟している全てのマネーのウォレットができます。

```json
{
  "type": "array",
  "minItems": 1,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`canTopupPrivateMoneyIds`** 
  

店舗でチャージ可能にするマネーIDの配列を指定します。

このパラメータは発行体のみが指定でき、自身が発行しているマネーのみを指定できます。加盟店が他発行体のマネーに加盟している場合でも、そのチャージ可否を変更することはできません。
省略したときは対象店舗のその発行体の全てのマネーのアカウントがチャージ不可となります。

```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```



成功したときは
[ShopWithAccounts](./responses.md#shop-with-accounts)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|400|invalid_parameters|項目が無効です|Invalid parameters|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|409|shop_name_conflict||The shop name is already used|
|422|organization_not_found||Organization not found|
|422|unpermitted_private_money|このマネーは使えません|This money is not available|
|422|unavailable_private_money||Given private money(s) is/are not available|
|422|organization_not_member_organization||The specified organization is not a member organization of the organization accessing this API|



---


<a name="get-shop"></a>
## GetShop: 店舗情報を表示する
店舗情報を表示します。

権限に関わらず自組織の店舗情報は表示可能です。それに加え、発行体は自組織の発行しているマネーの加盟店組織の店舗情報を表示できます。

```JAVA
Request request = new GetShop(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 店舗ユーザーID
);

```



### Parameters
**`shopId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[ShopWithAccounts](./responses.md#shop-with-accounts)
を返します



---


<a name="update-shop"></a>
## UpdateShop: 店舗情報を更新する
店舗情報を更新します。bodyパラメーターは全て省略可能で、指定したもののみ更新されます。

```JAVA
Request request = new UpdateShop(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // shopId: 店舗ユーザーID
)
        .name("oxスーパー三田店")                        // 店舗名
        .postalCode("6312761")                    // 店舗の郵便番号
        .address("東京都港区芝...")                     // 店舗の住所
        .tel("01441419")                          // 店舗の電話番号
        .email("pgFNSux0je@obdQ.com")             // 店舗のメールアドレス
        .externalId("1VXjU")                      // 店舗の外部ID
        .privateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗で有効にするマネーIDの配列
        .canTopupPrivateMoneyIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 店舗でチャージ可能にするマネーIDの配列
        .status("disabled");                      // 店舗の状態

```



### Parameters
**`shopId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`name`** 
  

店舗名です。

同一組織内に同名の店舗があった場合は`shop_name_conflict`エラーが返ります。

```json
{
  "type": "string",
  "minLength": 1,
  "maxLength": 256
}
```

**`postalCode`** 
  

店舗住所の郵便番号(7桁の数字)です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

```json
{
  "type": "string",
  "pattern": "^[0-9]{3}-?[0-9]{4}$"
}
```

**`address`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`tel`** 
  

店舗の電話番号です。ハイフンは無視されます。明示的に空の値を設定するにはNULLを指定します。

```json
{
  "type": "string",
  "pattern": "^0[0-9]{1,3}-?[0-9]{2,4}-?[0-9]{3,4}$"
}
```

**`email`** 
  

店舗の連絡先メールアドレスです。明示的に空の値を設定するにはNULLを指定します。

```json
{
  "type": "string",
  "format": "email",
  "maxLength": 256
}
```

**`externalId`** 
  

店舗の外部IDです(最大36文字)。明示的に空の値を設定するにはNULLを指定します。

```json
{
  "type": "string",
  "maxLength": 36
}
```

**`privateMoneyIds`** 
  

店舗で有効にするマネーIDの配列を指定します。

店舗が所属する組織が発行または加盟しているマネーのみが指定できます。利用できないマネーが指定された場合は`unavailable_private_money`エラーが返ります。
店舗が既にウォレットを持っている場合に、ここでそのウォレットのマネーIDを指定しないで更新すると、そのマネーのウォレットは凍結(無効化)されます。

```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`canTopupPrivateMoneyIds`** 
  

店舗でチャージ可能にするマネーIDの配列を指定します。

このパラメータは発行体のみが指定でき、発行しているマネーのみを指定できます。加盟店が他発行体のマネーに加盟している場合でも、そのチャージ可否を変更することはできません。
省略したときは対象店舗のその発行体の全てのマネーのアカウントがチャージ不可となります。

```json
{
  "type": "array",
  "minItems": 0,
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`status`** 
  

店舗の状態です。activeを指定すると有効となり、disabledを指定するとリスト表示から除外されます。

```json
{
  "type": "string",
  "enum": [
    "active",
    "disabled"
  ]
}
```



成功したときは
[ShopWithAccounts](./responses.md#shop-with-accounts)
を返します



---



