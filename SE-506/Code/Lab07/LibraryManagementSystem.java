public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create users
        User admin = new User("Admin", true);
        User regularUser = new User("John", false);

        // Create library items using the factory
        LibraryItem book = LibraryItemFactory.createItem("book", "Design Patterns", "Erich Gamma", true);
        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "National Geographic", "2023-10", false);

        // Access items through the proxy
        LibraryAccess bookAccess = new LibraryAccessProxy(book);
        LibraryAccess magazineAccess = new LibraryAccessProxy(magazine);

        // Admin accesses restricted book
        bookAccess.accessItem("B001", admin);

        // Regular user tries to access restricted book
        bookAccess.accessItem("B001", regularUser);

        // Regular user accesses unrestricted magazine
        magazineAccess.accessItem("M001", regularUser);

        // Access library configuration
        LibraryConfigManager config = LibraryConfigManager.getInstance();
        System.out.println("Library Opening Hours: " + config.getOpeningHours());
        System.out.println("Late Fee: $" + config.getLateFee());
        System.out.println("Borrowing Limit: " + config.getBorrowingLimit() + " items");
    }
}