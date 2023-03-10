/*Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати

 */

package homeWork2;

//import java.util.Arrays; при вариант две!

public class ExcThreeOfTwoExtended {
    public static void main(String[] args) {
        double [] arr = new double[5]; //декларирам масива
        arr [0] = 1.1; //инициализирам масива
        arr [1] = 1.2;
        arr [2] = 1.3;
        arr [3] = 1.4;
        arr [4] = 1.5;
        int i; //декларирам променлива, която да запазва броя на променливите в масива
        //System.out.println(Arrays.toString(arr)); при вариант две!
        for (i = 0; i < arr.length; i++) //обхождам елементите в масива
            System.out.println(arr[i]); //принтирам стойностите на екран
    }
}
