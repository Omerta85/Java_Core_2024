package lesson2.preview1CompozitionAggregtion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String  login;
    private String password;
    private Passport passport;

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
