package task;

public class DoubleLinkedList<T extends Comparable<T>> {
    private DoubleLinkedListItem<T> first;//первый
    private DoubleLinkedListItem<T> last;//предыдущий
    private int size;// размер списка

    public DoubleLinkedList() {
        first = last = null;
        //last = null;
        size = 0;
    }

//    findFirstItem    - возвращает первый элемент с указанным значением


    public DoubleLinkedListItem<T> findFirstItem(T value) {
        if (size == 0) {
            return null;
        }
        var worker = first;// мы не знаем из каких значний будет состоять список
        while (worker != null && !worker.getData().equals(value)) {
            worker = worker.getNext();
        }
        return worker;// name brought from test
    }
   //     findLastItem     - возвращает первый элемент с указанным значением

    public DoubleLinkedListItem<T>  findLastItem(T value) {
        if (size==0){
            return null;
        }
        var worker = last;
        while (worker != null &&!worker.getData().equals(value)) {
            worker = worker.getPrev();
        }
        return worker;
    }

//      insertAfter      - размещает элемент с указанным ЗНАЧЕНИЕМ после заданного.
    public void  insertAfter(DoubleLinkedListItem<T> listItem, T data) {// элемент + значение
        if (size == 0) {
            first = last = new DoubleLinkedListItem<>(data);
         //   last = new DoubleLinkedListItem<>(data);// взяла из программы теста
            size ++;
            return;
        }
        var item = new DoubleLinkedListItem<>(data);//element our list
        if (listItem == null) {
            item.setNext(first);
            first.setPrev(item);
            first = item;
        } else if (listItem == last) {
            last.setNext(item);
            item.setPrev(last);
            last = item;
        } else { //this element between first and last
            item.setPrev(listItem);
            item.setNext(listItem.getNext());
            listItem.getNext().setPrev(item);
            listItem.setNext(item);
        }
        size ++    ; }
    //insertBefore     - размещает элемент с указанным ЗНАЧЕНИЕМ перед заданным
    public void  insertBefore(DoubleLinkedListItem<T> listItem, T data) {// элемент + значение
        if (size == 0) {
            first = last = new DoubleLinkedListItem<>(data);
            //last = new DoubleLinkedListItem<>(data);// взяла из программы теста
            size += 1;// we add new element, so +1
            return;
        }
        var item = new DoubleLinkedListItem<>(data);//element our list
        if (listItem == null) {
            last.setNext(item);
            item.setPrev(last);
            last = item;
        } else if (listItem == first) {
            item.setNext(first);
            first.setPrev(item);
            first = item;
        } else { //this element between first and last
            item.setNext(listItem);
            item.setPrev(listItem.getPrev());
            listItem.getPrev().setNext(item);
            listItem.setPrev(item);
        }
        size ++;
    }

    public void remove(DoubleLinkedListItem<T> item){
        if (size==1){// если наш список состоит только из одной позиции, то вренет nothing
            first = last = null;
        }
        else if (item == first){
            item.getNext().setPrev(null);
            first = item.getNext();
        }
        else if (item == last){
            item.getPrev().setNext(null);
            last = item.getPrev();
        }
        else{
            item.getNext().setPrev(item.getPrev());
            item.getPrev().setNext(item.getNext());
        }
        size --;
    }

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
