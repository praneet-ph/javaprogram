// contains only cool digits 2 and 5, ie, 2,5,22,25,52,55... are cool digits where as 6,7,.... are not cool digits.
// for example, 3 7, f(3)+f(4)+f(5)+f(6)+f(7) = 5+5+5+22+22= 59
import java.util.*;
public class coolDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, i = 0;
        int[] arr = new int[1000000];
        while (a < 100000) {
            int length = (int) (Math.log10(a) + 1);
            int flag = 0, temp, rev = a;
            while (length > 0) {
                temp = rev % 10;
                rev = rev / 10;
                if (temp == 2 || temp == 5) {
                    length--;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr[i] = a;
                i++;
            }
            a++;
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;
        for (int j = l; j <= r; j++) {
            for (int value : arr) {
                if (j <= value) {
                    sum = sum + value;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
