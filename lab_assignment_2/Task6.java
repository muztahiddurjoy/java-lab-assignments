public class Task6 {
    public static void main(String[] args) {
        int x = -3;
        int result = 0;
        if(x<0){
            result = 2*x;
        }
        else if(x>=0&&x<2){
            result = x+1;
        }
        else if(x>=2&&x<5){
            result = ((int) Math.pow(x,2))-1;
        }
        else if(x>=5){
            result = (3*(int)Math.pow(x,2))+2;
        }
        System.out.println("output: "+result);
    }
}
