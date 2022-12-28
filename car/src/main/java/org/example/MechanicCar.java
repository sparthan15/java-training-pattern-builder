package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MechanicCar {
    private boolean childChair;
    private int speed = 0;
    private int shifts;
    private int WHEELS = 4;
    private int wheels;

    private MechanicCar() {
        System.out.println("Hi, I'm a Mechanic Car");
    }

    public void setChildChair(boolean value) {
        if (this.speed > 50) {
            this.childChair = false;
        }
        this.childChair = value;
    }

    public boolean getChildChair() {
        return this.childChair;
    }

    public static class RaceCarBuilder {
        private MechanicCar car;

        public RaceCarBuilder() {
            car = new MechanicCar();
            car.setChildChair(false);
        }

        public RaceCarBuilder speed(int speed) {
            this.car.setSpeed(speed);
            return this;
        }

        public MechanicCar build() {
            return this.car;
        }
    }

    public static class SchoolCarBuilder {

        private MechanicCar car;

        public SchoolCarBuilder() {
            this.car = new MechanicCar();
            this.car.setSpeed(50);
            this.car.setChildChair(true);
        }

        public MechanicCar build() {
            return this.car;
        }

    }


}
