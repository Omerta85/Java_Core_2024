package lesson2.preview2Enum;

public class Helper {
    public String extraToken(User user){
        Role role = user.getRole();
        return role.getToken();
    }
}
