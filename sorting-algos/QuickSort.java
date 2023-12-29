//pivot is important here
//worst case: O(n^2)

import java.util.Arrays;

public class QuickSort {
    
    public void sort(int[] arr, int startIndex, int endIndex){
        //base case... partion of 1 is sorted
        if(startIndex == endIndex || startIndex > endIndex){
            return;
        }

        int pivotIndex = pickPivot(arr, startIndex, endIndex);
        // move pivot to endIndex of array
        int temp = arr[endIndex];
        arr[endIndex] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        while(true){

            int itemFromLeftIndex = endIndex;
            //itemFromLeft that is larger than pivot value
            for(int i=startIndex; i<=endIndex-1; i++){
                if(arr[i] > arr[endIndex]){
                    itemFromLeftIndex = i;
                    break;
                }
            }

            int itemFromRightIndex = -1;
            //itemFromRight that is less than pivot value
            for(int i=endIndex-1; i>=startIndex; i--){
                if(arr[i] < arr[endIndex]){
                    itemFromRightIndex = i;
                    break;
                }
            }

            if(itemFromLeftIndex > itemFromRightIndex){
                //swap itemFromLeft with pivot
                temp = arr[itemFromLeftIndex];
                arr[itemFromLeftIndex] = arr[endIndex];
                arr[endIndex] = temp;
                pivotIndex = itemFromLeftIndex;
                break;
            }
            else {
                temp = arr[itemFromLeftIndex];
                arr[itemFromLeftIndex] = arr[itemFromRightIndex];
                arr[itemFromRightIndex] = temp;
            }
        }

        sort(arr, startIndex, pivotIndex-1);
        sort(arr, pivotIndex+1, endIndex);

    }

    //find middle value when first, middle and last values are sorted
    public int pickPivot(int[] arr, int startIndex, int endIndex){
        int[] medianOfThree = new int[3];
        medianOfThree[0] = arr[startIndex];
        medianOfThree[1] = arr[(int) Math.floor((startIndex+endIndex)/ 2)];
        medianOfThree[2] = arr[endIndex];

        BubbleSort bs = new BubbleSort();
        int[] sorted = bs.sort(medianOfThree);
        
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == sorted[1]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {4, 6, 5, 3, 2, 7, 1 ,0, 8};
        qs.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
