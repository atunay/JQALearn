/*Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3} да се състави програма, която проверява дали масивите
са еднакви*/


package homeWork2;

import java.util.Arrays;

public class ExcSixOfTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}; //инициализираме масивите
        int[] arr2 = {1, 2, 3};
        if (Arrays.equals(arr1, arr2)) { //Поставяме условие за еднаквост на стойностите.
            System.out.println("The values are the same: "); //показваме на екран
        }
            else {
            System.out.println("The values are different: ");
        }

    }
}
