/*Създайте клас Car, който представя кола.
Класът да има следните полета:

year – числова стойност показваща година на производство на
колата
price – числова стойност (не е задължително да е цяло число) показваща
цената на колата
isSportCar – булева стойност – дали колата е спортна или не
fuelTankCapacity – числова стойност за размера на резервоара
freeFuel – числова стойност показваща наличното свободно гориво
engineFuelOperationSystem – текстово поле за вида гориво,което използва автомобила

Класът да дефинира следните методи:
-метод void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem), който сменя
стойността на полето engineFuelOperationSystem със стойността подадена като параметър.
-метод void useFuel(double fuel), който намалява свободното гориво
(freeFuel) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от наличното гориво, извеждa
съобщение "Not enough free fuel!"

Да се създаде клас CarPerson, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Car.

Да се зададат стойности на всеки от колите за year, price,
fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна. На едната от колата да е заделено 35 литра гориво (чрез
метода useFuel), а на другия, да се смени горивната система (чрез
метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на двете коли*/

package homeWork3;


public class CarPerson {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.price = 1000;
        car1.year = 2021;
        car1.isSportCar = true;
        car1.fuelTankCapacity = 50;
        car1.engineFuelOperationSystem = "Diesel";
        car1.freeFuel = 35;

        car1.useFuel(30);
        car1.changeЕngineFuelOperationSystem("Hybrid");

        System.out.println("price: " + car1.price + " year: " + car1.year + " Sports car: " + car1.isSportCar +
                " Tank capacity: " + car1.fuelTankCapacity + " Operation system: " + car1.engineFuelOperationSystem +
                " Free fuel: " + car1.freeFuel);


        Car car2 = new Car();
        car2.price = 1500;
        car2.isSportCar = false;
        car2.fuelTankCapacity = 60;
        car2.engineFuelOperationSystem = "Diesel";
        car2.freeFuel = 10.5;

        car2.useFuel(20);

        System.out.println("price: " + car2.price + " year: " + car2.year + " Sports car: " + car2.isSportCar +
                " Tank capacity: " + car2.fuelTankCapacity + " Operation system: " + car2.engineFuelOperationSystem +
                " Free fuel: " + car2.freeFuel);
    }

}
