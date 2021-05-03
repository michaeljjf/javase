package com.michaeljjf.chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "demo.txt");
        String str = "hello你好！";
//        // 最原始方式
        FileWriter fileWriter = new FileWriter(file, true);
//        for (int i = 0; i < str.length(); i++) {
//            fileWriter.write(str.charAt(i));
//        }
//        fileWriter.close();

        // 利用缓冲数组
        fileWriter = new FileWriter(file, true);
        fileWriter.write(str.toCharArray());
        fileWriter.close();
    }
}
