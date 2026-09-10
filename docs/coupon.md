# Coupon
割引クーポンを表すデータです。
クーポンをユーザが明示的に利用することによって支払い決済時の割引(固定金額 or 割引率)が適用されます。
クーポンは支払い時に指定し、支払い処理の前にクーポンに指定の方法で値引き処理を行います。
クーポン原資を負担する発行店舗を設定したり、配布先を指定することも可能です。
また、特定店舗で利用できるものや利用可能期間、配信条件などを設定できます。


<a name="list-coupons"></a>
## ListCoupons: クーポン一覧の取得
指定したマネーのクーポン一覧を取得します

```JAVA
Request request = new ListCoupons(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: 対象クーポンのマネーID
)
        .couponId("N6")                           // クーポンID
        .couponName("pPYojnL")                    // クーポン名
        .issuedShopName("WN99oUAp2")              // 発行店舗名
        .availableShopName("7dRd")                // 利用可能店舗名
        .availableFrom("2026-08-05T12:36:43.000000Z") // 利用可能期間 (開始日時)
        .availableTo("2023-09-01T05:36:08.000000Z") // 利用可能期間 (終了日時)
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数

```



### Parameters
#### `privateMoneyId`
対象クーポンのマネーIDです(必須項目)。
存在しないマネーIDを指定した場合はprivate_money_not_foundエラー(422)が返ります。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `couponId`
指定されたクーポンIDで結果をフィルターします。
部分一致(前方一致)します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `couponName`
指定されたクーポン名で結果をフィルターします。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `issuedShopName`
指定された発行店舗で結果をフィルターします。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `availableShopName`
指定された利用可能店舗で結果をフィルターします。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `availableFrom`
利用可能期間でフィルターします。フィルターの開始日時をISO8601形式で指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `availableTo`
利用可能期間でフィルターします。フィルターの終了日時をISO8601形式で指定します。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `page`
取得したいページ番号です。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 1
}
```

</details>

#### `perPage`
1ページ分の取得数です。デフォルトでは 50 になっています。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 1
}
```

</details>



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
    "T0bu9kBbfQDVxrOePjXnEEoR26VQKj59HY9GxwaIDAEfbXDBB3FNIL8Usakbi9ZrjBPmCyriSuUZrqYwqtbArFxY0",
    "2023-08-23T09:29:18.000000Z",
    "2023-08-18T01:05:44.000000Z",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("lQ2iQavwvhDr8TNB4vIcRTpSaCV5lZtxsN8hQh23jWL68GyttBaIaA6bT")
        .discountAmount(5938)
        .discountPercentage(7535.0)
        .discountUpperLimit(2989)
        .displayStartsAt("2024-06-20T21:57:03.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2026-02-13T21:59:23.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("SP8aD")                            // クーポン受け取りコード
        .usageLimit(2807)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(2353)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ストレージID
        .numRecipientsCap(7416);                  // クーポンを受け取ることができるユーザ数上限

```

`setShopSpecified`と`availableShopIds`は同時に指定する必要があります。


### Parameters
#### `privateMoneyId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `name`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "maxLength": 128
}
```

</details>

#### `description`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "maxLength": 256
}
```

</details>

#### `discountAmount`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 0
}
```

</details>

#### `discountPercentage`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "number",
  "minimum": 0
}
```

</details>

#### `discountUpperLimit`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 0
}
```

</details>

#### `startsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `endsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `displayStartsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `displayEndsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `setDisabled`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `setHidden`
アプリに表示されるクーポン一覧に掲載されるかどうか。
主に一時的に掲載から外したいときに用いられる。そのためis_publicの設定よりも優先される。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `setPublic`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `code`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `usageLimit`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer"
}
```

</details>

#### `minAmount`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer"
}
```

</details>

#### `issuedShopId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `setShopSpecified`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `availableShopIds`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

</details>

#### `storageId`
Storage APIでアップロードしたクーポン画像のStorage IDを指定します

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `numRecipientsCap`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 1
}
```

</details>



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
#### `couponId`
取得するクーポンのIDです。
UUIDv4フォーマットである必要があり、フォーマットが異なる場合は InvalidParametersエラー(400)が返ります。
指定したIDのクーポンが存在しない場合はCouponNotFoundエラー(422)が返ります。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>



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
        .name("Qo1a8Jvio1NlXmWokT3fCZ0aqdulZZGglvs1mmHvcGJdXuMvjofsG8E4KIFxs3y0EBuTM1S0iPJraQIMtAPJ1JN9Ct")
        .description("WW30Uo4UAg9arJ4XCMrwN15cIxDvF6fUC0OQCualYkGbJ73b3nYCrV9uDJehyXJGfZSkx4G3NTiGEBvJP8jVkcC85nZnpCpVaAaHx1iEs8vFtOGvU65Sy7b45F1sYQbanmxI5u8gze9w")
        .discountAmount(8918)
        .discountPercentage(7993.0)
        .discountUpperLimit(809)
        .startsAt("2025-12-14T02:35:32.000000Z")
        .endsAt("2021-02-21T22:50:00.000000Z")
        .displayStartsAt("2020-06-26T05:52:22.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2023-04-19T03:26:17.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(true)                        // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("xV0P")                             // クーポン受け取りコード
        .usageLimit(402)                          // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(1881)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ストレージID
        .numRecipientsCap(8600);                  // クーポンを受け取ることができるユーザ数上限

```


`discountAmount`と`discountPercentage`の少なくとも一方は指定する必要があります。



### Parameters
#### `couponId`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `name`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "maxLength": 128
}
```

</details>

#### `description`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "maxLength": 256
}
```

</details>

#### `discountAmount`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 0
}
```

</details>

#### `discountPercentage`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "number",
  "minimum": 0
}
```

</details>

#### `discountUpperLimit`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 0
}
```

</details>

#### `startsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `endsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `displayStartsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `displayEndsAt`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "date-time"
}
```

</details>

#### `setDisabled`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `setHidden`
アプリに表示されるクーポン一覧に掲載されるかどうか。
主に一時的に掲載から外したいときに用いられる。そのためis_publicの設定よりも優先される。

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `setPublic`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `code`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string"
}
```

</details>

#### `usageLimit`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer"
}
```

</details>

#### `minAmount`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer"
}
```

</details>

#### `setShopSpecified`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "boolean"
}
```

</details>

#### `availableShopIds`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

</details>

#### `storageId`
Storage APIでアップロードしたクーポン画像のStorage IDを指定します

<details>
<summary>スキーマ</summary>

```json
{
  "type": "string",
  "format": "uuid"
}
```

</details>

#### `numRecipientsCap`

<details>
<summary>スキーマ</summary>

```json
{
  "type": "integer",
  "minimum": 1
}
```

</details>



成功したときは
[CouponDetail](./responses.md#coupon-detail)
を返します



---



