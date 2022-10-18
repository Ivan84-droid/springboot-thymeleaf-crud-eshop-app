package net.javaguides.springbootthymeleafcrudeshopapp.service;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;
import net.javaguides.springbootthymeleafcrudeshopapp.repozitory.TshirtRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TshirtServiceImpl implements  TshirtService {
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
    public Tshirt getTshirtById(long id) {
        Optional<Tshirt> optional = tshirtRepozitory.findById(id);
        Tshirt tshirt = null;
        if (optional.isPresent()) {
            tshirt = optional.get();
        } else {
            throw new RuntimeException(" Tshirt not found for id :: " + id);
        }
        return tshirt;
    }

        @Override
        public void deleteTshirtById ( long id){
        this.tshirtRepozitory.deleteById(id);
        }
    }
