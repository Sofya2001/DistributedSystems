package LaboratoryWork_3;

public class Lorry extends Car{
    double load_capacity;
    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {

    }
}
