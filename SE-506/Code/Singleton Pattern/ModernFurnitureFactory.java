
class ModernFurnitureFactory implements FurnitureFactory {

    private static volatile ModernFurnitureFactory instance;
    private  ModernFurnitureFactory(){
        
    }

    public static ModernFurnitureFactory getInstance() {
      if (instance == null) {
        synchronized (ModernFurnitureFactory.class) {
          if (instance == null) {
            instance = new ModernFurnitureFactory();
          }
        }
      }
  
      return instance;
    }
    int id = 0;
    private int  generateID(){
        return id++;
    }
    public Chair createChair() {
        return new VictorianChair(generateID());
    }
    public Table createTable() {
        return new VictorianTable(generateID());
    }
    public Sofa createSofa() {
        return new VictorianSofa(generateID());
    }
}
