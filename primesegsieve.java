import java.util.*;
class primesegsieve{
    public static void printPrimes(int l, int r) {
        boolean[] primes = new boolean[r - l + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i * i <= r; i++) {
            int start = (l / i) * i;
            if (start < l) {
                start += i;
            }
            if (start == i) {
                start += i;
            }
            for (int j = start; j <= r; j += i) {
                primes[j - l] = false;
            }
        }
        if (l == 1) {
            primes[0] = false;
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print((i + l) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        printPrimes(l,r);
    }
}