import Enums.AnimalSpecies;
import Classes.Animal;
import Classes.Cat;
import Classes.Cow;
import Classes.Dog;

public class AnimalFactory {

    public static Animal createAnimal(AnimalSpecies species) {
        switch (species) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case COW:
                return new Cow();
            default:
                new IllegalArgumentException("Invalid species");
        }

        return null;
    }
}
