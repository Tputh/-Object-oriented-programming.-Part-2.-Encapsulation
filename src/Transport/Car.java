package Transport;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean rubber;
    private Key key;



    public void changeOfRubber(int month) {
        if (month >= 4 && month < 10) {
            setRubber(true);
        }else {
            setRubber(false);
        }

    }



    public  Car(String brand, String model, double engineVolume, String color, int year, String country,
                String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean rubber,
                boolean keylessEngineStart, boolean keylessAccess) {

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
        setKey(keylessEngineStart, keylessAccess);

    }



    public Car() {
        this("default ", "default", 1.5, "Белый", 2000, "default" ,
                "default", "default", "default", 5,
                Boolean.parseBoolean("default"), false, false);

    }
    class Key {
        private final boolean keylessEngineStart;
        private final boolean keylessAccess;


        public Key(boolean keylessEngineStart, boolean keylessAccess) {
            this.keylessEngineStart = keylessEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isKeylessEngineStart() {
            return keylessEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }



        @Override
        public String toString() {
            return "Key{" +
                    "keylessEngineStart=" + keylessEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public boolean isRubber() {
        return rubber;
    }


    public void setRubber(boolean rubber) {
        this.rubber = rubber;

    }

    public void setKey(boolean keylessEngineStart, boolean keylessAccess) {
        this.key = new Key(keylessEngineStart, keylessAccess);
    }





    @Override
    public String toString() {

        return "Автомобиль " + brand + model + "," + " Год выпуска " + year + "," + " Страна изготовитель " + country +
                ", " + color + " цвета" + ", " + "Объём двигателя " + engineVolume + " л, " +
                "Коробка передач " + transmission + "," + "Тип кузова " + bodyType + "," + "Регистрационный номер " +
                registrationNumber + "," + "Количество мест " + numberOfSeats + "," + "Резина " + rubber + "," +
                "key = " + key ;
    }


}
