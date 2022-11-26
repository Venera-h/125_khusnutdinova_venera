package task;

public class DoubleLinkedListSorter {
    public static <T extends Comparable<T>> void sort(DoubleLinkedList<T> list) {//принимаем список
//        int i = 0;
//        int j = 0;// perebiraem herez 2 spicka
        for (int i  = 0; i< list.getSize();++i){
            DoubleLinkedListItem data = list.getLast();
            DoubleLinkedListItem worker = list.getLast();
            for (int j=0;j< list.getSize()-i;++j ){
                if(worker.getData().compareTo(data.getData()) > 0){
                    data = worker;
                }
                worker = worker.getPrev();
            }
            list.remove(data);
            list.insertBefore(list.getFirst(), (T)data.getData());//

//                if ()
//        if (list.getSize() == 0) {
//            return;
//        }
//        int i = 0;//sort>0
//        //int foundChange = 1;
//        while(i>n) {
//            foundChange = 0;
//            var worker = list.getFirst();
//            for (i = 0; i < list.getSize() - 1; i++) {
//                if (worker.getData() > worker.getNext().getData()) {
//                    var data = worker.getData();
//                    worker.setData(worker.getNext().getData());
//                    worker.getNext().setData(data);
//                    foundChange = 1;
//                }
//                worker = worker.getNext();
//            }
//            ++i;
        }
    }
}