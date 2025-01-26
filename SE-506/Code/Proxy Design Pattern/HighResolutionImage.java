public class HighResolutionImage implements Image {
    private final String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();  
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image from disk: " + filename);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

  
    public void display() {
        System.out.println("Displaying high-resolution image: " + filename);
    }
}
