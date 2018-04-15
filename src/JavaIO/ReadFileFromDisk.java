package JavaIO;
import java.io.*;

public class ReadFileFromDisk {
    public static void main(String[] args) throws IOException {
    File file = null;
    InputStream inputStream = null;
    BufferedInputStream bufferedInputStream = null;
    OutputStream outputStream = null;
        try {
            file = new File("E:/demo.txt");
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream("E:/copy.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte [] bytes = new byte[1024];
        try {
            while (bufferedInputStream.read(bytes) != -1){
                outputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            bufferedInputStream.close();
            outputStream.close();
        }
    }
}
