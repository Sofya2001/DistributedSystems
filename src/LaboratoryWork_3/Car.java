package LaboratoryWork_3;

public abstract class Car {
    String stamp;
    String class_auto;
    String weight;
    Engine motor;


    abstract void start();
    abstract void stop();
    abstract void printInfo();
    String turnRight(){
        return "Поворот направо";
    }
    String turnLeft(){
        return "Поворот налево";
    }
}
