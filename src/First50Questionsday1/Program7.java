package First50Questionsday1;
//TODO WAJP to zigzag merge two arrays into a single array.
//i/p:
//arr1 = {20, 30, 50}
//arr2 = {2, 4, 6, 8, 10}
//merged: {20, 2, 30, 4, 50, 6, 8, 10}
public class Program7 {
    public static void main(String[]args){
int []arr1 = {20, 30, 50};
int []arr2 = {2, 4, 6, 8, 10};
int []result=zigzagMerge(arr1,arr2);
for (int y:result){
    System.out.print(y+" ");
}

    }
    public static int[] zigzagMerge(int []a,int []b) {
        int n = a.length + b.length;
        int i = 0;
        int j = 0;
        int r[] = new int[n];
        int index = 0;
        while (i < a.length && j < b.length) {
            r[index++] = a[i++];
            r[index++] = b[j++];
        }
        while (i < a.length) {
            r[index++] = a[i++];

        }
        while (j < b.length) {
            r[index++] = b[j++];
        }
    return r;
    }
}
