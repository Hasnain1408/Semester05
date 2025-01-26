class Printer {
    private String department;

   
    private Printer(String department) {
        this.department = department;
        System.out.println("Printer created for department: " + department);
    }

    public void printDocument(String document) {
        System.out.println("Printing document '" + document + "' from department: " + department);
    }
}