package tests;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class Car {

    private String make;
    private String model;
    private int speed;
    private int doors;

    public Car() {
    }
}
