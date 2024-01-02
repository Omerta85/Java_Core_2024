package lesson1.preview2;

public class User {
    int id;
            //byte (-128  127)
            //short (-32000  32000)
            //int( значення на 2 млрд. 300 млн)
            //long ( 10 у 18 степені)
    String name;
    boolean status;
    double weight;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                '}';
    }
}


