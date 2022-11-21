package Homework1;/*Да се изведат числата от 1 до 100 във възходящ и в низходящ ред
и да се отпечатат получените резултати с помоща на for цикъл
 */

public class ExsFive {
    public static void main(String[] Args) {
        int i; //променливи целочислен тип
        int t;
        for (i = 1; i <= 100; i++) { //определям границите на цикъла
            System.out.println(i); //извеждам на екран
        }
        for (t = 100; t >= 1; t--) {
            System.out.println(t);
        }
    }
}