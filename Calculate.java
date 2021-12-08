import java.io.*;

public class Calculate {
    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\Admin\\Desktop\\Java\\new_file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));

        File file2 = new File("C:\\Users\\Admin\\Desktop\\Java\\new_file_upper.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        try {
            String str;
            while((str = br.readLine()) != null){
                bw.write(str.toUpperCase() + "\n");
            }
        }
        catch(IOException e){
            System.out.println("Exception occurred: " + e);
        }
        finally{
            try {
                br.close();
                bw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
