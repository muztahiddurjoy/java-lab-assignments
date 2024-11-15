public class Task8 {
    public static void main(String[] args) {
        int amount = 15000;
        int age = 18;
        int tax = 0;

        if(age<18){
            tax=0;
        }
        else{
            if(amount<10000){
                tax = 0;
            }
            else if(amount>=10000&&amount<=20000){
                tax = (int) (amount*0.05);
            }
            else{
                tax = (int) (amount*0.1);
            }
        }
        System.out.println("Your tax amount is "+tax+" Tk");
    }
}
