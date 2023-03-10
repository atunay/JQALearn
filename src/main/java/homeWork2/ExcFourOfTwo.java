/*Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
1) с помоща на for loop
2) с помоща на while loop
Да се изведат елементите на екрана.*/

package homeWork2;

import java.util.stream.IntStream; //импортирам предефиниран клас

public class ExcFourOfTwo {
    public static void main(String[] args) {
        int [] arr = IntStream.rangeClosed(1, 10).toArray(); //създавам масив с поредни стойности
        int i = 0; //за While цикъла инициализирам индекс за начало на масива
        while (i<arr.length) { //създавам условието
            System.out.println(arr[i]); //извиквам на екрам стойностите
            i++; //инкрементирам с единица
        }
        for(i=0; i< arr.length;i++) { //поставям условие за масива
            System.out.println(arr[i]);//принтирам на екран стойностите
        }
    }
}
