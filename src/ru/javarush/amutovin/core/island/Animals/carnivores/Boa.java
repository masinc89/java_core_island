package ru.javarush.amutovin.core.island.Animals.carnivores;

import ru.javarush.amutovin.core.island.Animals.Animal;
import ru.javarush.amutovin.core.island.interfaces.Carnivore;

import java.util.Random;

public class Boa extends Animal implements Carnivore {
    public Boa(){
        setTypeAnimal("Boa");
        this.weight = 15;
        this.maxDistance = 1;
        this.fullEat = 3;
        Random random = new Random();
        this.currentEat = random.nextDouble(fullEat);
    }

    @Override
    public Animal clone() {
        return new Boa();
    }
}
