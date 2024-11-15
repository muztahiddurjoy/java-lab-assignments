public class Task7 {
    public static void main(String[] args) {
        int id = 24321312;
        int year = id/1000000;
        int session = (id/100000)%10;
        if(session==1){
            System.out.println("Student Joined BRAC in Spring "+year);
        }
        else if(session==3){
            System.out.println("Student Joined BRAC in Summer "+year);
        }
        else if(session==2){
            System.out.println("Student Joined BRAC in Fall "+year);
        }
    }
}
