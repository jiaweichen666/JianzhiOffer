package JavaIO;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FolderTraverserIterablely {
    public static void foldertraveser(String path){
        File file = new File(path);
        int folderNum = 0;
        int fileNum = 0;
        List<File> folderList = new LinkedList<>();
        if (file.exists()){
            File[] files = file.listFiles();
            if (files.length == 0){
                System.out.println("文件夹为空！");
                return;
            }else {
                for (File tmpFile:files){
                    if (tmpFile.isFile()){
                        System.out.println("文件："+ tmpFile.getAbsolutePath());
                    }else if (tmpFile.isDirectory()){
                        folderList.add(tmpFile);
                    }
                }
            }

        }else {
            System.out.println("文件不存在！");
        }
        while (!folderList.isEmpty()){
            File tmp = folderList.remove(0);
            File[] files = tmp.listFiles();
            if (files.length == 0){
                System.out.println(tmp.getAbsolutePath() + "文件夹为空！");
            }else{
                for (File ff:files){
                    if (ff.isDirectory()){
                        folderList.add(ff);
                    }else {
                        System.out.println("文件："+ff.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        foldertraveser("E:/TDDOWNLOAD");
    }

}
