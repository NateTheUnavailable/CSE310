
import java.util.Scanner;

public class Game{
    public static void main(String[] args) throws Exception{
        System.out.println("The Story of Dan");
        Reader.start();
    }
    public void story(String choice){
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
    }
  }