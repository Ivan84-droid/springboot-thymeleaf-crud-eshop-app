package net.javaguides.springbootthymeleafcrudeshopapp.service;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;

import java.util.List;

public interface TshirtService {
    List<Tshirt> getAllTshirts();
    void saveTshirt(Tshirt tshirt);
    Tshirt getTshirtById(long id);

    void deleteTshirtById(long id);
}
