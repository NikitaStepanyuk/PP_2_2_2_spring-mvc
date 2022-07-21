package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars(Integer count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "car1", 1000));
        list.add(new Car(2, "car2", 2000));
        list.add(new Car(3, "car3", 3000));
        list.add(new Car(4, "car4", 4000));
        list.add(new Car(5, "car5", 5000));
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
