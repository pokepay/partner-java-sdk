## Example

```
PartnerAPI client = new PartnerAPI(new File("./sample.properties"));
Product[] products = new Product[]{
        new Product(),
};
Request request = new CreateTransaction(cpmToken, amount, shopId).setProducts(products);
UserTransaction userTransaction = (UserTransaction) client.send(request);
System.out.println(userTransaction.getId());
```

設定はプロパティファイルに記述し、PartnerAPIのコンストラクタにFileとして渡します。
プロパティファイルの書き方はsample.propertiesを参考にしてください。

## cpmトークンを使った取引のリクエストを作成

```
CreateTransaction request = new CreateCpmTransaction(
    "4405c879-0a8c-4dde-89ee-d5b0a99d5584", // cpmトークンのid
    "100", // 金額、正だとチャージ、負だと支払いを表す
    "68ee8c2b-770c-4f00-b01a-17749a7d882b" // 店舗id
);

request.setProducts(商品情報の配列); // 省略可能
```

成功した場合のレスポンスはTransactionオブジェクトです。以下にプロパティを示します。

- id(string): 取引ID
- type(string): 取引種別(exchange, topup, payment, transfer)
- isModified(boolean): 返金された取引かどうか
- senderAccount(Account): 送金口座情報
- receiver(User): 受取者情報
- receiverAccount: 受取口座情報
- amount(double): 決済総額 (マネー額 + ポイント額)
- moneyAmount(double): 決済マネー額
- pointAmount(double): 決済ポイント額
- doneAt(string): 取引日時
- description(string): 取引説明文


senderとreceiverはAccountオブジェクトです。以下にプロパティを示します。

- id(string): 口座ID
- name(string): 口座名
- isSuspended(boolean): 口座が凍結されているかどうか
- privateMoney(PrivateMoney): 設定マネー情報


privateMoneyはPrivateMoneyのオブジェクトです。以下にプロパティを示します。

- id(string): マネーID
- name(string): マネー名
- unit(string): マネー単位 (例: 円)
- isExclusive(boolean): 会員制のマネーかどうか
- description(string): マネー説明文
- maxBalance(double): 口座の上限金額
- transferLimit(double): マネーの取引上限額
- type(string): マネー種別 (自家型=own, 第三者型=third-party)
- expirationType(string): 有効期限種別 (チャージ日時起算=static, 最終利用日時起算=last-update)
