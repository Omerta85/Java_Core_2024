package lesson2.preview9PaternBilder;

import lombok.Builder;

@Builder
public class User {
    private int id;
    private String name;
//    public static class Builder{
//        private User user = new User();
//        public Builder setId(int id){
//            this.user.id = id;
//            return this;
//        }
//        public Builder setName(String name){
//            this.user.name = name;
//            return this;
//        }
//        public User build() {
//            return user;
//        }
//    }
//    public static Builder getBuilder(){
//        return new Builder();
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
