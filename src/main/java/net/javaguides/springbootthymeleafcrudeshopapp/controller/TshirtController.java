package net.javaguides.springbootthymeleafcrudeshopapp.controller;
import net.javaguides.springbootthymeleafcrudeshopapp.model.Order;
import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;
import net.javaguides.springbootthymeleafcrudeshopapp.service.OrderService;
import net.javaguides.springbootthymeleafcrudeshopapp.service.TshirtService;
import net.javaguides.springbootthymeleafcrudeshopapp.service.TshirtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

    public class TshirtController {

    @Autowired
    private TshirtService tshirtService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        // listTshirts je vlastne to, co sa zobrazi index.html v resources/templates
        // v prikaze <tr th:each="employee:${listEmployees}">
        model.addAttribute("listOrders", orderService.getAllOrders());
        return "index";
    }

    @GetMapping("/showNewTshirtForm")
    public String showNewTshirtForm(Model model) {
        Tshirt tshirt = new Tshirt();
        model.addAttribute("tshirt", tshirt);
        model.addAttribute("orders", orderService.getAllOrders());
        return "NewTshirt";
    }
    @GetMapping("/showNewOrderForm")
    public String showNewOrderForm(Model model) {
        // create model attribute to bind form data
        Order order = new Order();
        model.addAttribute("order", order);
        return "newOrder";
    }

    @PostMapping("/saveTshirt")
    public String saveTshirt(@ModelAttribute("tshirt") Tshirt tshirt) {
        tshirtService.saveTshirt(tshirt);
        return "redirect:/";
    }
    @PostMapping("/saveOrder")
    // koresponduje s <form action="#" th:action="@{/saveEmployee}" th:object="${employee}" v subore new_employee.html
    public String saveOrder(@ModelAttribute("order") Order order) {
        orderService.saveOrder(order);
        return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long userid, Model model) {
        Tshirt tshirt = tshirtService.getTshirtById(userid);
        model.addAttribute("tshirt", tshirt);
        model.addAttribute("orders", orderService.getAllOrders());
        return "updateTshirt";

    }
        @GetMapping("/deleteTshirt/{id}")
        public String deleteTshirt ( @PathVariable(value = "id") long id){
            this.tshirtService.deleteTshirtById(id);
            return "redirect:/";
        }
    @GetMapping("/deleteOrder/{id}")
    public String deleteOrder( @PathVariable(value = "id") long id){
        this.orderService.deleteOrderById(id);
        return "redirect:/";
    }
    }



