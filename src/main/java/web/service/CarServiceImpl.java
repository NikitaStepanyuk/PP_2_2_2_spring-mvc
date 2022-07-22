package web.service;

import org.springframework.stereotype.Component;
import web.dao.*;
import web.model.Car;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        return carDao.getAllCars(count);
    }
}
