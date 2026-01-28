package First50Questionsday1;

import java.util.Arrays;

public class Program10 {
    public static void main(String[] args) {
int []a={1,2,3,1,21,8,2,1,2,2,2,223,4,4,4};
        System.out.println(countEven(a));
    }
    public static int countEven(int []a){
        long count= Arrays.stream(a).filter(i->i%2==0).count();
        return (int)count;
    }
}
