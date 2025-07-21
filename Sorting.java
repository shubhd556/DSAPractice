//Selection Sort 

class Solution {
    public int[] selectionSort(int[] nums) {


            int k = nums.length;
            int low=0;
            for(int i=0;i<k-1;i++)
            {
                low=i;
               for(int j=i+1;j<k;j++)
               {
                    if(nums[low]>nums[j])
                    {
                        low=j;
                    }
               }

               int temp = nums[low];
               nums[low]=nums[i];
               nums[i]=temp;
            }

            return nums;
    }

    // Bubble Sort
    public int[] bubbleSort(int[] nums) {

        int k = nums.length;

        for(int i=0;i<k;i++)
        {
            for(int j =0;j<k-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        return nums;
}

    // Bubble Sort with Recursion : 

    void bubble_sort(int arr[], int n) {
        // Base Case: range == 1.
        if (n == 1) return;
    
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    
        //Range reduced after recursion:
        bubble_sort(arr, n - 1);
    }

    // Insertion Sort 

    public int[] insertionSort(int[] nums) {


        int k = nums.length;

        for(int i=1;i<k;i++)
        {
            int curr = nums[i];
            int j= i-1;
            while(j >= 0 && curr<nums[j])
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=curr;
        }
        return nums;
    }

    // Insertion Sort with recursion : 

    void insertion_sort(int arr[], int i, int n) {

        // Base Case: i == n.
        if (i == n) return;
    
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
    
        insertion_sort(arr, i + 1, n);
    }

    // Merge Sort 

    public static void conquer(int arr[],int si,int mid, int ei)
    {
        int merged[]= new int[ei-si +1];

        int idx1 = si;
        int idx2 = mid+1;

        int x =0;
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<= arr[idx2])
            {
                merged[x++]= arr[idx1++];
            }
            else 
            {
                merged[x++]=arr[idx2++];
            }
        }

        while(idx1<=mid)
        {
            merged[x++]= arr[idx1++];
        }
        while(idx2<=ei)
        {
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j = si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }

    }

    public static void  divide(int arr[],int si,int ei)
    {

        if(si>=ei)
        {
            return;
        }
        int mid = si+(ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);

    }
    public int[] mergeSort(int[] nums) {
        int k = nums.length;

         divide(nums,0,k-1);

         return nums;


    }


    // Quick Sort : 

    
public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

   ];
    arr[high] = temp;

    return i;
}

public static void quickSorted(int arr[], int low, int high) {
    if (low < high) {
        int pivotidx = partition(arr, low, high);
        quickSorted(arr, low, pivotidx - 1);
        quickSorted(arr, pivotidx + 1, high);
    }
}

public int[] quickSort(int[] nums) {
    int n = nums.length;
    quickSorted(nums, 0, n - 1);
    return nums;
}

// Main method for testing
public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {5, 3, 8, 4, 2};
    int[] sorted = sol.quickSort(nums);
    System.out.println("Sorted array: " + Arrays.toString(sorted));
}


    
}