public class Task3 {
    public static void main(String[] args) {
        int num = 28;
        if(num%7==0&&num%5==0){
            System.out.println("Divisible by both");
        }
        else if(num%7==0&&num%5!=0){
            System.out.println("Invalid: Divisible by 7 only");
        }
        else if (num%7!=0&&num%5==0){
            System.out.println("Invalid: Divisible by 5 only");
        }
        else{
            System.out.println("No");
        }
    }
}
