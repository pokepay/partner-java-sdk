// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.tdsl;

import jp.pokepay.partnerapi.PartnerAPITest;
import jp.pokepay.partnerapi.response.*;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateOrganizationTest {
    @Test
    void testCreateOrganization() throws Exception {
        String code = "test-org" + PartnerAPITest.randomString(6);
        String name = "テスト組織" + PartnerAPITest.randomString(4);
        String[] privateMoneyIds = new String[]{
            "4b138a4c-8944-4f98-a5c4-96d3c1c415eb"
        };
        String issuerAdminUserEmail = PartnerAPITest.randomString(6) + "@pokepay-tests.jp";
        String memberAdminUserEmail = PartnerAPITest.randomString(6) + "@pokepay-tests.jp";
        Organization response = (Organization)PartnerAPITest.getClient().send(new jp.pokepay.partnerapi.request.CreateOrganization(
            code,
            name,
            privateMoneyIds,
            issuerAdminUserEmail,
            memberAdminUserEmail
        ));
        assertEquals(code, response.getCode());
        assertEquals(name, response.getName());
    }
    @Test
    void testCreateOrganizationWithMetadata() throws Exception {
        String code = "test-org" + PartnerAPITest.randomString(6);
        String name = "テスト組織" + PartnerAPITest.randomString(4);
        String[] privateMoneyIds = new String[]{
            "4b138a4c-8944-4f98-a5c4-96d3c1c415eb"
        };
        String issuerAdminUserEmail = PartnerAPITest.randomString(6) + "@pokepay-tests.jp";
        String memberAdminUserEmail = PartnerAPITest.randomString(6) + "@pokepay-tests.jp";
        String bankCode = "1234";
        String bankName = PartnerAPITest.randomString(4) + "銀行";
        String bankBranchCode = "123";
        String bankBranchName = PartnerAPITest.randomString(4) + "支店";
        String bankAccountType = "saving";
        String bankAccount = "1234567";
        String bankAccountHolderName = "ﾌｸｻﾞﾜﾕｷﾁ";
        String contactName = "佐藤清";
        Organization response = (Organization)PartnerAPITest.getClient().send(new jp.pokepay.partnerapi.request.CreateOrganization(
            code,
            name,
            privateMoneyIds,
            issuerAdminUserEmail,
            memberAdminUserEmail
        )
            .bankCode(bankCode)
            .bankName(bankName)
            .bankBranchCode(bankBranchCode)
            .bankBranchName(bankBranchName)
            .bankAccountType(bankAccountType)
            .bankAccount(bankAccount)
            .bankAccountHolderName(bankAccountHolderName)
            .contactName(contactName));
        assertEquals(code, response.getCode());
        assertEquals(name, response.getName());
    }
}
