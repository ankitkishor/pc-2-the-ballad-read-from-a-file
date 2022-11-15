package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        FileInputStream fileInputStream=null;
        String str="";
        try {
            fileInputStream=new FileInputStream(fileName);

            int value=0;
            while((value=fileInputStream.read())!=-1){

                str=str+String.valueOf((char)value);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }


}
