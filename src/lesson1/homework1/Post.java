package lesson1.homework1;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(){}
    // Конструктор класу, який приймає значення для полів
    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    // Гетери та сетери
    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // Метод класу, який повертає рядкове представлення об'єкта
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }


}
