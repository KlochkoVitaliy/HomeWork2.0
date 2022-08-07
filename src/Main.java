public class Main {
    public static void main(String[] args) {
// Задание 1

        //var a =1;
        byte b = 2;
        int c = 3;
        long d = 4L;
        short f = 5;

        float e = 5.2f;
        double g = 3.1;

// Задание 2

        float BoxOneWeight = 78.2f;
        float BoxTwoWeight = 82.7f;
        float AllBoxWeight  = BoxOneWeight + BoxTwoWeight;

        System.out.println("Общий вес боксеров = " + AllBoxWeight + " кг " );

        float  DifferenceBoxWeight = BoxOneWeight - BoxTwoWeight;
        System.out.println("Разница между весами боксеров = " + Math.abs (DifferenceBoxWeight )+ " кг ");

 // Задание 3

        int Banana = 5;
        int WeightBanana = 80;
        int Milk = 200;
        int WeightMilk = 105*2;
        int IceCreamPlom = 2;
        int IceCreamWeight = 100;
        int Egg = 4;
        int EggWeight = 70;

        int AllWeight =(Banana * WeightBanana) + (Milk * WeightMilk/200) + (IceCreamPlom * IceCreamWeight) + (Egg *EggWeight );
        System.out.println("Общий вес коктейля = " + AllWeight + " грамм ");
        float  KGAllWeight = AllWeight / 1000f;
        System.out.println("Общий вес коктейля = " + KGAllWeight + " кг ");

// Задание 4

        int BoxWeightOutKG = 7;
        int Weight250OutGRAMM = 250;
        int DayWeightOut250 = (BoxWeightOutKG * 1000) / Weight250OutGRAMM;
        System.out.println("Потеря веса в 250 грамм в день за = " + DayWeightOut250 + " дней ");

        int Weight500OutGRAMM = 500;
        int DayWeightOut500 = (BoxWeightOutKG * 1000) / Weight500OutGRAMM;
        System.out.println("Потеря веса в 500 грамм в день за = " + DayWeightOut500 + " дней ");

        int OnAverageDay = (DayWeightOut250 + DayWeightOut500)/2;
        System.out.println("Дней в среднем = " + OnAverageDay + " дней ");

// Задание 5
        int Maria = 67760;
        int Denis = 83690;
        int Kris = 76230;

        double Maria10 = (Maria *0.1) + Maria;     // при int  теряет (округляет) 6 на конце значения
        double Denis10 = (Denis*0.1)+Denis;
        double Kris10 = (Kris*0.1)+Kris;

        //System.out.println("Мария получает на 10% больше = " + Maria10);
        //System.out.println("Денис получает на 10% больше = " + Denis10);
        //System.out.println("Кристина получает на 10% больше = " + Kris10);

        double Maria365 = Maria10 * 12;
        //System.out.println("Мария за год ПОСЛЕ увеличения получает -  " + Maria365);
        double Denis365 = Denis10 * 12;
        //System.out.println("Денис за год ПОСЛЕ увеличения получает -  " + Denis365);
        double Kris365 = Kris10 * 12;
        //System.out.println("Кристина за год ПОСЛЕ увеличения получает -  " + Kris365);

        //до увеличения

        int DoMaria365 = Maria * 12;
        //System.out.println("Мария за год  ДО увеличения получает -  " + DoMaria365);
        int DoDenis365 = Denis * 12;
        //System.out.println("Денис за год  ДО увеличенияЯ получает -  " + DoDenis365);
        int DoKris365 = Kris * 12;
        //System.out.println("Кристина за год  ДО увеличения получает -  " + DoKris365);

        //Разница

        double RazMaria = Maria365 - DoMaria365;
        double RazDenis = Denis365 - DoDenis365;
        double RazKris = Kris365 - DoKris365;
        //System.out.println("Raznica -  " + RazMaria);

        System.out.println("Маша теперь получает " + Maria10 + " рублей. Годовой доход вырос на " + RazMaria );
        System.out.println("Денис теперь получает " + Denis10 + " рублей. Годовой доход вырос на " + RazDenis );
        System.out.println("Кристина теперь получает " + Kris10 + " рублей. Годовой доход вырос на " + RazKris );












    }
}