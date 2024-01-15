package lesson4.HW4.task4;

import java.util.*;
public class ZooClub {
    private Map<Person, List<Pet>> club;

    public ZooClub() {
        this.club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        club.computeIfAbsent(person, k -> new ArrayList<>()).add(pet);
    }

    public void removePetFromMember(Person person, Pet pet) {
        club.getOrDefault(person, Collections.emptyList()).remove(pet);
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAllMembers(Pet pet) {
        club.values().forEach(pets -> pets.removeIf(p -> p.equals(pet)));
    }

    public void displayClub() {
        System.out.println("ZooClub members and their pets:");
        club.forEach((person, pets) ->
                System.out.println(person + ": " + pets));
    }
}
