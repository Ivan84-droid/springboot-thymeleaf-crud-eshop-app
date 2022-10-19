package net.javaguides.springbootthymeleafcrudeshopapp.service;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Order;
import net.javaguides.springbootthymeleafcrudeshopapp.repozitory.OrderRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class OrderServiceImpl implements OrderService{

        @Autowired
            private OrderRepozitory orderRepozitory;

        @Override
        public List<Order> getAllOrders(){return orderRepozitory.findAll();
        }
        @Override
        public void saveOrder (Order order){orderRepozitory.save(order);
        }

    @Override
    public void deleteOrderById(long id) {

    }

}

