# Private Money

<a name="get-private-moneys"></a>
## GetPrivateMoneys: マネー一覧を取得する
マネーの一覧を取得します。
パートナーキーの管理者が発行体組織に属している場合、自組織が加盟または発行しているマネーの一覧を返します。また、`organization_code`として決済加盟店の組織コードを指定した場合、発行マネーのうち、その決済加盟店組織が加盟しているマネーの一覧を返します。
パートナーキーの管理者が決済加盟店組織に属している場合は、自組織が加盟しているマネーの一覧を返します。

```JAVA
Request request = new GetPrivateMoneys()
        .organizationCode("ox-supermarket")       // 組織コード
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数

```



### Parameters
**`organizationCode`** 
  

パートナーキーの管理者が発行体組織に属している場合、発行マネーのうち、この組織コードで指定した決済加盟店組織が加盟しているマネーの一覧を返します。決済加盟店組織の管理者は自組織以外を指定することはできません。

```json
{
  "type": "string",
  "maxLength": 32,
  "pattern": "^[a-zA-Z0-9-]*$"
}
```

**`page`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```



成功したときは
[PaginatedPrivateMoneys](./responses.md#paginated-private-moneys)
を返します



---


<a name="get-private-money-organization-summaries"></a>
## GetPrivateMoneyOrganizationSummaries: 決済加盟店の取引サマリを取得する

```JAVA
Request request = new GetPrivateMoneyOrganizationSummaries(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2022-12-28T22:17:50.000000+09:00") // 開始日時(toと同時に指定する必要有)
        .to("2022-11-20T04:04:40.000000+09:00")   // 終了日時(fromと同時に指定する必要有)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取引数

```

`from`と`to`は同時に指定する必要があります。


### Parameters
**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`from`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`page`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```

**`perPage`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```



成功したときは
[PaginatedPrivateMoneyOrganizationSummaries](./responses.md#paginated-private-money-organization-summaries)
を返します



---


<a name="get-private-money-summary"></a>
## GetPrivateMoneySummary: 取引サマリを取得する

```JAVA
Request request = new GetPrivateMoneySummary(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .from("2024-03-04T09:43:58.000000+09:00") // 開始日時
        .to("2020-01-14T06:30:32.000000+09:00");  // 終了日時

```



### Parameters
**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`from`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`to`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```



成功したときは
[PrivateMoneySummary](./responses.md#private-money-summary)
を返します



---



