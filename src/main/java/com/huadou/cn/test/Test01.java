package com.huadou.cn.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/**
 * Created by jinliang on 16/6/14.
 */
public class Test01 {

    private static final String filePath = "/Users/jinliang/tools/log/abc.txt" ;
    public static void main(String[] args)  {

//        String content = "huhu" ;
//
//        byte[] bytes = content.getBytes(Charset.forName("UTF-8"));
//
//        for (int i = 0; i < bytes.length ; i++) {
//            System.out.println(""+ bytes[i]);
//        }
//


        // 预分配文件所占的磁盘空间，磁盘中会创建一个指定大小的文件
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(filePath, "rw");
            raf.setLength(1024*1024); // 预分配 1M 的文件空间
            raf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 所要写入的文件内容
        String s1 = "第一个字符串";
        String s2 = "第二个字符串";
        String s3 = "第三个字符串";
        String s4 = "第四个字符串";
        String s5 = "第五个字符串";

        // 利用多线程同时写入一个文件
        new FileWriteThread(0,s1.getBytes()).start(); // 从文件的1024字节之后开始写入数据
        new FileWriteThread(s1.getBytes(Charset.forName("UTF-8")).length,s2.getBytes()).start(); // 从文件的2048字节之后开始写入数据
        new FileWriteThread((s2+s1).getBytes(Charset.forName("UTF-8")).length,s3.getBytes()).start(); // 从文件的3072字节之后开始写入数据
        new FileWriteThread((s1+s2+s3).getBytes(Charset.forName("UTF-8")).length,s4.getBytes()).start(); // 从文件的4096字节之后开始写入数据
        new FileWriteThread((s1+s2+s3+s4).getBytes(Charset.forName("UTF-8")).length,s5.getBytes()).start(); // 从文件的5120字节之后开始写入数据


    }


    // 利用线程在文件的指定位置写入指定数据
    static class FileWriteThread extends Thread{
        private int skip;
        private byte[] content;

        public FileWriteThread(int skip,byte[] content){
            this.skip = skip;
            this.content = content;
        }

        public void run(){
            RandomAccessFile raf = null;
            try {
                raf = new RandomAccessFile(filePath, "rw");
                raf.seek(skip);
//                raf.skipBytes(skip);
                raf.write(content);
                System.out.println(" "+ Thread.currentThread().getName() );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    raf.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
