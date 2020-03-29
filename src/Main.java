import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Civil plan = new Civil(1000,700, 2200, "Boing", 12, 30);
        Military airplan = new Military(1500,950, 1200, "UFO", 12, 3);
        Passenger auto = new Passenger(300,210, 900, "BMW", 4,
                9,"hatchback", 5);
        Freight truk = new Freight(600,190, 2300, "VOLVO", 10,
                9, 20);
        System.out.println(plan);
        System.out.println(airplan);
        System.out.println(auto);
        System.out.println(truk);
        System.out.println();
        //ЛЕГКОВОЙ ТРАНСПОРТ
        // Использование метода getDeclareMethod() чтобы получить доступ к приватному методу
        Method m = Passenger.class.getDeclaredMethod("fuelCount");
        // Использование метода setAccessible(), без проверки доступности
        m.setAccessible(true);
        System.out.print("Enter the time: ");
        auto.timeDistance();
        System.out.print("In " + auto.getTime() + " hours the " + auto.getModel() + " moving at max speed "
                + auto.getSpeed() + " km and will travel ");
        auto.getDistance();
        System.out.print(" and use up " + m.invoke(auto) + " liters of fuel");
        // Использование метода invoke(), использование приватного метода с параметрами внутри метода Method
        System.out.println();
        System.out.println();
        //ГРУЗОВОЙ
        System.out.print("Enter the weight of cargo: ");
        truk.Cargo();
        truk.Shipment();
        System.out.println();
        System.out.println();
        //ГРАЖДАНСКИЙ САМОЛЕТ
        System.out.print("Enter the quantity of passengers: ");
        plan.pasCount();
        plan.count_of_passengers();
        System.out.println();
        System.out.println();
        //ВОЕННЫЙ САМОЛЕТ
        System.out.print ("The quantity of rocket is " + airplan.getQuantity_rocket());
        System.out.println();
        airplan.Short();
        airplan.Bailout();

    }
}
