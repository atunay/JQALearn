/*Да се състави масив със следните стойности {10 12 1 8 4}. След създаването на масива да се копират стойностите в нов масив

 */

package Homework2;

public class ExcFiveOfTwo {
    public static void main(String[] args) {
        theMethod(); //извиквам метода в който ми е кода
    }
    static void theMethod () {
        int [] arr1 = {10, 12, 1, 8, 4}; //създавам масив от определен тип
        int [] arr2; //създавам вотри масив със същата дължина като първия
        arr2 = arr1; //копирам стойностите във новосъздаденият
        int i; //променлива брояч
        System.out.println("The values of arr2: ");
        for (i=0; i<arr2.length; i++) { //обхождам масива и извличам инфо за броя на променливите и техните стойности.
            System.out.println(arr2[i]);
        }
        System.out.print("The number of the variables in arr2 = " + i);
    }
}
