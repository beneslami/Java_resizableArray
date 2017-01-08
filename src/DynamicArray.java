import java.util.Arrays;

/**
 * Created by ben on 1/8/17.
 */
public class DynamicArray {

    private int [] elementData;
    private final int DEFAULT_SIZE = 0;
    private static int size;

    public DynamicArray(int capacity){
        if(capacity == 0)
            elementData = new int[DEFAULT_SIZE];
        else if(capacity > 1)
            elementData = new int[capacity];
    }

    public boolean isEmpty(){
        return (arraySize() == 0);
    }

    public int arraySize(){
        return elementData.length;
    }

    public void growSize(){
        elementData = Arrays.copyOf(elementData,arraySize()+1);
    }

    public void add(int item){
        growSize();
        elementData[arraySize()-1] = item;
    }

    public void show(){
        for(int i=0;i<arraySize();i++)
            System.out.printf("%3d ",elementData[i]);
        System.out.println("| size:"+arraySize());
    }

    public void remove(int item){
        if(arraySize() == 0) {
            System.out.println("there is no element in the array!");
            return ;
        }
        int [] temp = new int[arraySize() -1];
        int j=0;
        for(int i=0;i<elementData.length;i++){
            if(elementData[i] != item){
                temp[j++] = elementData[i];
            }
            else{
                continue;
            }
        }
        elementData = temp;
    }
}
