# BankPay
BankPayを用いた銀行からのチャージ取引などのAPIを提供しています。


<a name="list-banks"></a>
## ListBanks: 登録した銀行の一覧
登録した銀行を一覧します

```JAVA
Request request = new ListBanks(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // userDeviceId: デバイスID
)
        .privateMoneyId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");

```



### Parameters
**`userDeviceId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[Banks](./responses.md#banks)
を返します



---


<a name="create-bank"></a>
## CreateBank: 銀行口座の登録
銀行口座の登録を始めるAPIです。レスポンスに含まれるredirect_urlをユーザーの端末で開き銀行を登録します。

ユーザーが銀行口座の登録に成功すると、callback_urlにリクエストが行われます。
アプリの場合はDeep Linkを使うことを想定しています。


```JAVA
Request request = new CreateBank(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // userDeviceId: デバイスID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    "<Deep Link>",                                // callbackUrl: コールバックURL
    "ポケペイタロウ"                                     // kana: ユーザーの氏名 (片仮名で指定)
)
        .email("wpVUwFU1am@kd1F.com")             // ユーザーのメールアドレス
        .birthdate("19901142");                   // 生年月日

```



### Parameters
**`userDeviceId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`callbackUrl`** 
  


```json
{
  "type": "string",
  "maxLength": 256
}
```

**`kana`** 
  


```json
{
  "type": "string",
  "maxLength": 30
}
```

**`email`** 
  


```json
{
  "type": "string",
  "format": "email",
  "maxLength": 300
}
```

**`birthdate`** 
  


```json
{
  "type": "string",
  "maxLength": 8
}
```



成功したときは
[BankRegisteringInfo](./responses.md#bank-registering-info)
を返します



---


<a name="create-bank-topup-transaction"></a>
## CreateBankTopupTransaction: 銀行からのチャージ
指定のマネーのアカウントにbank_idの口座を用いてチャージを行います。

```JAVA
Request request = new CreateBankTopupTransaction(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // userDeviceId: デバイスID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // privateMoneyId: マネーID
    8003,                                         // amount: チャージ金額
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",       // bankId: 銀行ID
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // requestId: リクエストID
)
        .receiverUserId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"); // 受け取りユーザーID (デフォルトは自身)

```



### Parameters
**`userDeviceId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`privateMoneyId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`amount`** 
  


```json
{
  "type": "integer",
  "minimum": 1
}
```

**`bankId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`receiverUserId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```

**`requestId`** 
  


```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[TransactionDetail](./responses.md#transaction-detail)
を返します



---



