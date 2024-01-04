package lesson1.homework1;

import java.util.List;
import java.util.ArrayList;

public class PostDemo {
    public static void main(String[] args) {
        // Створюємо 5 об'єктів класу Post з довільними даними
        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
        Post post4 = new Post(1, 4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit");
        Post post5 = new Post(1, 5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque");

       // Створюємо список для зберігання об'єктів класу Post
        List<Post> posts = new ArrayList<>();

        // Додаємо об'єкти до списку
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

    // Проходимо по списку за допомогою циклу for-each і виводимо об'єкти у консоль
        for (Post post : posts) {
            System.out.println(post);
        }

    }
}
