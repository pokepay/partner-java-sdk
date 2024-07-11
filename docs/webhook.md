# Webhook
Webhookは特定のワーカータスクでの処理が完了した事を通知します。
WebHookにはURLとタスク名、有効化されているかを設定することが出来ます。
通知はタスク完了時、事前に設定したURLにPOSTリクエストを行います。


<a name="list-webhooks"></a>
## ListWebhooks: 作成したWebhookの一覧を返す

```JAVA
Request request = new ListWebhooks()
        .page(1)                                  // ページ番号
        .perPage(50);                             // 1ページ分の取得数

```



### Parameters
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
[PaginatedOrganizationWorkerTaskWebhook](./responses.md#paginated-organization-worker-task-webhook)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|



---


<a name="create-webhook"></a>
## CreateWebhook: webhookの作成
ワーカータスクの処理が終了したことを通知するためのWebhookを登録します
このAPIにより指定したタスクの終了時に、指定したURLにPOSTリクエストを送信します。
このとき、リクエストボディは `{"task": <タスク名>}` という値になります。

```JAVA
Request request = new CreateWebhook(
    "bulk_shops",                                 // task: タスク名
    "OR"                                          // url: URL
);

```



### Parameters
**`task`** 
  

ワーカータスク名を指定します

```json
{
  "type": "string",
  "enum": [
    "bulk_shops",
    "process_user_stats_operation"
  ]
}
```

**`url`** 
  

通知先のURLを指定します

```json
{
  "type": "string"
}
```



成功したときは
[OrganizationWorkerTaskWebhook](./responses.md#organization-worker-task-webhook)
を返します

### Error Responses
|status|type|ja|en|
|---|---|---|---|
|403|unpermitted_admin_user|この管理ユーザには権限がありません|Admin does not have permission|
|409|organization_worker_task_finish_webhook_conflict|そのwebhookは既に登録されています|The webhook is already registered|



---


<a name="delete-webhook"></a>
## DeleteWebhook: Webhookの削除
指定したWebhookを削除します

```JAVA
Request request = new DeleteWebhook(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // webhookId: Webhook ID
);

```



### Parameters
**`webhookId`** 
  

削除するWebhookのIDです。

```json
{
  "type": "string",
  "format": "uuid"
}
```



成功したときは
[OrganizationWorkerTaskWebhook](./responses.md#organization-worker-task-webhook)
を返します



---


<a name="update-webhook"></a>
## UpdateWebhook: Webhookの更新
指定したWebhookの内容を更新します

```JAVA
Request request = new UpdateWebhook(
    "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"        // webhookId: Webhook ID
)
        .url("Z")                                 // URL
        .setActive(true)                          // 有効/無効
        .task("bulk_shops");                      // タスク名

```



### Parameters
**`webhookId`** 
  

更新するWebhookのIDです。

```json
{
  "type": "string",
  "format": "uuid"
}
```

**`url`** 
  

変更するURLを指定します

```json
{
  "type": "string"
}
```

**`setActive`** 
  

trueならWebhookによる通知が有効になり、falseなら無効になります

```json
{
  "type": "boolean"
}
```

**`task`** 
  

指定したタスクが終了したときにWebhookによる通知がされます

```json
{
  "type": "string",
  "enum": [
    "bulk_shops",
    "process_user_stats_operation"
  ]
}
```



成功したときは
[OrganizationWorkerTaskWebhook](./responses.md#organization-worker-task-webhook)
を返します



---



