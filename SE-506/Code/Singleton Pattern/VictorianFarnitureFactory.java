
class VictorianFurnitureFactory implements FurnitureFactory {

    private static volatile VictorianFurnitureFactory instance;

    public static VictorianFurnitureFactory getInstance() {
      if (instance == null) {
        synchronized (VictorianFurnitureFactory.class) {
          if (instance == null) {
            instance = new VictorianFurnitureFactory();
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
