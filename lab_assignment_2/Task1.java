public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c  = 30;
        if(a>b && a>c){
            System.out.println("Largest number: "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest number: "+b);
        }
        else{
            System.out.println("Largest number: "+c);
        }
    }
}
