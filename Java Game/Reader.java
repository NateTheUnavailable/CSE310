import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(string[] args) throws FileNotFoundException{
        File file = new File("Game Story\\story.txt");
        Scanner scan = new Scanner(file);

        System.out.println(scan.nextLine());
    }
}
