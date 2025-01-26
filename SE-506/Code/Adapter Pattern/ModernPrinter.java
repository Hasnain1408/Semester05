public class ModernPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing with Modern Printer: " + document);
    }
}
