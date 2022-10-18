package net.javaguides.springbootthymeleafcrudeshopapp.controller;
import net.javaguides.springbootthymeleafcrudeshopapp.model.Tshirt;
import net.javaguides.springbootthymeleafcrudeshopapp.service.TshirtService;
import net.javaguides.springbootthymeleafcrudeshopapp.service.TshirtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

    public class TshirtController {

    @Autowired
    private TshirtServiceImpl tshirtService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listTshirts", tshirtService.getAllTshirts());
        return "index";
    }

    @GetMapping("/showNewTshirtForm")
    public String showNewTshirtForm(Model model) {
        Tshirt tshirt = new Tshirt();
        model.addAttribute("tshirt", tshirt);
        return "NewTshirt";
    }

    @PostMapping("/saveTshirt")
    public String saveTshirt(@ModelAttribute("tshirt") Tshirt tshirt) {
        tshirtService.saveTshirt(tshirt);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long userid, Model model) {
        Tshirt tshirt = tshirtService.getTshirtById(userid);
        model.addAttribute("tshirt", tshirt);
        return "update_tshirt";

    }
        @GetMapping("/deleteTshirt/{id}")
        public String deleteTshirt ( @PathVariable(value = "id") long id){
            this.tshirtService.deleteTshirtById(id);
            return "redirect:/";
        }
    }


