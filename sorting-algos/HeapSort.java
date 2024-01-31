//resource: https://www.youtube.com/watch?v=HqPJF2L5h9U&ab_channel=AbdulBari

import java.util.Arrays;
//heap: ordered binary tree
//max heap: parent nodes > child nodes
public class HeapSort {

    //other way of creating max heap from array is 0(nlogn)
    //Heapifys time complexity is 0(n) 
    public void maxHeapify(int[] arr, int heapSize){
        int len = heapSize;
        for(int i=len-1; i>=0; i--){
            //check for children
            boolean hasLeftChild = false;
            boolean hasRightChild = false;

            //may need to check for null
            if((2*i)+1<=len-1){
                hasLeftChild = true;
            }
            if((2*i)+2<=len-1){
                hasRightChild = true;
            }

            //need to follow changes all the way to the bottom, where there are no more children
            //if two children -> get maximum and compare to current node -> swap if neccessary
            int curr = i;

            while(true){
                if(hasLeftChild && hasRightChild){
                    int maxNodeIndex;
    
                    if(arr[(2*curr)+1] > arr[(2*curr)+2]){
                        maxNodeIndex = (2*curr)+1;
                    } else {
                        maxNodeIndex = (2*curr)+2;
                    }
    
                    if(arr[curr] < arr[maxNodeIndex]){
                        int temp = arr[curr];
                        arr[curr] = arr[maxNodeIndex];
                        arr[maxNodeIndex] = temp;

                        curr = maxNodeIndex;
                    } else {
                        break;
                    }
                } else if (hasLeftChild){
                    if(arr[curr] < arr[(2*curr)+1]){
                        int temp = arr[curr];
                        arr[curr] = arr[(2*curr)+1];
                        arr[(2*curr)+1] = temp;

                        curr = (2*curr)+1;
                    } else {
                        break;
                    }

                } else if (hasRightChild){
                    if(arr[curr] < arr[(2*curr)+2]){
                        int temp = arr[curr];
                        arr[curr] = arr[(2*curr)+2];
                        arr[(2*curr)+2] = temp;

                        curr = (2*curr)+2;
                    } else{
                        break;
                    }

                } else {
                    //has no children
                    break;
                }

                //check the swapped childs children
                hasLeftChild = false;
                hasRightChild = false;

                if((2*curr)+1<=len-1){
                    hasLeftChild = true;
                }
                if((2*curr)+2<=len-1){
                    hasRightChild = true;
                }

            }
            
        }
    }

    public int[] sort (int[] arr){
        maxHeapify(arr, arr.length);

        int sizeOfHeap = arr.length;

        while(sizeOfHeap > 1){
            int temp = arr[0];
            //move last node to root
            arr[0] = arr[sizeOfHeap-1];
            //use empty space in array to store 'removed' node value
            arr[sizeOfHeap-1] = temp;

            //ensure max heap condition is still met
            sizeOfHeap--;
            maxHeapify(arr, sizeOfHeap);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 12, 40, 25, 18};
        HeapSort hs = new HeapSort();
        arr = hs.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //could make a heap implementation of a priority queue from what I learned from resource
}
