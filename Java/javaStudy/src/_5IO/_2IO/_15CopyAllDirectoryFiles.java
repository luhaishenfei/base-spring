package _5IO._2IO;

import java.io.*;

public class _15CopyAllDirectoryFiles {
    public static void main(String[] args) throws IOException {
        copyAllDirectoryFiles("src\\_5IO\\_2IO","src\\_5IO\\_2IO_15Copy");
        //   System.out.println(new File("src\\_5IO\\_2IO\\_11Test.txt").getName());
       //copyFile("src\\_5IO\\_2IO\\_5_IMG_copy.jpg","src\\_5IO\\_2IO\\_15Copy");
        //copyAllDirectoryFiles("src\\_5IO\\_2IO");
    }



    public static void copyFile(String sourcePath,String targetPath){
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File targetFile = new File(targetPath+"\\"+(new File(sourcePath).getName()));

            if (!targetFile.exists()){
                targetFile.createNewFile();
            }

            bufferedInputStream=new BufferedInputStream(
              new FileInputStream(sourcePath)
            );

            bufferedOutputStream = new BufferedOutputStream(
                   new FileOutputStream(targetPath+"\\"+(new File(sourcePath).getName()))
            );

            long l = System.currentTimeMillis();

            byte[] bys = new byte[1024];
            int len = 0;
            while((len=bufferedInputStream.read(bys))!=-1){
                bufferedOutputStream.write(bys,0,len);
                bufferedOutputStream.flush();
            }

            //bufferedOutputStream.close();
            //bufferedInputStream.close();


            System.out.println(System.currentTimeMillis()-l);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            //      bufferedOutputStream.close();

        }
    }

    public static void copyAllDirectoryFiles(String sourcePath,String targetPath) throws IOException {
        File file = new File(sourcePath);
        if (file.isDirectory()){
            File targetFile = new File(targetPath+"\\"+(new File(sourcePath).getName()));

            if (!targetFile.exists()){
                targetFile.mkdirs();
            }
            System.out.println("-----"+file.getAbsolutePath()+"-----");
            File[] fileList = file.listFiles();
            for (File f:
                    fileList) {
                copyAllDirectoryFiles(f.getAbsolutePath(),targetPath+"\\"+(new File(sourcePath).getName()));
            }
        }else if(file.isFile()){
            copyFile(sourcePath,targetPath);


            System.out.println("file:"+file.getAbsolutePath());
        }else {
            System.out.println("error!please input the correct PATH!");
        }
    }
}
