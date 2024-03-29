# Responses
<a name="admin-user-with-shops-and-private-moneys"></a>
## AdminUserWithShopsAndPrivateMoneys
* `getId() String`: 
* `getRole() String`: 
* `getEmail() String`: 
* `getName() String`: 
* `isActive() boolean`: 
* `getOrganization() Organization`: 
* `getShops() User[]`: 
* `getPrivateMoneys() PrivateMoney[]`: 

`getOrganization`は [Organization](#organization) クラスのインスタンスを返します。

`getShops`は [User](#user) クラスのインスタンスの配列を返します。

`getPrivateMoneys`は [PrivateMoney](#private-money) クラスのインスタンスの配列を返します。

<a name="account-with-user"></a>
## AccountWithUser
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="account-detail"></a>
## AccountDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getBalance() double`: 
* `getMoneyBalance() double`: 
* `getPointBalance() double`: 
* `getPointDebt() double`: 
* `getPrivateMoney() PrivateMoney`: 
* `getUser() User`: 
* `getExternalId() String`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="account-deleted"></a>
## AccountDeleted

<a name="bill"></a>
## Bill
* `getId() String`: 支払いQRコードのID
* `getAmount() double`: 支払い額
* `getMaxAmount() double`: 支払い額を範囲指定した場合の上限
* `getMinAmount() double`: 支払い額を範囲指定した場合の下限
* `getDescription() String`: 支払いQRコードの説明文(アプリ上で取引の説明文として表示される)
* `getAccount() AccountWithUser`: 支払いQRコード発行ウォレット
* `isDisabled() boolean`: 無効化されているかどうか
* `getToken() String`: 支払いQRコードを解析したときに出てくるURL

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="check"></a>
## Check
* `getId() String`: チャージQRコードのID
* `getCreatedAt() String`: チャージQRコードの作成日時
* `getAmount() double`: チャージマネー額 (deprecated)
* `getMoneyAmount() double`: チャージマネー額
* `getPointAmount() double`: チャージポイント額
* `getDescription() String`: チャージQRコードの説明文(アプリ上で取引の説明文として表示される)
* `getUser() User`: 送金元ユーザ情報
* `isOnetime() boolean`: 使用回数が一回限りかどうか
* `isDisabled() boolean`: 無効化されているかどうか
* `getExpiresAt() String`: チャージQRコード自体の失効日時
* `getLastUsedAt() String`: 
* `getPrivateMoney() PrivateMoney`: 対象マネー情報
* `getUsageLimit() int`: 一回限りでない場合の最大読み取り回数
* `getUsageCount() double`: 一回限りでない場合の現在までに読み取られた回数
* `getPointExpiresAt() String`: ポイント有効期限(絶対日数指定)
* `getPointExpiresInDays() int`: ポイント有効期限(相対日数指定)
* `getToken() String`: チャージQRコードを解析したときに出てくるURL

`getUser`は [User](#user) クラスのインスタンスを返します。

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="paginated-checks"></a>
## PaginatedChecks
* `getRows() Check[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Check](#check) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="cpm-token"></a>
## CpmToken
* `getCpmToken() String`: 
* `getAccount() AccountDetail`: 
* `getTransaction() Transaction`: 
* `getEvent() ExternalTransaction`: 
* `getScopes() String[]`: 許可された取引種別
* `getExpiresAt() String`: CPMトークンの失効日時
* `getMetadata() String`: エンドユーザー側メタデータ

`getAccount`は [AccountDetail](#account-detail) クラスのインスタンスを返します。

`getTransaction`は [Transaction](#transaction) クラスのインスタンスを返します。

`getEvent`は [ExternalTransaction](#external-transaction) クラスのインスタンスを返します。

<a name="cashtray"></a>
## Cashtray
* `getId() String`: Cashtray自体のIDです。
* `getAmount() double`: 取引金額
* `getDescription() String`: Cashtrayの説明文
* `getAccount() AccountWithUser`: 発行店舗のウォレット
* `getExpiresAt() String`: Cashtrayの失効日時
* `getCanceledAt() String`: Cashtrayの無効化日時。NULLの場合は無効化されていません
* `getToken() String`: CashtrayのQRコードを解析したときに出てくるURL

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="cashtray-with-result"></a>
## CashtrayWithResult
* `getId() String`: CashtrayのID
* `getAmount() double`: 取引金額
* `getDescription() String`: Cashtrayの説明文(アプリ上で取引の説明文として表示される)
* `getAccount() AccountWithUser`: 発行店舗のウォレット
* `getExpiresAt() String`: Cashtrayの失効日時
* `getCanceledAt() String`: Cashtrayの無効化日時。NULLの場合は無効化されていません
* `getToken() String`: CashtrayのQRコードを解析したときに出てくるURL
* `getAttempt() CashtrayAttempt`: Cashtray読み取り結果
* `getTransaction() Transaction`: 取引結果

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

`getAttempt`は [CashtrayAttempt](#cashtray-attempt) クラスのインスタンスを返します。

`getTransaction`は [Transaction](#transaction) クラスのインスタンスを返します。

<a name="user"></a>
## User
* `getId() String`: ユーザー (または店舗) ID
* `getName() String`: ユーザー (または店舗) 名
* `isMerchant() boolean`: 店舗ユーザーかどうか

<a name="organization"></a>
## Organization
* `getCode() String`: 組織コード
* `getName() String`: 組織名

<a name="transaction-detail"></a>
## TransactionDetail
* `getId() String`: 取引ID
* `getType() String`: 取引種別
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 取引総額 (マネー額 + ポイント額)
* `getMoneyAmount() double`: 取引マネー額
* `getPointAmount() double`: 取引ポイント額(キャンペーン付与ポイント合算)
* `getRawPointAmount() double`: 取引ポイント額
* `getCampaignPointAmount() double`: キャンペーンによるポイント付与額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文
* `getTransfers() Transfer[]`: 

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

`getTransfers`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

<a name="shop-with-accounts"></a>
## ShopWithAccounts
* `getId() String`: 店舗ID
* `getName() String`: 店舗名
* `getOrganizationCode() String`: 組織コード
* `getStatus() String`: 店舗の状態
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID
* `getAccounts() ShopAccount[]`: 

`getAccounts`は [ShopAccount](#shop-account) クラスのインスタンスの配列を返します。

<a name="bulk-transaction"></a>
## BulkTransaction
* `getId() String`: 
* `getRequestId() String`: リクエストID
* `getName() String`: バルク取引管理用の名前
* `getDescription() String`: バルク取引管理用の説明文
* `getStatus() String`: バルク取引の状態
* `getError() String`: バルク取引のエラー種別
* `getErrorLineno() int`: バルク取引のエラーが発生した行番号
* `getSubmittedAt() String`: バルク取引が登録された日時
* `getUpdatedAt() String`: バルク取引が更新された日時

<a name="paginated-bulk-transaction-job"></a>
## PaginatedBulkTransactionJob
* `getRows() BulkTransactionJob[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [BulkTransactionJob](#bulk-transaction-job) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="external-transaction-detail"></a>
## ExternalTransactionDetail
* `getId() String`: ポケペイ外部取引ID
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 決済額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文
* `getTransaction() TransactionDetail`: 関連ポケペイ取引詳細

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

`getTransaction`は [TransactionDetail](#transaction-detail) クラスのインスタンスを返します。

<a name="paginated-private-money-organization-summaries"></a>
## PaginatedPrivateMoneyOrganizationSummaries
* `getRows() PrivateMoneyOrganizationSummary[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoneyOrganizationSummary](#private-money-organization-summary) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="private-money-summary"></a>
## PrivateMoneySummary
* `getTopupAmount() double`: 
* `getRefundedTopupAmount() double`: 
* `getPaymentAmount() double`: 
* `getRefundedPaymentAmount() double`: 
* `getAddedPointAmount() double`: 
* `getTopupPointAmount() double`: 
* `getCampaignPointAmount() double`: 
* `getRefundedAddedPointAmount() double`: 
* `getExchangeInflowAmount() double`: 
* `getExchangeOutflowAmount() double`: 
* `getTransactionCount() int`: 

<a name="user-stats-operation"></a>
## UserStatsOperation
* `getId() String`: 集計処理ID
* `getFrom() String`: 集計期間の開始時刻
* `getTo() String`: 集計期間の終了時刻
* `getStatus() String`: 集計処理の実行ステータス
* `getErrorReason() String`: エラーとなった理由
* `getDoneAt() String`: 集計処理の完了時刻
* `getFileUrl() String`: 集計結果のCSVのダウンロードURL
* `getRequestedAt() String`: 集計リクエストを行った時刻

<a name="user-device"></a>
## UserDevice
* `getId() String`: デバイスID
* `getUser() User`: デバイスを使用するユーザ
* `isActive() boolean`: デバイスが有効か
* `getMetadata() String`: デバイスのメタデータ

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="bank-registering-info"></a>
## BankRegisteringInfo
* `getRedirectUrl() String`: 
* `getPaytreeCustomerNumber() String`: 

<a name="banks"></a>
## Banks
* `getRows() Bank[]`: 
* `getCount() int`: 

`getRows`は [Bank](#bank) クラスのインスタンスの配列を返します。

<a name="paginated-transaction"></a>
## PaginatedTransaction
* `getRows() Transaction[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transaction-v2"></a>
## PaginatedTransactionV2
* `getRows() Transaction[]`: 
* `getPerPage() int`: 
* `getCount() int`: 
* `getNextPageCursorId() String`: 
* `getPrevPageCursorId() String`: 

`getRows`は [Transaction](#transaction) クラスのインスタンスの配列を返します。

<a name="paginated-transfers"></a>
## PaginatedTransfers
* `getRows() Transfer[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-transfers-v2"></a>
## PaginatedTransfersV2
* `getRows() Transfer[]`: 
* `getPerPage() int`: 
* `getCount() int`: 
* `getNextPageCursorId() String`: 
* `getPrevPageCursorId() String`: 

`getRows`は [Transfer](#transfer) クラスのインスタンスの配列を返します。

<a name="paginated-account-with-users"></a>
## PaginatedAccountWithUsers
* `getRows() AccountWithUser[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountWithUser](#account-with-user) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-account-details"></a>
## PaginatedAccountDetails
* `getRows() AccountDetail[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountDetail](#account-detail) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-account-balance"></a>
## PaginatedAccountBalance
* `getRows() AccountBalance[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [AccountBalance](#account-balance) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-shops"></a>
## PaginatedShops
* `getRows() ShopWithMetadata[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [ShopWithMetadata](#shop-with-metadata) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-bills"></a>
## PaginatedBills
* `getRows() Bill[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Bill](#bill) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-private-moneys"></a>
## PaginatedPrivateMoneys
* `getRows() PrivateMoney[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [PrivateMoney](#private-money) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="campaign"></a>
## Campaign
* `getId() String`: キャンペーンID
* `getName() String`: キャペーン名
* `getApplicableShops() User[]`: キャンペーン適用対象の店舗リスト
* `isExclusive() boolean`: キャンペーンの重複を許すかどうかのフラグ
* `getStartsAt() String`: キャンペーン開始日時
* `getEndsAt() String`: キャンペーン終了日時
* `getPointExpiresAt() String`: キャンペーンによって付与されるポイントの失効日時
* `getPointExpiresInDays() int`: キャンペーンによって付与されるポイントの有効期限(相対指定、単位は日)
* `getPriority() int`: キャンペーンの優先順位
* `getDescription() String`: キャンペーン説明文
* `getBearPointShop() User`: ポイントを負担する店舗
* `getPrivateMoney() PrivateMoney`: キャンペーンを適用するマネー
* `getDestPrivateMoney() PrivateMoney`: ポイントを付与するマネー
* `getMaxTotalPointAmount() int`: 一人当たりの累計ポイント上限
* `getPointCalculationRule() String`: ポイント計算ルール (banklisp表記)
* `getPointCalculationRuleObject() String`: ポイント計算ルール (JSON文字列による表記)
* `getStatus() String`: キャンペーンの現在の状態
* `getBudgetCapsAmount() int`: キャンペーンの予算上限額
* `getBudgetCurrentAmount() int`: キャンペーンの付与合計額
* `getBudgetCurrentTime() String`: キャンペーンの付与集計日時

`getApplicableShops`は [User](#user) クラスのインスタンスの配列を返します。

`getBearPointShop`は [User](#user) クラスのインスタンスを返します。

`getDestPrivateMoney`と`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="paginated-campaigns"></a>
## PaginatedCampaigns
* `getRows() Campaign[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Campaign](#campaign) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="account-transfer-summary"></a>
## AccountTransferSummary
* `getSummaries() AccountTransferSummaryElement[]`: 

`getSummaries`は [AccountTransferSummaryElement](#account-transfer-summary-element) クラスのインスタンスの配列を返します。

<a name="organization-worker-task-webhook"></a>
## OrganizationWorkerTaskWebhook
* `getId() String`: 
* `getOrganizationCode() String`: 
* `getTask() String`: 
* `getUrl() String`: 
* `getContentType() String`: 
* `isActive() boolean`: 

<a name="paginated-organization-worker-task-webhook"></a>
## PaginatedOrganizationWorkerTaskWebhook
* `getRows() OrganizationWorkerTaskWebhook[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [OrganizationWorkerTaskWebhook](#organization-worker-task-webhook) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="coupon-detail"></a>
## CouponDetail
* `getId() String`: クーポンID
* `getName() String`: クーポン名
* `getIssuedShop() User`: クーポン発行店舗
* `getDescription() String`: クーポンの説明文
* `getDiscountAmount() int`: クーポンによる値引き額(絶対値指定)
* `getDiscountPercentage() double`: クーポンによる値引き率
* `getDiscountUpperLimit() int`: クーポンによる値引き上限(値引き率が指定された場合の値引き上限額)
* `getStartsAt() String`: クーポンの利用可能期間(開始日時)
* `getEndsAt() String`: クーポンの利用可能期間(終了日時)
* `getDisplayStartsAt() String`: クーポンの掲載期間(開始日時)
* `getDisplayEndsAt() String`: クーポンの掲載期間(終了日時)
* `getUsageLimit() int`: ユーザごとの利用可能回数(NULLの場合は無制限)
* `getMinAmount() int`: クーポン適用可能な最小取引額
* `isShopSpecified() boolean`: 特定店舗限定のクーポンかどうか
* `isHidden() boolean`: クーポン一覧に掲載されるかどうか
* `isPublic() boolean`: アプリ配信なしで受け取れるかどうか
* `getCode() String`: クーポン受け取りコード
* `isDisabled() boolean`: 無効化フラグ
* `getToken() String`: クーポンを特定するためのトークン
* `getCouponImage() String`: クーポン画像のURL
* `getAvailableShops() User[]`: 利用可能店舗リスト
* `getPrivateMoney() PrivateMoney`: クーポンのマネー

`getIssuedShop`は [User](#user) クラスのインスタンスを返します。

`getAvailableShops`は [User](#user) クラスのインスタンスの配列を返します。

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="paginated-coupons"></a>
## PaginatedCoupons
* `getRows() Coupon[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Coupon](#coupon) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="paginated-organizations"></a>
## PaginatedOrganizations
* `getRows() Organization[]`: 
* `getCount() int`: 
* `getPagination() Pagination`: 

`getRows`は [Organization](#organization) クラスのインスタンスの配列を返します。

`getPagination`は [Pagination](#pagination) クラスのインスタンスを返します。

<a name="private-money"></a>
## PrivateMoney
* `getId() String`: マネーID
* `getName() String`: マネー名
* `getUnit() String`: マネー単位 (例: 円)
* `isExclusive() boolean`: 会員制のマネーかどうか
* `getDescription() String`: マネー説明文
* `getOnelineMessage() String`: マネーの要約
* `getOrganization() Organization`: マネーを発行した組織
* `getMaxBalance() double`: ウォレットの上限金額
* `getTransferLimit() double`: マネーの取引上限額
* `getMoneyTopupTransferLimit() double`: マネーチャージ取引上限額
* `getType() String`: マネー種別 (自家型=own, 第三者型=third-party)
* `getExpirationType() String`: 有効期限種別 (チャージ日起算=static, 最終利用日起算=last-update, 最終チャージ日起算=last-topup-update)
* `getEnableTopupByMember() boolean`:  (deprecated)
* `getDisplayMoneyAndPoint() String`: 

`getOrganization`は [Organization](#organization) クラスのインスタンスを返します。

<a name="pagination"></a>
## Pagination
* `getCurrent() int`: 
* `getPerPage() int`: 
* `getMaxPage() int`: 
* `getHasPrev() boolean`: 
* `getHasNext() boolean`: 

<a name="transaction"></a>
## Transaction
* `getId() String`: 取引ID
* `getType() String`: 取引種別
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 取引総額 (マネー額 + ポイント額)
* `getMoneyAmount() double`: 取引マネー額
* `getPointAmount() double`: 取引ポイント額(キャンペーン付与ポイント合算)
* `getRawPointAmount() double`: 取引ポイント額
* `getCampaignPointAmount() double`: キャンペーンによるポイント付与額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

<a name="external-transaction"></a>
## ExternalTransaction
* `getId() String`: ポケペイ外部取引ID
* `isModified() boolean`: 返金された取引かどうか
* `getSender() User`: 送金者情報
* `getSenderAccount() Account`: 送金ウォレット情報
* `getReceiver() User`: 受取者情報
* `getReceiverAccount() Account`: 受取ウォレット情報
* `getAmount() double`: 決済額
* `getDoneAt() String`: 取引日時
* `getDescription() String`: 取引説明文

`getReceiver`と`getSender`は [User](#user) クラスのインスタンスを返します。

`getReceiverAccount`と`getSenderAccount`は [Account](#account) クラスのインスタンスを返します。

<a name="cashtray-attempt"></a>
## CashtrayAttempt
* `getAccount() AccountWithUser`: エンドユーザーのウォレット
* `getStatusCode() double`: ステータスコード
* `getErrorType() String`: エラー型
* `getErrorMessage() String`: エラーメッセージ
* `getCreatedAt() String`: Cashtray読み取り記録の作成日時

`getAccount`は [AccountWithUser](#account-with-user) クラスのインスタンスを返します。

<a name="account"></a>
## Account
* `getId() String`: ウォレットID
* `getName() String`: ウォレット名
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getStatus() String`: 
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="transfer"></a>
## Transfer
* `getId() String`: 
* `getSenderAccount() AccountWithoutPrivateMoneyDetail`: 
* `getReceiverAccount() AccountWithoutPrivateMoneyDetail`: 
* `getAmount() double`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 
* `getDoneAt() String`: 
* `getType() String`: 
* `getDescription() String`: 
* `getTransactionId() String`: 

`getReceiverAccount`と`getSenderAccount`は [AccountWithoutPrivateMoneyDetail](#account-without-private-money-detail) クラスのインスタンスを返します。

<a name="shop-account"></a>
## ShopAccount
* `getId() String`: ウォレットID
* `getName() String`: ウォレット名
* `isSuspended() boolean`: ウォレットが凍結されているかどうか
* `getCanTransferTopup() boolean`: チャージ可能かどうか
* `getPrivateMoney() PrivateMoney`: 設定マネー情報

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="bulk-transaction-job"></a>
## BulkTransactionJob
* `getId() int`: 
* `getBulkTransaction() BulkTransaction`: 
* `getType() String`: 取引種別
* `getSenderAccountId() String`: 
* `getReceiverAccountId() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 
* `getDescription() String`: バルク取引ジョブ管理用の説明文
* `getBearPointAccountId() String`: 
* `getPointExpiresAt() String`: ポイント有効期限
* `getStatus() String`: バルク取引ジョブの状態
* `getError() String`: バルク取引のエラー種別
* `getLineno() int`: バルク取引のエラーが発生した行番号
* `getTransactionId() String`: 
* `getCreatedAt() String`: バルク取引ジョブが登録された日時
* `getUpdatedAt() String`: バルク取引ジョブが更新された日時

`getBulkTransaction`は [BulkTransaction](#bulk-transaction) クラスのインスタンスを返します。

<a name="private-money-organization-summary"></a>
## PrivateMoneyOrganizationSummary
* `getOrganizationCode() String`: 
* `getTopup() OrganizationSummary`: 
* `getPayment() OrganizationSummary`: 

`getPayment`と`getTopup`は [OrganizationSummary](#organization-summary) クラスのインスタンスを返します。

<a name="bank"></a>
## Bank
* `getId() String`: 
* `getPrivateMoney() PrivateMoney`: 
* `getBankName() String`: 
* `getBankCode() String`: 
* `getBranchNumber() String`: 
* `getBranchName() String`: 
* `getDepositType() String`: 
* `getMaskedAccountNumber() String`: 
* `getAccountName() String`: 

`getPrivateMoney`は [PrivateMoney](#private-money) クラスのインスタンスを返します。

<a name="account-balance"></a>
## AccountBalance
* `getExpiresAt() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 

<a name="shop-with-metadata"></a>
## ShopWithMetadata
* `getId() String`: 店舗ID
* `getName() String`: 店舗名
* `getOrganizationCode() String`: 組織コード
* `getStatus() String`: 店舗の状態
* `getPostalCode() String`: 店舗の郵便番号
* `getAddress() String`: 店舗の住所
* `getTel() String`: 店舗の電話番号
* `getEmail() String`: 店舗のメールアドレス
* `getExternalId() String`: 店舗の外部ID

<a name="account-transfer-summary-element"></a>
## AccountTransferSummaryElement
* `getTransferType() String`: 
* `getMoneyAmount() double`: 
* `getPointAmount() double`: 
* `getCount() double`: 

<a name="coupon"></a>
## Coupon
* `getId() String`: クーポンID
* `getName() String`: クーポン名
* `getIssuedShop() User`: クーポン発行店舗
* `getDescription() String`: クーポンの説明文
* `getDiscountAmount() int`: クーポンによる値引き額(絶対値指定)
* `getDiscountPercentage() double`: クーポンによる値引き率
* `getDiscountUpperLimit() int`: クーポンによる値引き上限(値引き率が指定された場合の値引き上限額)
* `getStartsAt() String`: クーポンの利用可能期間(開始日時)
* `getEndsAt() String`: クーポンの利用可能期間(終了日時)
* `getDisplayStartsAt() String`: クーポンの掲載期間(開始日時)
* `getDisplayEndsAt() String`: クーポンの掲載期間(終了日時)
* `getUsageLimit() int`: ユーザごとの利用可能回数(NULLの場合は無制限)
* `getMinAmount() int`: クーポン適用可能な最小取引額
* `isShopSpecified() boolean`: 特定店舗限定のクーポンかどうか
* `isHidden() boolean`: クーポン一覧に掲載されるかどうか
* `isPublic() boolean`: アプリ配信なしで受け取れるかどうか
* `getCode() String`: クーポン受け取りコード
* `isDisabled() boolean`: 無効化フラグ
* `getToken() String`: クーポンを特定するためのトークン

`getIssuedShop`は [User](#user) クラスのインスタンスを返します。

<a name="account-without-private-money-detail"></a>
## AccountWithoutPrivateMoneyDetail
* `getId() String`: 
* `getName() String`: 
* `isSuspended() boolean`: 
* `getStatus() String`: 
* `getPrivateMoneyId() String`: 
* `getUser() User`: 

`getUser`は [User](#user) クラスのインスタンスを返します。

<a name="organization-summary"></a>
## OrganizationSummary
* `getCount() int`: 
* `getMoneyAmount() double`: 
* `getMoneyCount() int`: 
* `getPointAmount() double`: 
* `getRawPointAmount() double`: 
* `getCampaignPointAmount() double`: 
* `getPointCount() int`: 
