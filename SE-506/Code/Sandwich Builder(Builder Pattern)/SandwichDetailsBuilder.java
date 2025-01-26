public class SandwichDetailsBuilder implements Builder{

    private String bread;
    private String filling;
    private String spread;

    @Override
    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public void setSpread(String spread) {
        this.spread = spread;
    }

   
    public SandwichDetails getResult() {
        return new SandwichDetails(bread, filling, spread);
    }
    
}
