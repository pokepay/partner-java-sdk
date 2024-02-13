// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.tdsl;

import jp.pokepay.partnerapi.PartnerAPITest;
import jp.pokepay.partnerapi.request.*;
import jp.pokepay.partnerapi.response.*;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListOrganizations {
    @Test
    void simple() throws Exception {
        PaginatedOrganizations response = (PaginatedOrganizations)PartnerAPITest.getClient().send(new ListOrganizations(
            "4b138a4c-8944-4f98-a5c4-96d3c1c415eb"
        ));
        System.out.println(response);
    }
    @Test
    void paging() throws Exception {
        PaginatedOrganizations response = (PaginatedOrganizations)PartnerAPITest.getClient().send(new ListOrganizations(
            "4b138a4c-8944-4f98-a5c4-96d3c1c415eb"
        )
            .perPage(3));
        assertEquals(3, response.getPagination().getPerPage());
    }
}