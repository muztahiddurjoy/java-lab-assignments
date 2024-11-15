public class Task5 {
    public static void main(String[] args) {
      int num = 11;
      if(num>0){
        if(num%2==0){
          System.out.println("Number is positive and even");
        }
        else{
          System.out.println("Number is positive and odd");
        }
      } 
      else if(num==0){
        System.out.println("Number is zero");
      }
      else{
        System.out.println("Number is negative");
      }  
    }
}
