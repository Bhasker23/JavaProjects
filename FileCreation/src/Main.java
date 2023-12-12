import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/ctp/Demo/fName.txt");
        File lFile = new File("/home/ctp/Demo/lName.txt");

        try {
            if (file.createNewFile() && lFile.createNewFile()){
                System.out.println("file created " + file.getPath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}