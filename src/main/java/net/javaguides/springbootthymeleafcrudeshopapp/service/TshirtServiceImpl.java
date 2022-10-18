package net.javaguides.springbootthymeleafcrudeshopapp.service;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;
import net.javaguides.springbootthymeleafcrudeshopapp.repozitory.TshirtRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TshirtServiceImpl implements  TshirtService{
    @Autowired
    private TshirtRepozitory tshirtRepozitory;

    @Override
    public List<Tshirt> getAllTshirts() {
        return tshirtRepozitory.findAll();
    }

    @Override
    public void saveTshirt(Tshirt tshirt) {
        this.tshirtRepozitory.save(tshirt);
    }

    @Override
    public void deleteTshirtById(Long id) {

    }

    @Override
    public void deleteTshirtById(long id) {

        this.tshirtRepozitory.deleteById(id);
    }
}
