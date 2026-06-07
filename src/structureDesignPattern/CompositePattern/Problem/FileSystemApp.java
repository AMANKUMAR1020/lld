package structureDesignPattern.CompositePattern.Problem;

public class FileSystemApp {

    public FileSystemApp(){
        System.out.println("This is FileSystemApp");
    }

    public static void execute() {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Folder folder = new Folder("Documents");

        folder.addFile(file1);
        folder.addFile(file2);

        folder.showDetails();
    }
}