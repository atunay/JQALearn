package Homework1;

/*Да се изведат числата от 1 до 100 без числата от 54 до 74.
След извършените операции да се отпечатат получените резултати. (hint - continue)
 */
public class ExsSeven {
    public static void main(String[] Args) {
        int i = 1;
        for (; i <= 100; i++) { //определям границите на цикъла
            if (i < 54 || i > 74) { //определям условието при което да се изпълни командата
                System.out.println(i); //извиквам на екран
            }
        }
    }
}
