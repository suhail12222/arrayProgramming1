package First50Questionsday1;
//TODO WAJP to merge two arrays into a single array.
//i/p:
//arr1 = {1, 3, 5}
//arr2 = {2, 4, 6, 8, 10}
//merged: {1, 3, 5, 2, 4, 6, 8, 10}
public class Program6 {
    public static void main(String[]args){
        int []arr1 = {1, 3, 5};
        int []arr2 = {2, 4, 6, 8, 10};
        int []result=merge(arr1,arr2);
        for (int o:result){
            System.out.print(o+" ");
        }
    }
    public static  int [] merge(int []a, int []b){
        int n=a.length+b.length;
        int []r=new int[n];
        int i=0;int j=0;
        int index=0;
        while (i<a.length){
            r[index++]=a[i];
            i++;
        }
        while(j<b.length){
            r[index++]=b[j];
            j++;
        }
        return r;
    }
}
