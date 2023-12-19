import java.util.ArrayList;


//linked list implementation

//arraylist implementation
public class MyStack<T>{

    private ArrayList<T> arr = new ArrayList<T>();
    
    public void push(T item){
        arr.add(item);
    }

    public T pop(){
        T item = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);

        return item;
    }

    public T peek(){
        return arr.get(arr.size() - 1);
    }

    public int size(){
        return arr.size();
    }

    public boolean isEmpty(){
        return arr.isEmpty();
    }

}