import java.util.Arrays;

//worst case 0(n^2) time complexity
public class InsertionSort {
    
    public int[] sort (int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(j != 0 && arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {4, 6, 5, 3, 2, 7, 1 ,0, 8};
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
