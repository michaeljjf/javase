package com.michaeljjf.chapter12;

import java.io.*;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        File fileSource = new File("d:" + File.separator + "test.txt");
        File fileObject = new File("d:" + File.separator + "demo.txt");
        FileReader fileReader = new FileReader(fileSource);
        FileWriter fileWriter = new FileWriter(fileObject);
        // 第一种方式
//        int n;
//        while ((n = fileReader.read()) != -1) {
//            fileWriter.write((char) n);
//        }
//        fileWriter.close();
//        fileReader.close();
        // 利用缓冲数组
        char[] ch = new char[5];
        int len = fileReader.read(ch);
        while (len != -1) {
            String s = new String(ch, 0, len);
            fileWriter.write(s);
            len = fileReader.read(ch);
        }
        fileWriter.close();
        fileReader.close();
    }
}
