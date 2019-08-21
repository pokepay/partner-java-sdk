package jp.pokepay.partnerapi.request;

import jp.pokepay.partnerapi.response.Check;
import jp.pokepay.partnerapi.response.PaginatedChecks;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GetChecks extends Request {

    private Integer page;
    private Integer perPage;
    private String checkId;
    private String createdFrom;
    private String createdTo;
    private String expiresFrom;
    private String expiresTo;
    private String issuerName;
    private Boolean isOnetime;
    private Boolean isDisabled;

    public GetChecks setPage(int page) {
        this.page = page;
        return this;
    }

    public GetChecks setPerPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    public GetChecks setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    public GetChecks setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }

    public GetChecks setCreatedTo(String createdTo) {
        this.createdTo = createdTo;
        return this;
    }

    public GetChecks setExpiresFrom(String expiresFrom) {
        this.expiresFrom = expiresFrom;
        return this;
    }

    public GetChecks setExpiresTo(String expiresTo) {
        this.expiresTo = expiresTo;
        return this;
    }

    public GetChecks setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public GetChecks setOnetime(boolean onetime) {
        isOnetime = onetime;
        return this;
    }

    public GetChecks setDisabled(boolean disabled) {
        isDisabled = disabled;
        return this;
    }

    @Override
    public Method method() {
        return Method.GET;
    }

    @Override
    public String path() {
        return "/checks";
    }

    @Override
    public Map<String, Object> parameters() {
        return new HashMap<String, Object>() {{
            if (page != null) {
                put("page", page);
            }
            if (perPage != null) {
                put("per_page", perPage);
            }
            if (checkId != null) {
                put("check_id", checkId);
            }
            if (createdFrom != null) {
                put("created_from", createdFrom);
            }
            if (createdTo != null) {
                put("created_to", createdTo);
            }
            if (expiresFrom != null) {
                put("expires_from", expiresFrom);
            }
            if (expiresTo != null) {
                put("expires_to", expiresTo);
            }
            if (issuerName != null) {
                put("issuer_name", issuerName);
            }
            if (isOnetime != null) {
                put("is_onetime", isOnetime);
            }
            if (isDisabled != null) {
                put("is_disabled", isDisabled);
            }
        }};
    }

    @Override
    public Type getResponseClass() {
        return PaginatedChecks.class;
    }
}
