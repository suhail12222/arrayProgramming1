package First50Questionsday1;
//Todo  Print biggest element , smallest elements and their difference from the given array.
public class Program1 {
    public static void main(String[] args) {
int []a={1,2,3,4,5,1,2};
printBiggestAndSmallest(a);
    }
    public static void printBiggestAndSmallest(int []a){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            } else if (a[i]>max) {
                max=a[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
