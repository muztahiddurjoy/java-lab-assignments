package lab_assignment_1;

public class Task18 {
    public static void main(String[] args) {
        int student_id = 24321312;
        int last1 = student_id % 10;
        int last2 = (student_id / 10) % 10;
        System.out.println(last1);
        System.out.println(last2);
    }
}
