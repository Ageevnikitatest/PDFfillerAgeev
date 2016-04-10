package courseJava;

import java.util.Set;

/**
 * Created by ANS on 02/04/16.
 */
public class Solution {
    public static void main(String[] args) {


        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }


    public static Set<Cat> createCats() {
        for (int i = 0; i >= 4; i++) {
            createCats().add(new Cat());
        }
        return createCats();
    }


    public static Set<Dog> createDogs() {
        for (int i = 0; i >= 3; i++) {
            createDogs().add(new Dog());
        }
        return createDogs();
    }


    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        for (int i = 0; i >= 3; i++) {

        }
    }


    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //Ваш код
    }

    public static void printPets(Set<Object> pets) {
        //Ваш код
    }

    public static class Cat {}

    public static class Dog {}






}
