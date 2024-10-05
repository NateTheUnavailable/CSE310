import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Game{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner option = new Scanner(System.in);
        System.out.println("The Story of Dan");
        String D = System.getProperty("user.dir");
        FileReader reader = new FileReader(D + "/GameStory/story.txt");
        int data = reader.read();
        while(data != -1) {
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
        String choice = option.nextLine();
        System.out.print("\033[H\033[2J");
        //First Choice
        if ("A".equals(choice)||"a".equals(choice)) {
            reader = new FileReader(D + "/GameStory/A.txt");
            data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
            choice = option.nextLine();
            System.out.print("\033[H\033[2J");
            //Seccond Choice
            if ("C".equals(choice)||"c".equals(choice)) {
                reader = new FileReader(D + "/GameStory/C.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = "Friends";
            }
            if ("D".equals(choice)||"d".equals(choice)) {
                reader = new FileReader(D + "/GameStory/D.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = "Friends";
            }
            if ("Friends".equals(choice)) {
                reader = new FileReader(D + "/GameStory/Friends.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
            }
            if ("E".equals(choice)||"e".equals(choice)) {
                reader = new FileReader(D + "/GameStory/E.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
                //Third Choice
            }
            if ("F".equals(choice)||"f".equals(choice)) {
                reader = new FileReader(D + "/GameStory/F.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
            }
            if ("G".equals(choice)||"g".equals(choice)) {
                reader = new FileReader(D + "/GameStory/G.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
            }
            if ("H".equals(choice)||"h".equals(choice)) {
                reader = new FileReader(D + "/GameStory/H.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
            }
            if ("I".equals(choice)||"i".equals(choice)) {
                reader = new FileReader(D + "/GameStory/I.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
                //Third Choice
            }
            if ("J".equals(choice)||"j".equals(choice)) {
                reader = new FileReader(D + "/GameStory/J.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                choice = option.nextLine();
                System.out.print("\033[H\033[2J");
            }
            if ("K".equals(choice)||"k".equals(choice)) {
                reader = new FileReader(D + "/GameStory/K.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
                //Third Choice
            }
            if ("L".equals(choice)||"l".equals(choice)) {
                reader = new FileReader(D + "/GameStory/L.txt");
                data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
            }
        }
        else if ("B".equals(choice)||"b".equals(choice)) {
            reader = new FileReader(D + "/GameStory/B.txt");
            data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
    }
  }