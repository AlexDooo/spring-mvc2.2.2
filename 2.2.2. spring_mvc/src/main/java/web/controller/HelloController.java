package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarServices;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private CarServices carServices;

    @GetMapping("/index")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        if (count == null) {
            modelMap.addAttribute("cars", carServices.getFullCars());
        } else {
            modelMap.addAttribute("cars", carServices.getCars(count));
        }
        return "cars";
    }
}