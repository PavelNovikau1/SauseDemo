package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class CarTest {

    @Test
    public void carComparisonTest(){
        Car car1 = new Car();
        Car car2 = new Car();

        Assert.assertEquals(car1,  car2);
    }

    @Test
    public void carComparisonTest2(){
        Car car1 = Car.builder()
                .make("BMW")
                .model("5")
                .build();
        Car car2 = Car.builder()
                .make("Tesla")
                .model("S")
                .build();
        Assert.assertEquals(car1.getModel(), car2.getModel());

    }
    @Test
    public void loggerTest(){
    log.fatal("fatal");
    log.error("error");
    log.warn("warn");
    log.info("info");
    log.debug("debug");
    log.trace("trace");

    }

}
