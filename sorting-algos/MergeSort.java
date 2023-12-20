public class MergeSort {
    
    public int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int splitIndex = (int) Math.floor(arr.length / 2);

        int[] first = new int[splitIndex];
        int[] second = new int[arr.length - splitIndex];

        for(int i=0; i<splitIndex; i++){
            first[i] = arr[i];
        }

        int index = splitIndex;
        for(int i=0; i<arr.length-splitIndex; i++){
            second[i] = arr[index];
            index++;
        }


        int[] left = sort(first);
        int[] right = sort(second);
        
        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right){
        int length = left.length + right.length;
        int[] result = new int[length];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<length; i++){
            if(index1 >= left.length){
                result[i] = right[index2];
                index2++;
                continue;
            }

            if(index2 >= right.length){
                result[i] = left[index1];
                index1++;
                continue;
            }

            if(left[index1] <= right[index2]){
                result[i] = left[index1];
                index1++;
            } else {
                result[i] = right[index2];
                index2++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7 };
        MergeSort ms = new MergeSort();
        int[] sortedArr = ms.sort(arr);
        System.out.println("[" + sortedArr[0]  + "," + sortedArr[1] + "," + sortedArr[2] + "," + sortedArr[3] + "," + sortedArr[4] + "," + sortedArr[5] + "]");
    }


    //  1 2 3 4 5 6 7 8 9
    //  1 2 3 4   5 6 7 8 9 
    //  1 2  3 4   5 6  7 8 9
    //  1  2  3  4   5 6   7  8 9
    //  1  2  3  4   5  6  7  8  9




}
