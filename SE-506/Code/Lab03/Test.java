
public class OfficePrinterManagement {
    public static void main(String[] args) {
        PrinterFactory printerFactor = PrinterFactory.getInstance();
        Printer hrPrinter = PrinterFactory.getPrinter("HR");
        hrPrinter.printDocument("HR Policy Document");

        // Fetch or create printer for IT department
        Printer itPrinter = Printer.PrinterFactory.getPrinter("IT");
        itPrinter.printDocument("IT Project Plan");

        // Reuse printer for HR department
        Printer hrPrinterAgain = Printer.PrinterFactory.getPrinter("HR");
        hrPrinterAgain.printDocument("HR Employee Handbook");

        // Verify that the same printer instance is reused
        System.out.println(hrPrinter == hrPrinterAgain);  // Output: true
    }
}
