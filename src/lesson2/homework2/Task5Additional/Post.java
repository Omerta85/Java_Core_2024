package lesson2.homework2.Task5Additional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments;
    private String commentSummary;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<>();
        this.commentSummary = "Немає коментарів";
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
        updateCommentSummary();
    }
    // Метод, який оновлює поле, яке характеризує список коментарів
    public void updateCommentSummary() {
        // Якщо список коментарів порожній, то встановлюємо значення поля "Немає коментарів"
        if (this.comments.isEmpty()) {
            this.commentSummary = "Немає коментарів";
        } else {
            // Інакше, визначаємо кількість коментарів, середню довжину коментарів та найпоширеніше ім'я автора коментарів
            int commentCount = this.comments.size(); // Кількість коментарів
            int totalLength = 0; // Загальна довжина коментарів
            Map<String, Integer> nameFrequency = new HashMap<>(); // Словник, який зберігає частоту кожного імені
            String mostCommonName = ""; // Найпоширеніше ім'я
            int maxFrequency = 0; // Максимальна частота

            // Проходимо по всіх коментарях
            for (Comment comment : this.comments) {
                // Додаємо довжину коментаря до загальної довжини
                totalLength += comment.getBody().length();
                // Отримуємо ім'я автора коментаря
                String name = comment.getName();
                // Якщо словник містить це ім'я, то збільшуємо його частоту на одиницю
                if (nameFrequency.containsKey(name)) {
                    nameFrequency.put(name, nameFrequency.get(name) + 1);
                } else {
                    // Інакше, додаємо це ім'я до словника з частотою один
                    nameFrequency.put(name, 1);
                }
                // Якщо частота цього імені більша за максимальну, то оновлюємо найпоширеніше ім'я та максимальну частоту
                if (nameFrequency.get(name) > maxFrequency) {
                    mostCommonName = name;
                    maxFrequency = nameFrequency.get(name);
                }
            }

            // Обчислюємо середню довжину коментарів
            double averageLength = (double) totalLength / commentCount;

            // Форматуємо значення поля, яке характеризує список коментарів
            this.commentSummary = String.format("Кількість коментарів: %d, Середня довжина коментарів: %.2f, Найпоширеніше ім'я: %s", commentCount, averageLength, mostCommonName);
        }
    }


    public String toString() {
        return String.format("Post{userId=%d, id=%d, title='%s', body='%s', comments=%s, commentSummary='%s'}", userId, id, title, body, comments, commentSummary);
    }

}
