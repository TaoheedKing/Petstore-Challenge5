package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping("/customer")
    public String loadCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "customer";
    }
    @PostMapping("/customer")
    public String processCustomer(@Valid Customer customer, BindingResult result){
        if (result.hasErrors()){
            return "customer";
        }
        ArrayList<Customer> cust = new ArrayList<>();
        cust.add(customer);
        return "dogs";
    }
    @GetMapping("/dogs")
    public String loadDogs(Model model){
        model.addAttribute("dogs", new Dogs());
        return "dogs";
    }
    @PostMapping("/dogs")
    public String processDogs(@Valid Dogs dogs, BindingResult result){
        if (result.hasErrors()){
            return "dogs";
        }
        ArrayList<Dogs> cust = new ArrayList<>();
        cust.add(dogs);
        return "cats";
    }
    @GetMapping("/cats")
    public String loadCats(Model model){
        model.addAttribute("dogs", new Cats());
        return "dogs";
    }
    @PostMapping("/cats")
    public String processCats(@Valid Cats cats, BindingResult result){
        if (result.hasErrors()){
            return "cats";
        }
        ArrayList<Cats> cust = new ArrayList<>();
        cust.add(cats);
        return "petstore";
    }
}
