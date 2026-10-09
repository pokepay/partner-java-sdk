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
        .couponId("nhx5")                         // クーポンID
        .couponName("1AwtpZI")                    // クーポン名
        .issuedShopName("6uv80k2")                // 発行店舗名
        .availableShopName("ZHBR50")              // 利用可能店舗名
        .availableFrom("2024-01-07T09:44:19.000000Z") // 利用可能期間 (開始日時)
        .availableTo("2022-12-22T07:16:24.000000Z") // 利用可能期間 (終了日時)
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
    "hGa26QKgCzW91ijqwGz4iwxLvGQu8AItYv5ALjIimTwKA5k60bA481CWCvSZBvCgqCd3bRt5kX2boQlLinyfuc6vmm92pmKFDO4dzrTnN2hnl6jClpe10uHCcb",
    "2021-02-17T10:44:59.000000Z",
    "2024-05-06T04:56:24.000000Z",
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // issuedShopId: 発行元の店舗ID
)
        .description("raKIE5JV72jwXeLc5ziCQvgnEPrwn8MGASAuLD3WLJqm2LErGcclueraXSCDvzDuhvkKIoa3xl900hkmeYLn1AjsWrIn7wWX9Rc7bgZ9BG44UnK5kugEbv8t3i1UGnc40madwkN30KxIK4R69fUEBg5VG6fY3BMw3LzyuQr74JtjTjvnySfqw4U7H9TvwAB8eScBfn1Rj6bF7qwsumEcO5tiAsH")
        .discountAmount(5197)
        .discountPercentage(9923.0)
        .discountUpperLimit(3126)
        .displayStartsAt("2025-12-29T14:37:02.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2022-08-04T10:35:30.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(true)                          // アプリ配信なしで受け取れるかどうか
        .code("A")                                // クーポン受け取りコード
        .usageLimit(7376)                         // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(7078)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ストレージID
        .numRecipientsCap(291);                   // クーポンを受け取ることができるユーザ数上限

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
        .name("Ct8CHPFNDEoS5JXEhny5IMhsG4v0CQldqzxJ6XAxr")
        .description("Ug5QJXjIdY8iZkaSGkcJKeradqBxAYjByUEnMrrxLZOgOaoYWcJG86z8KVqUt2uzq")
        .discountAmount(3847)
        .discountPercentage(2703.0)
        .discountUpperLimit(9118)
        .startsAt("2026-03-12T13:26:37.000000Z")
        .endsAt("2023-10-29T09:57:22.000000Z")
        .displayStartsAt("2021-06-04T13:53:55.000000Z") // クーポンの掲載期間(開始日時)
        .displayEndsAt("2021-03-22T12:31:41.000000Z") // クーポンの掲載期間(終了日時)
        .setDisabled(false)                       // 無効化フラグ
        .setHidden(true)                          // クーポン一覧に掲載されるかどうか
        .setPublic(false)                         // アプリ配信なしで受け取れるかどうか
        .code("YKRp5jW")                          // クーポン受け取りコード
        .usageLimit(229)                          // ユーザごとの利用可能回数(NULLの場合は無制限)
        .minAmount(7594)                          // クーポン適用可能な最小取引額
        .setShopSpecified(true)                   // 特定店舗限定のクーポンかどうか
        .availableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // 利用可能店舗リスト
        .storageId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ストレージID
        .numRecipientsCap(9331);                  // クーポンを受け取ることができるユーザ数上限

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



