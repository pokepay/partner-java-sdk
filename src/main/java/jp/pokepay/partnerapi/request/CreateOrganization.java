// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.request;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import jp.pokepay.partnerapi.response.*;
import java.lang.reflect.Type;

public class CreateOrganization extends Request {
    private String code;
    private String name;
    private String[] privateMoneyIds;
    private String issuerAdminUserEmail;
    private String memberAdminUserEmail;
    private String bankName;
    private String bankCode;
    private String bankBranchName;
    private String bankBranchCode;
    private String bankAccountType;
    private String bankAccount;
    private String bankAccountHolderName;
    private String contactName;

    public CreateOrganization(String code, String name, String[] privateMoneyIds, String issuerAdminUserEmail, String memberAdminUserEmail) {
        this.code = code;
        this.name = name;
        this.privateMoneyIds = privateMoneyIds;
        this.issuerAdminUserEmail = issuerAdminUserEmail;
        this.memberAdminUserEmail = memberAdminUserEmail;
    }

    public CreateOrganization bankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public CreateOrganization bankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    public CreateOrganization bankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }

    public CreateOrganization bankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
        return this;
    }

    public CreateOrganization bankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
        return this;
    }

    public CreateOrganization bankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    public CreateOrganization bankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
        return this;
    }

    public CreateOrganization contactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    @Override
    public Method method() {
        return Method.POST;
    }

    @Override
    public String path() {
        return "/organizations";
    }

    @Override
    public Type getResponseClass() {
        return Organization.class;
    }

    @Override
    public JsonObject getRequestBodyJsonObject(JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add("code", context.serialize(this.code));
        object.add("name", context.serialize(this.name));
        object.add("private_money_ids", context.serialize(this.privateMoneyIds));
        object.add("issuer_admin_user_email", context.serialize(this.issuerAdminUserEmail));
        object.add("member_admin_user_email", context.serialize(this.memberAdminUserEmail));
        object.add("bank_name", context.serialize(this.bankName));
        object.add("bank_code", context.serialize(this.bankCode));
        object.add("bank_branch_name", context.serialize(this.bankBranchName));
        object.add("bank_branch_code", context.serialize(this.bankBranchCode));
        object.add("bank_account_type", context.serialize(this.bankAccountType));
        object.add("bank_account", context.serialize(this.bankAccount));
        object.add("bank_account_holder_name", context.serialize(this.bankAccountHolderName));
        object.add("contact_name", context.serialize(this.contactName));
        return object;
    }
}
