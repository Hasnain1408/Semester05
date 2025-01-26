class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private int borrowingLimit;
    private String openingHours;

    private LibraryConfigManager() {
        // Default settings
        lateFee = 0.50;
        borrowingLimit = 5;
        openingHours = "9 AM - 6 PM";
    }

    public static LibraryConfigManager getInstance() {
        if (instance == null) {
            instance = new LibraryConfigManager();
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}