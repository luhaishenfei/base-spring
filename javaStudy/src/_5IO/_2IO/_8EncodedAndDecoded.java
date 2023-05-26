package _5IO._2IO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class _8EncodedAndDecoded {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bytes =s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

        String stringDecoded = new String(bytes,"GBK");
        System.out.println(stringDecoded);
    }
}
