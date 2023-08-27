public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1");
        int intValue = 127127;
        byte byteValue = 127;
        short shortValue = 31212;
        long longValue = 9999999999L;
        float floatValue = 3.14f;
        double doubleValue = 3.1415926535;
        System.out.println("Значение переменной intValue с типом int равно "+intValue);
        System.out.println("Значение переменной byteValue с типом byte равно "+byteValue);
        System.out.println("Значение переменной shortValue с типом short равно "+shortValue);
        System.out.println("Значение переменной longValue с типом long равно "+longValue);
        System.out.println("Значение переменной floatValue с типом float равно "+floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно "+doubleValue);

        //Задача 2

        System.out.println("Задача 2");
        float fValue = 27.12f;
        long lValue = 987678965549L;
        double dValue = 2.786;
        short sValue = 569;
        int iValue = -159;
        char cValue = 27897; //symbol 泹 ASCII
        byte bValue = 67;
        System.out.println("============================================");

        //Задача 3

        System.out.println("Задача 3");
        byte studentLudP = 23;
        byte studentAnnS = 27;
        byte studentEkA = 30;
        short paperTotal = 480;

        int paperPerStudent = paperTotal / (studentAnnS+studentEkA+studentLudP);
        System.out.println("На каждого ученика расчитано "+paperPerStudent+" листов бумаги");

        //Задача 4

        System.out.println("Задача 4");
        byte bottlePerTwoMin = 16;
        int bottlePerMin = bottlePerTwoMin/2;

        int bottlePer20min = bottlePerMin * 20;
        int bottlePerOneDay = bottlePerMin * 60 * 24;
        int bottlePerThreeDays = bottlePerOneDay * 3;
        int bottlePerOneMonth = bottlePerOneDay * 30;
        System.out.println("За 20 минут машина произвела "+bottlePer20min+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottlePerOneDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottlePerThreeDays+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+bottlePerOneMonth+" штук бутылок");

        //Задача 5

        System.out.println("Задача 5");
        byte totalCanOfPaint = 120;
        byte whiteCans = 2;
        byte brownCans = 4;

        int totalClasroom = totalCanOfPaint/(whiteCans+brownCans);
        int totalWhitePaint = totalClasroom * whiteCans;
        int totalBrownPaint = totalClasroom * brownCans;
        System.out.println("В школе, где "+totalClasroom+
                " классов, нужно "+totalWhitePaint+
                " банок белой краски и "+totalBrownPaint+
                " банок коричневой краски");

        //Задача 6

        System.out.println("Задача 6");
        byte massBanana = 80;
        byte massMilk = 105;
        byte massIce = 100;
        byte massEgg = 70;

        byte quantBanana = 5;
        byte quantMilk = 2;
        byte quantIce = 2;
        byte quantEgg = 4;

        int massQuantBanana = massBanana * quantBanana;
        int massQuantMilk = massMilk * quantMilk;
        int massQuantIce = massIce * quantIce;
        int massQuantEgg = massEgg * quantEgg;

        int massTotalGramm = massQuantBanana +
                massQuantEgg +
                massQuantIce +
                massQuantMilk;
        float massTotalKg = (float)massTotalGramm / 1000;
        System.out.println("Масса завтрака в граммах равна "+massTotalGramm+" гр.");
        System.out.println("Масса завтрака в килограммах равна "+massTotalKg+" кг.");

        //Задача 7

        System.out.println("Задача 7");
        byte needOut = 7;
        int needOutGramm = needOut * 1000;
        short badRes = 250;
        short goodRes = 500;

        int badResDay = needOutGramm / badRes;
        int goodResDay = needOutGramm / goodRes;
        int averageDays = (badResDay + goodResDay)/2;
        System.out.println("Если спортсмен будет терять по "+
                badRes+" гр. каждый день , то сброс "+needOut+
                "кг. веса займет "+badResDay+" дней.");
        System.out.println("Если спортсмен будет терять по "+
                goodRes+" гр. каждый день , то сброс "+needOut+
                "кг. веса займет "+goodResDay+" дней.");
        System.out.println("В среднем чтобы сбросить "+needOut+
                " кг. веса может потребоваться "+averageDays+" дней/день.");

        //Задача 8

        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double ratio = 1.1;

        double newSalaryMasha = salaryMasha * ratio;
        double newSalaryDenis = salaryDenis * ratio;
        double newSalaryKristina = salaryKristina * ratio;

        double differSalaryMasha = newSalaryMasha - salaryMasha;
        double differSalaryDenis = newSalaryDenis - salaryDenis;
        double differSalaryKristina = newSalaryKristina - salaryKristina;

        double difYearSalaryMasha = differSalaryMasha * 12;
        double difYearSalaryDenis = differSalaryDenis * 12;
        double difYearSalaryKristina = differSalaryKristina * 12;

        System.out.println("Маша теперь получает "+newSalaryMasha+
                " рублей. Годовой доход вырос на "+difYearSalaryMasha+
                " рублей.");
        System.out.println("Денис теперь получает "+newSalaryDenis+
                " рублей. Годовой доход вырос на "+difYearSalaryDenis+
                " рублей.");
        System.out.println("Кристина теперь получает "+newSalaryKristina+
                " рублей. Годовой доход вырос на "+difYearSalaryKristina+
                " рублей.");


    }
}