package service;

import java.util.List;

public interface PersonServiceDao <T>{
    String add(T t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName(String ascOrDesc);  //asc/desc
    List<T> filterByGender(String gender);  //female/male
    List<T> clearMethod();

}
