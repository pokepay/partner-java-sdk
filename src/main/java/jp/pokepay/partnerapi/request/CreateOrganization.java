package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CreateOrganization extends Request {
    private String code;
    private String name;
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

    public CreateOrganization(String code, String name, String issuerAdminUserEmail, String memberAdminUserEmail) {
        this.code = code;
        this.name = name;
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
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            put("code", code);
            put("name", name);
            put("issuer_admin_user_email", issuerAdminUserEmail);
            put("member_admin_user_email", memberAdminUserEmail);
            if (bankName != null) put("bank_name", bankName);
            if (bankCode != null) put("bank_code", bankCode);
            if (bankBranchName != null) put("bank_branch_name", bankBranchName);
            if (bankBranchCode != null) put("bank_branch_code", bankBranchCode);
            if (bankAccountType != null) put("bank_account_type", bankAccountType);
            if (bankAccount != null) put("bank_account", bankAccount);
            if (bankAccountHolderName != null) put("bank_account_holder_name", bankAccountHolderName);
            if (contactName != null) put("contact_name", contactName);
        }};
    }

    @Override
    public Type getResponseClass() {
        return Organization.class;
    }
}