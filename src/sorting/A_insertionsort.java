
package Sorting;

public class A_insertionsort {
    
    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++) { //i=1 //i=2 //i=3
            int key = A[i]; //A[0]=25 //A[1]=7 //A[2]=9 //A[3]=13 //A[4]=3
            int j = i - 1; //j=0 //j=1 //j=2
            while ((j >-0 ) && (A[j] > key)) { //0>-&A[0]25>7-F
                                               //1>-&A[1]25>9-T /0>-&A[0]13>9-F
                                               //2>-&A[2]25>13-T /1>-&A[1]7>3-T
                A[j + 1] = A[j]; //A[2]=A[1]=25  //A[3]=A[2]=13 /A[2]=A[1]=9 /A[1]=A[0]=7
                j--; //j=0     //j=1  /j=0 /j=1
            }
            A[j + 1] = key; //A[3]=A[2]=10 //A[2]=A[1]=4 //A[1]=A[0]=3
        } //25,7 //9,13,3 //7,25,9, 13,3 //7,9,13,25, 3
    }
    
    public static void tampil(int data[]) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3, 7, 9, 13, 25};
        A_insertionsort.tampil(A);
        A_insertionsort.insertionSort(A);
        A_insertionsort.tampil(A);
        System.out.println("Hanif Bachtiar Martin");
    }
}