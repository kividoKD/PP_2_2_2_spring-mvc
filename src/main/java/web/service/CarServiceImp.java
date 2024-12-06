package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
