package lesson1.preview7;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
        @NonNull
        private int id;
        @NonNull
        private String name;
        private String skills[] = new String[100];


        public void addSkill(int i, String skill) {
                if (i >= 0 && i < skills.length) {
                        skills[i] = skill;
                }
        }
}
