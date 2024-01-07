package lesson2.preview1CompozitionAggregtion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private Passport passport;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String series, String number) {
        this.id = id;
        this.name = name;
        this.passport = new Passport(series, number);
    }
}
