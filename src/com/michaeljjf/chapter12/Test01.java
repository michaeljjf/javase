package com.michaeljjf.chapter12;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {

        File f = new File("d:" + File.separator + "test_java.txt");

        if (!f.exists()) {
            f.createNewFile();
        }

        File f1 = new File("d:" + File.separator + "test_java.txt");

        //常用方法：
        System.out.println("文件是否可读：" + f.canRead());
        System.out.println("文件是否可写：" + f.canWrite());
        System.out.println("文件的名字：" + f.getName());
        System.out.println("上级目录：" + f.getParent());
        System.out.println("是否是一个目录：" + f.isDirectory());
        System.out.println("是否是一个文件：" + f.isFile());
        System.out.println("是否隐藏：" + f.isHidden());
        System.out.println("文件的大小：" + f.length());
        System.out.println("是否存在：" + f.exists());
        /*if(f.exists()){//如果文件存在，将文件删除操作
            f.delete();
        }else{//如果不存在，就创建这个文件
            f.createNewFile();
        }*/
        System.out.println(f == f1);//比较两个对象的地址
        System.out.println(f.equals(f1));//比较两个对象对应的文件的路径
        //跟路径相关的：
        System.out.println("绝对路径：" + f.getAbsolutePath());
        System.out.println("相对路径：" + f.getPath());
        System.out.println("toString:" + f.toString());
        System.out.println("----------------------");
    }
}
