package LaboratoryWork_2;

public class Task_2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Horse horse=new Horse();
        Veterinarian doctor=new Veterinarian();
        Animal[] array={dog,cat,horse};
        for(Animal who: array){
            doctor.treatAnimal(who);
        }
    }
    }
