
/*
        Създайте клас **Computer** със следните полета от тип:
        int year,
        double price,
        String operationSystem

        Класът Computer да има следния конструктор:
        - констуктор с параметри **Computer(int year, double price, String operationSystem)**, който да инициализира всички полета със стойностите
        подадени му като аргументи. С помоща на ключовата дума **THIS**

        В същия клас създайте метод **int comparePrice(Computer compare)**, който сравнява цените на 2 компютъра и връща стойност **(използвайте return)**.
        Ако цената на първия компютър (този, за който се вика метода) е по-висока от тази на компютъра подаден като аргумент, метода връща -1.
        Ако цената на компютъра подаден като аргумент (втория компютър) е по-високата, се връща 1, а ако са равни, метода връща стойност 0

        Стойностите/цените на двата компътъра да бъдат изнесени в отделен **клас ComputerPrices с main метод**.
        Цената на първия компютър да бъде декларирана с помоща на обект от клас **Computer**,
        а цената на втория компютър да бъде извлечена с подаване на стойности в конструктора на клас Computer - **Computer(int year, double price, String operationSystem)**
*/

        package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }
    int comparePrice(int x, double y, String z){
        x = 1988;
        y = 2000.50;
        z = "IBM";
        if (y>price)
        return 1;
        if (y<price)
            return -1;
        else
            return 0;
    }
}