package lab_assignment_1;
public class Task11 {
    public static void main(String[] args) {
        //2.1
        int a = 10;
        System.out.println(a);
        
        //2.2
        int b = 20;
        int add = a + b;
        System.out.println(add);

        //2.3
        int prod = a*b;
        System.out.println(prod);
        int div = b/a;
        System.out.println(div);

        //2.4
        double c = 9.5;
        System.out.println(a);

        double d = 19.5;
        double add_double = c + d;
        System.out.println(add_double);
        double prod_double = c*d;
        System.out.println(prod_double);
        double div_double = d/c;
        System.out.println(div_double);


        //2.5
        String a_str = "10";
        System.out.println(a_str);
        String b_str = "20";
        String add_str = a_str + b_str;
        System.out.println(add_str); //it will concat the string. for example:  1020
        //if we try to add integer with string then
        System.out.println(10+"20"); //it will also concat the string. for example:  1020
        System.out.println("10"+20); //it will also concat the string. for example:  1020
    }
}
