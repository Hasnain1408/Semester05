import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String deptName;

        while(true)
        {
            deptName = scanner.nextLine();
            
            if(deptName.equals("exit")) break;
            PrinterFactory printerFactor = PrinterFactory.getInstance();
            Printer hrPrinter = PrinterFactory.getPrinter("HR");
            hrPrinter.printDocument("HR Policy Document");
        }
    }
}
