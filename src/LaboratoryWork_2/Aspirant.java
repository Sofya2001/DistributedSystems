package LaboratoryWork_2;

public class Aspirant extends Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;
    String nameScientificWork;

    @Override
    int getScholarship() {
        int scholarship;
        if (averageMark==5) scholarship=200;
        else scholarship=180;
        return scholarship;
    }
}
