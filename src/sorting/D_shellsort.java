
package sorting;

public class D_shellsort {
   public static void shellsort(int[]arr){
       int n =arr.length;
       int C,M ;
       int jarak, i, j,kondisi;
       boolean Sudah = true;
       int temp ;
       C = 0;
       M = 0;
       jarak = n;
               
       while (jarak >-1){
           jarak = jarak/2;
           Sudah = true;
           while(Sudah){
           Sudah = false;
           for(j=0; j < n-jarak; j++){
              i = j +jarak;// i=02=2
              C++;
              if (arr[j]> arr[i]){
                  temp =arr[j];
                  arr[1]=arr[i];
                  Sudah = true;
                }
            }
        }
    }
}
                           
                    
   public static void tampil(int data[]){
       for(int i=0;i<data.length;i++)
           System.out.print(data[i]+" ");
       System.out.println();
   }
   public static void main(String[] args) {
       int A[] = {25,7,9,13,3};
       D_shellsort.tampil(A);
       D_shellsort.shellsort(A);
       D_shellsort.tampil(A);
       System.out.println("Hanif Bachtiar Martin");
   }
}