# Campaign

<a name="list-campaigns"></a>
## ListCampaigns: キャンペーン一覧を取得する
マネーIDを指定してキャンペーンを取得します。
発行体の組織マネージャ権限で、自組織が発行するマネーのキャンペーンについてのみ閲覧可能です。
閲覧権限がない場合は unpermitted_admin_user エラー(422)が返ります。

```JAVA
Request request = new ListCampaigns(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // privateMoneyId: マネーID
)
        .setOngoing(false)                        // 現在適用可能なキャンペーンかどうか
        .availableFrom("2023-04-20T21:23:50.000000Z") // 指定された日時以降に適用可能期間が含まれているか
        .availableTo("2020-11-27T03:39:30.000000Z") // 指定された日時以前に適用可能期間が含まれているか
        .page(1)                                  // ページ番号
        .perPage(20);                             // 1ページ分の取得数

```



### Parameters
**`privateMoneyId`** 
  

マネーIDです。

フィルターとして使われ、指定したマネーでのキャンペーンのみ一覧に表示されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`setOngoing`** 
  

有効化されており、現在キャンペーン期間内にあるキャンペーンをフィルターするために使われます。
真であれば適用可能なもののみを抽出し、偽であれば適用不可なもののみを抽出します。
デフォルトでは未指定(フィルターなし)です。

```json
{
  "type": "boolean"
}
```

**`availableFrom`** 
  

キャンペーン終了日時が指定された日時以降であるキャンペーンをフィルターするために使われます。
デフォルトでは未指定(フィルターなし)です。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`availableTo`** 
  

キャンペーン開始日時が指定された日時以前であるキャンペーンをフィルターするために使われます。
デフォルトでは未指定(フィルターなし)です。

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
  

1ページ分の取得数です。デフォルトでは 20 になっています。

```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 50
}
```



