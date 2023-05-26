package _5IO._1File;

import java.io.File;

public class _5RecursionDirectory {
    public static void main(String[] args) {
        getAllDirectoryFiles("F:\\javaStudy");
    }

    public static void getAllDirectoryFiles(String path){
        File file = new File(path);
        if (file.isDirectory()){
            System.out.println("-----"+file.getAbsolutePath()+"-----");
            File[] fileList = file.listFiles();
            for (File f:
                    fileList) {
                getAllDirectoryFiles(f.getAbsolutePath());
            }
        }else if(file.isFile()){
            System.out.println("file:"+file.getAbsolutePath());
        }else {
            System.out.println("error!please input the correct PATH!");
        }
    }
}
