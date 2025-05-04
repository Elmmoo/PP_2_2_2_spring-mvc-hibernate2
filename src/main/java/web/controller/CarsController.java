package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceInterface;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarServiceInterface carService;

    public CarsController(CarServiceInterface carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showCars(
            @RequestParam(required = false, defaultValue = "5") Integer count,
            Model model
    ) {
        model.addAttribute("cars", carService.getCars(count));
        model.addAttribute("currentCount", count);
        return "cars";
    }
}