成功したときは
[PaginatedCampaigns](./responses.md#paginated-campaigns)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|503|temporarily_unavailable||Service Unavailable|



---


<a name="create-campaign"></a>
## CreateCampaign: ポイント付与キャンペーンを作る
ポイント付与キャンペーンを作成します。


```JAVA
JsonObject items = new JsonObject();
items.addProperty("point_amount", 5);
items.addProperty("point_amount_unit", "percent");
items.addProperty("subject_more_than_or_equal", 1000);
items.addProperty("subject_less_than", 5000);
JsonObject items2 = new JsonObject();
items2.addProperty("point_amount", 5);
items2.addProperty("point_amount_unit", "percent");
items2.addProperty("subject_more_than_or_equal", 1000);
items2.addProperty("subject_less_than", 5000);
JsonObject items3 = new JsonObject();
items3.addProperty("point_amount", 5);
items3.addProperty("point_amount_unit", "percent");
items3.addProperty("subject_more_than_or_equal", 1000);
items3.addProperty("subject_less_than", 5000);
JsonObject items4 = new JsonObject();
items4.addProperty("point_amount", 5);
items4.addProperty("point_amount_unit", "percent");
items4.addProperty("product_code", "4912345678904");
items4.addProperty("is_multiply_by_count", true);
items4.addProperty("required_count", 2);
JsonObject items5 = new JsonObject();
items5.addProperty("point_amount", 5);
items5.addProperty("point_amount_unit", "percent");
items5.addProperty("product_code", "4912345678904");
items5.addProperty("is_multiply_by_count", true);
items5.addProperty("required_count", 2);
JsonObject items6 = new JsonObject();
items6.addProperty("product_code", "4912345678904");
items6.addProperty("classification_code", "c123");
JsonObject items7 = new JsonObject();
items7.addProperty("from", "12:00");
items7.addProperty("to", "23:59");
JsonObject items8 = new JsonObject();
items8.addProperty("from", "12:00");
items8.addProperty("to", "23:59");
JsonObject applicable_account_metadata = new JsonObject();
applicable_account_metadata.addProperty("key", "sex");
applicable_account_metadata.addProperty("value", "male");
JsonObject applicable_transaction_metadata = new JsonObject();
applicable_transaction_metadata.addProperty("key", "rank");
applicable_transaction_metadata.addProperty("value", "bronze");
Request request = new CreateCampaign(
    "bdPk0z0U5np6zSSSsJChBCfGVrTTzFEA3cEkuniAENmbJtM74yoK3yNaovdjb7urlPondGWEfVzKMwihh3UCJATPnnGfbSAjt8y1LpRX9w3aEMSDM7H6DKpMVCMs6AqPF1N4VGIihJYcZH1yqyLKdrb7VdvBferrdPPsgFTBp21GVpuNthlN8cTNxtClPPAh3ydu7juMa", // name: キャンペーン名
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    "2020-05-27T16:30:33.000000Z",                // startsAt: キャンペーン開始日時
    "2022-03-29T07:15:33.000000Z",                // endsAt: キャンペーン終了日時
    4491,                                         // priority: キャンペーンの適用優先度
    "external-transaction"                        // event: イベント種別
)
        .bearPointShopId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント負担先店舗ID
        .description("7kqGjaASQkqyw2Q45pim16jWY8Li2yJuAILC9WmiQzTAP0hsvYk94ECXfwyrT6FNWSeiPJDkaNGUUFy37fVBCxguWkgEaSRxikajDhky1e9MUM8ZY9eEBDTjFI18oRpgCoDiEOfsuO") // キャンペーンの説明文
        .status("disabled")                       // キャンペーン作成時の状態
        .pointExpiresAt("2023-06-21T16:01:16.000000Z") // ポイント有効期限(絶対日時指定)
        .pointExpiresInDays(5365)                 // ポイント有効期限(相対日数指定)
        .setExclusive(false)                      // キャンペーンの重複設定
        .subject("all")                           // ポイント付与の対象金額の種別
        .amountBasedPointRules(new Object[]{items,items2,items3}) // 取引金額ベースのポイント付与ルール
        .productBasedPointRules(new Object[]{items4,items5}) // 商品情報ベースのポイント付与ルール
        .blacklistedProductRules(new Object[]{items6}) // 商品情報ベースのキャンペーンで除外対象にする商品リスト
        .applicableDaysOfWeek(new Integer[]{0,0,5}) // キャンペーンを適用する曜日 (複数指定)
        .applicableTimeRanges(new Object[]{items7,items8}) // キャンペーンを適用する時間帯 (複数指定)
        .applicableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象となる店舗IDのリスト
        .blacklistedShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象外となる店舗IDのリスト(ブラックリスト方式)
        .minimumNumberOfProducts(3310)            // キャンペーンを適用する1会計内の商品個数の下限
        .minimumNumberOfAmount(9962)              // キャンペーンを適用する1会計内の商品総額の下限
        .minimumNumberForCombinationPurchase(1410) // 複数種類の商品を同時購入するときの商品種別数の下限
        .existInEachProductGroups(false)          // 複数の商品グループにつき1種類以上の商品購入によって発火するキャンペーンの指定フラグ
        .maxPointAmount(4219)                     // キャンペーンによって付与されるポイントの上限
        .maxTotalPointAmount(3453)                // キャンペーンによって付与されるの1人当たりの累計ポイントの上限
        .destPrivateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx") // ポイント付与先となるマネーID
        .applicableAccountMetadata(applicable_account_metadata) // ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
        .applicableTransactionMetadata(applicable_transaction_metadata) // 取引時に指定するメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
        .budgetCapsAmount(1859163538);            // キャンペーン予算上限

```



### Parameters
**`name`** 
  

キャンペーン名です(必須項目)。

ポイント付与によってできるチャージ取引の説明文に転記されます。取引説明文はエンドユーザーからも確認できます。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`privateMoneyId`** 
  

キャンペーン対象のマネーのIDです(必須項目)。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`startsAt`** 
  

キャンペーン開始日時です(必須項目)。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`endsAt`** 
  

キャンペーン終了日時です(必須項目)。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`priority`** 
  

キャンペーンの適用優先度です。

優先度が大きいものから順に適用判定されていきます。
キャンペーン期間が重なっている同一の優先度のキャンペーンが存在するとcampaign_period_overlapsエラー(422)になります。

```json
{
  "type": "integer"
}
```

**`event`** 
  

キャンペーンのトリガーとなるイベントの種類を指定します(必須項目)。

以下のいずれかを指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)
2. payment
   エンドユーザーから店舗への送金取引(支払い)
3. external-transaction
   ポケペイ外の取引(現金決済など)

```json
{
  "type": "string",
  "enum": [
    "topup",
    "payment",
    "external-transaction"
  ]
}
```

**`bearPointShopId`** 
  

ポイントを負担する店舗のIDです。デフォルトではマネー発行体の本店が設定されます。
ポイント負担先店舗は後から更新することはできません。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`description`** 
  

キャンペーンの内容を記載します。管理画面などでキャンペーンを管理するための説明文になります。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`status`** 
  

キャンペーン作成時の状態を指定します。デフォルトではenabledです。

以下のいずれかを指定できます。

1. enabled
   有効
2. disabled
   無効

```json
{
  "type": "string",
  "enum": [
    "enabled",
    "disabled"
  ]
}
```

**`pointExpiresAt`** 
  

キャンペーンによって付与されるポイントの有効期限を絶対日時で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`pointExpiresInDays`** 
  

キャンペーンによって付与されるポイントの有効期限を相対日数で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`setExclusive`** 
  

キャンペーンの重ね掛けを行うかどうかのフラグです。

これにtrueを指定すると他のキャンペーンと同時適用されません。デフォルト値はtrueです。
falseを指定すると次の優先度の重ね掛け可能なキャンペーンの適用判定に進みます。

