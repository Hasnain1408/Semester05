public class ImageProxy implements Image {
    private final String filename;
    private HighResolutionImage highResolutionImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(filename); 
        }
        highResolutionImage.display();
    }
}
