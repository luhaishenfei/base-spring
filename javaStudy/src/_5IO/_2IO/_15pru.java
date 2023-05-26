package _5IO._2IO;

import java.io.*;

import static com.sun.deploy.cache.Cache.copyFile;

public class _15pru {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("src\\_5IO\\_2IO");
        File destFile = new File("src\\_5IO\\_2IO_15Copy");
        copyFolder(srcFile, destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            //File+String 拼接文件名
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            File[] fileArray = srcFile.listFiles();

            for (File file : fileArray) {
                copyFolder(file, newFolder);
            }
        }
        //当是文件是
        else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);

        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bufferedInputStream=new BufferedInputStream(
                new FileInputStream(srcFile)
        );


        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream(destFile)
        );

        long l = System.currentTimeMillis();

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bufferedInputStream.read(bys))!=-1){
            bufferedOutputStream.write(bys,0,len);
            bufferedOutputStream.flush();
        }

        bufferedOutputStream.close();
        bufferedInputStream.close();

    }
}