```json
{
  "type": "boolean"
}
```

**`subject`** 
  

ポイント付与額を計算する対象となる金額の種類を指定します。デフォルト値はallです。
eventとしてexternal-transactionを指定した場合はポイントとマネーの区別がないためsubjectの指定に関わらず常にallとなります。

以下のいずれかを指定できます。

1. money
moneyを指定すると決済額の中で「マネー」を使って支払った額を対象にします

2. all
all を指定すると決済額全体を対象にします (「ポイント」での取引額を含む)
注意: event を topup にしたときはポイントの付与に対しても適用されます

```json
{
  "type": "string",
  "enum": [
    "money",
    "all"
  ]
}
```

**`amountBasedPointRules`** 
  

金額をベースとしてポイント付与を行うルールを指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
各ルールは一つのみ適用され、条件に重複があった場合は先に記載されたものが優先されます。

例:
```javascript
[
  // 1000円以上、5000円未満の決済には 5％
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 1000,
    "subject_less_than": 5000
  },
  // 5000円以上の決済には 10%
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 5000
  },
]
```

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`productBasedPointRules`** 
  

商品情報をベースとしてポイント付与を行うルールを指定します。
ルールは商品ごとに設定可能で、ルールの配列として指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
event が payment か external-transaction の時のみ有効です。
各ルールの順序は問わず、適用可能なものは全て適用されます。
一つの決済の中で複数の商品がキャンペーン適用可能な場合はそれぞれの商品についてのルールが適用され、ポイント付与額はその合算になります。

例:
```javascript
[
  // 対象商品の購入額から5%ポイント付与。複数購入時は単価の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
  },
  // 対象商品の購入額から5%ポイント付与。複数購入時は購入総額の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
    "is_multiply_by_count": true,
  },
  // 対象商品を2つ以上購入したら500ポイント付与(固定額付与)
  {
    "point_amount": 500,
    "point_amount_unit": "absolute",
    "product_code": "4912345678904",
    "required_count": 2
  },
  // 書籍は10%ポイント付与
  // ※ISBNの形式はレジがポケペイに送信する形式に準じます
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-%",
  },
  // 一部の出版社の書籍は10%ポイント付与
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-4-01-%", // 旺文社
  }
]
```

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`blacklistedProductRules`** 
  

商品情報をベースとしてポイント付与を行う際に、事前に除外対象とする商品リストを指定します。
除外対象の商品コード、または分類コードのパターンの配列として指定します。
取引時には、まずここで指定した除外対象商品が除かれ、残った商品に対して `product_based_point_rules` のルール群が適用されます。

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`applicableDaysOfWeek`** 
  

キャンペーンを適用する曜日を指定します (複数指定)。
曜日は整数で表します。月曜を 0 とし、日曜を 6 とします。
指定しなかった場合は全日を対象にします (曜日による適用条件なし)

```json
{
  "type": "array",
  "items": {
    "type": "integer",
    "minimum": 0,
    "maximum": 6
  }
}
```

**`applicableTimeRanges`** 
  

キャンペーンを適用する時間帯を指定します (複数指定可)。
時間帯はfromとtoからなるオブジェクトで指定します。
fromとtoは両方必要です。

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`applicableShopIds`** 
  

キャンペーンを適用する店舗IDを指定します (複数指定)。
指定しなかった場合は全店舗が対象になります。

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`blacklistedShopIds`** 
  

キャンペーンの適用対象外となる店舗IDをブラックリスト方式で指定します (複数指定可)。
このパラメータが指定されている場合、blacklisted_shop_idsに含まれていない店舗全てがキャンペーンの適用対象になります。
blacklisted_shop_idsとapplicable_shop_idsは同時には指定できません。ホワイトリスト方式を使うときはapplicable_shop_idsを指定してください。

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`minimumNumberOfProducts`** 
  

このパラメータを指定すると、取引時の1会計内のルールに適合する商品個数がminimum_number_of_productsを超えたときにのみキャンペーンが発火するようになります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`minimumNumberOfAmount`** 
  

このパラメータを指定すると、取引時の1会計内のルールに適合する商品総額がminimum_number_of_amountを超えたときにのみキャンペーンが発火するようになります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`minimumNumberForCombinationPurchase`** 
  

複数種別の商品を同時購入したとき、同時購入キャンペーンの対象となる商品種別数の下限です。デフォルトでは未指定で、指定する場合は1以上の整数を指定します。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定されている必要があります。
例えば、A商品とB商品とC商品のうち、キャンペーンの発火のために2商品以上が同時購入される必要があるときは 2 を指定します。

例1: 商品A, Bが同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード"
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード"
    }
  ]
}
```

例2: 商品A, Bが3個ずつ以上同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード",
      "required_count": 3
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード",
      "required_count": 3
    }
  ]
}
```

