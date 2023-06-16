import java.util.Scanner;
public class strobo {
    public static boolean check(String num) {
        int l = 0;
        int r = num.length() - 1;
        while (l <= r) {
            char c1 = num.charAt(l);
            char c2 = num.charAt(r);
            if ((c1 == '0' && c2 == '0') || (c1 == '1' && c2 == '1') || (c1 == '8' && c2 == '8') || (c1 == '6' && c2 == '9') || (c1 == '9' && c2 == '6')) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (check(n)) {
            System.out.println(n + " is a strobogrammatic number.");
        } else {
            System.out.println(n + " is not a strobogrammatic number.");
        }
    }
}