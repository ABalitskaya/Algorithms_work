package Feb1;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{7, -2, 4, 1, 6, 5, 0, -4, 2};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    private static int[] quickSort(int[] arr, int startIdx, int endIdx) {
        // if array has only one element - return array
        // else
        // choose checkPoint
        // make partition around it
        // recursive calls for left and right

        if(startIdx >= endIdx) { // проверка, не 1 ли элемент в массиве
            return arr;
        } else {
            int idx = partition(arr, startIdx, endIdx); //
            quickSort(arr, startIdx, idx-1);
            quickSort(arr, idx+1, endIdx);
        } return  arr;

        }

    // quick sort example
    // arr =  [7, -2, 4, 1, 6, 5, 0, -4, 2]  /
    // arr =  [-2, 1, 0,-4, 2, 7, 4, 6, 5] (partition does it and returns 4)]    /
    // arr =  [-4, -2, 1 ,0, 2, 7, 4, 6, 5] ( after recursive call of left arrays
    // arr =  [-4, -2, 1 ,0, 2, 4, 5, 7, 6] ( after recursive call of right arrays_
    // elements -4, 2, 5


    //returns the index of pivot (опорный эл.)
    private static int partition(int[] arr, int startIdx, int endIdx) {
        //Выбирает опорный элемент
        // Возвращает индекс pivot
        int pivot = arr[endIdx]; //опорный элемент - последний
        int indexPivot = startIdx; // предполагаем, что нет элементов меньше, чем опорный

        for (int i = startIdx; i < endIdx; i++) { // идем циклом по всем элементам между начальным и конечным (start and end)
            if(arr[i] <= pivot) { //если элемент меньше опорного
                int temp = arr[i]; // меняем местами индекса i и текущешл опорного индекса
                arr[i] = arr[indexPivot];
                arr[indexPivot] = temp; // выделяем место для индекса, который оказался меньше опорного элемента
                indexPivot++; //увеличиваем счетчик

        }
        }

        int temp = arr[endIdx]; // меняем местами индекс опорного элемента и endIdx
        arr[endIdx] = arr[indexPivot];
        arr[indexPivot] = temp;

        return indexPivot;
    }

    // quick sort example
    // arr[7,-2,4,1,6,5,0,-4,2]
    // arr = [-2,1,0,-4,2,7,4,6,5] (partition does it)

    // выбрать опорный элемент
    // разбивка на два подмассива
    // рекурсивный вызов
}
