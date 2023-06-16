import java.util.*;
class leader{
	public static void leadercheck(int arr[], int size) {
		int currentMax = arr[size - 1]; 
        System.out.print(currentMax + " "); 
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                System.out.print(currentMax + " ");
            }
        }
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
		leadercheck(arr, n);
	}
}