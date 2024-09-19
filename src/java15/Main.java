package java15;

import Generator.IdGenerate;
import models.Animal;
import models.Gender;
import models.Person;
import service.AnimalServiceDao;
import service.PersonServiceDao;
import service.serviceImpl.AnimalServiceImpl;
import service.serviceImpl.PersonServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceDao serviceDao = new PersonServiceImpl();
        AnimalServiceDao animalServiceDao = new AnimalServiceImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);


        while (true) {
            System.out.println("""
                    1 -> Add 
                    2 -> Find By Id
                    3 -> Get All
                    4 -> Sort by Name
                    5 -> Sort by Gender
                    6 -> Clear
                                        
                    ~~~~~~~~~~~~~~~
                    7 -> Add Animal
                    8 -> Find By Id 
                    9 -> Get All Animal
                    10 -> Sort by Name Animal
                    11 -> Sort By Gender Animal
                    12 -> Clear 
                                        
                    13 -> Exit
                    """);
            switch (scannerNum.nextInt()) {
                case 1 -> {
                    System.out.println(serviceDao.add(new Person(IdGenerate.personId(), "Atai", 19, Gender.MALE)));
                    System.out.println(serviceDao.add(new Person(IdGenerate.personId(), "Venera", 23, Gender.FEMALE)));
                    System.out.println(serviceDao.add(new Person(IdGenerate.personId(), "Bektur", 21, Gender.MALE)));
                    System.out.println(serviceDao.add(new Person(IdGenerate.personId(), "Yana", 28, Gender.FEMALE)));
                    System.out.println(serviceDao.add(new Person(IdGenerate.personId(), "Rasul", 32, Gender.MALE)));
                }
                case 2 -> {
                    System.out.println(serviceDao.getById(3L));
                    System.out.println(serviceDao.getById(1L));
                    System.out.println(serviceDao.getById(2L));
                }
                case 3 -> {
                    System.out.println(serviceDao.getAll());
                }
                case 4 -> {

                    System.out.println("asc/desc");
                    String name = scanner.nextLine();
                    System.out.println(serviceDao.sortByName(name));


                }
                case 5 -> {
                    System.out.println("Male/Female");
                    String gender = scanner.nextLine();
                    System.out.println(serviceDao.filterByGender(gender));
                }
                case 6 -> {
                    serviceDao.clearMethod();
                    System.out.println(serviceDao.clearMethod());
                }
                case 7 -> {
                    System.out.println(animalServiceDao.add(new Animal(IdGenerate.animalId(), "Bull", 23, Gender.MALE)));
                    System.out.println(animalServiceDao.add(new Animal(IdGenerate.animalId(), "Cow", 25, Gender.FEMALE)));
                    System.out.println(animalServiceDao.add(new Animal(IdGenerate.animalId(), "Sheep", 12, Gender.MALE)));
                    System.out.println(animalServiceDao.add(new Animal(IdGenerate.animalId(), "Horse", 13, Gender.MALE)));
                    System.out.println(animalServiceDao.add(new Animal(IdGenerate.animalId(), "Dog", 6, Gender.FEMALE)));
                }
                case 8 -> {
                    System.out.println(animalServiceDao.getById(1L));
                    System.out.println(animalServiceDao.getById(5L));
                    System.out.println(animalServiceDao.getById(3L));
                    System.out.println(animalServiceDao.getById(2L));
                    System.out.println(animalServiceDao.getById(4L));
                }
                case 9 -> {
                    System.out.println(animalServiceDao.getAll());
                }
                case 10 -> {
                    System.out.println("asc/desc");
                    String sortName = scanner.nextLine();
                    System.out.println(animalServiceDao.sortByName(sortName));
                }
                case 11 -> {
                    System.out.println("Male/Female");
                    String gender = scanner.nextLine();
                    System.out.println(animalServiceDao.filterByGender(gender));
                }
                case 12 -> {
                    System.out.println(animalServiceDao.clearMethod());
                }


                case 13 -> {
                    return;
                }
                default -> System.out.println("No commands");
            }
        }
    }
}