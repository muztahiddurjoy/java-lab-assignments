package lab_assignment_1;

public class Task20 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        double sinA = a/c;
        System.out.println(sinA);
        double cosA = b/c;
        System.out.println(cosA);
        double sinB = b/c;
        System.out.println(sinB);
        double cosB = a/c;
        System.out.println(cosB);
    }
}
