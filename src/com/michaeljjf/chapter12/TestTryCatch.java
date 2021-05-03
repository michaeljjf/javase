package com.michaeljjf.chapter12;

import java.io.*;

public class TestTryCatch {
    public static void main(String[] args) {
        File fileSource = new File("d:" + File.separator + "test.txt");
        File fileObject = new File("d:" + File.separator + "demo.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(fileSource);
            fileWriter = new FileWriter(fileObject);
            char[] ch = new char[5];
            int len = fileReader.read(ch);
            while (len != -1) {
                String s = new String(ch, 0, len);
                fileWriter.write(s);
                len = fileReader.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
