package dao.daoImpl;

import dao.PersonDao;
import db.DateBase;
import models.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDaoImpl implements PersonDao <Person> {
    @Override
    public String add(Person person) {
        DateBase.persons.add(person);
        return "Success " + person + " saved";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : DateBase.persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return DateBase.persons;
    }

    @Override
    public List<Person> sortByName(String ascOrDesc) {

        String s = ascOrDesc.trim().toLowerCase();
        if (s.equalsIgnoreCase("asc")) {
            Collections.sort(DateBase.persons, Comparator.comparing(Person::getName));
            return List.copyOf(DateBase.persons);
        } else if (s.equalsIgnoreCase("desc")) {
            Collections.sort(DateBase.persons, Comparator.comparing(Person::getName).reversed());
            return List.copyOf(DateBase.persons);
        } else {
            throw new IllegalArgumentException("choice asc or desc");
        }
    }

    @Override
    public List<Person> filterByGender(String gender) {
        if (gender.trim().toUpperCase().equalsIgnoreCase("Male")) {
            Collections.sort(DateBase.persons, Comparator.comparing(person -> person.getGender()));
            return List.copyOf(DateBase.persons);
        } else if (gender.trim().toUpperCase().equalsIgnoreCase("Female")) {
            Collections.sort(DateBase.persons, Comparator.comparing(Person::getGender).reversed());
            return List.copyOf(DateBase.persons);
        }
        return null;
    }

    @Override
    public List<Person> clearMethod() {
        DateBase.persons.clear();
        return  DateBase.persons;
    }

}
