import java.util.*;
class discount{
    public static void rec(int n,int i,int check){
        while(i<=n){
            System.out.println(check);
            check=check*2+1;
            rec(n,i,check);
            i++;
        }
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int i=1;
        int check=2;
        rec(n,i,check);
	}
}