package pro.sky.q1.lesson02;

public class homeWork02 {
    public homeWork02() {
    }
    public static void main(String[] args) {
        byte a = 115;
        short b = 32570;
        int c = 949461;
        long d = 88491313L;
        float e = 3.5F;
        double f = 55.55D;
        char g = 158;
        System.out.println("byte " + a);
        System.out.println("short " + b);
        System.out.println("int " + c);
        System.out.println("long " + d);
        System.out.println("float " + e);
        System.out.println("double " + f);
        System.out.println("char " + g);
        int apples = 10;
        boolean isApples = apples >= 10;
        System.out.println(isApples);
        float boxxer1 = 78.2F;
        float boxxer2 = 82.7F;
        float allBoxxers = boxxer1 + boxxer2;
        System.out.println("Вес обоих боксёров " + allBoxxers + " кг!");
        allBoxxers = boxxer2 % boxxer1;
        System.out.println("Разница в весе " + allBoxxers + " кг!");
        int bananas = 80;
        int milk = 105;
        int iceCreamSundae = 100;
        int rawEggs = 70;
        System.out.println("Банан " + bananas + " грамм");
        System.out.println("Молоко " + milk + " грамм");
        System.out.println("Мороженное пломбир " + iceCreamSundae + " грамм");
        System.out.println("Сырое яйцо " + rawEggs + " грамм");
        int breakfast = bananas * 5 + milk * 2 + iceCreamSundae * 2 + rawEggs * 4;
        System.out.println("Вес завтрака равен " + breakfast + " грамм");
        float breakfastWeightInKilograms = (float)breakfast * 0.001F;
        System.out.println("Вес завтрака " + breakfastWeightInKilograms + " кг");
        System.out.println("Вес боксёра " + boxxer1 + " кг");
        int loseWeightOn = 7;
        System.out.println("Боксёру надо похудеть на " + loseWeightOn + " кг");
        float resetsInDay = 0.25F;
        float resetsInDay1 = 0.5F;
        System.out.println("1) В день худеет на " + resetsInDay + " кг");
        System.out.println("2) В день худеет на " + resetsInDay1 + " кг");
        System.out.println("1) Боксёр похудеет на " + loseWeightOn + " кг за " + (float)loseWeightOn / resetsInDay + " дней");
        System.out.println("2) Боксёр похудеет на " + loseWeightOn + " кг за " + (float)loseWeightOn / resetsInDay1 + " дней");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        System.out.println("Маша получает " + masha + " рублей в месяц. Годовой доход " + masha * 12 + " рублей ");
        System.out.println("Денис получает " + denis + " рублей в месяц. Годовой доход " + denis * 12 + " рублей ");
        System.out.println("Кристина получает " + kristina + " рублей в месяц. Годовой доход " + kristina * 12 + " рублей ");
        float masha1 = (float)masha * 0.1F;
        float masha2 = (float)masha + masha1;
        System.out.println("После повышения зарплата Маши " + masha2 + " рублей в месяц. Годовой доход " + masha2 * 12.0F + " рублей");
        System.out.println("Разница годового дохода Маши после повышения = " + (masha2 * 12.0F - (float)(masha * 12)) + " рублей");
        float denis1 = (float)denis * 0.1F;
        float denis2 = (float)denis + denis1;
        System.out.println("После повышения зарплата Дениса " + denis2 + " рублей в месяц. Годовой доход " + denis2 * 12.0F + " рублей");
        System.out.println("Разница годового дохода Дениса после повышения = " + (denis2 * 12.0F - (float)(denis * 12)) + " рублей");
        float kristina1 = (float)kristina * 0.1F;
        float kristina2 = kristina1 + (float)kristina;
        System.out.println("После повышения зарплата Кристины " + kristina2 + " рублей в месяц. Годовой доход " + kristina2 * 12.0F + " рублей");
        System.out.println("Разница годового дохода Кристины после повышения = " + (kristina2 * 12.0F - (float)(kristina * 12)) + " рублей");
    }
}