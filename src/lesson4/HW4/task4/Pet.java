package lesson4.HW4.task4;

import java.util.*;
public class Pet {
        private String name;
        private String type;

        public Pet(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pet pet = (Pet) o;
            return Objects.equals(name, pet.name) && Objects.equals(type, pet.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type);
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

}
