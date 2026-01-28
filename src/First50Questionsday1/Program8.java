package First50Questionsday1;

import java.util.Arrays;

/*
Merge two sorted array in sorted manner.
        i/p:
        arr1 = {20, 30, 50, 60}
        arr2 = {2, 28, 32, 35, 42}
        merged: {2, 20, 28, 30, 32, 35, 42, 50, 60}
*/
public class Program8 {
    public static void main(String[] args) {
int [] arr1 = {20, 30, 50, 60};
int [] arr2 = {2, 28, 32, 35, 42};
int[]rest=mergeSortedArray(arr1,arr2);
        Arrays.stream(rest).forEach(System.out::println);
    }
    public static int [] mergeSortedArray(int []a,int []b){
        int n=a.length+b.length;
        int []r=new int[n];
        int i = 0,j=0,index=0;
        while(i<a.length&&j<b.length){
            if (a[i]>b[j]){
                r[index++]=b[j++];
            }
            else {
                r[index++]=a[i++];
            }

        }
        while (i<a.length){
            r[index++]=a[i++];
        }
        while (j<b.length){
            r[index++]=b[j++];
        }
        return r;
    }
}
