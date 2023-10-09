
public class QuickSort {

    public static void quicksort(int a[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotindex = partition(a,si,ei);
        quicksort(a,si,pivotindex-1);
        quicksort(a,pivotindex+1,ei);
    }

    public static int partition(int a[], int si, int ei){
        int pivotelement = a[si];
        int smallernumbercount = 0;
        for(int i = si+1; i<=ei;i++)
        {
            if(a[i]<pivotelement)
            {
                smallernumbercount++;
            }
        }
        int temp = a[si+smallernumbercount];
        a[si+smallernumbercount]=pivotelement;
        a[si]=temp;
        return si+smallernumbercount;
    }
}
