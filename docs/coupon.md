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
        .couponId("4V5s0hC7X")                    // クーポンID
        .couponName("G")                          // クーポン名
        .issuedShopName("k0lbWem")                // 発行店舗名
        .availableShopName("hS2lFzcCj")           // 利用可能店舗名
        .availableFrom("2023-03-17T03:34:00.000000+09:00") // 利用可能期間 (開始日時)
        .availableTo("2020-07-13T05:33:03.000000+09:00") // 利用可能期間 (終了日時)
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



---


<a name="create-coupon"></a>
## CreateCoupon: クーポンの登録
新しいクーポンを登録します

```JAVA
Request request = new CreateCoupon(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    "MWy84cvakyWCskvYUMyFhMlId2wNoTbTNdr5P0q9HhyquLsBDIMKJ8l5UHCorKt9zsCxjgmmeHXbQcGaC214G3t6Avvcw2xFpOWU882ayN",
    "2022-01-07T14:31:05.000000+09:00",
    "2022-02-18T09:28:55.000000+09:00",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("hZ2ErWlYHns6hSZrsPfJf1DAR2Lhy7wzH8Ciy0ow")
        .discountAmount(7345)
        .discountPercentage(3505.0)
        .discountUpperLimit(74)
        .displayStartsAt("2024-04-20T03:52:10.000000+09:00") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2023-05-20T21:29:09.000000+09:00") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("uOf")                              // クーポン受け取りコード
        .usageLimit(1829)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(4417)                          // クーポン適用可能な最小取引額
        .setShopSpecified(false)                  // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
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
        .name("lrDMhSVDkb")
        .description("Mcl9hjQwD5t1GJbNtNkzczhiXCIL39dWOH4y2uK2noNpQcHSa2W1XEVzb3FYomF3HNVnJyi17VNpITTF0nv4PMYqEJwOtZuYls2unMM4aX0iSGw6M7DeMJCf6l1WSajpoS")
        .discountAmount(2063)
        .discountPercentage(2777.0)
        .discountUpperLimit(1966)
        .startsAt("2024-01-27T21:12:18.000000+09:00")
        .endsAt("2020-09-12T09:07:44.000000+09:00")
        .displayStartsAt("2021-06-27T05:26:48.000000+09:00") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2024-05-04T01:24:56.000000+09:00") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(false)                         // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("cQmUnMz")                          // クーポン受け取りコード
        .usageLimit(4013)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(7372)                          // クーポン適用可能な最小取引額
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



