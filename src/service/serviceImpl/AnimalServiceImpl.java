package service.serviceImpl;

import dao.AnimalDao;
import dao.daoImpl.AnimalDaoImpl;
import models.Animal;
import service.AnimalServiceDao;
import service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements AnimalServiceDao<Animal> {

    AnimalDao<Animal> animalAnimalDao = new AnimalDaoImpl();

    @Override
    public String add(Animal animal) {
        return animalAnimalDao.add(animal);

    }

    @Override
    public Animal getById(Long id) {
        return animalAnimalDao.getById(id);

    }

    @Override
    public List<Animal> getAll() {
        return animalAnimalDao.getAll();
    }

    @Override
    public List<Animal> sortByName(String ascOrDesc) {
        return animalAnimalDao.sortByName(ascOrDesc);
    }


    @Override
    public List<Animal> filterByGender(String gender) {
        return animalAnimalDao.filterByGender(gender);
    }

    @Override
    public List<Animal> clearMethod() {
        return animalAnimalDao.clearMethod();
    }
}
