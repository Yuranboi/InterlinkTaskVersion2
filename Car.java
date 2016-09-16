package Cars;

public abstract class Car {

    String nameCar;             // название машины
    private int ageCar;         // возраст машины
    private int volumeEngine;   // объем двигателя
    private int consumFuel;     // расход бензина

    public Car(String nameCar, int ageCar, int volumeEngine, int consumFuel) {

        if (nameCar.matches("^[a-zA-Z0-9]+$"))
            this.nameCar = nameCar;
        else
            throw new IllegalArgumentException("Неправильное название машины");

        if (ageCar >= 0) {
            this.ageCar = ageCar;
        }   else {
            throw new IllegalArgumentException("Неправильный возраст машины!!!");
        }


        if ((volumeEngine>0) && (volumeEngine<20)) {
            this.volumeEngine = volumeEngine;
        } else {
            throw new IllegalArgumentException("Объем двигателя должен быть больше 0 и меньше 20!!!");

        }

        if ((consumFuel>0) && (consumFuel<volumeEngine)) {
            this.consumFuel = consumFuel;
        } else {
            throw new IllegalArgumentException("Расход бензина должен быть больше 0 и меньше объема двигаеля!!!");

        }

    }

    public int getAgeCar() {
        return ageCar;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }


    public int getConsumFuel() {
        return consumFuel;
    }

    public String getNameCar() {
        return nameCar;
    }

    public abstract int calcMoneyCustom(); // метод расчета таможенного сбора на машину

}
