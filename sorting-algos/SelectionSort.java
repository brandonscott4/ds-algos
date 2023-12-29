import java.util.Arrays;

//worst case time complexity: O(n^2)
public class SelectionSort{

    public int[] sort(int[] arr){
        int currMinIndex;

        for(int i=0; i<arr.length; i++){
            currMinIndex = i;
            for(int j=i; j<arr.length; j++){
                if((j != currMinIndex) && (arr[j] < arr[currMinIndex])){
                    currMinIndex = j;
                }
            }
            int temp = arr[currMinIndex];
            arr[currMinIndex] = arr[i];
            arr[i] = temp;   
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {4, 6, 5, 3, 2, 7, 1 ,0, 8};
        arr = ss.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}