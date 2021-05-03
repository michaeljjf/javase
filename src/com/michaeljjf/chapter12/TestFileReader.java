package com.michaeljjf.chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        // 一次读取一个字符
        File file = new File("d:" + File.separator + "test.txt");
        FileReader fileReader = new FileReader(file);
        int n;
        while ((n = fileReader.read()) != -1) {
            System.out.println((char) n);
        }
        fileReader.close();

        // 一次读取多个
        file = new File("d:" + File.separator + "test.txt");
        fileReader = new FileReader(file);
        char[] ch = new char[5];
        int len = fileReader.read(ch);
        while (len != -1) {
//            for (int i = 0; i < len; i++) {
//                System.out.println((ch[i]));
//            }
            String str = new String(ch, 0, len);
            System.out.println(str);
            len = fileReader.read(ch);
        }
        fileReader.close();
    }
}
