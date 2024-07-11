# Organization

<a name="list-organizations"></a>
## ListOrganizations: 加盟店組織の一覧を取得する

```JAVA
Request request = new ListOrganizations(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .page(1)                                  // ページ番号
        .perPage(50)                              // 1ページ分の取引数
        .name("U")                                // 組織名
        .code("rE8EA");                           // 組織コード

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。
このマネーに加盟している加盟組織がフィルターされます。

```json
{
  "type": "string",
  "format": "uuid"
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

**`name`** 
  


```json
{
  "type": "string"
}
```

**`code`** 
  


```json
{
  "type": "string"
}
```



成功したときは
[PaginatedOrganizations](./responses.md#paginated-organizations)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|400|invalid_parameters|項目が無効です|Invalid parameters|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|private_money_not_found||Private money not found|



---


<a name="create-organization"></a>
## CreateOrganization: 新規加盟店組織を追加する

```JAVA
Request request = new CreateOrganization(
    "ox-supermarket",                             // code: 新規組織コード
    "oxスーパー",                                     // name: 新規組織名
    new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}, // privateMoneyIds: 加盟店組織で有効にするマネーIDの配列
    "TMWkW53gnq@E0TT.com",                        // issuerAdminUserEmail: 発行体担当者メールアドレス
    "1OD00WYy85@d5RK.com"                         // memberAdminUserEmail: 新規組織担当者メールアドレス
)
        .bankName("XYZ銀行")                        // 銀行名
        .bankCode("1234")                         // 銀行金融機関コード
        .bankBranchName("ABC支店")                  // 銀行支店名
        .bankBranchCode("123")                    // 銀行支店コード
        .bankAccountType("other")                 // 銀行口座種別 (普通=saving, 当座=current, その他=other)
        .bankAccount("1234567")                   // 銀行口座番号
        .bankAccountHolderName("ﾌｸｻﾞﾜﾕｷﾁ")        // 口座名義人名
        .contactName("佐藤清");                      // 担当者名

```



### Parameters
**`code`** 
  


```json
{
  "type": "string",
  "maxLength": 32
}
```

**`name`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`privateMoneyIds`** 
  


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

**`issuerAdminUserEmail`** 
  


```json
{
  "type": "string",
  "format": "email"
}
```

**`memberAdminUserEmail`** 
  


```json
{
  "type": "string",
  "format": "email"
}
```

**`bankName`** 
  


```json
{
  "type": "string",
  "maxLength": 64
}
```

**`bankCode`** 
  


```json
{
  "type": "string",
  "pattern": "^$|^[0-9]{4}$"
}
```

**`bankBranchName`** 
  


```json
{
  "type": "string",
  "maxLength": 64
}
```

**`bankBranchCode`** 
  


```json
{
  "type": "string",
  "pattern": "^(|[0-9]{3})$"
}
```

**`bankAccountType`** 
  


```json
{
  "type": "string",
  "enum": [
    "saving",
    "current",
    "other"
  ]
}
```

**`bankAccount`** 
  


```json
{
  "type": "string",
  "maxLength": 7,
  "pattern": "[0-9]{0,7}"
}
```

**`bankAccountHolderName`** 
  


```json
{
  "type": "string",
  "maxLength": 30,
  "pattern": "^[0-9A-Zｦｱ-ﾟ (-),-/\\\\｢-｣]$"
}
```

**`contactName`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```



成功したときは
[Organization](./responses.md#organization)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|NULL|NULL|NULL|
|409|organization_conflict||The organization code is already used|
|409|shop_name_conflict||The shop name is already used|
|422|organization_private_money_not_found||Issuer organization does not have private-money|
|422|unavailable_private_money||Given private money(s) is/are not available|
|503|failed_to_send_email||Failed to send an E-mail.|



---



