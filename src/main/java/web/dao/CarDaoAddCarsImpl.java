package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoAddCarsImpl implements CarDao {

    private final List<Car> list = new ArrayList <>();

    public CarDaoAddCarsImpl() {
        list.add(new Car(1, "car1", 1000));
        list.add(new Car(2, "car2", 2000));
        list.add(new Car(3, "car3", 3000));
        list.add(new Car(4, "car4", 4000));
        list.add(new Car(5, "car5", 5000));
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }

}
