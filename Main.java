import Mersedes.*;
import Cars.Car;

import Pikap.Gaz;

public class Main {

    public static void main(String[] args) {

        Car mersedes = new Mersedes("Mers200", 5, 12, 10);

        System.out.println("Название машины - " + mersedes.getNameCar() + " таможеный сбор = " + mersedes.calcMoneyCustom() + " грн!!!");

        boolean n = mersedes instanceof Car;

        Gaz gaz = new Gaz("Gaz", 10, 19, 13);
        gaz.seatsAvaliable(true);
        gaz.trailerAvaliable(false);
        System.out.println("Марка машины - " + gaz.getNameCar() + " количество посадочных мест : " + gaz.numberPassengers() + ", грузоподъемность : " + gaz.capacity() + " кг");


        System.out.println(n);

        boolean n2 = gaz instanceof Car;
        System.out.println(n2);



    }
}
