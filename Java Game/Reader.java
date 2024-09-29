import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void start() throws FileNotFoundException{
        String number ="";
        String D = System.getProperty("user.dir");
        File file = new File(D + "//Game Story//story.txt");
        Game reader = new Game();
        reader.story(number);
        if("A".equals(number)){
            file = new File(D + "//Game Story//story.txt");
            if("A".equals(number)){
                file = new File(D + "//Game Story//story.txt");
                if("A".equals(number)){
                    file = new File(D + "//Game Story//story.txt");
                    
                }
                if("B".equals(number)){
                    file = new File(D + "//Game Story//story2.txt");
                    if("A".equals(number)){
                        file = new File(D + "//Game Story//story.txt");
                        
                    }
                    if("B".equals(number)){
                        file = new File(D + "//Game Story//story2.txt");
                    }
                }
                
            }
            if("B".equals(number)){
                file = new File(D + "//Game Story//story2.txt");
                if("A".equals(number)){
                    file = new File(D + "//Game Story//story.txt");
                    if("A".equals(number)){
                        file = new File(D + "//Game Story//story.txt");
                        
                    }
                    if("B".equals(number)){
                        file = new File(D + "//Game Story//story2.txt");
                        if("A".equals(number)){
                            file = new File(D + "//Game Story//story.txt");
                            
                        }
                        if("B".equals(number)){
                            file = new File(D + "//Game Story//story2.txt");
                        }
                    }
                    
                }
                if("B".equals(number)){
                    file = new File(D + "//Game Story//story2.txt");
                }
            }
            
        }
        if("B".equals(number)){
            file = new File(D + "//Game Story//story2.txt");
        }
        else if("".equals(number)){
            file = new File(D + "//Game Story//story.txt");
        }
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }
}
