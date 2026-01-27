package First50Questionsday1;
//input : 2,5,4,3,6
//output: 360,144,180,240,120
public class Program5 {
    public static void main(String[] args) {
        int []a={2,5,4,3,6};
        int []result=fullfilling(a);
        for (int r:result){
            System.out.print(r+" ");
        }

    }
    public static int []fullfilling(int[]a ){
        int n=a.length;
        int []b=new int[n];
        for (int i=0;i<n;i++){
            int  product=1;
            for (int j=0;j<n;j++){
                if (i==j)continue;
                product*=a[j];
            }
            b[i]=product;
        }
        return b;
    }
}
