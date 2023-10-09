
// Selection Sort 
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort{
    static final int MAX = 10010;
    static int[] a = new int[MAX];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Random rand = new Random();
        //System.out.println("Enter the Array Elements: ");
        for (int i = 0;i<n;i++){
            //a[i] = scanner.nextInt();
            a[i] = rand.nextInt(1000);
        }

        a = Arrays.copyOf(a, n);
        /*System.out.println("The Input Array: ");
        for (int i = 0;i<n;i++){
            System.out.println(a[i]+" ");
            System.out.println("\n");
        }*/

        // Set Start Time
        long starttime = System.nanoTime();
        Selection(a,n);

        //Set End Time
        long endtime = System.nanoTime();

        long elapsedtime = endtime - starttime;

        System.out.println("The Sorted Array is : ");
        for (int i=0; i<n; i++) {
            System.out.println(a[i]+" ");
            System.out.println();
        }

        System.out.println("The time complexity in ms for n = "+n+" is: "+(double)elapsedtime/1000000);
        scanner.close();
    }

    public static void Selection(int a[],int n)
    {
        int i = 0;
        int minindex;
        int temp;

        for(i = 0; i < n-1; i++)
        {
            minindex = i;
            for (int j = i+1; j<n;j++){
                if(a[j] < a[minindex])
                    minindex = j;
            }
            if(minindex != 1)
            {
                temp = a[i];
                a[i] = a[minindex];
                a[minindex] = temp;
            }
        }
        System.out.println("Sorted Array Elements are: ");
        for ( i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println("\n");
    }

}