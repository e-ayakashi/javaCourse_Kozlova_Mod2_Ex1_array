import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
        int maxElement = array[0];
        int sumElement = 0;

        System.out.println("1) Выводит (через пробел) те элементы массива, которые являются чётными числами");
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println ("\n2) Выводит все двузначные числа массива");
        for (int i=0; i < array.length; i++) {
            if (array[i] / 10 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println ("\n3) Выводит наибольшее целое число этого массива");
        for (int i=0; i < array.length; i++) {

            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println(maxElement);
        System.out.println ("4) Считает сумму элементов массива и выводит её на экран");
        for (int i=0; i < array.length; i++) {
            sumElement = sumElement + array[i];
        }
        System.out.println(sumElement);
        System.out.println ("5) Переворачивает массив в обратном порядке");
        for (int i = array.length; i>0 ; i--) {
          System.out.print(array[i-1] + " ");
        }

    }
}
