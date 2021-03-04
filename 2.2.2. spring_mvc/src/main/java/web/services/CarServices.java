package web.services;


import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServices {

    private final List<Car> cars = new ArrayList<>();

    public CarServices() {
        cars.add(new Car("Mazda", "X6", "business"));
        cars.add(new Car("Nisan", "Tiguan", "standart"));
        cars.add(new Car("Subaru", "Impreza", "sport"));
        cars.add(new Car("BMW", "X7", "sport"));
        cars.add(new Car("Mersedes", "Cls", "business"));
    }

    public List<Car> getFullCars() {
        return cars;
    }

    public List<Car> getCars(@RequestParam(value = "count", required = false) Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
