class LibraryItemFactory {
    public static LibraryItem createItem(String type, String title, String detail, boolean isRestricted) {
        switch (type.toLowerCase()) {
            case "book":
                return new Book(title, detail, isRestricted);
            case "magazine":
                return new Magazine(title, detail, isRestricted);
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }
}