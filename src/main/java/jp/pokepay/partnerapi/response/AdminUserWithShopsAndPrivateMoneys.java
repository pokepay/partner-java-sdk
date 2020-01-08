package jp.pokepay.partnerapi.response;

public class AdminUserWithShopsAndPrivateMoneys extends Response {
    private String id;
    private String role;
    private String email;
    private String name;
    private Boolean isActive;
    private Organization organization;
    private User[] shops;
    private PrivateMoney[] privateMoneys;

    public String getId() {
        return id;
    }

    public AdminUserWithShopsAndPrivateMoneys id(String id) {
        this.id = id;
        return this;
    }

    public String getRole() {
        return role;
    }

    public AdminUserWithShopsAndPrivateMoneys role(String role) {
        this.role = role;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AdminUserWithShopsAndPrivateMoneys email(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdminUserWithShopsAndPrivateMoneys name(String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public AdminUserWithShopsAndPrivateMoneys setActive(boolean active) {
        isActive = active;
        return this;
    }

    public Organization getOrganization() {
        return organization;
    }

    public AdminUserWithShopsAndPrivateMoneys organization(Organization organization) {
        this.organization = organization;
        return this;
    }

    public User[] getShops() {
        return shops;
    }

    public AdminUserWithShopsAndPrivateMoneys shops(User[] shops) {
        this.shops = shops;
        return this;
    }

    public PrivateMoney[] getPrivateMoneys() {
        return privateMoneys;
    }

    public AdminUserWithShopsAndPrivateMoneys privateMoneys(PrivateMoney[] privateMoneys) {
        this.privateMoneys = privateMoneys;
        return this;
    }
}

