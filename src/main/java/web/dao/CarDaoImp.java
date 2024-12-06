package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 5, 1999));
        cars.add(new Car("Audi", 100, 1989));
        cars.add(new Car("Nissan", 370, 2015));
        cars.add(new Car("Mercedes", 190, 1995));
        cars.add(new Car("Mazda", 3, 2007));
        cars.add(new Car("BMW", 5, 1999));
        cars.add(new Car("Audi", 100, 1989));
        cars.add(new Car("Nissan", 370, 2015));
        cars.add(new Car("Mercedes", 190, 1995));
        cars.add(new Car("Mazda", 3, 2007));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}
