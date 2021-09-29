package LaboratoryWork_2;

public class Task_1 {
    public static void main(String[] args) {
        Student student_1 = new Aspirant();
        Student student_2 = new Student();
        Aspirant student_3 = new Aspirant();
        Student[] array={student_1,student_2, student_3};
        for (Student who : array){
            who.getScholarship();
        }

    }
}
