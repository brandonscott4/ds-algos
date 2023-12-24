import java.util.Arrays;

public class BubbleSort {
    
    public int[] sort(int[] arr){
        int n = arr.length;

        boolean noSwaps;

        for(int i=0; i<n-1; i++){
            noSwaps = true;
            //j<n-1-i because after each pass through largest element will be sorted in correct position
            //so dont need to check that element in next pass through
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    noSwaps = false;
                }
            }

            if(noSwaps){
                break;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arrToSort = {1, 5, 2, 9, 4, 3, 6, 8, 7};
        int[] sorted = bs.sort(arrToSort);
        System.out.println(Arrays.toString(sorted));
    }
}
