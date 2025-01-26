
class RusticFurnitureFactory implements FurnitureFactory {

    private static volatile RusticFurnitureFactory instance;

    public static RusticFurnitureFactory getInstance() {
      if (instance == null) {
        synchronized (RusticFurnitureFactory.class) {
          if (instance == null) {
            instance = new RusticFurnitureFactory();
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
