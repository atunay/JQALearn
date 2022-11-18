public class JustContinuie {
    public static void main(String[] Args) {
        int i = 1;
        for (i = 1; i <= 100; i++) { //определям границите на цикъла
            if (i < 54 || i > 74) { //определям условието при което да се изпълни командата
                System.out.println(i); //извиквам на екран
            }
        }
    }
}
