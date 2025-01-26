import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching for keyword '" + keyword + "' in folder: " + name);
        for (FileSystemComponent component : children) {
            component.search(keyword);
        }
    }
}