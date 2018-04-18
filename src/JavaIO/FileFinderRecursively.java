package JavaIO;

import java.io.File;

public class FileFinderRecursively {
    public static void folderTraverser(String path) {
        File file = new File(path);
        if (file.exists()){
            File[] files = file.listFiles();
            if (files.length == 0){
                System.out.println("文件夹是空的！");
                return;
            }else {
                for (File tmpFile: files){
                    if (tmpFile.isDirectory()){
                        System.out.println("文件夹："+tmpFile.getAbsolutePath());
                        folderTraverser(tmpFile.getAbsolutePath());
                    }else {
                        System.out.println("文件："+tmpFile.getAbsolutePath());
                    }
                }
            }
        }else {
            System.out.println("文件不存在！");
        }
    }

    public static void main(String[] args) {
        folderTraverser("E:/TDDOWNLOAD");
    }
}
