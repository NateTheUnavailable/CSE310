import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void start() throws FileNotFoundException{
        String number;
        String D = System.getProperty("user.dir");
        File file = new File(D + "//Game Story//story.txt");
        Game reader = new Game();
        reader.story(number);
        if("A".equals(number)){
            file = new File(D + "//Game Story//story.txt");
        }
        if("B".equals(number)){
            file = new File(D + "//Game Story//story2.txt");
        }
        if("C".equals(number)){
            file = new File(D + "//Game Story//story3.txt");
        }
        if("D".equals(number)){
            file = new File(D + "//Game Story//story4.txt");
        }
        if("E".equals(number)){
            file = new File(D + "//Game Story//story5.txt");
        }
        if("F".equals(number)){
            file = new File(D + "//Game Story//story6.txt");
        }
        if("G".equals(number)){
            file = new File(D + "//Game Story//story7.txt");
        }
        if("H".equals(number)){
            file = new File(D + "//Game Story//story8.txt");
        }
        else if("".equals(number)){
            file = new File(D + "//Game Story//story.txt");
        }
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }
}
