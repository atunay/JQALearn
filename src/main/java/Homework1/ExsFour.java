package Homework1;/*Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
с плаваща запетая), дали е почивен ден – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:
- ако не е почивен ден ще работя
- ако имам пари и е почивен ден ще отида на кино
- ако нямам – ще стоя вкъщи и ще гледам телевизия
- ако е почивен ден
- ако имам по-малко от 10 лв ще отида за сладолед */

import java.util.Scanner; //импортивам четец от библиотеката

public class ExsFour {
    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in); //във входа на системата нов клас четец
        System.out.print("Insert the hours: "); //извиквам на екран подканящи съобщения за променливи от рализчен тип
        int workingHours = see.nextInt(); //декларирам типа на променливата
        System.out.print("Insert the sum: ");
        float sum = see.nextFloat();
        System.out.print("Enter for weekend is true or false: ");
        boolean weekend = see.nextBoolean();
        if (!weekend) { //със условни оператаори правя проверка на логиката. Булиново условие за дните.
            System.out.println("I will work with passion.");
        } else {
            if (sum <= 0) { //със вложени цикли на пронливи влизам във буленовото условие на логиката. Правя проверки.
                System.out.println("I will stay at home and watch tv."); //спрямо резултата извиквам на екран текст.
            }
            if (sum >= 10) {
                System.out.println("I will go to the cinema.");
            }
            if (sum > 0 && sum < 10) {
                System.out.println("I will byu an ice cream");
            }
        }
    }
}
