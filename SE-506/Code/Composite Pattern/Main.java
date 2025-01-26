public class Main {
    public static void main(String[] args) {
        // Create files
        FileSystemComponent file1 = new File("Document.txt", "This is a sample document.");
        FileSystemComponent file2 = new File("Image.jpg", "This is an image file.");
        FileSystemComponent file3 = new File("Report.pdf", "The report contains important data.");

        // Create folders
        Folder rootFolder = new Folder("Root");
        Folder documentsFolder = new Folder("Documents");
        Folder imagesFolder = new Folder("Images");

        // Add files to folders
        documentsFolder.addComponent(file1);
        documentsFolder.addComponent(file3);
        imagesFolder.addComponent(file2);

        // Add folders to the root folder
        rootFolder.addComponent(documentsFolder);
        rootFolder.addComponent(imagesFolder);

        // Search for a keyword
        rootFolder.search("important");
        rootFolder.search("sample");
    }
}