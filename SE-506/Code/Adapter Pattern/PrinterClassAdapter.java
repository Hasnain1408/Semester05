public class PrinterClassAdapter extends LegacyPrinter implements Printer{
    public void printDocument(String document){
        oldPrintMethod(document);
        }
    
}
