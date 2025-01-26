// Magazine
class Magazine implements LibraryItem {
    private String title;
    private String issue;
    private boolean isRestricted;

    public Magazine(String title, String issue, boolean isRestricted) {
        this.title = title;
        this.issue = issue;
        this.isRestricted = isRestricted;
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + " (Issue: " + issue + ")" + (isRestricted ? " (Restricted)" : "");
    }

    @Override
    public void borrowItem(User user) {
        System.out.println("Magazine '" + title + "' borrowed by " + user.getName());
    }
}