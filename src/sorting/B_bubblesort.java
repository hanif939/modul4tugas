
package sorting;

public class B_bubblesort {
    public static void bubbleShort(int[] A) {
        int i=1, j, n = A.length;
        int temp;
        while (i<n){   //1<5
            j = n-1 ;  //j=5-1=4
            while(j>-1){   //4>-1-T
                if (A[j-1]>A[j]){ //A[3]>A[4]=3-1-T
                    temp = A[j]; //temp-1
                    A[j] = A[j-1]; //A[4]=A[3]=3
                }
                j = j - 1; //j=3
            }
            i = i + 1; //i = i+1
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i< data.length; i++){
            System.out.print (data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int A[] = {25,7,9,13,3};
        B_bubblesort.tampil(A);
        B_bubblesort.bubbleShort(A);
        B_bubblesort.tampil(A);
        System.out.println("Hanif Bachtiar Martin");
    }
}
