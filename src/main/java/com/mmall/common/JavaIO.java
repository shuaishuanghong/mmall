package com.mmall.common;
import java.io.*;
public class JavaIO {
        public static void main(String args[]) throws IOException {
            String c;
            // 使用 System.in 创建 BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入字符, 按下 'q' 键退出。");
            // 读取字符
            do {
                c = br.readLine();
                System.out.println(c);
            } while (c != "q");
        }
}
