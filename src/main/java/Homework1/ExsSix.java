/*Да се въведе число от клавиатурата от 1 до 7
и да се изведе съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение
 */
package Homework1;

import java.util.Scanner; //четец от клас от библиотеката

public class ExsSix {
    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in); //четец на входа на системата
        System.out.print("Enter the number from one to seven: "); //текс за пояснение
        int day = see.nextInt(); //променлива, чиято сойност ще бъде въведена
        switch (day) { // определям условията при които се прави проверката
            case 1:
                System.out.print("Monday");
                break; //команда за спиране на скрипта при вярно условие
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default: //при въведена стойност различна от очкваната да изпише грешка
                System.out.print("Error");
        /*switch (day) { //подобрена версия
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");*/


        }
    }
}