例2: 商品A, B, Cのうち2商品以上が同時購入されたときに総額の10%ポイントが付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Aの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Bの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Cの商品コード",
      "is_multiply_by_count": true,
    }
  ]
}
```

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`existInEachProductGroups`** 
  

複数の商品グループの各グループにつき1種類以上の商品が購入されることによって発火するキャンペーンであるときに真を指定します。デフォルトは偽です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定され、さらにその中でgroup_idが指定されている必要があります。group_idは正の整数です。
exist_in_each_product_groupsが指定されているにも関わらず商品毎のルールでgroup_idが指定されていないものが含まれている場合はinvalid_parametersエラー(missing group_id, エラーコード400)が返ります。

例えば、商品グループA(商品コードa1, a2)、商品グループB(商品コードb1, b2)の2つの商品グループがあるとします。
このとき、各商品グループからそれぞれ少なくとも1種類以上の商品が購入されることにより発火するキャンペーンに対するリクエストパラメータは以下のようなものになります。

```javascript
{
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になります。つまり100 + 200=300がポイント付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

ポイント付与値を各商品毎のルールの総和ではなく固定値にしたい場合には、max_point_amountを指定します。
例えば以下のようなリクエストパラメータ指定の場合を考えます。

```javascript
{
  max_point_amount: 100,
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になりますが、付与値の上限が100ポイントになります。つまり100 + 200=300と計算されますが上限額の100ポイントが実際の付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600ですが上限額の100がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

```json
{
  "type": "boolean"
}
```

**`maxPointAmount`** 
  

キャンペーンによって付与されるポイントの上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、amount_based_point_rules や product_based_point_rules によって計算されるポイント付与値がmax_point_amountを越えている場合、max_point_amountの値がポイント付与値となり、越えていない場合はその値がポイント付与値となります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`maxTotalPointAmount`** 
  

キャンペーンによって付与される1人当たりの累計ポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、各ユーザに対してそのキャンペーンによって過去付与されたポイントの累積値が記録されるようになります。
累積ポイント数がmax_total_point_amountを超えない限りにおいてキャンペーンで算出されたポイントが付与されます。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`destPrivateMoneyId`** 
  

キャンペーンを駆動するイベントのマネーとは「別のマネー」に対してポイントを付けたいときに、そのマネーIDを指定します。

ポイント付与先のマネーはキャンペーンを駆動するイベントのマネーと同一発行体が発行しているものに限ります。その他のマネーIDが指定された場合は private_money_not_found (422) が返ります。
エンドユーザー、店舗、ポイント負担先店舗はポイント付与先マネーのウォレットを持っている必要があります。持っていない場合はポイントは付きません。
元のイベントのマネーと異なる複数のマネーに対して同時にポイントを付与することはできません。重複可能に設定されている複数のキャンペーンで別々のポイント付与先マネーを指定した場合は最も優先度の高いものが処理され、残りは無視されます。
キャンペーンのポイント付与先マネーは後から更新することはできません。
デフォルトではポイント付与先はキャンペーンを駆動するイベントのマネー(private_money_idで指定したマネー)になります。

別マネーに対するポイント付与は別のtransactionとなります。 RefundTransaction で元のイベントをキャンセルしたときはポイント付与のtransactionもキャンセルされ、逆にポイント付与のtransactionをキャンセルしたときは連動して元のイベントがキャンセルされます。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`applicableAccountMetadata`** 
  

ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
ウォレットのメタデータはCreateUserAccountやUpdateCustomerAccountで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引が行なわれたウォレットのメタデータに住所として東京が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo"
}
```

例2: 取引が行なわれたウォレットのメタデータに住所として東京以外が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo",
  "test": "not-equal"
}
```

```json
{
  "type": "object"
}
```

**`applicableTransactionMetadata`** 
  

取引時に指定するメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
取引のメタデータはCreatePaymentTransactionやCreateExternalTransactionで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引のメタデータに会員ランクとしてbronzeが指定されているときのみ発火

```javascript
{
  "key": "rank",
  "value": "bronze"
}
```

例2: 取引のメタデータに会員ランクとしてbronze以外が指定されているときのみ発火

```javascript
{
  "key": "rank",
  "value": "bronze",
  "test": "not-equal"
}
```

```json
{
  "type": "object"
}
```

**`budgetCapsAmount`** 
  

キャンペーンの予算上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、このキャンペーンの適用により付与されたポイント全体を定期的に集計し、その合計が上限を越えていた場合にはキャンペーンを無効にします。
一度この値を越えて無効となったキャンペーンを再度有効にすることは出来ません。

```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 10000000000
}
```



成功したときは
[Campaign](./responses.md#campaign)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|400|invalid_parameters|項目が無効です|Invalid parameters|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|422|campaign_overlaps|同期間に開催されるキャンペーン間で優先度が重複してます|The campaign period overlaps under the same private-money / type / priority|
|422|shop_account_not_found|店舗アカウントが見つかりません|The shop account is not found|
|422|campaign_period_overlaps|同期間に開催されるキャンペーン間で優先度が重複してます|The campaign period overlaps under the same private-money / type / priority|
|422|campaign_invalid_period||Invalid campaign period starts_at later than ends_at|
|422|shop_user_not_found|店舗が見つかりません|The shop user is not found|
|422|private_money_not_found|マネーが見つかりません|Private money not found|



---


<a name="get-campaign"></a>
## GetCampaign: キャンペーンを取得する
IDを指定してキャンペーンを取得します。
発行体の組織マネージャ権限で、自組織が発行するマネーのキャンペーンについてのみ閲覧可能です。
閲覧権限がない場合は unpermitted_admin_user エラー(422)が返ります。

```JAVA
Request request = new GetCampaign(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // campaignId: キャンペーンID
);

