/* Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.*/

package homeWork2;

public class ExcOneOfTwo {
    public static void main(String[] args) {
        theMethod(); //в основният метод извкваме фунциите на друг метод и така изпълняваме скрипта
    }
    static void theMethod () { //метод със блок от код, в който се изпълнява функцията
        int a = 13;
        int b = 13;
        System.out.println(a + b);
    }
}
