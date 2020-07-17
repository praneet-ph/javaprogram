//find the previous day of a given day
import java.util.*;
public class PreviousDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] Date = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int j = 0; j < T; j++){
            int D = sc.nextInt();
            String M = sc.next();
            int Y = sc.nextInt();
            if(M.equals(Month[0])){
                System.out.println(Date[11]+" "+ Month[11] +" "+(Y-1));
            }else if(D == 1){
                for(int i = 1; i < 11; i++){
                    if(M.equals(Month[i]) && Y%4 != 0){
                        System.out.println(Date[i-1]+" "+Month[i-1]+" "+Y);
                    }
                }
                if(M.equals(Month[2]) && Y%4 == 0){
                    System.out.println(29+" "+Month[1]+" "+(Y-1));
                }
            }else{
                System.out.println(D-1+" "+M+" "+Y);
            }

        }
    }
}
