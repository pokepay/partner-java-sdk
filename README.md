# Partner API SDK for Java

```
try {
    PartnerAPI client = new PartnerAPI(new File("config.properties"));
    Request request = new CreateCheck("account_id")
            .setAmount(1);
    Check check = (Check) client.send(request);
    System.out.println(check.getId());
} catch (BankHttpError error) {
    System.out.println(error.getType());
    System.out.println(error.getMessage());
} catch (Exception ex) {
    ex.printStackTrace();
}
```

設定はプロパティファイルに記述し、PartnerAPIのコンストラクタにFileとして渡します。
プロパティファイルの書き方はsample.propertiesを参考にしてください。

## 送金用QRの作成

* `new CreateCheck(口座ID)`: 送金用QRコードを作成するリクエストオブジェクトを作成します。

* `CreateCheck#setAmount`: 送金マネー額を指定します。これは `CreateCheck#setMoneyAmount` 、`CreateCheck#setPointAmount` と同時に使用できません。

* `CreateCheck#setMoneyAmount` `CreateCheck#setPointAmount`: 送金マネー額、送金ポイント額を指定します。

* `CreateCheck#setDescription`: QRの説明文を指定します。これは読み取り時や取引履歴に表示されます。

* `CreateCheck#setIsOnetime`: 一度しか読み取りできないQRコードの作成時に指定します。デフォルトはtrueです。

* `CreateCheck#setUsageLimit`: QRコード読み取りの利用回数制限を指定します、setIsOnetimeをfalseにした場合のみ有効です。

* `CreateCheck#setExpiresAt`: QRコードの有効期限を指定します。デフォルトで三ヶ月です。

## Check

取得できるデータは以下のメソッドのとおりです。

* `Check#getId`: Idを返します

* `Check#getAmount`: 送金マネー、ポイント額を足した値を返します

* `Check#getPointAmount`: 送金ポイント額を返します

* `Check#getMoneyAmount`: 送金マネー額を返します

* `Check#getDescription`: 説明文を返します

* `Check#getUser`: 送金元ユーザーのオブジェクトを返します

* `Check#getPrivateMoney`: マネーのオブジェクトを返します

* `Check#isOnetime`: 一度しか読み取りができないかを返します

* `Check#isDisabled`: 無効化されているかを返します

* `Check#getUsageLimit`: 利用回数制限を返します

* `Check#getUsageCount`: 利用回数を返します

* `Check#getExpiresAt`: 有効期限を返します

* `Check#getToken`: QRコード用の文字列を返します

## リクエストの送信

* `PartnerAPI#send(request)`: リクエストを送信します。返り値はリクエストに応じた型にキャストする必要があります。
