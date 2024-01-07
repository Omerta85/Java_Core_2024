package lesson2.preview2Enum;

public enum Role {
    ADMIN("foo"), MANAGER("bar"), SUPERVISER;
    private String token;

    Role(){}

    Role(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
