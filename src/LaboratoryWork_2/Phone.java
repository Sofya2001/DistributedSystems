package LaboratoryWork_2;

public class Phone {
    String number;
    String model;
    double weight;
    Phone(String number,String model, double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    Phone(String number,String model){
        this.number=number;
        this.model=model;
    }
    Phone(){
        number= "Несуществует";
        model="Несуществует";
        weight= -1;
    }
    Phone(Phone phone,double weight){
        this.number= phone.number;
        this.model= phone.model;
        this.weight=weight;
    }

    String receiveCall(String name){
        return "Звонит "+name;
    }
    String getNumber(){
        return number;
    }
    String receiveCall(String name, String number){
        return " Звонит "+name+" номер телефона: "+number;
    }
}
