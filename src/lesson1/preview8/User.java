package lesson1.preview8;

import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private ArrayList<String> skills = new ArrayList<>();
}
