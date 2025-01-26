public class SandwichDetails{
    private String bread;
    private String filling;
    private String spread;

    public SandwichDetails(String bread, String filling, String spread) {
        this.bread = bread;
        this.filling = filling;
        this.spread = spread;
    }
    public String result() {
        return "Sandwich with " + bread + " bread, " + filling + " filling, and " + spread + " spread.";
    }
    
}
