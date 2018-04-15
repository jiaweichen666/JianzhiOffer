package JavaIO;

import java.io.*;

public class ReadFromDiskReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
         fileReader  = new FileReader("E:/demo.txt");
         bufferedReader = new BufferedReader(fileReader);
         fileWriter = new FileWriter("E:/copy.txt");
         bufferedWriter = new BufferedWriter(fileWriter);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            String s = bufferedReader.readLine();
            while (s != null){
                try {
                    bufferedWriter.write(s);
                    System.out.println(s);
                s = bufferedReader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bufferedReader.close();
            bufferedWriter.close();
            fileReader.close();
            fileWriter.close();
        }
    }
}
