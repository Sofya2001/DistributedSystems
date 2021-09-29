package LaboratoryWork_2;

public class Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;
    int getScholarship(){
        int scholarship;
        if (averageMark==5) scholarship=100;
        else scholarship=80;
        return scholarship;
    }

}
