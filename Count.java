import java.io.*;

public class Count {
    public static void main(String[] args) throws IOException {
        
        int count = 0;
        int character = 0;
        String line;
        int numberOfWords = 0;

        File file = new File("C:\\Users\\Admin\\Desktop\\Java\\new_file.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        try {
            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");
                numberOfWords = numberOfWords + words.length;

                for (String word : words) {
                    character += word.length();
                }

                char c;
                int i = 0;
                while(i < line.length()){
                    c = line.charAt(i);
                    if(c == '.' || c == '?' || c == '!'){
                        count++;
                    }
                    i++;
                }
            }
            System.out.println("The number of words in " + file.getName() + " are " + numberOfWords);
            System.out.println("The number of sentences in " + file.getName() + " are " + count);
            System.out.println("The number of characters in " + file.getName() + " are " + character);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();           
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}