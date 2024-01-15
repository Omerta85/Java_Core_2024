package lesson4.HW4.task4;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("Myroslav", 38);
        Person person2 = new Person("Mariya", 35);

        Pet pet1 = new Pet("Miky", "Cat");
        Pet pet2 = new Pet("Cem", "Dog");
        Pet pet3 = new Pet("Persyk", "Parrot");

        zooClub.addMember(person1);
        zooClub.addMember(person2);

        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person1, pet2);
        zooClub.addPetToMember(person2, pet3);

        zooClub.displayClub();

        zooClub.removePetFromMember(person1, pet1);
        zooClub.removeMember(person2);
        zooClub.removePetFromAllMembers(pet3);

        zooClub.displayClub();
    }
}
