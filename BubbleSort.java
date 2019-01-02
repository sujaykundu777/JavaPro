import java.util.Scanner;



public class BubbleSort {
  
        // MEthod to sort the array element using Bubble Sort

        public static void bubblesort(int a[]){
        
            int len = a.length;
            for(int i=0; i<len-1; i++)
                for(int j=0; j< len-1; j++)
                    if(a[j] > a[j+1]){
                        //swap temp and a[i]
                            int temp = a[j];
                            a[j]=a[j+1];
                            a[j+1]= temp;
                    }
            }
        
        public static void printarray(int a[]){

                   int len = a.length;
                   for(int i=0; i<=len-1; i++)
                      System.out.print(a[i] + " " );
                   System.out.println();
        }
         
     public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
         
        System.out.printf("Bubble Sort Program");

        System.out.println("\n Enter the number of elements of array");
       
        int n = inp.nextInt();

        System.out.println("Enter" + n + "elements of the array");
         
        int a[] = new int[n];  // Declaring a array of size n

        for(int i=0; i<n; i++){    // Taking n input for the array
           
            a[i] = inp.nextInt();        
            
        }
        inp.close();
        BubbleSort obj = new BubbleSort();

        obj.bubblesort(a);
        
        System.out.println("The Sorted Array is :");

        obj.printarray(a);
        
    
     }

}