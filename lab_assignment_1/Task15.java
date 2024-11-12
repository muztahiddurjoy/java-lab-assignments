package lab_assignment_1;

public class Task15 {
    public static void main(String[] args) {
        //a
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is now "+a);
        System.out.println("b is now "+b);

        //b
        int c = 10;
        int d = 20;
        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("c is now "+c);
        System.out.println("d is now "+d);

    }
}
