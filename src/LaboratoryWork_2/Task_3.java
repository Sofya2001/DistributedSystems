package LaboratoryWork_2;

public class Task_3 {
    void sendMessage( String ... number){
        for(String num:number) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Phone phone_1=new Phone();
        Phone phone_2=new Phone("+798534653","s234f", 245.7);
        Phone phone_3=new Phone("+798543244","iotf5");
        Phone phone_4=new Phone(new Phone("+723456783","RT45"),130.5);
        Phone[] array={phone_1,phone_2,phone_3,phone_4};
        String[] name={"Anna","Alexsandr","Masha","Pavel"};
        int i=0;
        for (Phone who: array){
            System.out.println(who.number+" "+who.model+ " "+who.weight);
            System.out.println(who.receiveCall(name[i]));
            System.out.println(who.getNumber());
            System.out.println(who.receiveCall(name[i],who.number));
            i++;
        }

    }
}
