package First50Questionsday1;
//TODO For the given array of Strings, print and count all the Strings which has even number of characters.
public class Program2 {
    public static void main(String[] args) {
        String [] words={"apple","mango","banana","tree"};
        printStringWithEvenNumberOfChars(words);
    }
    public static  void printStringWithEvenNumberOfChars(String[] words){
        for (String w:words){
            if (w.length()%2==0){
                System.out.println(w);
            }
        }
    }
}
