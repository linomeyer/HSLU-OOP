package ch.hslu.oop.sw10.ex01;

import com.github.valfirst.slf4jtest.TestLogger;
import com.github.valfirst.slf4jtest.TestLoggerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.event.Level;

import static com.github.valfirst.slf4jtest.Assertions.assertThat;

class CarTest {
    private final TestLogger logger = TestLoggerFactory.getTestLogger(Car.class);

    @AfterEach
    void tearDown() {
        logger.clear();
    }

    @Test
    void testReceiveEventInCarIfMotorIsChanged() {
        Car car = new Car("Renault Twizzy", new Motor(), new Light());
        car.getMotor().switchOn();
        car.getMotor().setRpm(2600);

        assertThat(logger).hasLogged(Level.INFO, "motor changed event: field: {}, oldvalue: {}, newValue: {}",
                "state", false, true);
        assertThat(logger).hasLogged(Level.INFO, "motor changed event: field: {}, oldvalue: {}, newValue: {}",
                "rpm", 0, 2600);
    }

    @Test
    void testReceiveEventInCarIfLightIsChanged() {
        Car car = new Car("Renault Twizzy", new Motor(), new Light());

        car.getLight().switchOn();

        assertThat(logger).hasLogged(Level.INFO, "light changed event: field: {}, oldvalue: {}, newValue: {}",
                "state", false, true);
    }
}