```



### Parameters
**`campaignId`** 
  

キャンペーンIDです。

指定したIDのキャンペーンを取得します。存在しないIDを指定した場合は404エラー(NotFound)が返ります。

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[Campaign](./responses.md#campaign)
を返します



---


<a name="update-campaign"></a>
## UpdateCampaign: ポイント付与キャンペーンを更新する
ポイント付与キャンペーンを更新します。


```JAVA
JsonObject items = new JsonObject();
items.addProperty("point_amount", 5);
items.addProperty("point_amount_unit", "percent");
items.addProperty("subject_more_than_or_equal", 1000);
items.addProperty("subject_less_than", 5000);
JsonObject items2 = new JsonObject();
items2.addProperty("point_amount", 5);
items2.addProperty("point_amount_unit", "percent");
items2.addProperty("product_code", "4912345678904");
items2.addProperty("is_multiply_by_count", true);
items2.addProperty("required_count", 2);
JsonObject items3 = new JsonObject();
items3.addProperty("point_amount", 5);
items3.addProperty("point_amount_unit", "percent");
items3.addProperty("product_code", "4912345678904");
items3.addProperty("is_multiply_by_count", true);
items3.addProperty("required_count", 2);
JsonObject items4 = new JsonObject();
items4.addProperty("point_amount", 5);
items4.addProperty("point_amount_unit", "percent");
items4.addProperty("product_code", "4912345678904");
items4.addProperty("is_multiply_by_count", true);
items4.addProperty("required_count", 2);
JsonObject items5 = new JsonObject();
items5.addProperty("product_code", "4912345678904");
items5.addProperty("classification_code", "c123");
JsonObject items6 = new JsonObject();
items6.addProperty("from", "12:00");
items6.addProperty("to", "23:59");
JsonObject items7 = new JsonObject();
items7.addProperty("from", "12:00");
items7.addProperty("to", "23:59");
JsonObject items8 = new JsonObject();
items8.addProperty("from", "12:00");
items8.addProperty("to", "23:59");
JsonObject applicable_account_metadata = new JsonObject();
applicable_account_metadata.addProperty("key", "sex");
applicable_account_metadata.addProperty("value", "male");
JsonObject applicable_transaction_metadata = new JsonObject();
applicable_transaction_metadata.addProperty("key", "rank");
applicable_transaction_metadata.addProperty("value", "bronze");
Request request = new UpdateCampaign(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // campaignId: キャンペーンID
)
        .name("tzTLcjSeNyveotr1SbLY9f9RM3h2SXQaAm6iMSYVoPQWfV62UhTGJS1L9KLOsA2Q2") // キャンペーン名
        .startsAt("2022-07-19T10:00:07.000000Z")  // キャンペーン開始日時
        .endsAt("2024-05-22T15:43:46.000000Z")    // キャンペーン終了日時
        .priority(7347)                           // キャンペーンの適用優先度
        .event("payment")                         // イベント種別
        .description("98ipOldTUQCXPcZtLDZ6t1d7NhS3tIbiaQ9UqJHQZFkEmVia7WMZwoONY9mYcjUD3BWfN3hpObBbd0WPCuqh90wnUEefdvvGn56xgqcINC0MaOVTzOYUS4YiFzadS1dG4VhCAXdvL") // キャンペーンの説明文
        .status("disabled")                       // キャンペーン作成時の状態
        .pointExpiresAt("2023-11-21T12:04:13.000000Z") // ポイント有効期限(絶対日時指定)
        .pointExpiresInDays(740)                  // ポイント有効期限(相対日数指定)
        .setExclusive(true)                       // キャンペーンの重複設定
        .subject("all")                           // ポイント付与の対象金額の種別
        .amountBasedPointRules(new Object[]{items}) // 取引金額ベースのポイント付与ルール
        .productBasedPointRules(new Object[]{items2,items3,items4}) // 商品情報ベースのポイント付与ルール
        .blacklistedProductRules(new Object[]{items5}) // 商品情報ベースのキャンペーンで除外対象にする商品リスト
        .applicableDaysOfWeek(new Integer[]{1,5}) // キャンペーンを適用する曜日 (複数指定)
        .applicableTimeRanges(new Object[]{items6,items7,items8}) // キャンペーンを適用する時間帯 (複数指定)
        .applicableShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象となる店舗IDのリスト
        .blacklistedShopIds(new String[]{"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"}) // キャンペーン適用対象外となる店舗IDのリスト(ブラックリスト方式)
        .minimumNumberOfProducts(7318)            // キャンペーンを適用する1会計内の商品個数の下限
        .minimumNumberOfAmount(9052)              // キャンペーンを適用する1会計内の商品総額の下限
        .minimumNumberForCombinationPurchase(6125) // 複数種類の商品を同時購入するときの商品種別数の下限
        .existInEachProductGroups(false)          // 複数の商品グループにつき1種類以上の商品購入によって発火するキャンペーンの指定フラグ
        .maxPointAmount(5449)                     // キャンペーンによって付与されるポイントの上限
        .maxTotalPointAmount(1307)                // キャンペーンによって付与されるの1人当たりの累計ポイントの上限
        .applicableAccountMetadata(applicable_account_metadata) // ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
        .applicableTransactionMetadata(applicable_transaction_metadata) // 取引時に指定するメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
        .budgetCapsAmount(456514657);             // キャンペーン予算上限

