package com.example.test6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {

    public static void main(String[] args) {
        File fromFile = new File("C:\\Users\\yu  mu\\Desktop\\Test\\test1.txt");
        File toFile = new File("C:\\Users\\yu  mu\\Desktop\\Test\\test2.txt");
        InputStream is = null;
        OutputStream os=null;
        try {
            is = new FileInputStream(fromFile);
            os = new FileOutputStream(toFile);
            int content = is.read();
            while (content != -1) {
                os.write(content);
                content = is.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}