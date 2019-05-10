public class printerTest {
    public static void main(String[] args) {

        Printer printerInfo = new Printer("bialy",45.0,22.3,0.5,"Brother",true);
        System.out.println("Paramentry drukarki to :");
        System.out.println("Color drukarki to: " + printerInfo.color);
        System.out.println("Marka drukarki to: " + printerInfo.name);
        System.out.println("Dlugosc drukarki to: " + printerInfo.length);
        System.out.println("Szerokosc drukarki to: " + printerInfo.width);
        System.out.println("Czy drukuje w kolorze: " + printerInfo.isPrintingInColor);




    }
}
