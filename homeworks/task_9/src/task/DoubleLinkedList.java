package task;

public class DoubleLinkedList<T extends Comparable<T>> {
    private DoubleLinkedListItem<T> first;
    private DoubleLinkedListItem<T> last;
    private int size;

    public DoubleLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

//    findFirstItem    - возвращает первый элемент с указанным значением


    public DoubleLinkedListItem<T> findFirstItem(T value) {
        if (size==0){
            return null;
        }
        var algoritm = first;
        if ()

    }
//     findLastItem     - возвращает первый элемент с указанным значением

    public DoubleLinkedListItem<T>  findLastItem(T value) {
        if (size==0){
            return null;
        }
    }

//      insertAfter      - размещает элемент с указанным ЗНАЧЕНИЕМ после заданного.


    public int getSize() {
        return size;
    }
    public DoubleLinkedListItem<T> getFirst() {
        return first;
    }
    public DoubleLinkedListItem<T> getLast() {
        return last;
    }
}
