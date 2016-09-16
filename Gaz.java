package Pikap;

import Mersedes.MersedesTruck;

public class Gaz extends MersedesTruck implements PassengerCar, Truck {

    boolean seatsYesOrNot;   // переменная есть или нету пассажирские места
    boolean trailerYesOrNot;    // переменная есть или нету прицепа

    public Gaz(String nameCar, int ageCar, int volumeEngime, int consumFuel) {
        super(nameCar, ageCar, volumeEngime, consumFuel);
    }


    @Override
    public void trailerAvaliable(boolean trailerAvaliable) {
        this.trailerYesOrNot = trailerAvaliable;
    }   // вводим переменную есть или нету прицепа

    @Override
    public int capacity() {                // если нету прицепа выводим "нету", иначе считаем по формуле
                                            // возвраст машины / 2 + расход бензына * 6 + обьем двигателя *3
       if (this.trailerYesOrNot == false) {
           return 0;
       } else {
           int cargo = super.getAgeCar()/2 + super.getConsumFuel()*6 + super.getVolumeEngine()*3;
           return cargo;
       }

    }

    @Override
    public void seatsAvaliable(boolean seatsAvaliable) {           // вводим перемнную есть или нету пассажирских мест
        this.seatsYesOrNot = seatsAvaliable;

    }


    @Override
    public int numberPassengers() {    // если нету пассажирских мест выводим "нету", иначе считаем по формуле
                                        // возвраст машины / 2 + расход бензына * 2 + обьем двигателя *3
        if (this.seatsYesOrNot == false) {
            return 0;
        } else  {
            int seats = super.getAgeCar()/2 + super.getConsumFuel()*2 + super.getVolumeEngine()*3;
            return seats;
        }

    }


}
