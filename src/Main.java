import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Домашнее задание 1
        // Задача 1
        // Person max = new Person();
        // max.name = "Максим";
        // max.yearOfBirth = 1988;
        //max.town = "Минск";
        //System.out.println("Привет! Меня зовут " + max.name + "." + " Я из города " + max.town + "." + " Я родился в " + max.yearOfBirth + " году. Будем знакомы!");
        //Person anya = new Person();
        //anya.name = "Аня";
        //anya.yearOfBirth = 1993;
        //anya.town = "Москва";
        //System.out.println("Привет! Меня зовут " + anya.name + "." + " Я из города " + anya.town + "." + " Я родился в " + anya.yearOfBirth + " году. Будем знакомы!");
        //Person katya = new Person();
        //katya.name = "Kaтя";
        //katya.yearOfBirth = 1992;
        //katya.town = "Калининград";
        //System.out.println("Привет! Меня зовут " + katya.name + "." + " Я из города " + katya.town + "." + " Я родился в " + katya.yearOfBirth + " году. Будем знакомы!");
        //Person artem = new Person();
        //artem.name = "Артём";
        //artem.yearOfBirth = 1995;
        //artem.town = "Москва";
        //System.out.println("Привет! Меня зовут " + artem.name + "." + " Я из города " + artem.town + "." + " Я родился в " + artem.yearOfBirth + " году. Будем знакомы!");

        // Задача 2
        //max.jobTitle = "бренд-менеджер";
        //anya.jobTitle = "методист образовательных программ";
        //katya.jobTitle = "продакт-менеджер";
        //artem.jobTitle = "директор по развитию бизнеса";
        //System.out.println("Привет! Меня зовут " + max.name + "." + " Я из города " + max.town + "." + " Я родился в " + max.yearOfBirth + " году. Я работаю на должности " + max.jobTitle + ". Будем знакомы!");
        //System.out.println("Привет! Меня зовут " + anya.name + "." + " Я из города " + anya.town + "." + " Я родился в " + anya.yearOfBirth + " году. Я работаю на должности " + anya.jobTitle + ". Будем знакомы!");
        //System.out.println("Привет! Меня зовут " + katya.name + "." + " Я из города " + katya.town + "." + " Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.jobTitle + ". Будем знакомы!");
        //System.out.println("Привет! Меня зовут " + artem.name + "." + " Я из города " + artem.town + "." + " Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.jobTitle + ". Будем знакомы!");

        // Задача 3
        //Car granta = new Car();
        // granta.brand = "Lada";
        //granta.model = "Granta";
        //granta.engineVolume = 1.7;
        //granta.colour = "жёлтый";
        //granta.country = "Россия";
        //granta.year = 2015;
        //System.out.println(granta.brand + " " + granta.model + ", объём двигателя - " + granta.engineVolume + " литра, год выпуска - " + granta.year + ", цвет - " + granta.colour + ", страна - " + granta.country + ".");

        //Car audi = new Car();
        //audi.brand = "Audi";
        //audi.model = "A8 50 L TDI quattro";
        // audi.engineVolume = 3.0;
        // audi.colour = "чёрный";
        // audi.country = "Германия";
        //audi.year = 2020;
        //System.out.println(audi.brand + " " + audi.model + ", объём двигателя - " + audi.engineVolume + " литра, год выпуска - " + audi.year + ", цвет - " + audi.colour + ", страна - " + audi.country + ".");

        //Car bmw = new Car();
        // bmw.brand = "BMW";
        // bmw.model = "Z8";
        //  bmw.engineVolume = 3.0;
        //  bmw.colour = "чёрный";
        // bmw.country = "Германия";
        // bmw.year = 2021;
        //System.out.println(bmw.brand + " " + bmw.model + ", объём двигателя - " + bmw.engineVolume + " литра, год выпуска - " + bmw.year + ", цвет - " + bmw.colour + ", страна - " + bmw.country + ".");

        //Car kia = new Car();
        // kia.brand = "KIA";
        // kia.model = "Sportage 4-го поколения";
        // kia.engineVolume = 2.4;
        // kia.colour = "красный";
        //kia.country = "Южная Корея";
        //kia.year = 2018;
        //System.out.println(kia.brand + " " + kia.model + ", объём двигателя - " + kia.engineVolume + " литра, год выпуска - " + kia.year + ", цвет - " + kia.colour + ", страна - " + kia.country + ".");

        //Car hyundai = new Car();
        //hyundai.brand = "Hyundai";
        //hyundai.model = "Avante";
        //hyundai.engineVolume = 1.6;
        //hyundai.colour = "оранжевый";
        //hyundai.country = "Южная Корея";
        // hyundai.year = 2016;
        // System.out.println(hyundai.brand + " " + hyundai.model + ", объём двигателя - " + hyundai.engineVolume + " литра, год выпуска - " + hyundai.year + ", цвет - " + hyundai.colour + ", страна - " + hyundai.country + ".");


        // Домашнее задание 2
        // Задача 1
        Person max1 = new Person(1988, "Максим", "Минск", "бренд-менеджер");
        Person anya1 = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        Person katya1 = new Person(1992, "Катя", "Калининград", "продакт-менеджер");
        Person artem1 = new Person(1995, "Артём", "Москва", "директор по развитию бизнеса");
        Person vladimir = new Person(2001, "Владимир", "Казань", null);

        // Задача 2

        Car granta1 = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "F234HJ679", true, null, null, 0, null, null);
        Car audi1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия", null, false, null, null, 0, null, null );
        Car bmw1 = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия", null, true, null, null, 0, null, null );
        Car kia1 = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", null, true, null, null, 0, null, null  );
        Car hyundai1 = new Car(null, "Avante", 0, null, 2016, "Южная Корея", null, true, null, null, 0, null, null );

        audi1.setGears("автомат");
        bmw1.setSummerTyres(false);
        granta1.setRegNumber("F234JK87M");

        if(!granta1.isCorrectRegNumber()){
            granta1.setRegNumber("incorrect");
        }
        new Car.Key();
        new Car.Insurance();


        audi1.setRegNumber(null);
        printInfo2(granta1);
        printInfo2(audi1);
        printInfo2(bmw1);
        printInfo2(kia1);
        printInfo2(hyundai1);

        printInfo(max1);
        printInfo(anya1);
        printInfo(katya1);
        printInfo(artem1);
        printInfo(vladimir);

        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower peony = new Flower(null, "Англия", 69.9);
        peony.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Турция",19.5);
        gypsophila.lifeSpan = 10;

        printInfo1(rose);
        printInfo1(chrysanthemum);
        printInfo1(peony);
        printInfo1(gypsophila);

        printCostOfBouquet(
                rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        );

    }

    private static void printInfo(Person person) {
        System.out.println("Привет! Меня зовут " + person.name + "." + " Я из города " + person.getTown() + "." + " Я родился в " + person.getYearOfBirth() + " году. Я работаю на должности " + person.jobTitle + ". Будем знакомы!");
    }
    private static void printInfo1(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColour() + "," + " страна: " + flower.getCountry() + "," + " цена 1 штуки " + flower.getCost() + ", срок: " + flower.lifeSpan + ".");
    }

    private static void printCostOfBouquet (Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for(Flower flower: flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo1(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }
    private static void printInfo2 (Car car) {
        System.out.println(car.getBrand()+ " " + car.getModel() + ", объём двигателя - " + car.getEngineVolume() + " литра, год выпуска - " + car.getYear() + ", цвет - " + car.getColour() + ", страна - " + car.getCountry() + ", тип кузова - " + car.getTypeOfBody() + ", рег. номер - " + car.getRegNumber() + ", количество мест - " + car.getSeatsCount() + ", летние шины - " + car.isSummerTyres() + ", привод - " + car.getGears() + (car.getKey().isWithoutKeyAccess()?"бесключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteRunEngine()? "удалённый запуск" : "обычный запуск") + ", номер страховки: " + car.getInsurance().getNumber() + ", стоимость страховки: " +
                car.getInsurance().getCost() + ", срок страховки: " + car.getInsurance(). getExpireDate() + ".");

    }
}
