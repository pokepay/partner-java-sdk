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
        .couponId("UgNjF9")                       // クーポンID
        .couponName("pGXPoR6")                    // クーポン名
        .issuedShopName("V6EH9oG2E")              // 発行店舗名
        .availableShopName("mJwg74tJd")           // 利用可能店舗名
        .availableFrom("2021-09-17T06:11:05.000000Z") // 利用可能期間 (開始日時)
        .availableTo("2022-06-22T11:15:22.000000Z") // 利用可能期間 (終了日時)
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
|422|private_money_not_found|マネーが見つかりません|Private money not found|



---


<a name="create-coupon"></a>
## CreateCoupon: クーポンの登録
新しいクーポンを登録します

```JAVA
Request request = new CreateCoupon(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "5Llab29gfUQ6hTQL3",
    "2020-12-30T15:57:59.000000Z",
    "2021-01-11T11:18:00.000000Z",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("ITMLHDmfb2965KcWooPsLAa0LofoeILq2j1JbokM11iel9SifEKQQKEl5jTOYEn550ChTMJy5Ri4zQipR66DYXbWwtCBK4yI7b7ruIn1DQefV0LKmn0D6u1aqXUgLXLPq2aR")
        .discountAmount(5623)
        .discountPercentage(6960.0)
        .discountUpperLimit(9272)
        .displayStartsAt("2021-04-27T12:56:01.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2020-11-05T14:23:13.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("HosccmXh")                         // クーポン受け取りコード
        .usageLimit(5575)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(8497)                          // クーポン適用可能な最小取引額
        .setShopSpecified(false)                  // 特定店舗限定のクーポンかどうか
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
|422|private_money_not_found|マネーが見つかりません|Private money not found|
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
        .name("E5aq4GKVSCfP0aoPIG5NuiBMU7rfLf6FhpORYw57l88LjJn33RIRSOmlXSQfzzTwn3Dxt4Xew7YzDaZ1J9OdsQM2IVUV93tsgTE0JE")
        .description("ew3ek7732woVpaWAn4e207OnXy1NWRJfp7ZK3WimQa")
        .discountAmount(3454)
        .discountPercentage(7341.0)
        .discountUpperLimit(5424)
        .startsAt("2022-11-19T21:09:25.000000Z")
        .endsAt("2020-10-04T17:07:18.000000Z")
        .displayStartsAt("2022-03-16T02:48:40.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2020-06-03T00:23:31.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(false)                         // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("2aIO")                             // クーポン受け取りコード
        .usageLimit(7115)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(6094)                          // クーポン適用可能な最小取引額
        .setShopSpecified(false)                  // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
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



