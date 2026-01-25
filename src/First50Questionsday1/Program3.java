package First50Questionsday1;
//TODO For the given array of Strings, print the largest string.
public class Program3 {
    public static void main(String[] args) {
        String []words={"Apple","banana","tree","Walnet"};
        printingLargestString(words);
    }
    public static void printingLargestString(String []words){
        int maxSize=Integer.MIN_VALUE;
//        StringBuilder str=new StringBuilder();
        String og="12";
        for (String s:words){
            if (s.length()>maxSize){
              og=s;
            }
        }
//        String result=str.toString();
        System.out.println(og);
//        System.out.println(str.toString());
    }
}
