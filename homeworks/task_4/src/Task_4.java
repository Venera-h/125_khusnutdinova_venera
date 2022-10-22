import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int massiv[] = new int[size];
        massiv[0] = a0;
        for (int i = 1; i< size; i++){
            massiv[i] = massiv[i-1] + d;}
        return  massiv;
        }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int massiv[] = new int[size];
        int sum =2;
        for (int i = 0; i< size; i++){
           if (i>=2){
               massiv[i]=sum;
               sum += sum;}
           else{
               massiv[i]=1;
           }
    }
        return massiv;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int fib[] = new int[size];
        for (int i =0; i< size; i++){
            //0 1 1 2 3 5 8
            if (i == 0){
                fib[i]=0;}
            if (i == 1 || i == 2){
                fib[i]=1;}
            if (i >=3){
                fib[i]= fib[i-1]+fib[i-2];}
        }
        return fib;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max = Integer.MIN_VALUE;
        for (int i =0; i< data.length; i++){
            if (data[i]>max) {
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max = Integer.MIN_VALUE;
        for (int i =0; i< data.length; i++){
            if ((data[i]>max) && (data[i]%k==0)){
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        int arr3[]= new int[arr1.length + arr2.length];
        int d1 = arr1.length;
        int d2 = arr2.length;
        int i=0, j=0, k=0;
        while (i< d1 && j<d2){
            if (arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;}
            else{
                arr3[k]= arr2[j];
                j++;}
            k++;
            }
        while (i<d1){
            arr3[k]= arr1[i];
            i++;
            k++;}
        while (j<d2){
            arr3[k]= arr2[j];
            j++;
            k++;}
        Arrays.sort(arr3);
        return arr3;
        }



    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        int arr3[]= new int[arr1.length + arr2.length];
        int d1 = arr1.length;
        int d2 = arr2.length;
        int i=0, j=0, k=0;
        while (i< d1 && j<d2){
            if (arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;}
            else{
                arr3[k]= arr2[j];
                j++;}
            k++;
        }
        while (i<d1){
            arr3[k]= arr1[i];
            i++;
            k++;}
        while (j<d2){
            arr3[k]= arr2[j];
            j++;
            k++;}
        Arrays.sort(arr3);
        return arr3;
    }
    }
