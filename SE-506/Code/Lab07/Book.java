// Book
class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean isRestricted;

    public Book(String title, String author, boolean isRestricted) {
        this.title = title;
        this.author = author;
        this.isRestricted = isRestricted;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + (isRestricted ? " (Restricted)" : "");
    }

    @Override
    public void borrowItem(User user) {
        System.out.println("Book '" + title + "' borrowed by " + user.getName());
    }

    public boolean isRestricted() {
        return isRestricted;
    }
}


