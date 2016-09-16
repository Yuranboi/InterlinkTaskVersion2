package Mersedes;

import Cars.Car;

public class MersedesTruck extends Car {

    public MersedesTruck(String nameCar, int ageCar, int volumeEngine, int consumFuel) {
        super(nameCar, ageCar, volumeEngine, consumFuel);
    }

    @Override
    public int calcMoneyCustom() {     // считаем таможенный сбор по формуле возраст машины * 1000 + обьем двигалея *3 + расход бензина * 2, потом всю сумму умножаем на 27
        int customsDuty = (super.getAgeCar()*1000+super.getVolumeEngine()*3+super.getConsumFuel()*2)*27;
        return customsDuty;
    }
}
