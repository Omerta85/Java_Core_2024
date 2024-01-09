package lesson2.homework2.Task5Additional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        return String.format("Comment{postId=%d, id=%d, name='%s', email='%s', body='%s'}", postId, id, name, email, body);
    }
}
