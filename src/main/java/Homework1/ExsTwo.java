/*Въведете 4 различни числа от конзолата и разменте стойността им две по две.
Нека числата бъдат от различен тип (int и duoble). Разпечатайте новите им стойности.
Направете кастване (casting) конвертиране на числата веднъж от int to double и после от double to int
и след всяко конвертиране изведете сумата им
 */
package Homework1;

import java.util.Scanner; //извиквам четеца като готов клас от библиотеката

public class ExsTwo {//public class

    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in); //създавам нов четец във входа на системата
        System.out.print("Insert the value1: "); //подканям да се въжда число
        int val1 = see.nextInt(); //създавам променлива, която приема стойността въвдена от клавиатурата
        System.out.print("Insert the value2: ");
        int val2 = see.nextInt();
        System.out.print("Insert the value3: ");
        double val3 = see.nextDouble();
        System.out.print("Insert the value4: ");
        double val4 = see.nextDouble();
        System.out.println("before swap value1: " + val1); //извиквам на екран текст и стойност
        System.out.println("before swap value2: " + val2);
        System.out.println("before swap value3: " + val3);
        System.out.println("before swap value4: " + val4);
        int z1 = val1 + val2; //сумирам отделнилните променливи по тип и стойност
        double z2 = val3 + val4;
        System.out.println("The sum of val1/val2 is: " + z1); //извиквам резултата на екран
        System.out.println("The sum of val3/val4 is: " + z2);
        int temp = val1; //създавам временна променлива, която приема стойност от същестуваща променлива
        val1 = (int) val3; //разменям стойностите на променливите по тип им
        val3 = temp;
        double temp2 = val4;
        val4 = val2;
        val2 = (int) temp2;
        System.out.println("after swap value1: " + val1); //извиквам на екран стойностите след размяната
        System.out.println("after swap value2: " + val2);
        System.out.println("after swap value3: " + val3);
        System.out.println("after swap value4: " + val4);
        int z3 = val1 + val2; //сумирам след размяната
        double z4 = val3 + val4;
        System.out.println("The sum after swap is: " + z3); //извиквам на екран сумата след промяната
        System.out.println("The sum after swap is: " + z4);
    }
}
