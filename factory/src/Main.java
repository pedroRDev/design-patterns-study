import Enums.AnimalSpecies;

public class Main {
    public static void main(String[] args) {
        AnimalFactory.createAnimal(AnimalSpecies.DOG).makeSound();
    }
}