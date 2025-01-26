import java.util.HashMap;
import java.util.Map;

class PrinterFactory {

    private static volatile PrinterFactory instance;
    private  PrinterFactory(){
        
    }

    public static PrinterFactory getInstance() {
      if (instance == null) {
        synchronized (PrinterFactory.class) {
          if (instance == null) {
            instance = new PrinterFactory();
          }
        }
      }
  
      return instance;
    }
    // int id = 0;
    // private int  generateID(){
    //     return id++;
    // }
    public Printer createPrinter(String department) {
        return new Printer(deptName);
    }


    private static Map<String, Printer> printerRegistry = new HashMap<>();

        public static Printer getPrinter(String department) {
            if (!printerRegistry.containsKey(department)) {
                printerRegistry.put(department, new Printer(department));
            }
            return printerRegistry.get(department);
        }
    
}
