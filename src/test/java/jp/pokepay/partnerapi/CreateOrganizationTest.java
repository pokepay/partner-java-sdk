// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateOrganization;
import jp.pokepay.partnerapi.request.Request;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateOrganizationTest {
    @Test
    void test0() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        );
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test1() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .contactName("u4lw8ZxL5ooBCUmbexHlOYPdRDRXfcFEKebPAHiatKRmL7K8IMJIBW1vB1RC8WQ75Zq2C");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test2() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankAccountHolderName("5")
                .contactName("Eph5LyiHrKKZHYeA6KMsRSBkbfNhFwjSSUkqouGV2ULftf3KLiOm0u6OdTYvY1WMa6BMdHbor9Bi8VjYjeAF8N8XvRYyNjj6LzPNoFY0NPc7gW3tdaerbfAUj6MGuDCQRgbbh69IfOOqdFvcv");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test3() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankAccount("7823")
                .bankAccountHolderName("ﾔ")
                .contactName("JtDSCuxpXIBKjX0wbEINtuhWyJmxhctiEpL1KlL20SY28CEIpXvCz2lX0WFgkUTJYHHOr63hjnglJCcSZdRjCOwyap0lsb8d4Dc5yMU1TN0yX6wxY6IPoPyEr8klncfGkEwHBWOqOmjPQjCJIqduyEzfF4ihEMnqIdNLL8T5msTmgqj81RX");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test4() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankAccountType("other")
                .bankAccount("036")
                .bankAccountHolderName("ｦ")
                .contactName("rpQfm9Le0rSPWlrPa8fbLwdjVaS9JydpHqXjqW7D3uCGCdE3Z7gIcLSudPl4JIrQmLFWJxcGB9NLriuIsMTYyCUoOEa9YZaUNPTMagDSPeHLGCGYvgqbqCIdoPTyGfjAlvbOwBRftL3mTfJhTjDs9c8QNUGvnht1UycVdhwjqe7Rve16qe5BUa3mrtCxkktMbdZ0Ff5nebRZC0vDYNEW");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test5() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankBranchCode("698")
                .bankAccountType("current")
                .bankAccount("52949")
                .bankAccountHolderName("ｦ")
                .contactName("dsEswklf9tWgAr9KxjsUzeefEvU98BI4BdtnYVFOF5IXA6lNw66Yqs62ry4EX0H5SsjBGi2vt3IVLujfoeXIyA6Ao821XE55hc29pv4sZBooZY5wA4Og2kdAYLVTxSOsaSsUmdY0CLcfoUMFS");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test6() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankBranchName("dEJMG98zC6")
                .bankBranchCode("")
                .bankAccountType("saving")
                .bankAccount("270")
                .bankAccountHolderName("ｦ")
                .contactName("rPkZnNjPWO55U7DSfY3LgW5M2IvR52CgIBy3eLTys12HHDFFeqLoUtYmfM0XLYceQxhubY3jVYhbh4RW4SjcPHu2gIp7HlCgxYlFZzBuHZ8tjsh68ScZg3aAMErP");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test7() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankCode("3619")
                .bankBranchName("o0TcGJkIJgRMahTjY4B83KCbssdnciBK2yKUyBp")
                .bankBranchCode("")
                .bankAccountType("other")
                .bankAccount("7368")
                .bankAccountHolderName("8")
                .contactName("oCqWWrzikH0DrThI9ndCARX9iZhUIwUrsQ8Uijo55dyiBxXbKWYhqIQcADAJhW");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
    @Test
    void test8() throws ConnectionError, ProcessingError {
        Request request = new CreateOrganization(
            "y",
            "Fq3Dy2RXyPUAe3PgOIxNaz33MDlMm45c417ClVPZadCz21oTLg0Zh082rSUmgTJgltXUvopMAE6nKVgCC79b4Ei190OQ71CLczodkHUHlo8UiDVjyL8K2mxNxSNDBAB21jRDnDfUt4YgIyZaT",
            new String[]{"1bd44ff3-b995-4369-9492-244845c9e14f"},
            "mcCShoExxX@Dzwm.com",
            "u0NmtxroKV@Uk7s.com"
        )
                .bankName("wASll2h")
                .bankCode("")
                .bankBranchName("GkEzja1NmQHCUATGGz590dtBhucZ4e0BzAWy80f2MmxJUnd92RrjDmsbpR1t9xm")
                .bankBranchCode("595")
                .bankAccountType("current")
                .bankAccount("")
                .bankAccountHolderName("7")
                .contactName("vNpULEoTr6H5p2Y5YBaOZdS1seolNILNbVpFGvZ3N4x3uvaLnbw12Ii4C82SzJJG4lODNS2Ij7U5b72UTWb");
        try {
            PartnerAPITest.getClient().send(request);
        } catch (PartnerRequestError e) {
            if (e.getType().equals("invalid_parameters")) {
                System.out.println(e.getType());
                System.out.println(e.getMessage());
                System.out.println(e.getRawJson());
            }
            assertNotEquals("invalid_parameters", e.getType());
        }
    }
}
