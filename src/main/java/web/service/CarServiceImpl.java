package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = List.of(
            new Car("Tesla", "Red", 2020),
            new Car("BMW", "Black", 2019),
            new Car("Audi", "White", 2021),
            new Car("Toyota", "Blue", 2018),
            new Car("Ford", "Yellow", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }

}
