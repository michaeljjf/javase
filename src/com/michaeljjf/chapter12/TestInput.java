package com.michaeljjf.chapter12;

import java.io.*;

public class TestInput {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入您要保存的内容：");
        InputStream inputStream = System.in;
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(isr);

        File file = new File("d:" + File.separator + "test_input.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String s = bufferedReader.readLine();
        while (!"exit".equals(s)) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            s = bufferedReader.readLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
