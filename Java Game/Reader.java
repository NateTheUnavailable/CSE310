import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void start() throws FileNotFoundException{
        String number = "";
        String D = System.getProperty("user.dir");
        File file = new File(D + "//Game Story//story.txt");
        File file2 = new File(D + "//Game Story//story2.txt");
        File file3 = new File(D + "//Game Story//story3.txt");
        File file4 = new File(D + "//Game Story//story4.txt");
        File file5 = new File(D + "//Game Story//story5.txt");
        File file6 = new File(D + "//Game Story//story6.txt");
        File file7 = new File(D + "//Game Story//story7.txt");
        File file8 = new File(D + "//Game Story//story8.txt");
        Scanner scan = new Scanner(file);
        Game reader = new Game();
        reader.story(number);
        if("A".equals(number)){
            scan = new Scanner(file);
        }
        if("B".equals(number)){
            scan = new Scanner(file);
        }
        if("C".equals(number)){
            scan = new Scanner(file);
        }
        if("D".equals(number)){
            scan = new Scanner(file);
        }
        if("E".equals(number)){
            scan = new Scanner(file);
        }
        if("F".equals(number)){
            scan = new Scanner(file);
        }
        if("G".equals(number)){
            scan = new Scanner(file);
        }
        if("H".equals(number)){
            scan = new Scanner(file);
        }
        else if("".equals(number)){
            scan = new Scanner(file);
        }
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }
}
