package jp.pokepay.partnerapi.parameter;

public class Product extends Parameter {
    private String janCode;
    private String name;
    private Integer unitPrice;
    private Integer price;
    private Boolean isDiscounted;
    private String other;

    public String getJanCode() {
        return janCode;
    }

    public Product janCode(String janCode) {
        this.janCode = janCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public Product unitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product price(int price) {
        this.price = price;
        return this;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public Product setDiscounted(boolean discounted) {
        isDiscounted = discounted;
        return this;
    }

    public String getOther() {
        return other;
    }

    public Product other(String other) {
        this.other = other;
        return this;
    }
}

