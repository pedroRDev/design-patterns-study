import enums.AnimalSpecies;
import classes.Animal;
import classes.Cat;
import classes.Cow;
import classes.Dog;

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
