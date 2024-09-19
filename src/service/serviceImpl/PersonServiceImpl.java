package service.serviceImpl;

import dao.PersonDao;
import dao.daoImpl.PersonDaoImpl;
import db.DateBase;
import models.Person;
import service.PersonServiceDao;

import java.util.List;


public class PersonServiceImpl implements PersonServiceDao <Person> {

    PersonDao <Person> personDao = new PersonDaoImpl();


    @Override
    public String add(Person newPerson) {
       return personDao.add(newPerson);
    }

    @Override
    public List<Person> getAll() {
        return DateBase.persons;
    }

    @Override
    public List<Person> sortByName(String ascOrDesc) {
        return personDao.sortByName(ascOrDesc);
    }


    @Override
    public List<Person> filterByGender(String gender) {
        return personDao.filterByGender(gender);
    }

    @Override
    public List<Person> clearMethod() {
        return personDao.clearMethod();
    }

    @Override
    public Person getById(Long id) {
        return personDao.getById(id);
    }
}
