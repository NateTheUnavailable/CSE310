import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Game{
    public static void main(String[] args) throws Exception{
        System.out.println("The Story of Dan");
        AssetManager assetManager = getAssets();
        InputStream = assetManager.open("text.txt");
        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)
        System.out.print((char)i);
    }
  }