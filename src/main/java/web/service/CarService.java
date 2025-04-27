package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> carList = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("BMW", "X5", 2019),
            new Car("Tesla", "Model S", 2021),
            new Car("Ford", "Mustang", 2017),
            new Car("Honda", "Civic", 2022)
    );

    public List<Car> getCars(int count) {
        if(count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
