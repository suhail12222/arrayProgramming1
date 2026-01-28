package First50Questionsday1;

import java.util.Arrays;

public class Program11 {
    public static void main(String[] args) {
int []res={2,3,4,5,6,7,8,9};
        System.out.println(countPrimeNUmers(res));
    }
    public static int countPrimeNUmers(int[]a){
       long count= Arrays.stream(a).filter(o->isPrime(o)==true).count();
    return (int)count;
    }
    public static boolean isPrime(int a){
        if (a<2)return false;
        if (a==2||a==3)return true;
        if (a%2==0)return false;
        for (int i=3;i*i<=a;i+=2){
            if (a%i==0)return false;
        }
        return true;
    }
}
