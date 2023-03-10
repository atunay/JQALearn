/*Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати*/

package homeWork2;

public class ExcThreeOfTwo {
    public static void main(String[] args) {
        double[] arr = {2.3, 3.2, 4.3, 7.34, 233.01}; //масив от данни със съответен тип
        int i;
        for (i=0; i < arr.length; i++) //обхождаме масива и извличаме стойностите в него
            System.out.println(arr[i]);
    }
}
