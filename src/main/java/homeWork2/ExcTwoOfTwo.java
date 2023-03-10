/* Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично. */

package homeWork2;

public class ExcTwoOfTwo {
    public static void main(String[] args) {
        System.out.println(theMethod()); //стартиращият метод, чрез който изпълняваме фунцията на друг метод
    }
    static int theMethod() { //метод който връща резултат
        int a = 56;
        int b = 64;
        return (a + b)/2;
    }
}
