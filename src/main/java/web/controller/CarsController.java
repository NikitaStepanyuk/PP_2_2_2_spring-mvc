package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5", required = false) Integer count, ModelMap model) {
        if (count < 0) {
            List<Car> cars = carService.getAllCars(5);
            model.addAttribute("cars", cars);
            return "cars";
        }
        List<Car> cars = carService.getAllCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

