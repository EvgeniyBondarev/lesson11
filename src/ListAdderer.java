import java.util.ArrayList;
import java.util.LinkedList;

public class ListAdderer<T> {
    public ArrayList<T> addArrayList(T element){
        ArrayList<T> arrayList = new ArrayList<>(500000);
        for (int i = 0; i < 500000; i++)
            arrayList.add(element);
        return arrayList;
    }
    public LinkedList<T> addLinkedList(T element){
        LinkedList<T> linkedList = new LinkedList<>();
        for (int i =0; i < 500000; i++)
            linkedList.add(element);
        return linkedList;
    }
}
