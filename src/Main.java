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
        float AllBoxWeight = BoxOneWeight + BoxTwoWeight;
        System.out.println("Общий вес боксеров = " + AllBoxWeight + " кг " );

        float DifferenceBoxWeight = BoxOneWeight - BoxTwoWeight;
        System.out.println("Разница между весами боксеров = " + DifferenceBoxWeight + " кг ");

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






    }
}