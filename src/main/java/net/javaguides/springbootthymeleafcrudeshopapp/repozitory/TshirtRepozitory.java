package net.javaguides.springbootthymeleafcrudeshopapp.repozitory;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TshirtRepozitory extends JpaRepository <Tshirt, Long>{

}
