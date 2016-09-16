package Mersedes;

import Cars.Car;

public class Mersedes extends Car  {


    public Mersedes(String nameCar, int ageCar, int volumeEngime, int consumFuel) {
        super(nameCar, ageCar, volumeEngime, consumFuel);
    }

    @Override
    public int calcMoneyCustom() { // считаем таможенный сбор по формуле возраст машины * 100 + обьем двигалея *2 + расход бензина / 2, потом всю сумму умножаем на 27
        int customsDuty = (super.getAgeCar()*100+super.getVolumeEngine()*2+super.getConsumFuel()/2)*27;
        return customsDuty;
    }
}
