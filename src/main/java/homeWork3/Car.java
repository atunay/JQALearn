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
метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на двете коли
 */

package homeWork3;
public class Car {

     int year;
     float price;
     boolean isSportCar;
     int fuelTankCapacity;
     double freeFuel;
     String engineFuelOperationSystem;
     void changeЕngineFuelOperationSystem (String NewEngineFuelOperationSystem) {

         this.engineFuelOperationSystem = NewEngineFuelOperationSystem;
         //System.out.println(engineFuelOperationSystem);
     }
     void useFuel (double fuel){
         //freeFuel -= fuel;
         if (fuel > freeFuel) {
             System.out.println("Not enough free fuel!");
         } else {
            System.out.println("The fuel is: " + (freeFuel -= fuel));
         }
  }

}
