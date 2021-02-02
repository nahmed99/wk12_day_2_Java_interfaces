import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void canConvertCar() {
        // Given we have a car
        Car car = new Car("Zafira", 10);

        // When we pass Car to the converter
        String message = Converter.process(car);

        // Then we should see some converted string
        assertEquals("Car data", message);
    }

    @Test
    public void canMoveCar() {
        Car car = new Car("Ford", 3);
        String returned = car.move(30);
        assertEquals("Moved 30", returned);
    }
}
