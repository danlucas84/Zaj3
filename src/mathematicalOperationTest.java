public class mathematicalOperationTest {

    public static void main(String[] args) {

        mathematicalOperation mathOp = new mathematicalOperation();


        int num = 3;
        double r = 4;
        int p = 5;

        boolean NumResult = mathOp.isEven(3);
        System.out.println("liczba jest parzysta: " + NumResult);

        double circleFieldResult = mathOp.circleField(4);
        System.out.println("pole okregu wynosi: " +circleFieldResult);

        int powerResult = mathOp.power(5);
        System.out.println("Wynik potegowania to: " + powerResult);

    }
}
