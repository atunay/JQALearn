/*Въведете 3 числа от клавиатурата ч1, ч2 и ч3.
Разменете стойностите им така, че ч1 да има стойността на ч2, ч2 да има стойността на ч3, а ч3 да има старатастойност на ч1.
Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3. Разпечатете стойностите на числата на етапи
 */
package homeWork1;

import java.util.Scanner;

public class ExsThree {

    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in); //създавам нов клас четец, поставям го във входа на системата
        System.out.print("Insert the X value: "); //подканващо съобщение
        int x = see.nextInt(); //декларирам типа на променливи
        System.out.print("Insert the Y value: ");
        int y = see.nextInt();
        System.out.print("Insert the Z value: ");
        int z = see.nextInt();
        z = x + y + z; //6 с математически действия завъртам стойностите
        y = z - (x + y); //3
        x = z - (x + y); //2
        z = z - (x + y); //1
        System.out.println("The new X value is: " + x); //показвам на екран новите стойности
        System.out.println("The new Y value is: " + y);
        System.out.println("The new Z value is: " + z);
        System.out.print("The difference is: " + ((x + y) - z)); //показвам разликата между сбора и едната променлива
    }
}
