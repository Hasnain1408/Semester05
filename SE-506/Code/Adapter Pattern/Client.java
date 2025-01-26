public class Client {
    public static void main(String[] args) {
        
        // Printer modernPrinter = new ModernPrinter();
        // modernPrinter.printDocument("Modern Document");

        //Object Adapter
        Printer adapter = new PrinterAdapter(new LegacyPrinter());
        adapter.printDocument("Legacy Document");

        //Class Adapter
        Printer adapter2 = new PrinterClassAdapter();
        adapter2.printDocument("Legacy Document via PrinterClassAdapter");


    }
}

