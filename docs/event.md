# Event

<a name="create-external-transaction"></a>
## CreateExternalTransaction: ポケペイ外部取引を作成する
ポケペイ外部取引を作成します。

ポケペイ外の現金決済やクレジットカード決済に対してポケペイのポイントを付けたいというときに使用します。


```JAVA
JsonObject items = new JsonObject();
items.addProperty("jan_code", "abc");
items.addProperty("name", "name1");
items.addProperty("unit_price", 100);
items.addProperty("price", 100);
items.addProperty("is_discounted", false);
items.addProperty("other", "{}");
JsonObject items2 = new JsonObject();
items2.addProperty("jan_code", "abc");
items2.addProperty("name", "name1");
items2.addProperty("unit_price", 100);
items2.addProperty("price", 100);
items2.addProperty("is_discounted", false);
items2.addProperty("other", "{}");
JsonObject items3 = new JsonObject();
items3.addProperty("jan_code", "abc");
items3.addProperty("name", "name1");
items3.addProperty("unit_price", 100);
items3.addProperty("price", 100);
items3.addProperty("is_discounted", false);
items3.addProperty("other", "{}");
Request request = new CreateExternalTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // shopId: 店舗ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // customerId: エンドユーザーID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    9453                                          // amount: 取引額
)
        .description("たい焼き(小倉)")                  // 取引説明文
        .metadata("{\"key\":\"value\"}")          // ポケペイ外部取引メタデータ
        .products(new Object[]{items,items2,items3}) // 商品情報データ
        .requestId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // リクエストID

```



### Parameters
**`shopId`** 
  

店舗IDです。

ポケペイ外部取引が行なう店舗を指定します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`customerId`** 
  

エンドユーザーIDです。

エンドユーザーを指定します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  

マネーIDです。

マネーを指定します。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`amount`** 
  

取引金額です。

```json
{
  "type": "integer",
  "minimum": 0
}
```

**`description`** 
  

取引説明文です。

任意入力で、取引履歴に表示される説明文です。

```json
{
  "type": "string",
  "maxLength": 200
}
```

**`metadata`** 
  

ポケペイ外部取引作成時に指定され、取引と紐付けられるメタデータです。

任意入力で、全てのkeyとvalueが文字列であるようなフラットな構造のJSONで指定します。

```json
{
  "type": "string",
  "format": "json"
}
```

**`products`** 
  

一つの取引に含まれる商品情報データです。
以下の内容からなるJSONオブジェクトの配列で指定します。

- `jan_code`: JANコード。64字以下の文字列
- `name`: 商品名。256字以下の文字列
- `unit_price`: 商品単価。0以上の数値
- `price`: 全体の金額(例: 商品単価 × 個数)。0以上の数値
- `is_discounted`: 賞味期限が近いなどの理由で商品が値引きされているかどうかのフラグ。boolean
- `other`: その他商品に関する情報。JSONオブジェクトで指定します。

```json
{
  "type": "array",
  "items": {
    "type": "object"
  }
}
```

**`requestId`** 
  

取引作成APIの羃等性を担保するためのリクエスト固有のIDです。

取引作成APIで結果が受け取れなかったなどの理由で再試行する際に、二重に取引が作られてしまうことを防ぐために、クライアント側から指定されます。指定は任意で、UUID V4フォーマットでランダム生成した文字列です。リクエストIDは一定期間で削除されます。

リクエストIDを指定したとき、まだそのリクエストIDに対する取引がない場合、新規に取引が作られレスポンスとして返されます。もしそのリクエストIDに対する取引が既にある場合、既存の取引がレスポンスとして返されます。

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[ExternalTransactionDetail](./responses.md#external-transaction-detail)
を返します


---


<a name="refund-external-transaction"></a>
## RefundExternalTransaction: ポケペイ外部取引をキャンセルする
取引IDを指定して取引をキャンセルします。

発行体の管理者は自組織の直営店、または発行しているマネーの決済加盟店組織での取引をキャンセルできます。
キャンセル対象のポケペイ外部取引に付随するポイント還元キャンペーンも取り消されます。

取引をキャンセルできるのは1回きりです。既にキャンセルされた取引を重ねてキャンセルしようとすると `transaction_already_refunded (422)` エラーが返ります。

```JAVA
Request request = new RefundExternalTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // eventId: 取引ID
)
        .description("返品対応のため");                  // 取引履歴に表示する返金事由

```



### Parameters
**`eventId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`description`** 
  


```json
{
  "type": "string",
  "maxLength": 200
}
```



成功したときは
[ExternalTransactionDetail](./responses.md#external-transaction-detail)
を返します


---


