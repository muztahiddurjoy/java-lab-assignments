public class Task4 {
    public static void main(String[] args) {
        int year = 1900;
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else if(year%100==0&&year%400==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
