package LaboratoryWork_3;

public class SportCar extends Car {
    double speed;

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    void printInfo() {

    }
}
