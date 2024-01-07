package lesson2.Preview3Heredity;

public class SuperUser extends User{
    private String role;

    public SuperUser(){};


    public SuperUser(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void greeting() {
        System.out.println("Hi!!!!!!!!");
    }
  public void foo(){}
}