```



### Parameters
**`campaignId`** 
  

キャンペーンIDです。

指定したIDのキャンペーンを更新します。存在しないIDを指定した場合は404エラー(NotFound)が返ります。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`name`** 
  

キャンペーン名です。

ポイント付与によってできるチャージ取引の説明文に転記されます。取引説明文はエンドユーザーからも確認できます。

```json
{
  "type": "string",
  "maxLength": 256
}
```

**`startsAt`** 
  

キャンペーン開始日時です。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`endsAt`** 
  

キャンペーン終了日時です。
キャンペーン期間中のみポイントが付与されます。
開始日時よりも終了日時が前のときはcampaign_invalid_periodエラー(422)になります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`priority`** 
  

キャンペーンの適用優先度です。

優先度が大きいものから順に適用判定されていきます。
キャンペーン期間が重なっている同一の優先度のキャンペーンが存在するとcampaign_period_overlapsエラー(422)になります。

```json
{
  "type": "integer"
}
```

**`event`** 
  

キャンペーンのトリガーとなるイベントの種類を指定します。

以下のいずれかを指定できます。

1. topup
   店舗からエンドユーザーへの送金取引(チャージ)
2. payment
   エンドユーザーから店舗への送金取引(支払い)
3. external-transaction
   ポケペイ外の取引(現金決済など)

```json
{
  "type": "string",
  "enum": [
    "topup",
    "payment",
    "external-transaction"
  ]
}
```

**`description`** 
  

キャンペーンの内容を記載します。管理画面などでキャンペーンを管理するための説明文になります。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`status`** 
  

キャンペーン作成時の状態を指定します。デフォルトではenabledです。

以下のいずれかを指定できます。

1. enabled
   有効
2. disabled
   無効

```json
{
  "type": "string",
  "enum": [
    "enabled",
    "disabled"
  ]
}
```

**`pointExpiresAt`** 
  

キャンペーンによって付与されるポイントの有効期限を絶対日時で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

```json
{
  "type": "string",
  "format": "date-time"
}
```

**`pointExpiresInDays`** 
  

キャンペーンによって付与されるポイントの有効期限を相対日数で指定します。
省略した場合はマネーに設定された有効期限と同じものがポイントの有効期限となります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`setExclusive`** 
  

キャンペーンの重ね掛けを行うかどうかのフラグです。

これにtrueを指定すると他のキャンペーンと同時適用されません。デフォルト値はtrueです。
falseを指定すると次の優先度の重ね掛け可能なキャンペーンの適用判定に進みます。

```json
{
  "type": "boolean"
}
```

**`subject`** 
  

ポイント付与額を計算する対象となる金額の種類を指定します。デフォルト値はallです。
eventとしてexternal-transactionを指定した場合はポイントとマネーの区別がないためsubjectの指定に関わらず常にallとなります。

以下のいずれかを指定できます。

1. money
moneyを指定すると決済額の中で「マネー」を使って支払った額を対象にします

2. all
all を指定すると決済額全体を対象にします (「ポイント」での取引額を含む)
注意: event を topup にしたときはポイントの付与に対しても適用されます

```json
{
  "type": "string",
  "enum": [
    "money",
    "all"
  ]
}
```

**`amountBasedPointRules`** 
  

金額をベースとしてポイント付与を行うルールを指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
各ルールは一つのみ適用され、条件に重複があった場合は先に記載されたものが優先されます。

例:
```javascript
[
  // 1000円以上、5000円未満の決済には 5％
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 1000,
    "subject_less_than": 5000
  },
  // 5000円以上の決済には 10%
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "subject_more_than_or_equal": 5000
  },
]
```

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`productBasedPointRules`** 
  

商品情報をベースとしてポイント付与を行うルールを指定します。
ルールは商品ごとに設定可能で、ルールの配列として指定します。
amount_based_point_rules と product_based_point_rules はどちらか一方しか指定できません。
event が payment か external-transaction の時のみ有効です。
各ルールの順序は問わず、適用可能なものは全て適用されます。
一つの決済の中で複数の商品がキャンペーン適用可能な場合はそれぞれの商品についてのルールが適用され、ポイント付与額はその合算になります。

例:
```javascript
[
  // 対象商品の購入額から5%ポイント付与。複数購入時は単価の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
  },
  // 対象商品の購入額から5%ポイント付与。複数購入時は購入総額の5%が付与される。
  {
    "point_amount": 5,
    "point_amount_unit": "percent",
    "product_code": "4912345678904",
    "is_multiply_by_count": true,
  },
  // 対象商品を2つ以上購入したら500ポイント付与(固定額付与)
  {
    "point_amount": 500,
    "point_amount_unit": "absolute",
    "product_code": "4912345678904",
    "required_count": 2
  },
  // 書籍は10%ポイント付与
  // ※ISBNの形式はレジがポケペイに送信する形式に準じます
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-%",
  },
  // 一部の出版社の書籍は10%ポイント付与
  {
    "point_amount": 10,
    "point_amount_unit": "percent",
    "product_code": "978-4-01-%", // 旺文社
  }
]
```

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`blacklistedProductRules`** 
  

商品情報をベースとしてポイント付与を行う際に、事前に除外対象とする商品リストを指定します。
除外対象の商品コード、または分類コードのパターンの配列として指定します。
取引時には、まずここで指定した除外対象商品が除かれ、残った商品に対して `product_based_point_rules` のルール群が適用されます。

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`applicableDaysOfWeek`** 
  

キャンペーンを適用する曜日を指定します (複数指定)。
曜日は整数で表します。月曜を 0 とし、日曜を 6 とします。
指定しなかった場合は全日を対象にします (曜日による適用条件なし)

```json
{
  "type": "array",
  "items": {
    "type": "integer",
    "minimum": 0,
    "maximum": 6
  }
}
```

**`applicableTimeRanges`** 
  

キャンペーンを適用する時間帯を指定します (複数指定可)。
時間帯はfromとtoからなるオブジェクトで指定します。
fromとtoは両方必要です。

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`applicableShopIds`** 
  

キャンペーンを適用する店舗IDを指定します (複数指定)。
指定しなかった場合は全店舗が対象になります。

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`blacklistedShopIds`** 
  

キャンペーンの適用対象外となる店舗IDをブラックリスト方式で指定します (複数指定可)。
このパラメータが指定されている場合、blacklisted_shop_idsに含まれていない店舗全てがキャンペーンの適用対象になります。
blacklisted_shop_idsとapplicable_shop_idsは同時には指定できません。ホワイトリスト方式を使うときはapplicable_shop_idsを指定してください。

```json
{
  "type": "array",
  "items": {
    "type": "string",
    "format": "uuid"
  }
}
```

**`minimumNumberOfProducts`** 
  

このパラメータを指定すると、取引時の1会計内のルールに適合する商品個数がminimum_number_of_productsを超えたときにのみキャンペーンが発火するようになります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`minimumNumberOfAmount`** 
  

このパラメータを指定すると、取引時の1会計内のルールに適合する商品総額がminimum_number_of_amountを超えたときにのみキャンペーンが発火するようになります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`minimumNumberForCombinationPurchase`** 
  

複数種別の商品を同時購入したとき、同時購入キャンペーンの対象となる商品種別数の下限です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定されている必要があります。
例えば、A商品とB商品とC商品のうち、キャンペーンの発火のために2商品以上が同時購入される必要があるときは 2 を指定します。

例1: 商品A, Bが同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード"
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード"
    }
  ]
}
```

