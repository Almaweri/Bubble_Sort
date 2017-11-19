
public class BubbleSort {


    void bubbleSort(int bub_arr[])
    {
        int n = bub_arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (bub_arr[j] > bub_arr[j+1])
                {
                    // To swap temp and bub_arr[i]
                    int temp = bub_arr[j];
                    bub_arr[j] = bub_arr[j+1];
                    bub_arr[j+1] = temp;
                }
    }
 
    // For loop to print the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Main method for testing and printing out.
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] =  {2, 1, 5, 10, 8, 6, 7, 9, 3, 4, 99, 77, 55, 199, 550, 2244, 9999,10000};
        ob.bubbleSort(arr);
        System.out.println("You Sorted array as follow: ");
        ob.printArray(arr);
    }
}
