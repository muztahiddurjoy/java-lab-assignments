package lab_assignment_1;

public class Task19 {
    public static void main(String[] args) {
        double a = 8;
        double b = 3;
        double half_a= a/2;
        double one_side = Math.sqrt(Math.pow(half_a, 2)+Math.pow(b, 2));
        double area = ((3*Math.sqrt(3)/2)*Math.pow(one_side, 2));
        double circum = 6*one_side;
        System.out.println("Area "+area);
        System.out.println("Circumference "+circum);
    }
}
