import java.util.*;
class nibbleswap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=((n1&0x0F)<<4|(n1&0xF0)>>4);
        System.out.println(n2);
    }
}
