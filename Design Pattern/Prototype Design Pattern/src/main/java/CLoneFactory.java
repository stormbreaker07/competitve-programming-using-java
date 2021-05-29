public class CLoneFactory {

    public Animal getAnimalClone(Animal animalType) {
        return animalType.makeClone();
    }
}
