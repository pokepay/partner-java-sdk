# Coupon
Couponは支払い時に指定し、支払い処理の前にCouponに指定の方法で値引き処理を行います。
Couponは特定店舗で利用できるものや利用可能期間、配信条件などを設定できます。


<a name="list-coupons"></a>
## ListCoupons: クーポン一覧の取得
指定したマネーのクーポン一覧を取得します

```JAVA
Request request = new ListCoupons(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: 対象クーポンのマネーID
)
        .couponId("bJ4pI")                        // クーポンID
        .couponName("eH1mIjK91B")                 // クーポン名
        .issuedShopName("ovJNiyan2R")             // 発行店舗名
        .availableShopName("9xEgMUhI")            // 利用可能店舗名
        .availableFrom("2020-07-31T17:05:34.000000Z") // 利用可能期間 (開始日時)
        .availableTo("2023-05-17T11:38:58.000000Z") // 利用可能期間 (終了日時)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数

```



### Parameters
**`privateMoneyId`** 
  

対象クーポンのマネーIDです(必須項目)。
存在しないマネーIDを指定した場合はprivate_money_not_foundエラー(422)が返ります。


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`couponId`** 
  

指定されたクーポンIDで結果をフィルターします。
部分一致(前方一致)します。


```json
{
  "type": "string"
}
```

**`couponName`** 
  

指定されたクーポン名で結果をフィルターします。


```json
{
  "type": "string"
}
```

**`issuedShopName`** 
  

指定された発行店舗で結果をフィルターします。


```json
{
  "type": "string"
}
```

**`availableShopName`** 
  

指定された利用可能店舗で結果をフィルターします。


```json
{
  "type": "string"
}
```

**`availableFrom`** 
  

利用可能期間でフィルターします。フィルターの開始日時をISO8601形式で指定します。


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`availableTo`** 
  

利用可能期間でフィルターします。フィルターの終了日時をISO8601形式で指定します。


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
  

1ページ分の取得数です。デフォルトでは 50 になっています。

```json
{
  "type": "integer",
  "minimum": 1
}
```



成功したときは
[PaginatedCoupons](./responses.md#paginated-coupons)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|shop_user_not_found|店舗が見つかりません|The shop user is not found|
|422|private_money_not_found||Private money not found|



---


<a name="create-coupon"></a>
## CreateCoupon: クーポンの登録
新しいクーポンを登録します

```JAVA
Request request = new CreateCoupon(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "yB0Lq7z8Ljil9JSMA7rA7mkLLtmKfguDK2IgQjODYIDOJbPEulQIvNSkQAL",
    "2023-07-04T23:11:33.000000Z",
    "2020-03-21T18:55:36.000000Z",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("tsxpQNr6y6a28m0nRuldHpSuEUpdPie9qQ2GFfC0at9jn8DwInc5YWbNc2E2NkkIcBn5byBGxSlhAbqrppUqGdxMolEMce2oIWkzh6xh3kO5wXHuEli1NcEVyTrbdyJqmh3WRfGT9d54NzUibZax1gbEqwtEhHNUjZJEl7H6aHeFVmJSAKrLNuNDUQhJfNq76RxAuxSVrnur4Ju4ayidm5BuCe0yTSEIanUYTV2eUYLa")
        .discountAmount(7344)
        .discountPercentage(6877.0)
        .discountUpperLimit(1564)
        .displayStartsAt("2021-12-20T01:02:32.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2022-05-04T02:49:32.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("2R1myjYz")                         // クーポン受け取りコード
        .usageLimit(4422)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(3587)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // ストレージID

```

`setShopSpecified`と`availableShopIds`は同時に指定する必要があります。


### Parameters
**`privateMoneyId`** 
  


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
  "maxLength": 128
}
```

**`description`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`discountAmount`** 
  


```json
{
  "type": "integer",
  "minimum": 0
}
```

**`discountPercentage`** 
  


```json
{
  "type": "number",
  "minimum": 0
}
```

**`discountUpperLimit`** 
  


```json
{
  "type": "integer",
  "minimum": 0
}
```

**`startsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`endsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`displayStartsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`displayEndsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`setDisabled`** 
  


```json
{
  "type": "boolean"
}
```

**`setHidden`** 
  

アプリに表示されるクーポン一覧に掲載されるかどうか。
主に一時的に掲載から外したいときに用いられる。そのためis_publicの設定よりも優先される。


```json
{
  "type": "boolean"
}
```

**`setPublic`** 
  


```json
{
  "type": "boolean"
}
```

**`code`** 
  


```json
{
  "type": "string"
}
```

**`usageLimit`** 
  


```json
{
  "type": "integer"
}
```

**`minAmount`** 
  


```json
{
  "type": "integer"
}
```

**`issuedShopId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`setShopSpecified`** 
  


