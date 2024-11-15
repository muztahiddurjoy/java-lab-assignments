public class Task9 {
    public static void main(String[] args) {
        double a = 18.83;
        double b = -4.02;
        double c = 83.12;

        double highest = 0;
        double lowest = 0;

        if(a>b){
            if(a>c){
                highest = a;

                if(b>c){
                    lowest = c;
                }
                else{
                    lowest = b;
                }
            }
            else{
                highest = c;
                lowest = b;
            }    
        }
        else if(b>c){
            highest = b;

            if(a>c){
                lowest = c;
            }
            else{
                lowest = a;
            }
        }
        else{
            highest = c;
            lowest = a;
        }
        System.out.println("Maximum number is: "+highest);
        System.out.println("Lowest number is: "+lowest);
    }
}
