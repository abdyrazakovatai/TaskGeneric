package dao.daoImpl;

import dao.AnimalDao;
import db.DateBase;
import models.Animal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AnimalDaoImpl implements AnimalDao <Animal> {

    @Override
    public String add(Animal animal) {
        DateBase.animals.add(animal);
        return "Success saved animal";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : DateBase.animals) {
            if (animal.getId().equals(id)){
                return animal;
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return DateBase.animals;
    }

    @Override
    public List<Animal> sortByName(String ascOrDesc) {
        if (ascOrDesc.trim().toLowerCase().equalsIgnoreCase("asc")){
            Collections.sort(DateBase.animals, Comparator.comparing(Animal::getName));
            return List.copyOf(DateBase.animals);
        } else if (ascOrDesc.trim().toLowerCase().equalsIgnoreCase("desc")) {
            Collections.sort(DateBase.animals,Comparator.comparing(Animal ::getName).reversed());
            return List.copyOf(DateBase.animals);
        }else {
            return null;
        }
    }


    @Override
    public List<Animal> filterByGender(String gender) {
        if (gender.trim().toLowerCase().equalsIgnoreCase("Male")){
            Collections.sort(DateBase.animals,Comparator.comparing(Animal::getGender));
            return List.copyOf(DateBase.animals);
        } else if (gender.trim().toLowerCase().equalsIgnoreCase("Female")) {
            Collections.sort(DateBase.animals,Comparator.comparing(Animal::getGender).reversed());
            return List.copyOf(DateBase.animals);
        }
        return null;
    }

    @Override
    public List<Animal> clearMethod() {
        DateBase.animals.clear();
        return DateBase.animals;
    }
}
