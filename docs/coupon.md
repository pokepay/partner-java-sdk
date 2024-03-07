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
        .couponId("bkQVRY8Muh")                   // クーポンID
        .couponName("wDy")                        // クーポン名
        .issuedShopName("lFo5mD")                 // 発行店舗名
        .availableShopName("Jw8V3XaTOk")          // 利用可能店舗名
        .availableFrom("2022-05-02T17:52:06.000000Z") // 利用可能期間 (開始日時)
        .availableTo("2023-06-21T19:23:15.000000Z") // 利用可能期間 (終了日時)
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
    "DFDXkJRYuzmNrD0IPFMYcPpoEq",
    "2023-02-03T19:51:10.000000Z",
    "2021-11-27T11:49:55.000000Z",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("qYNWKYupHW3vkZPbupwOmpLyfcnvR24ekndSEuijqLz34cJjz9WzSXV2waIpnDEjnPuGDOLqsy43AtWyT6hyzJkPIxd")
        .discountAmount(8182)
        .discountPercentage(1010.0)
        .discountUpperLimit(4673)
        .displayStartsAt("2022-12-25T05:08:47.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2021-10-02T17:22:12.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("n")                                // クーポン受け取りコード
        .usageLimit(1090)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(3250)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
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
        .name("JrtrRhEmEhncAz9T8Jn6tKv842hmKtJWGe0W2JoBVxOBG6QSEaMM6DcJjfAtdrmKAg3KBKDu0vlbYdVC6n9nVLo43cE33CQPF6kxIlI0u")
        .description("guDnziraNYM7VX5YLnlD8HOOCDlP4GZ7jbmXMO5zVMwfk3fyCehTHNb57OPgysrQCIrNbKg5EGtS1CRG8HTOfVnvp3qGXZFBsOSpPHbliv7UIdhUMzObVJcG5btiH5rur7GsubMGTjIcOXKD9o8Kba3zToGBURahT5P")
        .discountAmount(1159)
        .discountPercentage(1312.0)
        .discountUpperLimit(1476)
        .startsAt("2023-04-10T09:31:34.000000Z")
        .endsAt("2023-02-12T20:04:21.000000Z")
        .displayStartsAt("2024-01-04T08:26:32.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2023-07-30T04:28:05.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("j")                                // クーポン受け取りコード
        .usageLimit(9892)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(8114)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
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



