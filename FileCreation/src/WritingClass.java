import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingClass {

    public static void main(String[] args) {

        try {
            PrintWriter fName = new PrintWriter("/home/ctp/Demo/fName.txt");
            PrintWriter lName = new PrintWriter("/home/ctp/Demo/lName.txt");

            fName.println("Bhasker");
            lName.println("Shrimali");

            fName.close();
            lName.close();

            System.out.println("Names written in file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
