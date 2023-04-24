import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long s=0;
        int d=0;
        while(n!=0 || s>9){
             if(n==0){
                 n=s;
                 s=0;
             }
             d=(int)n%10;
             s+=d;
             n/=10;
        }
        System.out.println(s);
    }
}