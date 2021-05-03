package com.michaeljjf.chapter12;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator);
//        String[] list = file.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + "," + file1.getAbsolutePath());
        }
    }
}
