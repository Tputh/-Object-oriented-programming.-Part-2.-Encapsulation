import Transport.Car;

import javax.sql.rowset.CachedRowSet;

public class Main {
        public static void main(String[] args) {
                System.out.println("Дз. Объектно-ориентированное программирование. Часть 2. Инкапсуляция");
                System.out.println(

                );
                System.out.println("машины которых у меня ни когда не было)  :");



                Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Жёлтого", 2015,
                        "Россия", "Механическая", "Седан",
                        "А 777 АА", 5, true,true,true);
                System.out.println(ladaGranta);
                System.out.println("=================================================================================");
                System.out.println();

                Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Чёрного",
                        2020, "Deutschland", " Автомат", "Седан",
                        "А 777 АА", 5, false,true,true);
                System.out.println(audi);

                System.out.println("=================================================================================");
                System.out.println();

                Car bmw = new Car("BMW ", "Z8", 3.0, "Чёрного", 2021,
                        "Deutschland", " Автомат", "Седан", "А 777 АА",
                        5, true,true,true);
                System.out.println(bmw);
                System.out.println("=================================================================================");
                System.out.println();

                Car kia = new Car("Kia ", "Sportage 4-го поколения", 2.4, "Красный",
                        2018, "Южная Корея"," Автомат", "Кросовер",
                        "А 777 АА", 5, true,true,true);
                System.out.println(kia);
                System.out.println("=================================================================================");
                System.out.println();

                Car hyundai =new Car("Hyundai ", "Avante", 1.6, "Оранжевый", 2016,
                        "Южная Корея"," Автомат", "Седан", "А 777 АА",
                        5, true,true,true);
                System.out.println(hyundai);
                System.out.println("=================================================================================");
                System.out.println();

        }

}



