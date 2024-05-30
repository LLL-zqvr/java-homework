package com.example.test6;

import java.io.*;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args)throws IOException {
       IOOperation();

    }
    public static void IOOperation() throws IOException{
        FileOutputStream path = new FileOutputStream("C:\\Users\\yu  mu\\Desktop\\Test\\test.txt", true);
        BufferedOutputStream bos = new BufferedOutputStream(path);
        byte[] bytes = "aaa".getBytes();
        bos.write(bytes);
        bos.flush();

        bos.close();
        path.close();



    }
}
