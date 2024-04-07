import java.util.Scanner;

public class method2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива (целое число): ");
        byte n = in.nextByte();
        int[] array = new int[n];
        System.out.print("Сгенерированный массив: ");
        elemsArrayDefault(array);
        printArrayDefault(array);
        starString();
        System.out.print("Минимальный элемент массива под индексом: ");
        System.out.println(getMinIndex(array));
        System.out.print("Максимальный элемент массива под индексом: ");
        System.out.print(getMaxIndex(array));
        starString();
        Barter(array);
        System.out.print("Изменённый массив: ");
        printArrayDefault(array);
        System.out.print("\nРазность между максимальным и минимальным значением массива: ");
        System.out.print(getDiffMaxMin(array));
        starString();
        System.out.print("Отсортированный массив: ");
        arrayBubbleSorter(array);
        printArrayDefault(array);
        System.out.println("Конец программы!");
    }
    static void elemsArrayDefault(int[] array) {
        int min = 0; int max = 200;
        for (int i = 0; i<array.length; i++) {
            int elem = (int) (Math.random() * (max - min) + min);
            array[i] = elem;
        }
    }
    static void printArrayDefault (int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(i!=array.length-1? array[i] + ", ": array[i] + ".");
    }
    static void starString() {
        System.out.print("\n*********************\n");
    }
    static int getMaxIndex(int[] array) {
        int indexMax = 0; int max = 0;
        for (int j = 0; j<array.length; j++)
            if (array[j]>max) {
                max = array[j];
                indexMax = j;
            }
        return indexMax;
    }
    static int getMinIndex(int[] array) {
        int indexMin = 0; int min = 200;
        for (int k = 0; k<array.length; k++)
            if (array[k]<min) {
                min = array[k];
                indexMin = k;
            }
        return indexMin;
    }
    static int getMax(int[] array) {
        int max = 0;
        for (int i : array)
            if (i > max)
                max = i;
        return max;
    }
    static int getMin(int[] array) {
        int min = 200;
        for (int i : array)
            if (i < min)
                min = i;
        return min;
    }
    static int getDiffMaxMin(int[] array) {
        return (getMax(array) - getMin(array));
    }
    static void Barter(int[] array) {
        int i_max; int i_min; int num0;
        i_max = getMaxIndex(array); i_min = getMinIndex(array);
        num0 = array[i_max];
        array[i_max] = array[i_min];
        array[i_min] = num0;
    }
    static void toSwap(int[] array, int n1, int n2) { // меняем местами
        int i0 = array[n1];
        array[n1] = array[n2];
        array[n2] = i0;
    }
    static void arrayBubbleSorter(int[] array) { // МЕТОД ОТ МЕНЬШЕГО К БОЛЬШЕМУ
        for (int i = array.length-1; i>=1; i--)// внешний цикл
            for (int j = 0; j < i; j++)   // внутренний цикл
                if (array[j] > array[j + 1]) // проверка элементов
                    toSwap(array, j, j+1);
    }
}