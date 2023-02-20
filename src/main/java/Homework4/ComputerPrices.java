package Homework4;

public class ComputerPrices {

    public static void main(String[] args){
Computer comp1 = new Computer(2000, 2.5,"Linux");
Computer comp2 = new Computer();

/*comp1.comparePrice(comp2);
System.out.println();*/

        System.out.println(comp1.year);
        System.out.println(comp1.price);
        System.out.println(comp1.operationSystem);

        System.out.println(comp2.year);
        System.out.println(comp2.price);
        System.out.println(comp2.operationSystem);
    }
}
