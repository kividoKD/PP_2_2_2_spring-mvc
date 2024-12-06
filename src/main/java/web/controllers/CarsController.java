package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) String count,
                            ModelMap model) {
        model.addAttribute("count", count);
        model.addAttribute("cars", carService.listCars());

        return "cars";
    }
}
