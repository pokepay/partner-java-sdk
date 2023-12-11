// DO NOT EDIT: File is generated by code generator.
package jp.pokepay.partnerapi.response;

public class Coupon extends Response {
    private String id;
    private String name;
    private User issuedShop;
    private String description;
    private Integer discountAmount;
    private Double discountPercentage;
    private Integer discountUpperLimit;
    private String startsAt;
    private String endsAt;
    private String displayStartsAt;
    private String displayEndsAt;
    private Integer usageLimit;
    private Integer minAmount;
    private Boolean isShopSpecified;
    private Boolean isHidden;
    private Boolean isPublic;
    private String code;
    private Boolean isDisabled;
    private String token;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getIssuedShop() {
        return issuedShop;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public Integer getDiscountUpperLimit() {
        return discountUpperLimit;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public String getDisplayStartsAt() {
        return displayStartsAt;
    }

    public String getDisplayEndsAt() {
        return displayEndsAt;
    }

    public Integer getUsageLimit() {
        return usageLimit;
    }

    public Integer getMinAmount() {
        return minAmount;
    }

    public Boolean isShopSpecified() {
        return isShopSpecified;
    }

    public Boolean isHidden() {
        return isHidden;
    }

    public Boolean isPublic() {
        return isPublic;
    }

    public String getCode() {
        return code;
    }

    public Boolean isDisabled() {
        return isDisabled;
    }

    public String getToken() {
        return token;
    }
}

