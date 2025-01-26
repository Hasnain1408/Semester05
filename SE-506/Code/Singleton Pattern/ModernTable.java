
class ModernTable implements Table {
    public ModernTable(int id){
        System.out.println("Creating  a ModernTable with ID : "+ id);
    }

    @Override
    public void putOn() {
        System.out.println("Putting on a Modern table.");
    }
}

