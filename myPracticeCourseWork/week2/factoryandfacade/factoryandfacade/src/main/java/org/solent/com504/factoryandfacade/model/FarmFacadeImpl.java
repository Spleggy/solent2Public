package org.solent.com504.factoryandfacade.model;

import java.util.List;
import java.util.ArrayList;

public class FarmFacadeImpl implements FarmFacade {


    private List<Animal> animalList = new ArrayList();

    public List<Animal> getAllAnimals() {
        return null;
    }

    public void addDog(String name) {
       animalList.add(AnimalObjectFactory.createDog());

    }

    public void addCat(String name) {

    }

    public void addCow(String name) {

    }
}
