import java.io.*;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\Java\\DuplicateLines.txt");
        Set<String> dataSet = new HashSet<String>();
        
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                dataSet.add(data);
            }
            Arrays [] dataArr = new Arrays[dataSet.size()];
                
            try {
                    BufferedWriter fw = new BufferedWriter(new FileWriter(file));
                    for(String s :dataSet ) {
                        System.out.println(s);
                        fw.write(s +"\n");
                    }
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
