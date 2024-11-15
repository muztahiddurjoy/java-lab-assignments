public class Task2 {
    public static void main(String[] args) {
        int score = 77;
        if(score>=90&&score<=100){
            System.out.println("Your grade is: A");
        }
        else if(score>=85&&score<=89){
            System.out.println("Your grade is: A-");
        }
        else if(score>=70&&score<=84){
            System.out.println("Your grade is: B");
        }
        else if(score>=57&&score<=69){
            System.out.println("Your grade is: C");
        }
        else if(score>=50&&score<=56){
            System.out.println("Your grade is: D");
        }
        else if(score<50){
            System.out.println("Your grade is: F");
        }
    }
}
