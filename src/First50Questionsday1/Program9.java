package First50Questionsday1;

import java.util.Arrays;

public class Program9
{
    public static void main(String[] args) {
        int []a={1,2,1};

        int result[]=getConcatenation(a);
        Arrays.stream(result).forEach(System.out::println);
    }

        public static int[] getConcatenation(int[] nums) {
            int n=nums.length*2;
            int []result=new int[n];
            for(int i=0;i<result.length;i++){
                result[i]=nums[i%nums.length];
            }
            return result;


    }
}
