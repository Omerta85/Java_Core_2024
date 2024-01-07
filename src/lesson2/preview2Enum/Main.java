package lesson2.preview2Enum;


public class Main {
    public  static void main(String[] args){
//       // Role role = Role.ADMIN; зі створенням зовнішнього обєкту
//        User user = new User("asd", Role.MANAGER);
//        Helper helper = new Helper();
//        String extractToken = helper.extraToken(user);
//        System.out.println(extractToken);

        Role [] values = Role.values();
//        List<Role> roles = Arrays.asList(values);
//        System.out.println(Arrays.toString(values));
//        System.out.println(Role.valueOf("ADMIN"));
        System.out.println(Role.ADMIN.ordinal());
    }
}
