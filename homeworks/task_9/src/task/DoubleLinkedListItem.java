package task;

public class DoubleLinkedListItem<T extends Comparable<T>> {
    private DoubleLinkedListItem<T> prev;//предыдущий
    private DoubleLinkedListItem<T> next;//следующий
    private T data;

    public DoubleLinkedListItem(T data) {
        prev = null;
        next = null;
        this.data=data;
    }

    public DoubleLinkedListItem<T> getNext() {
        return next;
    }

    public DoubleLinkedListItem<T> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }

    public void setNext(DoubleLinkedListItem<T> next) {
        this.next = next;
    }

    public void setPrev(DoubleLinkedListItem<T> prev) {
        this.prev = prev;
    }

    public void setData( T data) {
        this.data = data;
    }

}

