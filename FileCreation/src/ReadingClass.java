import java.io.*;

public class ReadingClass {
    public static void main(String[] args) {

        try {
            FileReader fileName = new FileReader("/home/ctp/Demo/fName.txt");
            FileReader lfileName = new FileReader("/home/ctp/Demo/lName.txt");

            BufferedReader bfName = new BufferedReader(fileName);
            BufferedReader blName = new BufferedReader(lfileName);

            String fname = bfName.readLine();
            String lname = blName.readLine();
            String full_Name = fname+" "+lname;

            File fullName = new File("/home/ctp/Demo/FullName.txt");
            boolean flag =  fullName.createNewFile();

            PrintWriter writeFullName = new PrintWriter("/home/ctp/Demo/FullName.txt");
            writeFullName.println(full_Name);
            writeFullName.close();

            FileReader readFullName = new FileReader("/home/ctp/Demo/FullName.txt");
            BufferedReader bFullName = new BufferedReader(readFullName);

            System.out.println(bFullName.readLine());

            bfName.close();
            blName.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