例2: 商品A, Bが3個ずつ以上同時購入されたときに固定ポイント額(200ポイント)付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Aの商品コード",
      "required_count": 3
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "商品Bの商品コード",
      "required_count": 3
    }
  ]
}
```

例2: 商品A, B, Cのうち2商品以上が同時購入されたときに総額の10%ポイントが付与
```javascript
{
  minimum_number_for_combination_purchase: 2,
  product_based_point_rules: [
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Aの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Bの商品コード",
      "is_multiply_by_count": true,
    },
    {
      "point_amount": 10,
      "point_amount_unit": "percent",
      "product_code": "商品Cの商品コード",
      "is_multiply_by_count": true,
    }
  ]
}
```

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`existInEachProductGroups`** 
  

複数の商品グループの各グループにつき1種類以上の商品が購入されることによって発火するキャンペーンであるときに真を指定します。デフォルトは偽です。

このパラメータを指定するときは product_based_point_rules で商品毎のルールが指定され、さらにその中でgroup_idが指定されている必要があります。group_idは正の整数です。
exist_in_each_product_groupsが指定されているにも関わらず商品毎のルールでgroup_idが指定されていないものが含まれている場合はinvalid_parametersエラー(missing group_id, エラーコード400)が返ります。

例えば、商品グループA(商品コードa1, a2)、商品グループB(商品コードb1, b2)の2つの商品グループがあるとします。
このとき、各商品グループからそれぞれ少なくとも1種類以上の商品が購入されることにより発火するキャンペーンに対するリクエストパラメータは以下のようなものになります。

```javascript
{
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 200,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になります。つまり100 + 200=300がポイント付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

ポイント付与値を各商品毎のルールの総和ではなく固定値にしたい場合には、max_point_amountを指定します。
例えば以下のようなリクエストパラメータ指定の場合を考えます。

```javascript
{
  max_point_amount: 100,
  exist_in_each_product_groups: true,
  product_based_point_rules: [
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a1",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "a2",
      "group_id": 1
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b1",
      "group_id": 2
    },
    {
      "point_amount": 100,
      "point_amount_unit": "absolute",
      "product_code": "b2",
      "group_id": 2
    }
  ]
}
```

このキャンペーンが設定された状態で、商品a1、b1が同時に購入された場合、各商品に対する個別のルールが適用された上での総和がポイント付与値になりますが、付与値の上限が100ポイントになります。つまり100 + 200=300と計算されますが上限額の100ポイントが実際の付与値になります。商品a1、a2、 b1、b2が同時に購入された場合は100 + 100 + 200 + 200=600ですが上限額の100がポイント付与値になります。 商品a1、a2が同時に購入された場合は全商品グループから1種以上購入されるという条件を満たしていないためポイントは付与されません。

```json
{
  "type": "boolean"
}
```

**`maxPointAmount`** 
  

キャンペーンによって付与される1取引当たりのポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、amount_based_point_rules や product_based_point_rules によって計算されるポイント付与値がmax_point_amountを越えている場合、max_point_amountの値がポイント付与値となり、越えていない場合はその値がポイント付与値となります。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`maxTotalPointAmount`** 
  

キャンペーンによって付与される1人当たりの累計ポイント数の上限を指定します。デフォルトは未指定です。

このパラメータが指定されている場合、各ユーザに対してそのキャンペーンによって過去付与されたポイントの累積値が記録されるようになります。
累積ポイント数がmax_total_point_amountを超えない限りにおいてキャンペーンで算出されたポイントが付与されます。

```json
{
  "type": "integer",
  "minimum": 1
}
```

**`applicableAccountMetadata`** 
  

ウォレットに紐付くメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
ウォレットのメタデータはCreateUserAccountやUpdateCustomerAccountで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引が行なわれたウォレットのメタデータに住所として東京が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo"
}
```

例2: 取引が行なわれたウォレットのメタデータに住所として東京以外が指定されているときのみ発火

```javascript
{
  "key": "prefecture",
  "value": "tokyo",
  "test": "not-equal"
}
```

```json
{
  "type": "object"
}
```

**`applicableTransactionMetadata`** 
  

取引時に指定するメタデータが特定の値を持つときにのみ発火するキャンペーンを登録します。
メタデータの属性名 key とメタデータの値 value の組をオブジェクトとして指定します。
取引のメタデータはCreatePaymentTransactionやCreateExternalTransactionで登録できます。

オプショナルパラメータtestによって比較方法を指定することができます。
デフォルトは equal で、その他に not-equalを指定可能です。

例1: 取引のメタデータに会員ランクとしてbronzeが指定されているときのみ発火

```javascript
{
  "key": "rank",
  "value": "bronze"
}
```

例2: 取引のメタデータに会員ランクとしてbronze以外が指定されているときのみ発火

```javascript
{
  "key": "rank",
  "value": "bronze",
  "test": "not-equal"
}
```

```json
{
  "type": "object"
}
```

**`budgetCapsAmount`** 
  

キャンペーンの予算上限を指定します。

キャンペーン予算上限が設定されておらずこのパラメータに数値が指定されている場合、このキャンペーンの適用により付与されたポイント全体を定期的に集計し、その合計が上限を越えていた場合にはキャンペーンを無効にします。
一度この値を越えて無効となったキャンペーンを再度有効にすることは出来ません。
キャンペーン予算上限が設定されておらずこのパラメータにnullが指定されている場合、何も発生しない。
キャンペーン予算上限が設定されておりこのパラメータにnullが指定された場合、キャンペーン予算上限は止まります。

```json
{
  "type": "integer",
  "minimum": 1,
  "maximum": 10000000000
}
```



成功したときは
[Campaign](./responses.md#campaign)
を返します



---



