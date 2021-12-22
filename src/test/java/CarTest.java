import com.skvortsov.Car;
import com.skvortsov.EngineCapacityComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CarTest {

    @Test
    void yearOfManufactureSortTest() {
        Car car1 = new Car(2010, 150);
        Car car2 = new Car(2005, 90);
        Car car3 = new Car(2020, 110);
        Car car4 = new Car(2013, 100);
        Car car5 = new Car(2001, 120);
        List<Car> resultList = new ArrayList<>(List.of(car5, car2, car1, car4, car3));
        List<Car> carList = new ArrayList<>(List.of(car1, car2, car3, car4, car5));
        Collections.sort(carList);
        Assertions.assertEquals(carList, resultList);
    }

    @Test
    void engineCapacitySortTest() {
        Car car1 = new Car(2010, 150);
        Car car2 = new Car(2005, 90);
        Car car3 = new Car(2020, 110);
        Car car4 = new Car(2013, 100);
        Car car5 = new Car(2001, 120);
        Comparator<Car> comp = new EngineCapacityComparator();
        TreeSet<Car> carTreeSet = new TreeSet(comp);
        carTreeSet.add(car1);
        carTreeSet.add(car2);
        carTreeSet.add(car3);
        carTreeSet.add(car4);
        carTreeSet.add(car5);
        Assertions.assertEquals(carTreeSet.toString(), "[Car yearOfManufacture is 2005, engineCapacity is 90, " +
                "Car yearOfManufacture is 2013, engineCapacity is 100, " +
                "Car yearOfManufacture is 2020, engineCapacity is 110, " +
                "Car yearOfManufacture is 2001, engineCapacity is 120, " +
                "Car yearOfManufacture is 2010, engineCapacity is 150]");
    }
}