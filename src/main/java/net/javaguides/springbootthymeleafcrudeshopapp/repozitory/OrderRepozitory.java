package net.javaguides.springbootthymeleafcrudeshopapp.repozitory;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepozitory extends JpaRepository<Order, Long> {
}
