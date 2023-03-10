/*Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата (тип int или double).
След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.
 */
package homeWork1;

import java.util.Scanner; //извикваме четеца от библиотеката

public class ExsOne {
    public static void main(String[] args) {
        Scanner see = new Scanner(System.in); //създаваме нов четец и го слагаме в началото на системата
        System.out.print("Insert a number: "); //даваме команда да изпише текст
        int num1 = see.nextInt();               //създавам променлива, която приема стойност от клавиатурата
        System.out.print("Insert a number: ");
        int num2 = see.nextInt();
        System.out.print("Insert a number: ");
        int num3 = see.nextInt();
        if (num1 < num3 && num3 < num2) //изпълянвам логическото условие за входните данни
        {
            System.out.print("The number of the beast!"); //ако услковието е вярно се изписва тескта
        } else {
            System.out.print("It's a mistake!"); //ако условието не е вярно се изписва текста (не е условие от задачата)
        }
    }

}
