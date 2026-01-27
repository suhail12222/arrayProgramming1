package First50Questionsday1;
//input :2,5,4,3,6
//output: 18,15,16,17,14
public class Program4 {
    public static void main(String[] args) {
        int []a={2,5,4,3,6};
        int []result=getResultant(a);
        for (int y:result){
            System.out.print(y+" ");
        }
    }

    public static int [] getResultant(int []a){
            int n = a.length;
            int[] b = new int[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                int sum=0;
                for (int j=0;j<n;j++){
                   if (i==j)continue;
                  sum+=a[j];
                }
           b[i]=sum;
            }
            return b;


        }

}
