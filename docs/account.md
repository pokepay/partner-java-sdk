# Account

<a name="list-user-accounts"></a>
## ListUserAccounts: エンドユーザー、店舗ユーザーのウォレット一覧を表示する
ユーザーIDを指定してそのユーザーのウォレット一覧を取得します。

```JAVA
Request request = new ListUserAccounts(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // userId: ユーザーID
)
        .page(8312)                               // ページ番号
        .perPage(9654);                           // 1ページ分の取引数

```



### Parameters
**`userId`** 
  

ユーザーIDです。

指定したユーザーIDのウォレット一覧を取得します。パートナーキーと紐づく組織が発行しているマネーのウォレットのみが表示されます。

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
  

1ページ当たりのウォレット数です。デフォルト値は50です。

```json
{
  "type": "integer",
  "minimum": 1
}
```



成功したときは
[PaginatedAccountDetails](./responses.md#paginated-account-details)
を返します



---


<a name="create-user-account"></a>
## CreateUserAccount: エンドユーザーのウォレットを作成する
既存のエンドユーザーに対して、指定したマネーのウォレットを新規作成します

```JAVA
Request request = new CreateUserAccount(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // userId: ユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .name("h13KECcLDTh6GlAU8Wlxk2LXarQ3IBbBCi5TZBDGz0WtpvhMi0sjBNmSJRfTiGPJPWWLeq8e8Kc5D0r0YM6vkpQLTxeBjMNRLqaPzFmxJhrrT7gN") // ウォレット名
        .externalId("IsPwJ7PfH")                  // 外部ID
        .metadata("{\"key1\":\"foo\",\"key2\":\"bar\"}"); // ウォレットに付加するメタデータ

```



### Parameters
**`userId`** 
  

ユーザーIDです。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  

マネーIDです。

作成するウォレットのマネーを指定します。このパラメータは必須です。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`name`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`externalId`** 
  


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

```json
{
  "type": "string",
  "format": "json"
}
```



成功したときは
[AccountDetail](./responses.md#account-detail)
を返します



---



