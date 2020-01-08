package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.*;
import jp.pokepay.partnerapi.parameter.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GetPrivateMoneyOrganizationSummaries extends Request {
    private String from;
    private String to;
    private Integer page;
    private Integer perPage;
    private String privateMoneyId;

    public GetPrivateMoneyOrganizationSummaries(String privateMoneyId) {
        this.privateMoneyId = privateMoneyId;
    }

    public GetPrivateMoneyOrganizationSummaries from(String from) {
        this.from = from;
        return this;
    }

    public GetPrivateMoneyOrganizationSummaries to(String to) {
        this.to = to;
        return this;
    }

    public GetPrivateMoneyOrganizationSummaries page(int page) {
        this.page = page;
        return this;
    }

    public GetPrivateMoneyOrganizationSummaries perPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/private-moneys" + "/" + this.privateMoneyId + "/organization-summaries";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            if (from != null) put("from", from);
            if (to != null) put("to", to);
            if (page != null) put("page", page);
            if (perPage != null) put("per_page", perPage);
        }};
    }

    @Override
    public Type getResponseClass() {
        return PaginatedPrivateMoneyOrganizationSummaries.class;
    }
}