```json
{
  "type": "boolean"
}
```

**`availableShopIds`** 
  


```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`storageId`** 
  

Storage APIでアップロードしたクーポン画像のStorage IDを指定します

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[CouponDetail](./responses.md#coupon-detail)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|400|invalid_parameters|項目が無効です|Invalid parameters|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|404|partner_storage_not_found|指定したIDのデータは保存されていません|Not found by storage_id|
|422|shop_user_not_found|店舗が見つかりません|The shop user is not found|
|422|private_money_not_found||Private money not found|
|422|coupon_image_storage_conflict|クーポン画像のストレージIDは既に存在します|The coupon image storage_id is already exists|



---


<a name="get-coupon"></a>
## GetCoupon: クーポンの取得
指定したIDを持つクーポンを取得します

```JAVA
Request request = new GetCoupon(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // couponId: クーポンID
);

```



### Parameters
**`couponId`** 
  

取得するクーポンのIDです。
UUIDv4フォーマットである必要があり、フォーマットが異なる場合は InvalidParametersエラー(400)が返ります。
指定したIDのクーポンが存在しない場合はCouponNotFoundエラー(422)が返ります。

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[CouponDetail](./responses.md#coupon-detail)
を返します



---


<a name="update-coupon"></a>
## UpdateCoupon: クーポンの更新
指定したクーポンを更新します

```JAVA
Request request = new UpdateCoupon(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // couponId: クーポンID
)
        .name("TXKtxMi6tvMf7GbuKVOo81owGN6i0XTT33lqYdKQ0h3ghVZk7eOE9tcwx8MOKl5MRsa1MFEYP")
        .description("OVzvPSXDUkbgX2oBshUtXGZ9lfp9TwgYPOmismihXWyqdhqoMR6oAdT5yPsPRTmUYdZdYDDGZDuZn0XgqQIqTu14tSh13qLZDYdRTWbMgZiB4q5yXIKvcyeytZUeCOzn479Q7e7CQ6mogsi4OQ6jQwMdVQzET3CTZR3naadmHoO9")
        .discountAmount(6295)
        .discountPercentage(6519.0)
        .discountUpperLimit(5287)
        .startsAt("2022-02-06T00:32:11.000000Z")
        .endsAt("2022-07-31T18:16:53.000000Z")
        .displayStartsAt("2022-06-17T14:02:15.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2020-09-05T10:19:57.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(false)                         // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("wuXtyGn")                          // クーポン受け取りコード
        .usageLimit(2149)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(3067)                          // クーポン適用可能な最小取引額
        .setShopSpecified(false)                  // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // ストレージID

```


`discountAmount`と`discountPercentage`の少なくとも一方は指定する必要があります。



### Parameters
**`couponId`** 
  


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
  "maxLength": 128
}
```

**`description`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`discountAmount`** 
  


```json
{
  "type": "integer",
  "minimum": 0
}
```

**`discountPercentage`** 
  


```json
{
  "type": "number",
  "minimum": 0
}
```

**`discountUpperLimit`** 
  


```json
{
  "type": "integer",
  "minimum": 0
}
```

**`startsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`endsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`displayStartsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`displayEndsAt`** 
  


```json
{
  "type": "string",
  "format": "date-time"
}
```

**`setDisabled`** 
  


```json
{
  "type": "boolean"
}
```

**`setHidden`** 
  

アプリに表示されるクーポン一覧に掲載されるかどうか。
主に一時的に掲載から外したいときに用いられる。そのためis_publicの設定よりも優先される。


```json
{
  "type": "boolean"
}
```

**`setPublic`** 
  


```json
{
  "type": "boolean"
}
```

**`code`** 
  


```json
{
  "type": "string"
}
```

**`usageLimit`** 
  


```json
{
  "type": "integer"
}
```

**`minAmount`** 
  


```json
{
  "type": "integer"
}
```

**`setShopSpecified`** 
  


```json
{
  "type": "boolean"
}
```

**`availableShopIds`** 
  


```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`storageId`** 
  

Storage APIでアップロードしたクーポン画像のStorage IDを指定します

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[CouponDetail](./responses.md#coupon-detail)
を返します



---



